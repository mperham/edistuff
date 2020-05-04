package com.webify.shared.edi.model;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Represents an EDI document with ISA, GS segments for the header and
 * GE, IEA segments for the footer.
 *
 * The interchange introspects the ST segment to determine which
 * object model can handle parsing that transaction.
 *
 * @author mperham
 * @version $Id: EDIInterchange.java 647 2004-11-19 00:51:56Z mperham $
 */
public class EDIInterchange implements EDIElement {

    private static final Log log = LogFactory.getLog(EDIInterchange.class);
    private static final int TEN = 10;

    private static final int ISA_SIZE = 16;
    private static final int GS_SIZE = 8;
    private static final int ST_SIZE = 3;
    private static final int GE_SIZE = 2;
    private static final int IEA_SIZE = 2;

    private static final Map transactionSets = new HashMap();
    private static final String[] xaClass = {
        "270", "271", "275", "276", "277", "835", "837i", "837p", "997"
    };

    static {
        Class c = null;

        for (int i = 0; i < xaClass.length; i++) {
            try {
                c = Class.forName(
                        "com.webify.shared.edi.model.hipaa" + xaClass[i] + ".Hipaa" + xaClass[i]
                        + "Document");
                List sids = (List) c.getField("STANDARDS_IDS").get(null);

                for (Iterator sit = sids.iterator(); sit.hasNext();) {
                    String sid = (String) sit.next();
                    transactionSets.put(sid, c);
                    // log.debug(xaClass[i] + " = " + sid);
                }
            }
            catch (Exception e) {
                log.error("", e);
            }
        }
    }

    /*
     # ISA01 - Authorization Information Qualifier
     # ISA02 - Authorization Information
     # ISA03 - Security Information Qualifier
     # ISA04 - Security Information - This was originally used as a kind of a password. The receiver
     ID might be public information such as a DUNS number, but this field might contain a value
     which is not public information. It is however clear text, so the security provided is
     not at a very high level.
     # ISA05 - Interchange ID Qualifier
     # ISA06 - Interchange Sender ID - Identifies the sender.
     # ISA07 - Interchange ID Qualifier
     # ISA08 - Interchange Receiver ID - Identifies the receiver.
     # ISA09 - Interchange Date - YYMMDD
     # ISA10 - Interchange Time - HHMM
     # ISA11 - Interchange Control Standards Identifier
     # ISA12 - Interchange Control Version Number - Indicates the version of the ISA/IEA envelope
     # ISA13 - Interchange Control Number - Uniquely identifies an interchange for tracking by trading
     partners and VANS, and can be used to detect duplicate, missing, or out of sequence transmissions.
     May take any numeric value, but is usually incremented by one for each interchange sent to the
     same trading partner.
     # ISA14 - Acknowledgment Requested - Indicates a request for a TA3 Interchange Acknowledgment to be sent.
     # ISA15 - Test Indicator - Test or Production
     # ISA16 - Subelement Separator
     */

    // Zeroth element is always the segment name e.g. "ISA"
    private String isa00;
    private String isa01;
    private String isa02;
    private String isa03;
    private String isa04;
    private String isa05;
    private String isa06;
    private String isa07;
    private String isa08;
    private String isa09;
    private String isa10;
    private String isa11;
    private String isa12;
    private String isa13;
    private String isa14;
    private String isa15;
    private String isa16;

    /*
     # GS01 - Functional Group Header Code - Same as the Group Type of the included Transaction Sets.
     # GS02 - Application Sender's Code
     # GS03 - Application Receiver's Code
     # GS04 - Date - YYMMDD, or CCYYMMDD as of 4010.
     # GS05 - Time - HHMM
     # GS06 - Group Control Number - Like the ISA control number, is used for audit and to detect
     duplicates, missing, or out of sequence groups. Most importantly, the 997 Functional
     Acknowledgment, which acts as a return receipt for the group, references the group control
     number. May take any numeric value so long as there are no duplicates in the interchange,
     but is usually incremented by one for each group of this type sent to the same trading partner.
     # GS07 - Responsible Agency Code - X for X12 or T for TDCC
     # GS08 - Version/Release/Industry Identifier Code - The first six characters specify the X12
     version and release, while any of the last six may be used to indicate an Industry standard
     or Implementation Convention reference.
     */
    private String gs0;
    private String gs1;
    private String gs2;
    private String gs3;
    private String gs4;
    private String gs5;
    private String gs6;
    private String gs7;
    private String gs8;

    private String ge0;
    private String ge1;
    private String ge2;

    private String iea0;
    private String iea1;
    private String iea2;

    private List documents = new ArrayList();

