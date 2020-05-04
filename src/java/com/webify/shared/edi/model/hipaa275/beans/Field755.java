package com.webify.shared.edi.model.hipaa275.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field755 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[114];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "97" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "A1", "A4" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "AA", "AZ" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "B1", "B4" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "BA", "BC" };
		DEFAULT_LEGAL_VALUES[5] = "BE";
		DEFAULT_LEGAL_VALUES[6] = "BF";
		DEFAULT_LEGAL_VALUES[7] = new String[] { "BL", "BO" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "BR", "BT" };
		DEFAULT_LEGAL_VALUES[9] = "BW";
		DEFAULT_LEGAL_VALUES[10] = "BY";
		DEFAULT_LEGAL_VALUES[11] = new String[] { "C1", "C9" };
		DEFAULT_LEGAL_VALUES[12] = new String[] { "CA", "CU" };
		DEFAULT_LEGAL_VALUES[13] = new String[] { "CW", "CZ" };
		DEFAULT_LEGAL_VALUES[14] = "D2";
		DEFAULT_LEGAL_VALUES[15] = new String[] { "DA", "DN" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "DQ", "DW" };
		DEFAULT_LEGAL_VALUES[17] = "E1";
		DEFAULT_LEGAL_VALUES[18] = new String[] { "EA", "ED" };
		DEFAULT_LEGAL_VALUES[19] = "EL";
		DEFAULT_LEGAL_VALUES[20] = "EP";
		DEFAULT_LEGAL_VALUES[21] = "ER";
		DEFAULT_LEGAL_VALUES[22] = "EX";
		DEFAULT_LEGAL_VALUES[23] = "EY";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "F1", "F9" };
		DEFAULT_LEGAL_VALUES[25] = new String[] { "FB", "FE" };
		DEFAULT_LEGAL_VALUES[26] = "FH";
		DEFAULT_LEGAL_VALUES[27] = "FI";
		DEFAULT_LEGAL_VALUES[28] = "FM";
		DEFAULT_LEGAL_VALUES[29] = "FS";
		DEFAULT_LEGAL_VALUES[30] = new String[] { "G1", "G7" };
		DEFAULT_LEGAL_VALUES[31] = "GP";
		DEFAULT_LEGAL_VALUES[32] = "GT";
		DEFAULT_LEGAL_VALUES[33] = "HC";
		DEFAULT_LEGAL_VALUES[34] = "HI";
		DEFAULT_LEGAL_VALUES[35] = "HR";
		DEFAULT_LEGAL_VALUES[36] = "HW";
		DEFAULT_LEGAL_VALUES[37] = new String[] { "I2", "I6" };
		DEFAULT_LEGAL_VALUES[38] = "IA";
		DEFAULT_LEGAL_VALUES[39] = "IC";
		DEFAULT_LEGAL_VALUES[40] = "IM";
		DEFAULT_LEGAL_VALUES[41] = "IN";
		DEFAULT_LEGAL_VALUES[42] = "IP";
		DEFAULT_LEGAL_VALUES[43] = new String[] { "IR", "IV" };
		DEFAULT_LEGAL_VALUES[44] = new String[] { "JA", "JI" };
		DEFAULT_LEGAL_VALUES[45] = new String[] { "JK", "JT" };
		DEFAULT_LEGAL_VALUES[46] = new String[] { "JV", "KA" };
		DEFAULT_LEGAL_VALUES[47] = new String[] { "KC", "KJ" };
		DEFAULT_LEGAL_VALUES[48] = new String[] { "KY", "LE" };
		DEFAULT_LEGAL_VALUES[49] = "LG";
		DEFAULT_LEGAL_VALUES[50] = "LI";
		DEFAULT_LEGAL_VALUES[51] = "LO";
		DEFAULT_LEGAL_VALUES[52] = "LP";
		DEFAULT_LEGAL_VALUES[53] = new String[] { "LR", "LT" };
		DEFAULT_LEGAL_VALUES[54] = "LW";
		DEFAULT_LEGAL_VALUES[55] = "M1";
		DEFAULT_LEGAL_VALUES[56] = new String[] { "MA", "MT" };
		DEFAULT_LEGAL_VALUES[57] = "MV";
		DEFAULT_LEGAL_VALUES[58] = "MZ";
		DEFAULT_LEGAL_VALUES[59] = "NA";
		DEFAULT_LEGAL_VALUES[60] = "NC";
		DEFAULT_LEGAL_VALUES[61] = "ND";
		DEFAULT_LEGAL_VALUES[62] = "NI";
		DEFAULT_LEGAL_VALUES[63] = new String[] { "NL", "NO" };
		DEFAULT_LEGAL_VALUES[64] = "NQ";
		DEFAULT_LEGAL_VALUES[65] = "NR";
		DEFAULT_LEGAL_VALUES[66] = "NT";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "OB", "OE" };
		DEFAULT_LEGAL_VALUES[68] = "OL";
		DEFAULT_LEGAL_VALUES[69] = "OP";
		DEFAULT_LEGAL_VALUES[70] = new String[] { "OR", "OT" };
		DEFAULT_LEGAL_VALUES[71] = "OX";
		DEFAULT_LEGAL_VALUES[72] = "OZ";
		DEFAULT_LEGAL_VALUES[73] = new String[] { "P1", "P8" };
		DEFAULT_LEGAL_VALUES[74] = new String[] { "PA", "PT" };
		DEFAULT_LEGAL_VALUES[75] = new String[] { "PV", "PZ" };
		DEFAULT_LEGAL_VALUES[76] = new String[] { "QC", "QE" };
		DEFAULT_LEGAL_VALUES[77] = "QM";
		DEFAULT_LEGAL_VALUES[78] = new String[] { "QR", "QT" };
		DEFAULT_LEGAL_VALUES[79] = new String[] { "R1", "R7" };
		DEFAULT_LEGAL_VALUES[80] = "R9";
		DEFAULT_LEGAL_VALUES[81] = new String[] { "RA", "RG" };
		DEFAULT_LEGAL_VALUES[82] = new String[] { "RM", "RO" };
		DEFAULT_LEGAL_VALUES[83] = "RR";
		DEFAULT_LEGAL_VALUES[84] = "RT";
		DEFAULT_LEGAL_VALUES[85] = "RV";
		DEFAULT_LEGAL_VALUES[86] = "RX";
		DEFAULT_LEGAL_VALUES[87] = new String[] { "S1", "S9" };
		DEFAULT_LEGAL_VALUES[88] = new String[] { "SA", "SI" };
		DEFAULT_LEGAL_VALUES[89] = new String[] { "SL", "SY" };
		DEFAULT_LEGAL_VALUES[90] = new String[] { "T1", "T6" };
		DEFAULT_LEGAL_VALUES[91] = new String[] { "TA", "TT" };
		DEFAULT_LEGAL_VALUES[92] = "TX";
		DEFAULT_LEGAL_VALUES[93] = "U1";
		DEFAULT_LEGAL_VALUES[94] = "UA";
		DEFAULT_LEGAL_VALUES[95] = "UB";
		DEFAULT_LEGAL_VALUES[96] = new String[] { "UD", "UV" };
		DEFAULT_LEGAL_VALUES[97] = new String[] { "UX", "UZ" };
		DEFAULT_LEGAL_VALUES[98] = new String[] { "V1", "V7" };
		DEFAULT_LEGAL_VALUES[99] = "VA";
		DEFAULT_LEGAL_VALUES[100] = "VC";
		DEFAULT_LEGAL_VALUES[101] = "VD";
		DEFAULT_LEGAL_VALUES[102] = "VM";
		DEFAULT_LEGAL_VALUES[103] = "W1";
		DEFAULT_LEGAL_VALUES[104] = "W2";
		DEFAULT_LEGAL_VALUES[105] = new String[] { "WA", "WI" };
		DEFAULT_LEGAL_VALUES[106] = "WP";
		DEFAULT_LEGAL_VALUES[107] = "WT";
		DEFAULT_LEGAL_VALUES[108] = new String[] { "X1", "X5" };
		DEFAULT_LEGAL_VALUES[109] = "XE";
		DEFAULT_LEGAL_VALUES[110] = "XP";
		DEFAULT_LEGAL_VALUES[111] = new String[] { "Y1", "Y3" };
		DEFAULT_LEGAL_VALUES[112] = new String[] { "ZA", "ZC" };
		DEFAULT_LEGAL_VALUES[113] = "ZZ";
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