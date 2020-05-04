package com.webify.shared.edi.parser.sef;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * @author mperham
 * @version $Id: X12Field.java 647 2004-11-19 00:51:56Z mperham $
 */
public class X12Field extends X12Element {

    /*
     * N - Numeric with implied decimal point, signed. Example: N2 indicates a numeric with
     *         two decimal places. 12.34 becomes 1234. N0 indicates in integer.
     * R - Decimal Number with explicit decimal point, signed. Example: 12.34 represented in
     *         R format is 12.34. Starting with 4010, exponential notation is also supported.
     * ID - Identifier - A coded value, usually alphanumeric.
     * AN - String - alphanumeric.
     * DT - Date - YYMMDD. As of 4010, CCYYMMDD is also supported.
     * TM - Time - HHMM, with optional seconds and hundredths.
     * B - Binary - Any sequence of 8 bit bytes.
     */

    public static final byte TYPE_STRING = 0; // AN
    public static final byte TYPE_DECIMAL = 1; // R
    public static final byte TYPE_ID = 2; // ID
    public static final byte TYPE_INTEGER = 3; // N0
    public static final byte TYPE_DATE = 4; // DT
    public static final byte TYPE_TIME = 5; // TM
    public static final byte TYPE_BINARY = 6; // B
    public static final byte TYPE_PACKED_DECIMAL = 7; // Nx
    public static final byte TYPE_COMPOSITE = 8;

    private byte minimumSize;
    private int maximumSize;
    private byte type;
    private String id;
    private X12Codeset codeset = null;
    private byte decimals = 0;
    private boolean emitted = false;

    public int getMaximumSize() {
        return maximumSize;
    }

    public byte getMinimumSize() {
        return minimumSize;
    }

    public void setMaximumSize(int i) {
        maximumSize = i;
    }

    public void setMinimumSize(byte i) {
        minimumSize = i;
    }

    public void toDebugString(StringBuffer sb, int lvl) {
        super.toDebugString(sb, lvl);

        sb.append(getName()).append(": ");
        sb.append(getFieldType());
        sb.append("(");
        sb.append(getMinimumSize());
        sb.append(",");
        sb.append(getMaximumSize());
        sb.append(") #");
        sb.append(getId());
        if (isRequired()) {
            sb.append(" *");
        }
        sb.append("\n");
    }