    public void parse(EDIInputStream eis) throws IOException, EDIParseException {
        String[] values = null;

        handleHeaders(eis);

        String[] fields = eis.readSegment(true);

        if (fields == null || !fields[0].startsWith("ST") || fields.length < ST_SIZE) {
            eis.addError("Error reading segment ST from input file");
            return;
        }
        String st01 = fields[1];
        String standard = getGS08() + "," + st01;

        Class c = (Class) transactionSets.get(standard);

        if (c == null) {
            throw new EDIParseException("No document handler found for " + standard);
        }
        int segCount = 0;

        while (eis.peekSegment("ST")) {
            try {
                eis.resetSegmentNumber();
                EDITransaction xa = (EDITransaction) c.newInstance();

                xa.parse(eis);
                documents.add(xa);
            }
            catch (Exception e) {
                throw new EDIParseException(e);
            }
        }

        if (eis.peekSegment("GE")) {
            values = eis.readSegment("GE", GE_SIZE);
            setGE00(values[0]);
            setGE01(values[1]);
            setGE02(values[2]);
        }
        else {
            String[] cur = eis.readSegment(false);
            throw new EDIParseException("Document parsing stopped early.  Got " + cur[0]
                    + " instead of GE segment");
        }

        if (!eis.hasErrors() && !getGS06().equals(getGE02())) {
            throw new EDIParseException(
                    "Group control numbers in GS06 and GE02 do not match: " + getGS06() + " != "
                    + getGE02());
        }

        values = eis.readSegment("IEA", IEA_SIZE);
        setIEA00(values[0]);
        setIEA01(values[1]);
        setIEA02(values[2]);

        if (!eis.hasErrors() && !getISA13().equals(getIEA02())) {
            throw new EDIParseException(
                    "Interchange control numbers in ISA13 and IEA02 do not match: " + getISA13()
                    + " != " + getIEA02());
        }
    }

    private void handleHeaders(EDIInputStream eis) throws EDIParseException {
        try {
            String[] isaValues = eis.readSegment("ISA", ISA_SIZE);
            for (int i = 0; i < isaValues.length; i++) {
                Method f = getClass().getMethod("setISA" + (i < TEN ? "0" : "") + i,
                        new Class[] {String.class });
                f.invoke(this, new Object[] {isaValues[i] });
            }

            String[] gsValues = eis.readSegment("GS", GS_SIZE);
            for (int i = 0; i < gsValues.length; i++) {
                Method f = getClass().getMethod("setGS" + (i < TEN ? "0" : "") + i,
                        new Class[] {String.class });
                f.invoke(this, new Object[] {gsValues[i] });
            }
        }
        catch (Exception xxx) {
            throw new EDIParseException(xxx);
        }
    }

/*
     public static void main(String[] args) throws IOException, EDIParseException {
        //        for (int i = 0; i < 5; i++)
        //            test(args, false);
        //        System.gc();
        //        pause();
        //        System.gc();
        //
        //        long beforeMem = Runtime.getRuntime().freeMemory();

        long a = System.currentTimeMillis();
        EDIInterchange ic = test(args, true);
        long b = System.currentTimeMillis();

        //        System.gc();
        //        pause();
        //        System.gc();
        //
        //        long afterMem = Runtime.getRuntime().freeMemory();
        //
        //        ic = null;
        //
        //        System.gc();
        //        pause();
        //        System.gc();
        //
        //        long doneMem = Runtime.getRuntime().freeMemory();

        log.info("Parsed " + ic.documents.size() + " documents in " + (b - a) + " ms ");
        //with " + (beforeMem - afterMem) + "/" + (doneMem - afterMem) + "
        // bytes");
    }
*/
    private static final int TIME_DELAY = 5000;
    private static void pause() {
        try {
            Thread.sleep(TIME_DELAY);
        }
        catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    public static EDIInterchange test(String[] args, boolean doWrite) throws IOException, EDIParseException {
        EDIInterchange ic = new EDIInterchange();
        File input = new File(args[0]);
        long inputSize = input.length();
        FileInputStream fis = new FileInputStream(input);

        EDIInputStream eis = new EDIInputStream(fis);
        ic.parse(eis);

        if (eis.hasErrors()) {
            int i = 0;
            Iterator eit = eis.getErrors().iterator();
            while (eit.hasNext()) {
                EDIParseError error = (EDIParseError) eit.next();
                log.error(error);
                if (i == 0) {
                    log.error("", error.getException());
                }
                i++;
            }
        }
        else if (doWrite) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            EDIOutputStream eos = new EDIOutputStream(baos);
            eos.setTest();
            ic = (EDIInterchange) ic.createCopy();
            ic.emit(eos);
            if (eos.hasErrors()) {
                int i = 0;
                Iterator eit = eos.getErrors().iterator();
                while (eit.hasNext()) {
                    EDIParseError error = (EDIParseError) eit.next();
                    log.error(error);
                    if (i == 0) {
                        log.error("", error.getException());
                    }
                    i++;
                }
            }
            else {
                byte[] data = baos.toByteArray();
                int outputSize = data.length;
                File output = new File("out." + input.getName());
                FileOutputStream fos = new FileOutputStream(output);
                fos.write(data);
                fos.close();

                int count = eos.getTotalSegmentsWritten();
                int diff = (int) inputSize - outputSize;
                if (diff != 0 && diff % count != 0) { // the mod handles optional linefeeds
                    log.error("Input size != output size [" + inputSize + " != " + outputSize + "] Diff of "
                                    + (outputSize - inputSize) + " with " + count + " segments");
                }
            }
        }
        return ic;
    }


