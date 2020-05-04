package com.webify.shared.edi.parser.sef;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * @author mperham
 * @version $Id: X12ValidationRule.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12ValidationRule {

    public static final int REQUIRE_ONE_OF = 1;
    public static final int CONDITIONAL = 2;
    public static final int EXCLUSIVE = 3;
    public static final int LIST_CONDITIONAL = 4;
    public static final int PAIRED = 5;

    private byte type = 0;
    private byte[] args = null;

    /*
     * SEF stores rules as "R0506" or "L030405".
     * The letter represents the type of rule while the numbers
     * are the arguments.
     */
    X12ValidationRule(int type, String argStr) {
        if (argStr == null || (argStr.length() % 2 != 0)) {
            throw new IllegalArgumentException("Invalid rule arguments: " + argStr);
        }
        int argCount = argStr.length() / 2;

        args = new byte[argCount];
        this.type = (byte) type;
        for (int i = 0; i < argCount; i++) {
            String arg = argStr.substring(i * 2, i * 2 + 2);

            args[i] = Byte.parseByte(arg);
        }
    }

    public void emit(PrintWriter out, String prefix, List fieldRefs, X12Mask mask) throws IOException {
        String propertyList = "";
        String first = null;
        X12FieldReference ref = null;

        /*
         * Need to verify that the fields mentioned in the validation rule
         * actually are used in this segment mask.
         */
        int activeFields = 0;

        for (int i = 0; i < args.length; i++) {
            ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
            if (ref.isUsed(mask, args[i] - 1)) {
                activeFields++;
            }
        }

        if (activeFields < 2) {
            return;
        }

        out.println("\t\t// " + getRuleType());
        switch (type) {
            case REQUIRE_ONE_OF:
                out.print("\t\tif (");
                for (int i = 0; i < args.length; i++) {
                    ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
                    String prop = prefix + getPaddedNumber(args[i]);

                    if (!ref.isUsed(mask, args[i] - 1)) {
                        out.print("/* " + prop + " */");
                        continue;
                    }

                    propertyList += prop;
                    out.print(prop + " == null");
                    if (i + 1 < args.length) {
                        propertyList += ", ";
                        out.print(" && ");
                    }
                }
                out.println(") {");
                out.println(
                        "\t\t\teis.addError(\"Segment '" + prefix
                        + "' requires at least one field of the following to be set: "
                        + propertyList + "\");");
                out.println("\t\t}");
                out.println();
                break;

            case CONDITIONAL:
                ref = (X12FieldReference) fieldRefs.get(args[0] - 1);
                if (!ref.isUsed(mask, args[0] - 1)) {
                    return;
                }

                first = prefix + getPaddedNumber(args[0]);
                out.println("\t\tif (" + first + " != null) {");
                out.print("\t\t\tif (");
                for (int i = 1; i < args.length; i++) {
                    ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
                    if (!ref.isUsed(mask, args[i] - 1)) {
                        continue;
                    }

                    String prop = prefix + getPaddedNumber(args[i]);

                    propertyList += prop;
                    out.print(prop + " == null");
                    if (i + 1 < args.length) {
                        propertyList += ", ";
                        out.print(" || ");
                    }
                }
                out.println(") {");
                out.println(
                        "\t\t\t\teis.addError(\"If '" + first
                        + "' is set, the following must be set also: " + propertyList + "\");");
                out.println("\t\t\t}");
                out.println("\t\t}");
                out.println();
                break;

            case EXCLUSIVE:
                out.println("\t\t{");
                out.println("\t\t\tint setCount = 0;");
                for (int i = 0; i < args.length; i++) {
                    ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
                    String prop = prefix + getPaddedNumber(args[i]);

                    if (!ref.isUsed(mask, args[i] - 1)) {
                        out.println("/* " + prop + " */");
                        continue;
                    }

                    propertyList += prop;
                    out.println("\t\t\tif (" + prop + " != null) setCount++;");
                    if (i + 1 < args.length) {
                        propertyList += ", ";
                    }
                }
                out.println("\t\t\tif (setCount > 1) {");
                out.println(
                        "\t\t\t\teis.addError(\"Only one of the following properties may be set: "
                                + propertyList + "\");");
                out.println("\t\t\t}");
                out.println("\t\t}");
                out.println();
                break;

            case LIST_CONDITIONAL:
                ref = (X12FieldReference) fieldRefs.get(args[0]);
                if (!ref.isUsed(mask, args[0] - 1)) {
                    return;
                }

                first = prefix + getPaddedNumber(args[0]);
                out.println("\t\tif (" + first + " != null) {");
                out.print("\t\t\tif (");
                for (int i = 1; i < args.length; i++) {
                    ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
                    String prop = prefix + getPaddedNumber(args[i]);

                    if (!ref.isUsed(mask, args[i] - 1)) {
                        out.print("/* " + prop + " */");
                        continue;
                    }

                    propertyList += prop;
                    out.print(prop + " == null");
                    if (i + 1 < args.length) {
                        propertyList += ", ";
                        out.print(" || ");
                    }
                }
                out.println(") {");
                out.println(
                        "\t\t\t\teis.addError(\"If '" + first
                        + "' is set, the following must be set also: " + propertyList + "\");");
                out.println("\t\t\t}");
                out.println("\t\t}");
                out.println();
                break;

            case PAIRED:
                out.println("\t\t{");
                out.println("\t\t\tint setCount = 0;");
                for (int i = 0; i < args.length; i++) {
                    ref = (X12FieldReference) fieldRefs.get(args[i] - 1);
                    String prop = prefix + getPaddedNumber(args[i]);

                    if (!ref.isUsed(mask, args[i] - 1)) {
                        out.println("/* " + prop + " */");
                        continue;
                    }

                    propertyList += prop;
                    out.println("\t\t\tif (" + prop + " != null) setCount++;");
                    if (i + 1 < args.length) {
                        propertyList += ", ";
                    }
                }
                out.println("\t\t\tif (setCount > 0 && setCount < " + args.length + ") {");
                out.println(
                        "\t\t\t\teis.addError(\"If any of the following properties are set, all must be set: "
                                + propertyList + "\");");
                out.println("\t\t\t}");
                out.println("\t\t}");
                out.println();
                break;
        }
    }

    public void toDebugString(StringBuffer sb, int lvl) {
        for (int i = 0; i < lvl; i++) {
            sb.append("  ");
        }
        sb.append(getRuleType());
        sb.append("(");
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if (i + 1 < args.length) {
                sb.append(",");
            }
        }
        sb.append(")\n");
    }

    public String getRuleType() {
        switch (type) {
            case REQUIRE_ONE_OF:
                return "REQUIRE_ONE_OF";

            case CONDITIONAL:
                return "CONDITIONAL";

            case EXCLUSIVE:
                return "EXCLUSIVE";

            case LIST_CONDITIONAL:
                return "LIST_CONDITIONAL";

            case PAIRED:
                return "PAIRED";
        }
        return "UNKNOWN";
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
}
