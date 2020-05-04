package com.webify.shared.edi.parser.sef;


import java.io.IOException;
import java.io.PrintWriter;


/**
 * References a composite field
 *
 * @author mperham
 * @version $Id: X12FieldReference.java 74 2004-09-16 23:04:46Z mperham $
 */
public class X12FieldReference extends X12Element {

    private short ordinal = 0;
    private short mask = 0;
    private short position = 0;
    private String id = null;

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

    public X12Field getField() {
        return X12Handler.getInstance().getField(getId());
    }

    public byte getUsage(X12Mask mask, int idx) {
        byte usage = getUsageNote();

        if (mask != null) {
            X12FieldOverride o = mask.getFieldOverride(idx);

            if (!o.isDefault() && o.getUsage() != X12Element.USAGE_DEFAULT) {
                usage = o.getUsage();
            }
        }
        return usage;
    }

    public boolean isUsed(X12Mask mask, int idx) {
        return (getUsage(mask, idx) != X12Element.USAGE_NOT_USED);
    }

    public void toDebugString(StringBuffer sb, int lvl) {
        super.toDebugString(sb, lvl);

        sb.append(getName());
        sb.append(" (").append(getMask()).append("/").append(getOrdinal()).append("/").append(getPosition()).append(
                ")");
        sb.append("\n");
    }

    public String getId() {
        return id;
    }

    public void setId(String string) {
        id = string;
    }
    
    public void emit(String xaType, PrintWriter out, X12Mask maskObj, int fieldIdx) throws IOException {
        String type = getField().getTypeClass(mask);
        String name = getCamelName();

        // write the base property info to the segment outputstream
        out.println("\tprivate " + type + " " + name + ";");
        out.println("\tpublic " + type + " get" + name + "() { return " + name + "; }");
        if ("String".equals(type) && getField().getCodeset() != null) {
            out.println("\tpublic void set" + name + "(" + type + " val) {");
            if (getUsage(maskObj, fieldIdx) == X12Element.USAGE_MUST_USE) {
                out.println("\t\tif (val == null) {");
                out.println(
                        "\t\t\tthrow new NullPointerException(\"Field '" + getName()
                        + "' may not be null\");");
                out.println("\t\t}");
            }
            out.println("\t\tif (Field" + getField().getId() + ".validateValue(val)) {");
            out.println("\t\t\t" + name + " = val;");
            out.println("\t\t} else {");
            out.println(
                    "\t\t\tthrow new IllegalArgumentException(\"Field '" + getName()
                    + "' cannot have value: \" + val);");
            out.println("\t\t}");
            out.println("\t}");
        }
        else {
            out.println("\tpublic void set" + name + "(" + type + " val) { " + name + " = val; }");
        }
        out.println();
    }

}
