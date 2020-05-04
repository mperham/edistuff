package com.webify.shared.edi.parser.sef;


import java.io.IOException;


/**
 * This object is necessary to handle "masks" which are variations of base segment
 * which have difference semantics depending on the mask.  A segment might have 5 fields
 * but at one location in the document 3 of those fields are required whereas at another
 * location all 5 are required.
 *
 * @author mperham
 * @version $Id: X12SegmentReference.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12SegmentReference extends X12Element {

    private short ordinal = 0;
    private short mask = 0;
    private short position = 0;

    private String baseName = null;

    public void emit(String xaType) throws IOException {}

    public short getMask() {
        return mask;
    }

    public short getOrdinal() {
        return ordinal;
    }

    public short getPosition() {
        return position;
    }

    public void setMask(short s) {
        mask = s;
    }

    public void setOrdinal(short s) {
        ordinal = s;
    }

    public void setPosition(short s) {
        position = s;
    }

    public X12Segment getSegment() {
        return X12Handler.getInstance().getSegment(getBaseName());
    }

    public X12Mask getSegmentMask() {
        if (mask == 0) {
            return null;
        }
        X12Mask maskObj = (X12Mask) getSegment().getMasks().get(mask);

        return maskObj;
    }

    public String getJavaType() {
        String type = "Segment" + getBaseName();

        if (mask > 0) {
            type += "_" + mask;
        }
        return type;
    }

    public void toDebugString(StringBuffer sb, int lvl) {
        super.toDebugString(sb, lvl);

        sb.append(getName());
        sb.append(" (").append(getMask()).append("/").append(getOrdinal()).append("/").append(getPosition()).append(
                ")");
        sb.append("\n");
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String string) {
        baseName = string;
    }

}
