package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field66 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[101];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "10", "50" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "53", "59" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "61", "64" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "71", "78" };
		DEFAULT_LEGAL_VALUES[5] = "81";
		DEFAULT_LEGAL_VALUES[6] = "82";
		DEFAULT_LEGAL_VALUES[7] = new String[] { "90", "99" };
		DEFAULT_LEGAL_VALUES[8] = "A";
		DEFAULT_LEGAL_VALUES[9] = new String[] { "A1", "A6" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "AA", "AE" };
		DEFAULT_LEGAL_VALUES[11] = "AL";
		DEFAULT_LEGAL_VALUES[12] = "AP";
		DEFAULT_LEGAL_VALUES[13] = new String[] { "BC", "BE" };
		DEFAULT_LEGAL_VALUES[14] = "BG";
		DEFAULT_LEGAL_VALUES[15] = "BP";
		DEFAULT_LEGAL_VALUES[16] = "BS";
		DEFAULT_LEGAL_VALUES[17] = "C";
		DEFAULT_LEGAL_VALUES[18] = "C1";
		DEFAULT_LEGAL_VALUES[19] = "C2";
		DEFAULT_LEGAL_VALUES[20] = "C5";
		DEFAULT_LEGAL_VALUES[21] = new String[] { "CA", "CF" };
		DEFAULT_LEGAL_VALUES[22] = "CI";
		DEFAULT_LEGAL_VALUES[23] = "CL";
		DEFAULT_LEGAL_VALUES[24] = "CM";
		DEFAULT_LEGAL_VALUES[25] = "CP";
		DEFAULT_LEGAL_VALUES[26] = new String[] { "CR", "CT" };
		DEFAULT_LEGAL_VALUES[27] = "D";
		DEFAULT_LEGAL_VALUES[28] = "DG";
		DEFAULT_LEGAL_VALUES[29] = "DL";
		DEFAULT_LEGAL_VALUES[30] = "DN";
		DEFAULT_LEGAL_VALUES[31] = "DP";
		DEFAULT_LEGAL_VALUES[32] = "DS";
		DEFAULT_LEGAL_VALUES[33] = "E";
		DEFAULT_LEGAL_VALUES[34] = "EC";
		DEFAULT_LEGAL_VALUES[35] = "EH";
		DEFAULT_LEGAL_VALUES[36] = "EI";
		DEFAULT_LEGAL_VALUES[37] = new String[] { "EP", "ES" };
		DEFAULT_LEGAL_VALUES[38] = "F";
		DEFAULT_LEGAL_VALUES[39] = new String[] { "FA", "FD" };
		DEFAULT_LEGAL_VALUES[40] = "FI";
		DEFAULT_LEGAL_VALUES[41] = "FJ";
		DEFAULT_LEGAL_VALUES[42] = "FN";
		DEFAULT_LEGAL_VALUES[43] = "G";
		DEFAULT_LEGAL_VALUES[44] = "GA";
		DEFAULT_LEGAL_VALUES[45] = "GC";
		DEFAULT_LEGAL_VALUES[46] = "HC";
		DEFAULT_LEGAL_VALUES[47] = "HN";
		DEFAULT_LEGAL_VALUES[48] = new String[] { "I", "L" };
		DEFAULT_LEGAL_VALUES[49] = new String[] { "LC", "LE" };
		DEFAULT_LEGAL_VALUES[50] = "LI";
		DEFAULT_LEGAL_VALUES[51] = "LN";
		DEFAULT_LEGAL_VALUES[52] = new String[] { "M3", "M6" };
		DEFAULT_LEGAL_VALUES[53] = new String[] { "MA", "MD" };
		DEFAULT_LEGAL_VALUES[54] = "MI";
		DEFAULT_LEGAL_VALUES[55] = "MK";
		DEFAULT_LEGAL_VALUES[56] = "ML";
		DEFAULT_LEGAL_VALUES[57] = "MN";
		DEFAULT_LEGAL_VALUES[58] = "MP";
		DEFAULT_LEGAL_VALUES[59] = "MR";
		DEFAULT_LEGAL_VALUES[60] = "N";
		DEFAULT_LEGAL_VALUES[61] = "NA";
		DEFAULT_LEGAL_VALUES[62] = "ND";
		DEFAULT_LEGAL_VALUES[63] = "NI";
		DEFAULT_LEGAL_VALUES[64] = "NO";
		DEFAULT_LEGAL_VALUES[65] = "OC";
		DEFAULT_LEGAL_VALUES[66] = "OP";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "PA", "PC" };
		DEFAULT_LEGAL_VALUES[68] = "PI";
		DEFAULT_LEGAL_VALUES[69] = "PP";
		DEFAULT_LEGAL_VALUES[70] = "PR";
		DEFAULT_LEGAL_VALUES[71] = new String[] { "RA", "RE" };
		DEFAULT_LEGAL_VALUES[72] = "RT";
		DEFAULT_LEGAL_VALUES[73] = "S";
		DEFAULT_LEGAL_VALUES[74] = "SA";
		DEFAULT_LEGAL_VALUES[75] = "SB";
		DEFAULT_LEGAL_VALUES[76] = "SD";
		DEFAULT_LEGAL_VALUES[77] = "SF";
		DEFAULT_LEGAL_VALUES[78] = "SI";
		DEFAULT_LEGAL_VALUES[79] = "SJ";
		DEFAULT_LEGAL_VALUES[80] = "SL";
		DEFAULT_LEGAL_VALUES[81] = "SP";
		DEFAULT_LEGAL_VALUES[82] = "ST";
		DEFAULT_LEGAL_VALUES[83] = "SV";
		DEFAULT_LEGAL_VALUES[84] = "SW";
		DEFAULT_LEGAL_VALUES[85] = "TA";
		DEFAULT_LEGAL_VALUES[86] = "TC";
		DEFAULT_LEGAL_VALUES[87] = "TZ";
		DEFAULT_LEGAL_VALUES[88] = "UC";
		DEFAULT_LEGAL_VALUES[89] = "UL";
		DEFAULT_LEGAL_VALUES[90] = "UM";
		DEFAULT_LEGAL_VALUES[91] = "UP";
		DEFAULT_LEGAL_VALUES[92] = "UR";
		DEFAULT_LEGAL_VALUES[93] = "US";
		DEFAULT_LEGAL_VALUES[94] = "WR";
		DEFAULT_LEGAL_VALUES[95] = "XV";
		DEFAULT_LEGAL_VALUES[96] = "XX";
		DEFAULT_LEGAL_VALUES[97] = "ZC";
		DEFAULT_LEGAL_VALUES[98] = "ZN";
		DEFAULT_LEGAL_VALUES[99] = "ZY";
		DEFAULT_LEGAL_VALUES[100] = "ZZ";
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

		currentValues = new Object[1];
		currentValues[0] = "AC";
		valueOverrides.put("43-5", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("90-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "46";
		valueOverrides.put("6-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "EI";
		currentValues[1] = "MI";
		valueOverrides.put("255-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AC";
		valueOverrides.put("270-5", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("214-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("281-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "PI";
		currentValues[1] = "XV";
		valueOverrides.put("31-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("278-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("148-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("81-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("162-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("223-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("211-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AC";
		valueOverrides.put("140-5", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("154-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("84-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "EI";
		currentValues[1] = "MI";
		valueOverrides.put("125-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("16-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("151-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("245-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "PI";
		currentValues[1] = "XV";
		valueOverrides.put("249-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("23-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "MI";
		valueOverrides.put("29-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("220-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("87-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "46";
		valueOverrides.put("4-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("145-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("10-8", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AC";
		valueOverrides.put("173-5", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "MI";
		currentValues[1] = "ZZ";
		valueOverrides.put("115-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("93-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("275-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("217-8", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "24";
		currentValues[1] = "34";
		currentValues[2] = "XX";
		valueOverrides.put("284-8", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "PI";
		currentValues[1] = "XV";
		valueOverrides.put("119-8", currentValues);
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
