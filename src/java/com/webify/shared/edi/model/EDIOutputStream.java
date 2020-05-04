package com.webify.shared.edi.model;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author mperham
 * @version $Id: EDIOutputStream.java 647 2004-11-19 00:51:56Z mperham $
 */
public class EDIOutputStream extends DataOutputStream {

    private int totalSegmentsWritten;
    private boolean testing = false;
    private char segmentSep = '~', fieldSep = '*', elementSep = ':';
    private final DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    private final DecimalFormat nf = (DecimalFormat) NumberFormat.getNumberInstance();
    private final DecimalFormat nfamt = (DecimalFormat) NumberFormat.getNumberInstance();
    private int fieldCount = 0;
    private int elementCount = 0;
    private int nullFields = 0;
    private int nullElements = 0;

    // this tracks the number of segments so it can be emitted in the GE segment
    private int segmentsStarted = 0;
    private int segmentsEnded = 0;

    private List errors;
    private String currentSegment;

    private void init() {
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(2);
        nf.setGroupingUsed(false);

        nfamt.setGroupingUsed(false);
    }

    public EDIOutputStream(OutputStream arg0, char segSep, char fSep, char elemSep) {
        super(arg0);
        this.segmentSep = segSep;
        this.fieldSep = fSep;
        this.elementSep = elemSep;
        init();
    }

    public EDIOutputStream(OutputStream arg0) {
        super(arg0);
        init();
    }

    // Error support
    public boolean hasErrors() {
        return (errors != null && errors.size() > 0);
    }

    public List getErrors() {
        return errors;
    }

    public void addError(String msg) {
        if (errors == null) {
            errors = new ArrayList();
        }
        errors.add(new EDIParseError(msg, currentSegment, segmentsStarted, new EDIParseException()));
    }

    private void writeFieldSep() throws IOException {
        // emit any cached null fields
        for (; nullFields > 0; nullFields--) {
            write(fieldSep);
        }
        write(fieldSep);
        fieldCount++;
    }

    private void writeElementSep() throws IOException {
        // emit any cached null fields
        if (nullFields > 0) {
            for (; nullFields > 0; nullFields--) {
                write(fieldSep);
            }
        }
        if (elementCount == 0) {
            write(fieldSep);
        }

        // emit any cached null elements
        if (nullElements > 0) {
            for (; nullElements > 0; nullElements--) {
                write(elementSep);
            }
        }
        if (elementCount > 0) {
            write(elementSep);
        }
        elementCount++;
    }

    public void writeField(String val) throws IOException {
        if (val != null) {
            writeField(val.getBytes());
        }
        else {
            writeNullField();
        }
    }

    public void writeField(Date val) throws IOException {
        String str = null;

        if (val != null) {
            str = formatter.format(val);
        }

        writeField(str);
    }

    public void writeField(byte[] val) throws IOException {
        if (val != null) {
            writeFieldSep();
            write(val);
        }
        else {
            writeNullField();
        }
    }

    void writeField(String val, int fieldSize) throws IOException {
        writeFieldSep();
        int length = 0;

        if (val != null) {
            length = val.length();
            write(val.getBytes());
        }

        for (int i = 0; i < (fieldSize - length); i++) {
            write(' ');
        }
    }

    public void writeField(Integer val) throws IOException {
        if (val != null) {
            writeFieldSep();
            write(val.toString().getBytes());
        }
        else {
            writeNullField();
        }
    }

    public void writeField(int val) throws IOException {
        writeFieldSep();
        write(Integer.toString(val).getBytes());
    }

    public void writeField(BigDecimal val) throws IOException {
        if (val != null) {
            writeFieldSep();
            String value = EDIUtils.stripTrailingZeros(val.toString());
            write(value.getBytes());
        }
        else {
            writeNullField();
        }
    }

    public void writeElement(String val) throws IOException {
        if (val != null) {
            writeElementSep();
            write(val.getBytes());
        }
        else {
            writeNullElement();
        }
    }

    public void writeElement(Integer val) throws IOException {
        if (val != null) {
            writeElementSep();
            write(val.toString().getBytes());
        }
        else {
            writeNullElement();
        }
    }

    public void writeElement(Date val) throws IOException {
        if (val != null) {
            writeElementSep();
            write(val.toString().getBytes());
        }
        else {
            writeNullElement();
        }
    }

    public void writeElement(BigDecimal val) throws IOException {
        if (val != null) {
            writeElementSep();
            String value = EDIUtils.stripTrailingZeros(val.toString());
            write(value.getBytes());
        }
        else {
            writeNullElement();
        }
    }

    public void writeNullElement() throws IOException {
        nullElements++;
    }

    public void writeNullField() throws IOException {
        nullFields++;
    }

    public void startComposite() {
    }

    public void startSegment(String name) throws IOException {
        currentSegment = name;
        write(name.getBytes());

        if (segmentsEnded != segmentsStarted) {
            throw new IllegalStateException("startSegment() call count != endSegment() call count");
        }
        segmentsStarted++;
    }

    public void endComposite() {
        elementCount = 0;
        nullElements = 0;
    }

    public void endSegment() throws IOException {
        write(segmentSep);
        if (testing) {
            write("\r\n".getBytes());
        }
        fieldCount = 0;
        nullFields = 0;
        totalSegmentsWritten++;

        segmentsEnded++;
        if (segmentsEnded != segmentsStarted) {
            throw new IllegalStateException("startSegment() call count != endSegment() call count");
        }
    }

    public int getSegmentsWritten() {
        return segmentsStarted;
    }

    public void resetSegmentsWritten() {
        segmentsStarted = 0;
        segmentsEnded = 0;
    }

    public int getTotalSegmentsWritten() {
        return totalSegmentsWritten;
    }

    void setTest() {
        testing = true;
    }

}