    private static final int[] ISA_FIELD_SIZES = {
        0, 2, 10, 2, 10, 2, 15, 2, 15, 6, 4, 1, 5, 9, 1, 1, 1
    };

    public void emit(EDIOutputStream eos) throws IOException {
        eos.startSegment("ISA");
        try {
            for (int i = 1; i <= ISA_SIZE; i++) {
                Method m = getClass().getMethod("getISA" + (i < TEN ? "0" : "") + i, null);
                String val = (String) m.invoke(this, null);
                eos.writeField(val, ISA_FIELD_SIZES[i]);
            }
        }
        catch (Exception ex) {
            log.error("", ex);
        }
        eos.endSegment();

        eos.startSegment("GS");
        eos.writeField(getGS01());
        eos.writeField(getGS02());
        eos.writeField(getGS03());
        eos.writeField(getGS04());
        eos.writeField(getGS05());
        eos.writeField(getGS06());
        eos.writeField(getGS07());
        eos.writeField(getGS08());
        eos.endSegment();

        // we don't want SE01 to count ISA and GS
        eos.resetSegmentsWritten();

        for (Iterator it = documents.iterator(); it.hasNext();) {
            EDIElement doc = (EDIElement) it.next();

            doc.emit(eos);
            eos.resetSegmentsWritten();
        }

        eos.startSegment("GE");
        eos.writeField(documents.size());
        eos.writeField(getGS06());
        eos.endSegment();

        eos.startSegment("IEA");
        eos.writeField(1);
        eos.writeField(getISA13());
        eos.endSegment();
    }

    public EDIElement createCopy() {
        EDIInterchange copy = new EDIInterchange();

        try {
            copy.setISA00(this.getISA00());
            copy.setISA01(this.getISA01());
            copy.setISA02(this.getISA02());
            copy.setISA03(this.getISA03());
            copy.setISA04(this.getISA04());
            copy.setISA05(this.getISA05());
            copy.setISA06(this.getISA06());
            copy.setISA07(this.getISA07());
            copy.setISA08(this.getISA08());
            copy.setISA09(this.getISA09());
            copy.setISA10(this.getISA10());
            copy.setISA11(this.getISA11());
            copy.setISA12(this.getISA12());
            copy.setISA13(this.getISA13());
            copy.setISA14(this.getISA14());
            copy.setISA15(this.getISA15());
            copy.setISA16(this.getISA16());

            copy.setGS00(this.getGS00());
            copy.setGS01(this.getGS01());
            copy.setGS02(this.getGS02());
            copy.setGS03(this.getGS03());
            copy.setGS04(this.getGS04());
            copy.setGS05(this.getGS05());
            copy.setGS06(this.getGS06());
            copy.setGS07(this.getGS07());
            copy.setGS08(this.getGS08());

            copy.setGE00(this.getGE00());
            copy.setGE01(this.getGE01());
            copy.setGE02(this.getGE02());

            copy.setIEA00(this.getIEA00());
            copy.setIEA01(this.getIEA01());
            copy.setIEA02(this.getIEA02());

            copy.documents = new ArrayList();
            for (Iterator it = documents.iterator(); it.hasNext();) {
                EDIElement element = (EDIElement) it.next();
                copy.documents.add(element.createCopy());
            }
        }
        catch (Exception ex) {
            log.error("", ex);
        }
        return copy;
    }

