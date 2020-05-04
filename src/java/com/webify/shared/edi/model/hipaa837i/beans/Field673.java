package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field673 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[160];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "43" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "45", "58" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "60", "70" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "72", "99" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "1A", "3N" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "3P", "3Y" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "4A", "4U" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "5A", "6X" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "6Z", "8S" };
		DEFAULT_LEGAL_VALUES[9] = "9A";
		DEFAULT_LEGAL_VALUES[10] = new String[] { "9C", "9F" };
		DEFAULT_LEGAL_VALUES[11] = "9H";
		DEFAULT_LEGAL_VALUES[12] = new String[] { "9J", "9N" };
		DEFAULT_LEGAL_VALUES[13] = new String[] { "A1", "A9" };
		DEFAULT_LEGAL_VALUES[14] = new String[] { "AA", "AL" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "AN", "AZ" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "B1", "B8" };
		DEFAULT_LEGAL_VALUES[17] = new String[] { "BA", "BK" };
		DEFAULT_LEGAL_VALUES[18] = "BQ";
		DEFAULT_LEGAL_VALUES[19] = "BR";
		DEFAULT_LEGAL_VALUES[20] = "BW";
		DEFAULT_LEGAL_VALUES[21] = "C0";
		DEFAULT_LEGAL_VALUES[22] = new String[] { "CA", "CI" };
		DEFAULT_LEGAL_VALUES[23] = "CL";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "CN", "CP" };
		DEFAULT_LEGAL_VALUES[25] = "CR";
		DEFAULT_LEGAL_VALUES[26] = "CS";
		DEFAULT_LEGAL_VALUES[27] = "CW";
		DEFAULT_LEGAL_VALUES[28] = "CY";
		DEFAULT_LEGAL_VALUES[29] = "CZ";
		DEFAULT_LEGAL_VALUES[30] = "D1";
		DEFAULT_LEGAL_VALUES[31] = "D3";
		DEFAULT_LEGAL_VALUES[32] = new String[] { "DA", "DG" };
		DEFAULT_LEGAL_VALUES[33] = "DI";
		DEFAULT_LEGAL_VALUES[34] = new String[] { "DN", "DP" };
		DEFAULT_LEGAL_VALUES[35] = new String[] { "DR", "DT" };
		DEFAULT_LEGAL_VALUES[36] = "DY";
		DEFAULT_LEGAL_VALUES[37] = new String[] { "E1", "E5" };
		DEFAULT_LEGAL_VALUES[38] = new String[] { "EA", "EE" };
		DEFAULT_LEGAL_VALUES[39] = "EM";
		DEFAULT_LEGAL_VALUES[40] = new String[] { "EP", "ET" };
		DEFAULT_LEGAL_VALUES[41] = "EW";
		DEFAULT_LEGAL_VALUES[42] = "F1";
		DEFAULT_LEGAL_VALUES[43] = new String[] { "FA", "FM" };
		DEFAULT_LEGAL_VALUES[44] = new String[] { "FR", "FT" };
		DEFAULT_LEGAL_VALUES[45] = new String[] { "GA", "GC" };
		DEFAULT_LEGAL_VALUES[46] = "GE";
		DEFAULT_LEGAL_VALUES[47] = "GF";
		DEFAULT_LEGAL_VALUES[48] = "GI";
		DEFAULT_LEGAL_VALUES[49] = "GL";
		DEFAULT_LEGAL_VALUES[50] = new String[] { "GP", "GX" };
		DEFAULT_LEGAL_VALUES[51] = new String[] { "GZ", "HP" };
		DEFAULT_LEGAL_VALUES[52] = "HR";
		DEFAULT_LEGAL_VALUES[53] = "HS";
		DEFAULT_LEGAL_VALUES[54] = "II";
		DEFAULT_LEGAL_VALUES[55] = "IN";
		DEFAULT_LEGAL_VALUES[56] = "IP";
		DEFAULT_LEGAL_VALUES[57] = "IQ";
		DEFAULT_LEGAL_VALUES[58] = "IS";
		DEFAULT_LEGAL_VALUES[59] = "IT";
		DEFAULT_LEGAL_VALUES[60] = new String[] { "JA", "JT" };
		DEFAULT_LEGAL_VALUES[61] = "K6";
		DEFAULT_LEGAL_VALUES[62] = new String[] { "KA", "KS" };
		DEFAULT_LEGAL_VALUES[63] = new String[] { "KU", "KZ" };
		DEFAULT_LEGAL_VALUES[64] = new String[] { "L2", "L7" };
		DEFAULT_LEGAL_VALUES[65] = new String[] { "LA", "LC" };
		DEFAULT_LEGAL_VALUES[66] = "LE";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "LG", "LI" };
		DEFAULT_LEGAL_VALUES[68] = new String[] { "LK", "LT" };
		DEFAULT_LEGAL_VALUES[69] = new String[] { "LV", "LY" };
		DEFAULT_LEGAL_VALUES[70] = "M1";
		DEFAULT_LEGAL_VALUES[71] = "M2";
		DEFAULT_LEGAL_VALUES[72] = "MA";
		DEFAULT_LEGAL_VALUES[73] = new String[] { "MD", "MF" };
		DEFAULT_LEGAL_VALUES[74] = "MI";
		DEFAULT_LEGAL_VALUES[75] = new String[] { "MM", "MO" };
		DEFAULT_LEGAL_VALUES[76] = "MQ";
		DEFAULT_LEGAL_VALUES[77] = "MX";
		DEFAULT_LEGAL_VALUES[78] = new String[] { "N1", "N6" };
		DEFAULT_LEGAL_VALUES[79] = new String[] { "NA", "NG" };
		DEFAULT_LEGAL_VALUES[80] = "NL";
		DEFAULT_LEGAL_VALUES[81] = new String[] { "NN", "NW" };
		DEFAULT_LEGAL_VALUES[82] = "OC";
		DEFAULT_LEGAL_VALUES[83] = "OD";
		DEFAULT_LEGAL_VALUES[84] = new String[] { "OF", "OI" };
		DEFAULT_LEGAL_VALUES[85] = "OL";
		DEFAULT_LEGAL_VALUES[86] = "ON";
		DEFAULT_LEGAL_VALUES[87] = "OO";
		DEFAULT_LEGAL_VALUES[88] = "OR";
		DEFAULT_LEGAL_VALUES[89] = new String[] { "OT", "OW" };
		DEFAULT_LEGAL_VALUES[90] = "P1";
		DEFAULT_LEGAL_VALUES[91] = new String[] { "P3", "P9" };
		DEFAULT_LEGAL_VALUES[92] = new String[] { "PA", "PG" };
		DEFAULT_LEGAL_VALUES[93] = "PK";
		DEFAULT_LEGAL_VALUES[94] = "PL";
		DEFAULT_LEGAL_VALUES[95] = new String[] { "PO", "PT" };
		DEFAULT_LEGAL_VALUES[96] = "PW";
		DEFAULT_LEGAL_VALUES[97] = "PX";
		DEFAULT_LEGAL_VALUES[98] = new String[] { "Q1", "Q4" };
		DEFAULT_LEGAL_VALUES[99] = new String[] { "QA", "QF" };
		DEFAULT_LEGAL_VALUES[100] = new String[] { "QH", "QJ" };
		DEFAULT_LEGAL_VALUES[101] = new String[] { "QL", "QS" };
		DEFAULT_LEGAL_VALUES[102] = new String[] { "QU", "QX" };
		DEFAULT_LEGAL_VALUES[103] = "R3";
		DEFAULT_LEGAL_VALUES[104] = "R5";
		DEFAULT_LEGAL_VALUES[105] = "R6";
		DEFAULT_LEGAL_VALUES[106] = "R9";
		DEFAULT_LEGAL_VALUES[107] = new String[] { "RA", "RH" };
		DEFAULT_LEGAL_VALUES[108] = "RJ";
		DEFAULT_LEGAL_VALUES[109] = new String[] { "RL", "RN" };
		DEFAULT_LEGAL_VALUES[110] = "RQ";
		DEFAULT_LEGAL_VALUES[111] = "RS";
		DEFAULT_LEGAL_VALUES[112] = "RT";
		DEFAULT_LEGAL_VALUES[113] = "RW";
		DEFAULT_LEGAL_VALUES[114] = "RY";
		DEFAULT_LEGAL_VALUES[115] = new String[] { "S1", "S9" };
		DEFAULT_LEGAL_VALUES[116] = new String[] { "SA", "SY" };
		DEFAULT_LEGAL_VALUES[117] = new String[] { "T1", "T7" };
		DEFAULT_LEGAL_VALUES[118] = new String[] { "TA", "TE" };
		DEFAULT_LEGAL_VALUES[119] = new String[] { "TG", "TK" };
		DEFAULT_LEGAL_VALUES[120] = new String[] { "TM", "TP" };
		DEFAULT_LEGAL_VALUES[121] = new String[] { "TR", "TY" };
		DEFAULT_LEGAL_VALUES[122] = "UA";
		DEFAULT_LEGAL_VALUES[123] = "UG";
		DEFAULT_LEGAL_VALUES[124] = "UL";
		DEFAULT_LEGAL_VALUES[125] = "UO";
		DEFAULT_LEGAL_VALUES[126] = "US";
		DEFAULT_LEGAL_VALUES[127] = "UU";
		DEFAULT_LEGAL_VALUES[128] = new String[] { "V1", "V5" };
		DEFAULT_LEGAL_VALUES[129] = new String[] { "VA", "VN" };
		DEFAULT_LEGAL_VALUES[130] = "VP";
		DEFAULT_LEGAL_VALUES[131] = new String[] { "VR", "VT" };
		DEFAULT_LEGAL_VALUES[132] = "VV";
		DEFAULT_LEGAL_VALUES[133] = "VY";
		DEFAULT_LEGAL_VALUES[134] = new String[] { "WA", "WE" };
		DEFAULT_LEGAL_VALUES[135] = "WG";
		DEFAULT_LEGAL_VALUES[136] = "WL";
		DEFAULT_LEGAL_VALUES[137] = "WO";
		DEFAULT_LEGAL_VALUES[138] = "WP";
		DEFAULT_LEGAL_VALUES[139] = "WR";
		DEFAULT_LEGAL_VALUES[140] = "WT";
		DEFAULT_LEGAL_VALUES[141] = new String[] { "WV", "WY" };
		DEFAULT_LEGAL_VALUES[142] = "X1";
		DEFAULT_LEGAL_VALUES[143] = new String[] { "XA", "XE" };
		DEFAULT_LEGAL_VALUES[144] = "XG";
		DEFAULT_LEGAL_VALUES[145] = "XI";
		DEFAULT_LEGAL_VALUES[146] = "XJ";
		DEFAULT_LEGAL_VALUES[147] = "XL";
		DEFAULT_LEGAL_VALUES[148] = "XN";
		DEFAULT_LEGAL_VALUES[149] = "XO";
		DEFAULT_LEGAL_VALUES[150] = new String[] { "XT", "XV" };
		DEFAULT_LEGAL_VALUES[151] = new String[] { "XX", "YH" };
		DEFAULT_LEGAL_VALUES[152] = new String[] { "YJ", "YN" };
		DEFAULT_LEGAL_VALUES[153] = new String[] { "YP", "YT" };
		DEFAULT_LEGAL_VALUES[154] = new String[] { "YW", "YY" };
		DEFAULT_LEGAL_VALUES[155] = new String[] { "Z1", "Z4" };
		DEFAULT_LEGAL_VALUES[156] = "Z6";
		DEFAULT_LEGAL_VALUES[157] = new String[] { "ZA", "ZP" };
		DEFAULT_LEGAL_VALUES[158] = "ZR";
		DEFAULT_LEGAL_VALUES[159] = "ZS";
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
		currentValues[0] = "VS";
		valueOverrides.put("80-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "VS";
		valueOverrides.put("210-1", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "CA";
		currentValues[1] = "CD";
		currentValues[2] = "LA";
		currentValues[3] = "NA";
		valueOverrides.put("207-1", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "CA";
		currentValues[1] = "CD";
		currentValues[2] = "LA";
		currentValues[3] = "NA";
		valueOverrides.put("77-1", currentValues);
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