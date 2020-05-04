package com.webify.shared.edi.parser.sef;


import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * @author mperham
 * @version $Id: X12LoopTrigger.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12LoopTrigger {

    private String[] values;
    private String loopName, segmentName;
    private int fieldIdx;

    public X12LoopTrigger(String loopName, String segName, int fieldIdx, String value) {
        this.loopName = loopName;
        this.segmentName = segName;
        this.fieldIdx = fieldIdx;

        if (value.indexOf(",") != -1) {
            StringTokenizer st = new StringTokenizer(value, ",");

            values = new String[st.countTokens()];
            for (int i = 0; i < values.length; i++) {
                values[i] = st.nextToken();
            }
        }
        else {
            values = new String[1];
            values[0] = value;
        }
    }

    public int getFieldIdx() {
        return fieldIdx;
    }

    public String getLoopName() {
        return loopName;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public String[] getValues() {
        return values;
    }

    public void setFieldIdx(int i) {
        fieldIdx = i;
    }

    public void setLoopName(String string) {
        loopName = string;
    }

    public void setSegmentName(String string) {
        segmentName = string;
    }

    public void setValues(String[] string) {
        values = string;
    }

    public String toString() {
        return "Trigger[" + loopName + "]: " + segmentName + "[" + fieldIdx + "] == "
                + Arrays.asList(values);
    }

}