    public String getFieldType() {
        switch (getType()) {
            case TYPE_STRING:
                return "STRING";

            case TYPE_DECIMAL:
                return "DECIMAL";

            case TYPE_ID:
                return "ID";

            case TYPE_INTEGER:
                return "INTEGER";

            case TYPE_DATE:
                return "DATE";

            case TYPE_TIME:
                return "TIME";

            case TYPE_BINARY:
                return "BINARY";

            case TYPE_COMPOSITE:
                return "COMPOSITE";

            case TYPE_PACKED_DECIMAL:
                return "PACKED DECIMAL";

            default:
                return "UNKNOWN";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String s) {
        id = s;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte b) {
        type = b;
    }

    public X12Codeset getCodeset() {
        return codeset;
    }

    public void setCodeset(X12Codeset codeset) {
        this.codeset = codeset;
    }

    public String getTypeClass(int mask) {
        switch (getType()) {
            case TYPE_DECIMAL:
            case TYPE_PACKED_DECIMAL:
                return "java.math.BigDecimal";

            case TYPE_INTEGER:
                return "Integer";

            case TYPE_DATE:
                return "Date";

            case TYPE_BINARY:
                return "byte[]";

            default:
                return "String";
        }
    }

    public byte getDecimals() {
        return decimals;
    }

    public void setDecimals(byte b) {
        decimals = b;
    }

    public void emit(String xaType) throws IOException {
        if (emitted || getCodeset() == null) {
            return;
        }
        emitted = true;

        String name = getName();
        String classname = "Field" + getId();
        FileWriter fw = new FileWriter(classname + ".java");
        PrintWriter out = new PrintWriter(fw);
        String typeStr = null;
        X12Codeset theCodeset = getCodeset();

        try {

            out.println("package com.webify.shared.edi.model.hipaa" + xaType + ".beans;");
            out.println();
            out.println("import java.util.*;");
            out.println("import com.webify.shared.edi.model.*;");
            out.println();
            out.println("/*");
            out.println(" * AUTOGENERATED FILE - DO NOT EDIT!!!");
            out.println(" */");
            out.println("public class " + classname + " {");
            out.println();
            out.println(
                    "\tprivate static final Object[] DEFAULT_LEGAL_VALUES = new Object["
                            + theCodeset.getLegalValues().length + "];");
            out.println("\tprivate static final Map valueOverrides = new HashMap();");
            out.println();
            out.println("\tstatic {");

            Object[] values = theCodeset.getLegalValues();

            for (int i = 0; i < values.length; i++) {
                Object object = values[i];

                if (object instanceof String) {
                    out.println("\t\tDEFAULT_LEGAL_VALUES[" + i + "] = \"" + object + "\";");
                }
                else if (object instanceof X12Codeset.StringRange) {
                    X12Codeset.StringRange range = (X12Codeset.StringRange) object;

                    out.println(
                            "\t\tDEFAULT_LEGAL_VALUES[" + i + "] = new String[] { \""
                            + range.getMin() + "\", \"" + range.getMax() + "\" };");
                }
            }

            out.println("\t\tcreateOverrides();");
            out.println("\t}");
            out.println();

            out.println("\tpublic static Object[] getLegalValues(String overrideKey) {");
            out.println("\t\tObject[] currentValues = (Object[]) valueOverrides.get(overrideKey);");
            out.println("\t\tif (currentValues == null) {");
            out.println("\t\t\treturn DEFAULT_LEGAL_VALUES;");
            out.println("\t\t}");
            out.println("\t\treturn currentValues;");
            out.println("\t}");
            out.println();

            out.println("\tprivate static void createOverrides() {");
            out.println("\t\tObject[] currentValues = null;");
            Map overrides = theCodeset.getOverrideMap();
            Set keys = overrides.keySet();

            for (Iterator it = keys.iterator(); it.hasNext();) {
                String key = (String) it.next();
                X12Codeset override = (X12Codeset) overrides.get(key);

                if (override.getLegalValues().length == 0) {
                    continue;
                }
                out.println();
                out.println(
                        "\t\tcurrentValues = new Object[" + override.getLegalValues().length + "];");

                values = override.getLegalValues();
                for (int i = 0; i < values.length; i++) {
                    Object object = values[i];

                    if (object instanceof String) {
                        out.println("\t\tcurrentValues[" + i + "] = \"" + object + "\";");
                    }
                    else if (object instanceof X12Codeset.StringRange) {
                        X12Codeset.StringRange range = (X12Codeset.StringRange) object;

                        out.println(
                                "\t\tcurrentValues[" + i + "] = new String[] { \"" + range.getMin()
                                + "\", \"" + range.getMax() + "\" };");
                    }
                }

                out.println("\t\tvalueOverrides.put(\"" + key + "\", currentValues);");
            }
            out.println("\t}");
            out.println();

            out.println("\tpublic static boolean validateValue(String value) {");
            out.println("\t\treturn EDIUtils.validateValue(value, DEFAULT_LEGAL_VALUES);");
            out.println("\t}");
            out.println();

            out.println(
                    "\tpublic static void validateInputValue(EDIInputStream eis, String fieldName, "
                    + "String value, int segmentOrdinal, int fieldOrdinal) {");
            out.println("\t\tString overrideKey = segmentOrdinal + \"-\" + fieldOrdinal;");
            out.println("\t\tObject[] values = (Object[]) valueOverrides.get(overrideKey);");
            out.println(
                    "\t\teis.validateInputValue(value, (values == null ? DEFAULT_LEGAL_VALUES : values), "
                    + "fieldName, overrideKey);");
            out.println("\t}");
            out.println();

            out.println(
                    "\tpublic static void validateInputValue(EDIInputStream eis, String fieldName, "
                    + "String value, String compositeOrdinal, int elementOrdinal) {");
            out.println("\t\tString overrideKey = compositeOrdinal + \"-\" + elementOrdinal;");
            out.println("\t\tObject[] values = (Object[]) valueOverrides.get(overrideKey);");
            out.println(
                    "\t\teis.validateInputValue(value, (values == null ? DEFAULT_LEGAL_VALUES : values), "
                    + "fieldName, overrideKey);");
            out.println("\t}");
            out.println("}");
        }
        finally {
            out.close();
            fw.close();
        }

    }

}
