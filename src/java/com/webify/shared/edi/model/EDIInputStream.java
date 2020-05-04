package com.webify.shared.edi.model;


import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author mperham
 * @version $Id: EDIInputStream.java 662 2004-11-19 17:02:12Z mperham $
 */
public class EDIInputStream extends PushbackInputStream {

    private static final Log log = LogFactory.getLog(EDIInputStream.class);

    private static final int BUFFER_SIZE = 512;
    private static final int ISA_LENGTH = 106;
    private static final byte[] BIN = new byte[] {'B', 'I', 'N' };
    private final byte[] bin = new byte[3];

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    private char fieldSep = 0;
    private char segmentSep = 0;
    private char subelementSep = 0;
    private byte[] linebuf = null;
    private int segmentCount = 0;
    private int currentLineNumber = 0;
    private String currentSegment = null;
    private List errors;
    private byte[] binary = null;

    public EDIInputStream(InputStream is) throws IOException {
        super(is, BUFFER_SIZE);

        linebuf = new byte[BUFFER_SIZE];
        read(linebuf, 0, ISA_LENGTH);
        unread(linebuf, 0, ISA_LENGTH);

        // determine the separators from the initial segment (which is 106 bytes long)
        fieldSep = (char) linebuf["ISA".length()];
        subelementSep = (char) linebuf[ISA_LENGTH - 2];
        segmentSep = (char) linebuf[ISA_LENGTH - 1];

        if (log.isDebugEnabled()) {
            log.debug("Parsing EDI with " + segmentSep + fieldSep + subelementSep);
        }
    }

    public boolean hasErrors() {
        return (errors != null && errors.size() > 0);
    }

    public List getErrors() {
        return errors;
    }

    /**
     * Returns the line number of the last segment read.
     */
    public int getCurrentSegmentNumber() {
        return segmentCount;
    }

    public int getCurrentLineNumber() {
        return currentLineNumber;
    }

    public void resetSegmentNumber() {
        segmentCount = 0;
    }

    public void addError(String msg) {
        if (errors == null) {
            errors = new ArrayList();
        }
        errors.add(new EDIParseError(msg, currentSegment, segmentCount, new EDIParseException()));
    }

    /**
     * Read the next segment from the InputStream and return a String array
     * of field values.  The parameters allow some minimal validation of the EDI data
     * stream.
     *
     * @param expectedName the expected value of the segment (for validation)
     * @param fieldCount the maximum number of fields in the segment (not counting the segment name itself)
     * @return array of field values.  The zeroth element of the array is always the segment name.
     */
    public String[] readSegment(String expectedName, int fieldCount) throws IOException {
        currentSegment = null;
        String[] values = null;

        try {
            values = readSegment(false);
            if (values == null) {
                addError("Expected segment '" + expectedName + "' but got nothing");
                return values;
            }

            currentSegment = values[0];

            if (values.length > fieldCount + 1) {
                addError(
                        "Expected segment '" + expectedName + "' with " + fieldCount
                        + " fields but got " + values.length);
                return values;
            }

            if (!values[0].startsWith(expectedName)) {
                addError(
                        "Expected segment '" + expectedName + "' but got "
                        + ((values != null && values.length > 0) ? values[0] : "null"));
                return values;
            }
            /*
            if (log.isDebugEnabled()) {
                log.debug("Read line " + currentLineNumber + ": " + ArrayUtils.toString(values));
            }
            */
        }
        finally {
            nextLine();
        }
        return values;
    }

