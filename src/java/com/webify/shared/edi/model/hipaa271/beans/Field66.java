package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field66 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[97];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = "A";
		DEFAULT_LEGAL_VALUES[2] = new String[] { "C", "G" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "I", "L" };
		DEFAULT_LEGAL_VALUES[4] = "N";
		DEFAULT_LEGAL_VALUES[5] = "S";
		DEFAULT_LEGAL_VALUES[6] = new String[] { "10", "50" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "53", "59" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "61", "64" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "71", "78" };
		DEFAULT_LEGAL_VALUES[10] = "81";
		DEFAULT_LEGAL_VALUES[11] = "82";
		DEFAULT_LEGAL_VALUES[12] = new String[] { "90", "99" };
		DEFAULT_LEGAL_VALUES[13] = new String[] { "A1", "A6" };
		DEFAULT_LEGAL_VALUES[14] = new String[] { "AA", "AE" };
		DEFAULT_LEGAL_VALUES[15] = "AL";
		DEFAULT_LEGAL_VALUES[16] = "AP";
		DEFAULT_LEGAL_VALUES[17] = new String[] { "BC", "BE" };
		DEFAULT_LEGAL_VALUES[18] = "BG";
		DEFAULT_LEGAL_VALUES[19] = "BP";
		DEFAULT_LEGAL_VALUES[20] = "BS";
		DEFAULT_LEGAL_VALUES[21] = "C1";
		DEFAULT_LEGAL_VALUES[22] = "C2";
		DEFAULT_LEGAL_VALUES[23] = "C5";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "CA", "CF" };
		DEFAULT_LEGAL_VALUES[25] = "CI";
		DEFAULT_LEGAL_VALUES[26] = "CL";
		DEFAULT_LEGAL_VALUES[27] = "CM";
		DEFAULT_LEGAL_VALUES[28] = "CP";
		DEFAULT_LEGAL_VALUES[29] = new String[] { "CR", "CT" };
		DEFAULT_LEGAL_VALUES[30] = "DG";
		DEFAULT_LEGAL_VALUES[31] = "DL";
		DEFAULT_LEGAL_VALUES[32] = "DN";
		DEFAULT_LEGAL_VALUES[33] = "DP";
		DEFAULT_LEGAL_VALUES[34] = "DS";
		DEFAULT_LEGAL_VALUES[35] = "EC";
		DEFAULT_LEGAL_VALUES[36] = "EH";
		DEFAULT_LEGAL_VALUES[37] = "EI";
		DEFAULT_LEGAL_VALUES[38] = new String[] { "EP", "ES" };
		DEFAULT_LEGAL_VALUES[39] = new String[] { "FA", "FD" };
		DEFAULT_LEGAL_VALUES[40] = "FI";
		DEFAULT_LEGAL_VALUES[41] = "FJ";
		DEFAULT_LEGAL_VALUES[42] = "FN";
		DEFAULT_LEGAL_VALUES[43] = "GA";
		DEFAULT_LEGAL_VALUES[44] = "GC";
		DEFAULT_LEGAL_VALUES[45] = "HC";
		DEFAULT_LEGAL_VALUES[46] = "HN";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "LC", "LE" };
		DEFAULT_LEGAL_VALUES[48] = "LI";
		DEFAULT_LEGAL_VALUES[49] = "LN";
		DEFAULT_LEGAL_VALUES[50] = new String[] { "M3", "M6" };
		DEFAULT_LEGAL_VALUES[51] = new String[] { "MA", "MD" };
		DEFAULT_LEGAL_VALUES[52] = "MI";
		DEFAULT_LEGAL_VALUES[53] = "MK";
		DEFAULT_LEGAL_VALUES[54] = "ML";
		DEFAULT_LEGAL_VALUES[55] = "MN";
		DEFAULT_LEGAL_VALUES[56] = "MP";
		DEFAULT_LEGAL_VALUES[57] = "MR";
		DEFAULT_LEGAL_VALUES[58] = "NA";
		DEFAULT_LEGAL_VALUES[59] = "ND";
		DEFAULT_LEGAL_VALUES[60] = "NI";
		DEFAULT_LEGAL_VALUES[61] = "NO";
		DEFAULT_LEGAL_VALUES[62] = "OC";
		DEFAULT_LEGAL_VALUES[63] = "OP";
		DEFAULT_LEGAL_VALUES[64] = new String[] { "PA", "PC" };
		DEFAULT_LEGAL_VALUES[65] = "PI";
		DEFAULT_LEGAL_VALUES[66] = "PP";
		DEFAULT_LEGAL_VALUES[67] = "PR";
		DEFAULT_LEGAL_VALUES[68] = new String[] { "RA", "RE" };
		DEFAULT_LEGAL_VALUES[69] = "RT";
		DEFAULT_LEGAL_VALUES[70] = "SA";
		DEFAULT_LEGAL_VALUES[71] = "SB";
		DEFAULT_LEGAL_VALUES[72] = "SD";
		DEFAULT_LEGAL_VALUES[73] = "SF";
		DEFAULT_LEGAL_VALUES[74] = "SI";
		DEFAULT_LEGAL_VALUES[75] = "SJ";
		DEFAULT_LEGAL_VALUES[76] = "SL";
		DEFAULT_LEGAL_VALUES[77] = "SP";
		DEFAULT_LEGAL_VALUES[78] = "ST";
		DEFAULT_LEGAL_VALUES[79] = "SV";
		DEFAULT_LEGAL_VALUES[80] = "SW";
		DEFAULT_LEGAL_VALUES[81] = "TA";
		DEFAULT_LEGAL_VALUES[82] = "TC";
		DEFAULT_LEGAL_VALUES[83] = "TZ";
		DEFAULT_LEGAL_VALUES[84] = "UC";
		DEFAULT_LEGAL_VALUES[85] = "UL";
		DEFAULT_LEGAL_VALUES[86] = "UM";
		DEFAULT_LEGAL_VALUES[87] = "UP";
		DEFAULT_LEGAL_VALUES[88] = "UR";
		DEFAULT_LEGAL_VALUES[89] = "US";
		DEFAULT_LEGAL_VALUES[90] = "WR";
		DEFAULT_LEGAL_VALUES[91] = "XV";
		DEFAULT_LEGAL_VALUES[92] = "XX";
		DEFAULT_LEGAL_VALUES[93] = "ZC";
		DEFAULT_LEGAL_VALUES[94] = "ZN";
		DEFAULT_LEGAL_VALUES[95] = "ZY";
		DEFAULT_LEGAL_VALUES[96] = "ZZ";
		createOverrides();
	}

	public static Object[] getLegalValues(String overrideKey) {
		Object[] currentValues = (Object[]) valueOverrides.get(overrideKey);
		if (currentValues == null) {
			return DEFAULT_LEGAL_VALUES;
		}
		return currentValues;
	}

	private static void createOverrides() {
		Object[] currentValues = null;

		currentValues = new Object[13];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "46";
		currentValues[3] = "FA";
		currentValues[4] = "FI";
		currentValues[5] = "MI";
		currentValues[6] = "NI";
		currentValues[7] = "PI";
		currentValues[8] = "PP";
		currentValues[9] = "SV";
		currentValues[10] = "XV";
		currentValues[11] = "XX";
		currentValues[12] = "ZZ";
		valueOverrides.put("32-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("40-8", currentValues);

		currentValues = new Object[8];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "FI";
		currentValues[3] = "PI";
		currentValues[4] = "PP";
		currentValues[5] = "SV";
		currentValues[6] = "XV";
		currentValues[7] = "XX";
		valueOverrides.put("10-8", currentValues);

		currentValues = new Object[13];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "46";
		currentValues[3] = "FA";
		currentValues[4] = "FI";
		currentValues[5] = "MI";
		currentValues[6] = "NI";
		currentValues[7] = "PI";
		currentValues[8] = "PP";
		currentValues[9] = "SV";
		currentValues[10] = "XV";
		currentValues[11] = "XX";
		currentValues[12] = "ZZ";
		valueOverrides.put("57-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("15-8", currentValues);

		currentValues = new Object[7];
		currentValues[0] = "24";
		currentValues[1] = "46";
		currentValues[2] = "FI";
		currentValues[3] = "NI";
		currentValues[4] = "PI";
		currentValues[5] = "XV";
		currentValues[6] = "XX";
		valueOverrides.put("5-8", currentValues);
	}

	public static boolean validateValue(String value) {
		return EDIUtils.validateValue(value, DEFAULT_LEGAL_VALUES);
	}

	public static void validateInputValue(EDIInputStream eis, String fieldName, String value, int segmentOrdinal, int fieldOrdinal) {
		String overrideKey = segmentOrdinal + "-" + fieldOrdinal;
		Object[] values = (Object[]) valueOverrides.get(overrideKey);
		eis.validateInputValue(value, (values == null ? DEFAULT_LEGAL_VALUES : values), fieldName, overrideKey);
	}

	public static void validateInputValue(EDIInputStream eis, String fieldName, String value, String compositeOrdinal, int elementOrdinal) {
		String overrideKey = compositeOrdinal + "-" + elementOrdinal;
		Object[] values = (Object[]) valueOverrides.get(overrideKey);
		eis.validateInputValue(value, (values == null ? DEFAULT_LEGAL_VALUES : values), fieldName, overrideKey);
	}
}
