package com.webify.shared.edi.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author mperham
 * @version $Id: EDIUtils.java 2 2004-07-05 20:20:46Z mperham $
 */
public final class EDIUtils {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    private EDIUtils() {
    }

    public static boolean validateValue(final String value, final Object[] legalValues) {
        if (value == null) {
            return true;
        }

        for (int i = 0; i < legalValues.length; i++) {
            Object legVal = legalValues[i];

            if (legVal instanceof String) {
                int result = ((String) legVal).compareTo(value);

                if (result == 0) {
                    return true;
                }
            }
            else {
                String[] legVals = (String[]) legVal;

                if (legVals[0].length() == value.length() && legVals[0].compareTo(value) <= 0
                        && legVals[1].compareTo(value) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String stringValue(String val) {
        if (val != null) {
            return val;
        }
        return "";
    }

    public static String stringValue(Integer val) {
        if (val != null) {
            return val.toString();
        }
        return "";
    }

    public static String stringValue(Date val) {
        if (val != null) {
            return val.toString();
        }
        return "";
    }

    public static String stringValue(BigDecimal val) {
        if (val != null) {
            return stripTrailingZeros(val.toString());
        }
        return "";
    }

    /**
     * X12 Standard says that trailing zeros should not be
     * printed.
     *
     * "600.00" -> "600"
     * "1.120" -> "1.12"
     *
     * Since BigDecimal keeps the trailing zeros, we need to
     * strip them after the fact.  I can't think of a better
     * solution than this, right now...
     */
    public static String stripTrailingZeros(String before) {
        if (before.indexOf('.') == -1) {
            return before;
        }

        char[] chars = before.toCharArray();
        int i = chars.length - 1;
        for (; i >= 0; i--) {
            if ('0' != chars[i]) {
                break;
            }
        }
        if ('.' == chars[i]) {
            i--;
        }
        String after = new String(chars, 0, i + 1);
        return after;
    }

    public static boolean checkBounds(String[] vals, int idx, boolean mandatory)
        throws EDIParseException {

        if (vals.length <= idx) {
            if (mandatory) {
                throw new EDIParseException("Missing mandatory field " + idx);
            }
            return false;
        }
        else {
            String val = vals[idx];

            if (val == null || "".equals(val.trim())) {
                if (mandatory) {
                    throw new EDIParseException("Missing mandatory field " + idx);
                }
                return false;
            }
        }
        return true;
    }

    public static Date getDateValue(String[] strVals, int idx, boolean mandatory)
        throws EDIParseException {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            return dateFormat.parse(strVal);
        }
        catch (Exception e) {
            throw new EDIParseException("Illegal date value '" + strVal + "'");
        }
    }

    public static Integer getIntegerValue(String[] strVals, int idx, boolean mandatory)
        throws EDIParseException {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            return new Integer(strVal);
        }
        catch (NumberFormatException e) {
            throw new EDIParseException("Illegal integer value '" + strVal + "'");
        }
    }

    public static BigDecimal getDecimalValue(String[] strVals, int idx, boolean mandatory)
        throws EDIParseException {
        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        try {
            return new BigDecimal(strVal);
        }
        catch (NumberFormatException e) {
            throw new EDIParseException("Illegal decimal value '" + strVal + "'");
        }
    }

    public static BigDecimal getPackedDecimalValue(String[] strVals, int idx, boolean mandatory,
            int decimalCount)
        throws EDIParseException {

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
            throw new EDIParseException("Illegal packed decimal value '" + strVal + "'");
        }
    }

    public static String getStringValue(String[] strVals, int idx, int minSize, int maxSize,
            boolean mandatory)
        throws EDIParseException {

        if (!checkBounds(strVals, idx, mandatory)) {
            return null;
        }
        String strVal = strVals[idx];

        strVal = strVal.trim();

        if (strVal.length() > maxSize) {
            throw new EDIParseException("Field value '" + strVal + "' is too long.  Max length: " + maxSize);
        }
        if (strVal.length() < minSize) {
            throw new EDIParseException("Field value '" + strVal + "' is too short.  Min length: " + minSize);
        }
        if ("".equals(strVal)) {
            return null;
        }
        return strVal;
    }

    private static SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");

    public static String getCurrentDate() {
        synchronized (date) {
            return date.format(new Date());
        }
    }

    private static SimpleDateFormat time = new SimpleDateFormat("hhmmss");

    public static String getCurrentTime() {
        synchronized (time) {
            return time.format(new Date());
        }
    }
}
