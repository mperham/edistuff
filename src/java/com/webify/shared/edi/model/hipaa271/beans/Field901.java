package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field901 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[79];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "21" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "23", "37" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "41", "92" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "95", "98" };
		DEFAULT_LEGAL_VALUES[4] = "AB";
		DEFAULT_LEGAL_VALUES[5] = "AD";
		DEFAULT_LEGAL_VALUES[6] = "AR";
		DEFAULT_LEGAL_VALUES[7] = "BA";
		DEFAULT_LEGAL_VALUES[8] = "BC";
		DEFAULT_LEGAL_VALUES[9] = "BD";
		DEFAULT_LEGAL_VALUES[10] = "BG";
		DEFAULT_LEGAL_VALUES[11] = "BL";
		DEFAULT_LEGAL_VALUES[12] = "BP";
		DEFAULT_LEGAL_VALUES[13] = "BR";
		DEFAULT_LEGAL_VALUES[14] = "BS";
		DEFAULT_LEGAL_VALUES[15] = "BV";
		DEFAULT_LEGAL_VALUES[16] = "BW";
		DEFAULT_LEGAL_VALUES[17] = "CA";
		DEFAULT_LEGAL_VALUES[18] = "CB";
		DEFAULT_LEGAL_VALUES[19] = "CL";
		DEFAULT_LEGAL_VALUES[20] = "CM";
		DEFAULT_LEGAL_VALUES[21] = "CP";
		DEFAULT_LEGAL_VALUES[22] = new String[] { "CS", "CU" };
		DEFAULT_LEGAL_VALUES[23] = "DD";
		DEFAULT_LEGAL_VALUES[24] = "DG";
		DEFAULT_LEGAL_VALUES[25] = "DM";
		DEFAULT_LEGAL_VALUES[26] = "DP";
		DEFAULT_LEGAL_VALUES[27] = "DR";
		DEFAULT_LEGAL_VALUES[28] = "DV";
		DEFAULT_LEGAL_VALUES[29] = new String[] { "E1", "E8" };
		DEFAULT_LEGAL_VALUES[30] = "EA";
		DEFAULT_LEGAL_VALUES[31] = "ER";
		DEFAULT_LEGAL_VALUES[32] = "ET";
		DEFAULT_LEGAL_VALUES[33] = "FR";
		DEFAULT_LEGAL_VALUES[34] = "GS";
		DEFAULT_LEGAL_VALUES[35] = "HB";
		DEFAULT_LEGAL_VALUES[36] = "HH";
		DEFAULT_LEGAL_VALUES[37] = "HX";
		DEFAULT_LEGAL_VALUES[38] = "ID";
		DEFAULT_LEGAL_VALUES[39] = "II";
		DEFAULT_LEGAL_VALUES[40] = "IN";
		DEFAULT_LEGAL_VALUES[41] = "KR";
		DEFAULT_LEGAL_VALUES[42] = "LK";
		DEFAULT_LEGAL_VALUES[43] = "LS";
		DEFAULT_LEGAL_VALUES[44] = "LW";
		DEFAULT_LEGAL_VALUES[45] = "MO";
		DEFAULT_LEGAL_VALUES[46] = "OG";
		DEFAULT_LEGAL_VALUES[47] = "OI";
		DEFAULT_LEGAL_VALUES[48] = "OR";
		DEFAULT_LEGAL_VALUES[49] = "OV";
		DEFAULT_LEGAL_VALUES[50] = "PF";
		DEFAULT_LEGAL_VALUES[51] = "PM";
		DEFAULT_LEGAL_VALUES[52] = "PN";
		DEFAULT_LEGAL_VALUES[53] = "RB";
		DEFAULT_LEGAL_VALUES[54] = "RD";
		DEFAULT_LEGAL_VALUES[55] = "RF";
		DEFAULT_LEGAL_VALUES[56] = "RH";
		DEFAULT_LEGAL_VALUES[57] = "RK";
		DEFAULT_LEGAL_VALUES[58] = "RL";
		DEFAULT_LEGAL_VALUES[59] = "RN";
		DEFAULT_LEGAL_VALUES[60] = "RP";
		DEFAULT_LEGAL_VALUES[61] = "RS";
		DEFAULT_LEGAL_VALUES[62] = "RT";
		DEFAULT_LEGAL_VALUES[63] = "SC";
		DEFAULT_LEGAL_VALUES[64] = "ST";
		DEFAULT_LEGAL_VALUES[65] = "SU";
		DEFAULT_LEGAL_VALUES[66] = "SW";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "T1", "T6" };
		DEFAULT_LEGAL_VALUES[68] = "TC";
		DEFAULT_LEGAL_VALUES[69] = "TD";
		DEFAULT_LEGAL_VALUES[70] = "TH";
		DEFAULT_LEGAL_VALUES[71] = "TL";
		DEFAULT_LEGAL_VALUES[72] = "TR";
		DEFAULT_LEGAL_VALUES[73] = "UC";
		DEFAULT_LEGAL_VALUES[74] = "UF";
		DEFAULT_LEGAL_VALUES[75] = "UG";
		DEFAULT_LEGAL_VALUES[76] = "WA";
		DEFAULT_LEGAL_VALUES[77] = "WK";
		DEFAULT_LEGAL_VALUES[78] = "ZZ";
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

		currentValues = new Object[10];
		currentValues[0] = "15";
		currentValues[1] = "42";
		currentValues[2] = "43";
		currentValues[3] = "45";
		currentValues[4] = new String[] { "47", "49" };
		currentValues[5] = "51";
		currentValues[6] = "52";
		currentValues[7] = new String[] { "56", "58" };
		currentValues[8] = new String[] { "60", "68" };
		currentValues[9] = "71";
		valueOverrides.put("45-3", currentValues);

		currentValues = new Object[5];
		currentValues[0] = "15";
		currentValues[1] = new String[] { "52", "57" };
		currentValues[2] = new String[] { "60", "63" };
		currentValues[3] = "69";
		currentValues[4] = "70";
		valueOverrides.put("53-3", currentValues);

		currentValues = new Object[8];
		currentValues[0] = "15";
		currentValues[1] = "41";
		currentValues[2] = new String[] { "43", "48" };
		currentValues[3] = "50";
		currentValues[4] = "51";
		currentValues[5] = "79";
		currentValues[6] = "97";
		currentValues[7] = "T4";
		valueOverrides.put("12-3", currentValues);

		currentValues = new Object[6];
		currentValues[0] = "04";
		currentValues[1] = "41";
		currentValues[2] = "42";
		currentValues[3] = "79";
		currentValues[4] = "80";
		currentValues[5] = "T4";
		valueOverrides.put("8-3", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "04";
		currentValues[1] = "41";
		currentValues[2] = "42";
		currentValues[3] = "79";
		valueOverrides.put("4-3", currentValues);

		currentValues = new Object[5];
		currentValues[0] = "15";
		currentValues[1] = new String[] { "52", "57" };
		currentValues[2] = new String[] { "60", "63" };
		currentValues[3] = "69";
		currentValues[4] = "70";
		valueOverrides.put("28-3", currentValues);

		currentValues = new Object[10];
		currentValues[0] = "15";
		currentValues[1] = "42";
		currentValues[2] = "43";
		currentValues[3] = "45";
		currentValues[4] = new String[] { "47", "49" };
		currentValues[5] = "51";
		currentValues[6] = "52";
		currentValues[7] = new String[] { "56", "58" };
		currentValues[8] = new String[] { "60", "68" };
		currentValues[9] = new String[] { "71", "78" };
		valueOverrides.put("20-3", currentValues);
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