    public byte[] emit() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        EDIOutputStream eos = new EDIOutputStream(baos);
        emit(eos);
        return baos.toByteArray();
    }

    private static final int MIN_DATA_LENGTH = 120;

    public static EDIInterchange parse(byte[] data) throws IOException, EDIParseException {
        EDIInterchange interchange = null;
        EDIInputStream eis = null;
        EDIOutputStream eos = null;
        ByteArrayInputStream bis = null;

        if (data == null) {
            throw new EDIParseException("Null EDI document");
        }
        if (data.length < MIN_DATA_LENGTH) {
            throw new EDIParseException("Invalid EDI document: " + new String(data));
        }
        if (!(data[0] == 'I' && data[1] == 'S' && data[2] == 'A')) {
            throw new EDIParseException("Invalid EDI document: "
                    + new String(data, 0, (data.length > 1000 ? 1000 : data.length)));
        }

        try {
            bis = new ByteArrayInputStream(data);
            eis = new EDIInputStream(bis);
            interchange = new EDIInterchange();
            interchange.parse(eis);
        }
        finally {
            if (bis != null) {
                bis.close();
            }
        }
        return interchange;
    }

    public void setDocuments(List documents) {
        this.documents = documents;
    }

    public List getDocuments() {
        return documents;
    }

    public void setIEA00(String iEA0) {
        this.iea0 = iEA0;
    }

    public String getIEA00() {
        return iea0;
    }

    public void setIEA01(String iEA1) {
        iea1 = iEA1;
    }

    public String getIEA01() {
        return iea1;
    }

    public void setIEA02(String iEA2) {
        iea2 = iEA2;
    }

    public String getIEA02() {
        return iea2;
    }

    public void setGE00(String gE0) {
        ge0 = gE0;
    }

    public String getGE00() {
        return ge0;
    }

    public void setGE01(String gE1) {
        ge1 = gE1;
    }

    public String getGE01() {
        return ge1;
    }

    public void setGE02(String gE2) {
        ge2 = gE2;
    }

    public String getGE02() {
        return ge2;
    }

    public void setGS08(String gS8) {
        gs8 = gS8;
    }

    public String getGS08() {
        return gs8;
    }

    public void setGS07(String gS7) {
        gs7 = gS7;
    }

    public String getGS07() {
        return gs7;
    }

    public void setGS06(String gS6) {
        gs6 = gS6;
    }

    public String getGS06() {
        return gs6;
    }

    public void setGS05(String gS5) {
        gs5 = gS5;
    }

    public String getGS05() {
        return gs5;
    }

    public void setGS04(String gS4) {
        gs4 = gS4;
    }

    public String getGS04() {
        return gs4;
    }

    public void setGS03(String gS3) {
        gs3 = gS3;
    }

    public String getGS03() {
        return gs3;
    }

    public void setGS02(String gS2) {
        gs2 = gS2;
    }

    public String getGS02() {
        return gs2;
    }

    public void setGS01(String gS1) {
        gs1 = gS1;
    }

    public String getGS01() {
        return gs1;
    }

    public void setGS00(String gS0) {
        gs0 = gS0;
    }

    public String getGS00() {
        return gs0;
    }

    public void setISA16(String iSA16) {
        isa16 = iSA16;
    }

    public String getISA16() {
        return isa16;
    }

    public void setISA15(String iSA15) {
        isa15 = iSA15;
    }

    public String getISA15() {
        return isa15;
    }

    public void setISA14(String iSA14) {
        isa14 = iSA14;
    }

    public String getISA14() {
        return isa14;
    }

    public void setISA13(String iSA13) {
        isa13 = iSA13;
    }

    public String getISA13() {
        return isa13;
    }

    public void setISA12(String iSA12) {
        isa12 = iSA12;
    }

    public String getISA12() {
        return isa12;
    }

    public void setISA11(String iSA11) {
        isa11 = iSA11;
    }

    public String getISA11() {
        return isa11;
    }

    public void setISA10(String iSA10) {
        isa10 = iSA10;
    }

    public String getISA10() {
        return isa10;
    }

    public void setISA09(String iSA9) {
        isa09 = iSA9;
    }

    public String getISA09() {
        return isa09;
    }

    public void setISA08(String iSA8) {
        isa08 = iSA8;
    }

    public String getISA08() {
        return isa08;
    }

    public void setISA07(String iSA7) {
        isa07 = iSA7;
    }

    public String getISA07() {
        return isa07;
    }

    public void setISA06(String iSA6) {
        isa06 = iSA6;
    }

    public String getISA06() {
        return isa06;
    }

    public void setISA05(String iSA5) {
        isa05 = iSA5;
    }

    public String getISA05() {
        return isa05;
    }

    public void setISA04(String iSA4) {
        isa04 = iSA4;
    }

    public String getISA04() {
        return isa04;
    }

    public void setISA03(String iSA3) {
        isa03 = iSA3;
    }

    public String getISA03() {
        return isa03;
    }

    public void setISA02(String iSA2) {
        isa02 = iSA2;
    }

    public String getISA02() {
        return isa02;
    }

    public void setISA01(String iSA1) {
        isa01 = iSA1;
    }

    public String getISA01() {
        return isa01;
    }

    public void setISA00(String iSA0) {
        isa00 = iSA0;
    }

    public String getISA00() {
        return isa00;
    }
}