    String[] readSegment(boolean unread) throws IOException {
        
        // Check for special BIN segment
        int bincount = read(bin);
        unread(bin);
        if (bincount == 3 && Arrays.equals(BIN, bin)) {
            return handleBinSegment(unread);
        }
        // done BIN check
        
        String segmentContent = "";
        final int count = read(linebuf);
        boolean done = false;
        boolean bin = false;
        int fieldCount = 0;

        // get the String representing a single segment
        while (!done) {
            for (int i = 0; i < count; i++) {
                if (linebuf[i] == segmentSep) {
                    done = true;
                    // save the content up to the tilde
                    segmentContent += new String(linebuf, 0, i);
                    // unread the content after the tilde and any linebreaks
                    i++;
                    if (i < count && linebuf[i] == '\r') {
                        i++;
                    }
                    if (i < count && linebuf[i] == '\n') {
                        i++;
                    }
                    if (i < count && !unread) {
                        unread(linebuf, i, count - i);
                    }
                    if (unread) {
                        unread(linebuf, 0, count);
                    }
                    fieldCount++;
                    break;
                }
                else if (linebuf[i] == fieldSep) {
                    fieldCount++;
                }
            }
            if (!done) {
                throw new IOException("EDI input buffer too small");
            }
        }

        // split the segment into fields
        List fields = new ArrayList(fieldCount);
        int sidx = 0;
        int eidx = segmentContent.indexOf(fieldSep);

        while (eidx != -1) {
            fields.add(segmentContent.substring(sidx, eidx));
            sidx = eidx + 1;
            eidx = segmentContent.indexOf(fieldSep, sidx);
        }
        fields.add(segmentContent.substring(sidx));
        fields.set(0, segmentContent);

        return (String[]) fields.toArray(new String[fields.size()]);
    }

