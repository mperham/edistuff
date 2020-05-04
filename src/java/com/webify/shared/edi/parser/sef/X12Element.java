package com.webify.shared.edi.parser.sef;


import java.io.IOException;


/**
 * @author mperham
 * @version $Id: X12Element.java 74 2004-09-16 23:04:46Z mperham $
 */
public abstract class X12Element {

    public static final byte USAGE_DEFAULT = 0;
    public static final byte USAGE_MUST_USE = 1;
    public static final byte USAGE_RECOMMENDED = 2;
    public static final byte USAGE_NOT_USED = 3;
    public static final byte USAGE_NOT_RECOMMENDED = 4;
    public static final byte USAGE_DEPENDENT = 5;

    private short maxUsage = 1;
    private boolean optional = true;
    private byte usageNote = USAGE_DEFAULT;

    private String name, camelName = null;
    private String description = null;

    public short getMaxUsage() {
        return maxUsage;
    }

    public String getDescription() {
        return description;
    }

    /* BAR01 */
    public String getName() {
        return name;
    }
    
    /**
     * BAR -> Bar
     * 2100BA -> 2100BA
     */
    public String getCamelName() {
        if (camelName == null) {
            camelName = "";
            camelName += Character.toUpperCase(name.charAt(0));
            boolean lowerIt = true;
            for (int i = 1; i < name.length(); i++) {                
                char a = name.charAt(i);
                if (lowerIt && Character.isLetter(a)) {
                    a = Character.toLowerCase(a);
                }
                else {
                    lowerIt = false;
                }
                camelName += a;  
            }
        }
        return camelName;
    }

    public boolean isRequired() {
        return !optional;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setMaxUsage(short i) {
        maxUsage = i;
    }

    public void setDescription(String string) {
        description = string;
    }

    public void setName(String string) {
        name = string;
    }

    public void setOptional(boolean b) {
        optional = b;
    }

    public void toDebugString(StringBuffer sb, int lvl) {
        for (int i = 0; i < lvl; i++) {
            sb.append("  ");
        }
    }

    public byte getUsageNote() {
        if (isRequired()) {
            // I have no idea why they have a mandatory/optional/situational/etc flag
            // AND a must use/not use/recommended/etc flag...  Seems redundant.  Some
            // fields are set to mandatory but not must use.  Override that here.
            return X12Element.USAGE_MUST_USE;
        }
        return usageNote;
    }

    public void setUsageNote(byte b) {
        usageNote = b;
    }

    public String getReadableUsageNote() {
        switch (usageNote) {
            case USAGE_DEFAULT:
                return "USED";

            case USAGE_MUST_USE:
                return "MUST USE";

            case USAGE_NOT_USED:
                return "NOT USED";

            case USAGE_RECOMMENDED:
                return "RECOMMENDED";

            case USAGE_NOT_RECOMMENDED:
                return "NOT RECOMMENDED";
        }
        return "ERROR";
    }

    /**
     * Formats the number according to EDI conventions:
     * 0 - 9 => "00" - "09"
     * >= 10 => "XX"
     */
    public String getPaddedNumber(int num) {
        String str = Integer.toString(num);

        if (num < 10) {
            str = "0" + str;
        }
        return str;
    }

    /**
     * Emit code for this X12 Object.
     */
    public abstract void emit(String xaType) throws IOException;

    public String toString() {
        StringBuffer sb = new StringBuffer();

        toDebugString(sb, 0);
        return sb.toString();
    }

}
