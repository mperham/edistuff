package com.webify.shared.edi.model.hipaa835.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field426 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[103];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "66" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "68", "99" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "A1", "A9" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "AA", "AC" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "AE", "AH" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "AL", "AZ" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "B1", "B9" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "BA", "BP" };
		DEFAULT_LEGAL_VALUES[8] = "BR";
		DEFAULT_LEGAL_VALUES[9] = "BS";
		DEFAULT_LEGAL_VALUES[10] = new String[] { "C1", "C9" };
		DEFAULT_LEGAL_VALUES[11] = "CB";
		DEFAULT_LEGAL_VALUES[12] = "CE";
		DEFAULT_LEGAL_VALUES[13] = "CK";
		DEFAULT_LEGAL_VALUES[14] = "CM";
		DEFAULT_LEGAL_VALUES[15] = new String[] { "CO", "CW" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "D1", "D9" };
		DEFAULT_LEGAL_VALUES[17] = new String[] { "DA", "DM" };
		DEFAULT_LEGAL_VALUES[18] = "DO";
		DEFAULT_LEGAL_VALUES[19] = "DP";
		DEFAULT_LEGAL_VALUES[20] = new String[] { "DR", "DT" };
		DEFAULT_LEGAL_VALUES[21] = new String[] { "DV", "DX" };
		DEFAULT_LEGAL_VALUES[22] = new String[] { "E1", "E9" };
		DEFAULT_LEGAL_VALUES[23] = "EE";
		DEFAULT_LEGAL_VALUES[24] = "ER";
		DEFAULT_LEGAL_VALUES[25] = "EX";
		DEFAULT_LEGAL_VALUES[26] = "F1";
		DEFAULT_LEGAL_VALUES[27] = new String[] { "F3", "F9" };
		DEFAULT_LEGAL_VALUES[28] = new String[] { "FA", "FC" };
		DEFAULT_LEGAL_VALUES[29] = "FI";
		DEFAULT_LEGAL_VALUES[30] = "FR";
		DEFAULT_LEGAL_VALUES[31] = "FT";
		DEFAULT_LEGAL_VALUES[32] = new String[] { "G1", "G9" };
		DEFAULT_LEGAL_VALUES[33] = new String[] { "GA", "GH" };
		DEFAULT_LEGAL_VALUES[34] = new String[] { "GJ", "GO" };
		DEFAULT_LEGAL_VALUES[35] = "GR";
		DEFAULT_LEGAL_VALUES[36] = new String[] { "H1", "H9" };
		DEFAULT_LEGAL_VALUES[37] = new String[] { "HA", "HG" };
		DEFAULT_LEGAL_VALUES[38] = "HI";
		DEFAULT_LEGAL_VALUES[39] = "IA";
		DEFAULT_LEGAL_VALUES[40] = "IC";
		DEFAULT_LEGAL_VALUES[41] = "IE";
		DEFAULT_LEGAL_VALUES[42] = "IF";
		DEFAULT_LEGAL_VALUES[43] = "IL";
		DEFAULT_LEGAL_VALUES[44] = "IP";
		DEFAULT_LEGAL_VALUES[45] = "IR";
		DEFAULT_LEGAL_VALUES[46] = "IS";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "J1", "J9" };
		DEFAULT_LEGAL_VALUES[48] = "JE";
		DEFAULT_LEGAL_VALUES[49] = new String[] { "K1", "K3" };
		DEFAULT_LEGAL_VALUES[50] = new String[] { "L1", "L9" };
		DEFAULT_LEGAL_VALUES[51] = "LA";
		DEFAULT_LEGAL_VALUES[52] = "LE";
		DEFAULT_LEGAL_VALUES[53] = "LF";
		DEFAULT_LEGAL_VALUES[54] = "LO";
		DEFAULT_LEGAL_VALUES[55] = "LP";
		DEFAULT_LEGAL_VALUES[56] = "LS";
		DEFAULT_LEGAL_VALUES[57] = new String[] { "M1", "M4" };
		DEFAULT_LEGAL_VALUES[58] = "MA";
		DEFAULT_LEGAL_VALUES[59] = "MC";
		DEFAULT_LEGAL_VALUES[60] = "ML";
		DEFAULT_LEGAL_VALUES[61] = new String[] { "NA", "ND" };
		DEFAULT_LEGAL_VALUES[62] = "NR";
		DEFAULT_LEGAL_VALUES[63] = "OA";
		DEFAULT_LEGAL_VALUES[64] = "OB";
		DEFAULT_LEGAL_VALUES[65] = "OL";
		DEFAULT_LEGAL_VALUES[66] = "PA";
		DEFAULT_LEGAL_VALUES[67] = "PD";
		DEFAULT_LEGAL_VALUES[68] = "PF";
		DEFAULT_LEGAL_VALUES[69] = "PI";
		DEFAULT_LEGAL_VALUES[70] = "PL";
		DEFAULT_LEGAL_VALUES[71] = "PM";
		DEFAULT_LEGAL_VALUES[72] = "PO";
		DEFAULT_LEGAL_VALUES[73] = "PP";
		DEFAULT_LEGAL_VALUES[74] = "PR";
		DEFAULT_LEGAL_VALUES[75] = "PT";
		DEFAULT_LEGAL_VALUES[76] = new String[] { "R1", "R3" };
		DEFAULT_LEGAL_VALUES[77] = "RA";
		DEFAULT_LEGAL_VALUES[78] = "RD";
		DEFAULT_LEGAL_VALUES[79] = "RE";
		DEFAULT_LEGAL_VALUES[80] = "RM";
		DEFAULT_LEGAL_VALUES[81] = "SC";
		DEFAULT_LEGAL_VALUES[82] = "SD";
		DEFAULT_LEGAL_VALUES[83] = "SF";
		DEFAULT_LEGAL_VALUES[84] = "SL";
		DEFAULT_LEGAL_VALUES[85] = "SP";
		DEFAULT_LEGAL_VALUES[86] = "TA";
		DEFAULT_LEGAL_VALUES[87] = "TD";
		DEFAULT_LEGAL_VALUES[88] = "TL";
		DEFAULT_LEGAL_VALUES[89] = "UB";
		DEFAULT_LEGAL_VALUES[90] = "UL";
		DEFAULT_LEGAL_VALUES[91] = "VC";
		DEFAULT_LEGAL_VALUES[92] = "VD";
		DEFAULT_LEGAL_VALUES[93] = "VO";
		DEFAULT_LEGAL_VALUES[94] = "W6";
		DEFAULT_LEGAL_VALUES[95] = "W8";
		DEFAULT_LEGAL_VALUES[96] = "W9";
		DEFAULT_LEGAL_VALUES[97] = new String[] { "WA", "WC" };
		DEFAULT_LEGAL_VALUES[98] = "WH";
		DEFAULT_LEGAL_VALUES[99] = "WO";
		DEFAULT_LEGAL_VALUES[100] = new String[] { "WR", "WU" };
		DEFAULT_LEGAL_VALUES[101] = "WW";
		DEFAULT_LEGAL_VALUES[102] = "ZZ";
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

		currentValues = new Object[39];
		currentValues[0] = "50";
		currentValues[1] = "51";
		currentValues[2] = "72";
		currentValues[3] = "90";
		currentValues[4] = "AM";
		currentValues[5] = "AP";
		currentValues[6] = "B2";
		currentValues[7] = "B3";
		currentValues[8] = "BD";
		currentValues[9] = "BN";
		currentValues[10] = "C5";
		currentValues[11] = new String[] { "CR", "CT" };
		currentValues[12] = "CV";
		currentValues[13] = "CW";
		currentValues[14] = "DM";
		currentValues[15] = "E3";
		currentValues[16] = "FB";
		currentValues[17] = "FC";
		currentValues[18] = "GO";
		currentValues[19] = "IP";
		currentValues[20] = "IR";
		currentValues[21] = "IS";
		currentValues[22] = "J1";
		currentValues[23] = "L3";
		currentValues[24] = "L6";
		currentValues[25] = "LE";
		currentValues[26] = "LS";
		currentValues[27] = "OA";
		currentValues[28] = "OB";
		currentValues[29] = "PI";
		currentValues[30] = "PL";
		currentValues[31] = "RA";
		currentValues[32] = "RE";
		currentValues[33] = "SL";
		currentValues[34] = "TL";
		currentValues[35] = "WO";
		currentValues[36] = "WU";
		currentValues[37] = "ZZ";
		currentValues[38] = "AH";
		valueOverrides.put("44-3-1", currentValues);
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