    private String[] handleBinSegment(boolean unread) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("Handling BIN segment");
        }
        String[] results = new String[3];
        results[0] = "BIN";
        int ch = read(bin);
        assert ch == 3;
        ch = read();
        assert ch == fieldSep;
        String count = "";
        ch = read();
        while (Character.isDigit((char) ch)) {
            count += (char) ch;
            ch = read();
        }
        if (log.isDebugEnabled()) {
            log.debug("Got byte count of " + count);
        }
        
        results[1] = count;
        results[2] = null;

        if (count.length() == 0) {
            addError("Expected byte count in BIN01 but got nothing");
            return results;
        }
        
        if (unread) {
            // Push this content back onto the InputStream in reverse order
            // We explicitly do not read the binary attachment - unread is
            // just used for peeking and the attachment should not be needed
            // for this purpose.
            unread(fieldSep);
            unread(count.getBytes());
            unread(fieldSep);
            unread(bin);
            return results;
        }
        // Read the binary attachment into a buffer
        int bufferSize = Integer.parseInt(count);
        if (bufferSize > 10000000) {
            log.error("Binary attachment of size " + bufferSize);
            addError("Binary attachments greater than 10MB are not supported");
            return results;
        }

        binary = new byte[bufferSize];
        int read = saferead(binary);
        if (read != bufferSize) {
            addError("Binary attachment size stated to be " + bufferSize + " bytes but only read " + read);
        }
        if (log.isDebugEnabled()) {
            log.debug("Read binary attachment: " + new String(binary));
        }
        return results;
    }

    private int saferead(final byte[] binary) throws IOException {
        int read = 0;
        while (true) {
            int ch = read();
            if (((char) ch) != segmentSep && read < binary.length) {
                binary[read++] = (byte) ch;
            }
            else {
                break;
            }
        }
        return read;
    }

    /**
     * Determines whether the next segment has the given name AND
     * a field with the given value.
     */
    public boolean peekSegment(String segName, int fieldIdx, String[] value) throws IOException {
        if (peekSegment(segName)) {
            String[] fields = readSegment(true);

            if (fields == null || fields.length <= fieldIdx) {
                return false;
            }

            String fieldValue = fields[fieldIdx];
            int idx = fieldValue.indexOf(subelementSep);

            if (idx > -1) {
                fieldValue = fieldValue.substring(0, idx);
            }

            for (int i = 0; i < value.length; i++) {
                String string = value[i];

                if (string.equals(fieldValue)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean peekSegment(String segName, int fieldIdx, String value) throws IOException {
        if (peekSegment(segName)) {
            String[] fields = readSegment(true);

            if (fields == null || fields.length <= fieldIdx) {
                return false;
            }

            String fieldValue = fields[fieldIdx];
            int idx = fieldValue.indexOf(subelementSep);

            if (idx > -1) {
                fieldValue = fieldValue.substring(0, idx);
            }

            return value.equals(fieldValue);
        }
        return false;
    }

    /**
     * Returns whether or not the next segment has the given name.
     */
    public boolean peekSegment(String string) throws IOException {
        read(linebuf, 0, string.length());
        unread(linebuf, 0, string.length());
        String cur = new String(linebuf, 0, string.length());

        return string.equals(cur);
    }

    public boolean checkBounds(String[] vals, int idx, boolean mandatory) {
        if (vals.length <= idx) {
            if (mandatory) {
                addError("Missing mandatory field " + idx);
            }
            return false;
        }
        else {
            String val = vals[idx];

            if (val == null || "".equals(val.trim())) {
                if (mandatory) {
                    addError("Missing mandatory field " + idx);
                }
                return false;
            }
        }
        return true;
    }

    public Date getDateValue(String[] strVals, int idx, boolean mandatory) {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            Date d = dateFormat.parse(strVal);

            return d;
        }
        catch (NumberFormatException e) {
            log.error("Illegal date value '" + strVal + "'", e);
            addError("Illegal date value '" + strVal + "'");
        }
        catch (ParseException e) {
            addError("Illegal date value '" + strVal + "'");
        }
        return null;
    }

    public Integer getIntegerValue(String[] strVals, int idx, boolean mandatory) {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            return new Integer(strVal);
        }
        catch (NumberFormatException e) {
            addError("Illegal integer value '" + strVal + "'");
        }
        return null;
    }

    public byte[] getBinaryValue(String[] strVals, int idx, boolean mandatory) {
        if (binary == null && mandatory) {
            addError("Missing mandatory field " + idx);
        }
        byte[] bin = binary;
        binary = null;
        return bin;
    }

    public BigDecimal getDecimalValue(String[] strVals, int idx, boolean mandatory) {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            return new BigDecimal(strVal);
        }
        catch (NumberFormatException e) {
            addError("Illegal decimal value '" + strVal + "'");
        }
        return null;
    }

    public BigDecimal getPackedDecimalValue(String[] strVals, int idx, boolean mandatory, int decimalCount) {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            int mid = strVal.length() - decimalCount;
            String s = strVal.substring(0, mid);
            String e = strVal.substring(mid);
            return new BigDecimal(s + "." + e);
        }
        catch (NumberFormatException e) {
            addError("Illegal packed decimal value '" + strVal + "'");
        }
        return null;
    }

    public String getStringValue(String[] strVals, int idx, int minSize, int maxSize, boolean mandatory) {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        strVal = strVal.trim();

        if (strVal.length() > maxSize) {
            addError("Field value '" + strVal + "' is too long.  Max length: " + maxSize);
        }
        if (strVal.length() < minSize) {
            addError("Field value '" + strVal + "' is too short.  Min length: " + minSize);
        }
        if ("".equals(strVal)) {
            return null;
        }
        return strVal;
    }

    public String[] getCompositeValue(String strVal, int elementCount) {
        List elements = new ArrayList(elementCount);
        int sidx = 0;
        int eidx = strVal.indexOf(subelementSep);

        while (eidx != -1) {
            elements.add(strVal.substring(sidx, eidx));
            sidx = eidx + 1;
            eidx = strVal.indexOf(subelementSep, sidx);
        }
        elements.add(strVal.substring(sidx));

        String[] ret = (String[]) elements.toArray(new String[elements.size()]);

        if (ret.length > elementCount) {
            addError(
                    "Unexpected number of composite field elements.  Expected " + elementCount
                    + " but got " + ret.length);
        }
        return ret;
    }

    public void validateInputValue(final String value, final Object[] legalValues, final String fieldName, final String overrideKey) {
        if (!EDIUtils.validateValue(value, legalValues)) {
            addError("[" + overrideKey + "]: Field '" + fieldName + "' cannot have a value of: " + value);
        }
    }

    public void eatSegments(String name) throws IOException {
        while (peekSegment(name)) {
            readSegment(false);
            nextLine();
        }
    }

    private void nextLine() {
        segmentCount++;
        currentLineNumber++;
    }

    /**
     * @return
     */
    public char getFieldSeperator() {
        return fieldSep;
    }

    /**
     * @return
     */
    public char getSegmentSeperator() {
        return segmentSep;
    }

    /**
     * @return
     */
    public char getSubelementSeperator() {
        return subelementSep;
    }

}
