package com.webify.shared.edi.parser.sef;


/**
 * @author mperham
 * @version $Id: X12FieldOverride.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12FieldOverride {

    private boolean optional = false;
    private boolean isDefault = false;
    private byte usage = X12Element.USAGE_DEFAULT;
    private short compMask, min, max, repeatCount;

    X12FieldOverride() {
        isDefault = true;
    }

    public X12FieldOverride(String usage, String mandatory, String compMask,
            String min, String max, String repeat) {

        if (".".equals(usage) && mandatory == null && compMask == null && min == null && max == null
                && repeat == null) {
            isDefault = true;
            return;
        }

        if (usage != null) {
            this.usage = convertX12Usage(usage);
        }
        if (mandatory != null) {
            optional = !"M".equals(mandatory);
        }
        if (compMask != null) {
            this.compMask = Short.parseShort(compMask);
        }
        if (min != null) {
            this.min = Short.parseShort(min);
        }
        if (max != null) {
            this.max = Short.parseShort(max);
        }
        if (repeat != null) {
            this.repeatCount = Short.parseShort(repeat);
        }
    }

    public boolean isDefault() {
        return isDefault;
    }

    private byte convertX12Usage(String usage) {
        byte use = X12Element.USAGE_DEFAULT;

        if ("@".equals(usage)) {
            use = X12Element.USAGE_MUST_USE;
        }
        else if ("#".equals(usage)) {
            use = X12Element.USAGE_NOT_USED;
        }
        else if ("$".equals(usage)) {
            use = X12Element.USAGE_RECOMMENDED;
        }
        else if ("-".equals(usage)) {
            use = X12Element.USAGE_NOT_RECOMMENDED;
        }
        else if ("&".equals(usage)) {
            use = X12Element.USAGE_DEPENDENT;
        }
        return use;
    }

    public short getMax() {
        return max;
    }

    public short getMin() {
        return min;
    }

    public boolean isOptional() {
        return optional;
    }

    public short getRepeatCount() {
        return repeatCount;
    }

    public byte getUsage() {
        return usage;
    }

    public void setDefault(boolean b) {
        isDefault = b;
    }

    public void setMax(short s) {
        max = s;
    }

    public void setMin(short s) {
        min = s;
    }

    public void setOptional(boolean b) {
        optional = b;
    }

    public void setRepeatCount(short s) {
        repeatCount = s;
    }

    public void setUsage(byte b) {
        usage = b;
    }

}
