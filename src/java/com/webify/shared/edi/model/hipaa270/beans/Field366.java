package com.webify.shared.edi.model.hipaa270.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field366 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[85];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1A", "1H" };
		DEFAULT_LEGAL_VALUES[1] = "3A";
		DEFAULT_LEGAL_VALUES[2] = new String[] { "A1", "A5" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "AA", "AI" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "AL", "AN" };
		DEFAULT_LEGAL_VALUES[5] = "AP";
		DEFAULT_LEGAL_VALUES[6] = new String[] { "AR", "AV" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "BA", "BD" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "BI", "BM" };
		DEFAULT_LEGAL_VALUES[9] = "BP";
		DEFAULT_LEGAL_VALUES[10] = "BS";
		DEFAULT_LEGAL_VALUES[11] = "BU";
		DEFAULT_LEGAL_VALUES[12] = "C2";
		DEFAULT_LEGAL_VALUES[13] = new String[] { "CA", "CP" };
		DEFAULT_LEGAL_VALUES[14] = new String[] { "CR", "DA" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "DC", "DF" };
		DEFAULT_LEGAL_VALUES[16] = "DI";
		DEFAULT_LEGAL_VALUES[17] = "DM";
		DEFAULT_LEGAL_VALUES[18] = "DN";
		DEFAULT_LEGAL_VALUES[19] = "DV";
		DEFAULT_LEGAL_VALUES[20] = "E1";
		DEFAULT_LEGAL_VALUES[21] = "E2";
		DEFAULT_LEGAL_VALUES[22] = new String[] { "EA", "ED" };
		DEFAULT_LEGAL_VALUES[23] = "EF";
		DEFAULT_LEGAL_VALUES[24] = "EG";
		DEFAULT_LEGAL_VALUES[25] = new String[] { "EM", "EP" };
		DEFAULT_LEGAL_VALUES[26] = "ES";
		DEFAULT_LEGAL_VALUES[27] = "EV";
		DEFAULT_LEGAL_VALUES[28] = "EX";
		DEFAULT_LEGAL_VALUES[29] = new String[] { "FA", "FD" };
		DEFAULT_LEGAL_VALUES[30] = "FF";
		DEFAULT_LEGAL_VALUES[31] = new String[] { "FL", "FR" };
		DEFAULT_LEGAL_VALUES[32] = new String[] { "GA", "GC" };
		DEFAULT_LEGAL_VALUES[33] = "GE";
		DEFAULT_LEGAL_VALUES[34] = "GR";
		DEFAULT_LEGAL_VALUES[35] = "HM";
		DEFAULT_LEGAL_VALUES[36] = "HR";
		DEFAULT_LEGAL_VALUES[37] = "IC";
		DEFAULT_LEGAL_VALUES[38] = "IO";
		DEFAULT_LEGAL_VALUES[39] = "IP";
		DEFAULT_LEGAL_VALUES[40] = "IS";
		DEFAULT_LEGAL_VALUES[41] = new String[] { "KA", "KC" };
		DEFAULT_LEGAL_VALUES[42] = "KP";
		DEFAULT_LEGAL_VALUES[43] = "KT";
		DEFAULT_LEGAL_VALUES[44] = "LD";
		DEFAULT_LEGAL_VALUES[45] = new String[] { "MA", "ME" };
		DEFAULT_LEGAL_VALUES[46] = "MG";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "MK", "MM" };
		DEFAULT_LEGAL_VALUES[48] = "NA";
		DEFAULT_LEGAL_VALUES[49] = "NC";
		DEFAULT_LEGAL_VALUES[50] = "NP";
		DEFAULT_LEGAL_VALUES[51] = "NT";
		DEFAULT_LEGAL_VALUES[52] = "OA";
		DEFAULT_LEGAL_VALUES[53] = "OC";
		DEFAULT_LEGAL_VALUES[54] = "OD";
		DEFAULT_LEGAL_VALUES[55] = "OS";
		DEFAULT_LEGAL_VALUES[56] = "OW";
		DEFAULT_LEGAL_VALUES[57] = new String[] { "PA", "QA" };
		DEFAULT_LEGAL_VALUES[58] = "QC";
		DEFAULT_LEGAL_VALUES[59] = "QI";
		DEFAULT_LEGAL_VALUES[60] = "QM";
		DEFAULT_LEGAL_VALUES[61] = "QP";
		DEFAULT_LEGAL_VALUES[62] = "QR";
		DEFAULT_LEGAL_VALUES[63] = "QY";
		DEFAULT_LEGAL_VALUES[64] = new String[] { "RA", "RG" };
		DEFAULT_LEGAL_VALUES[65] = "RP";
		DEFAULT_LEGAL_VALUES[66] = "RQ";
		DEFAULT_LEGAL_VALUES[67] = "RS";
		DEFAULT_LEGAL_VALUES[68] = new String[] { "RZ", "SW" };
		DEFAULT_LEGAL_VALUES[69] = "SY";
		DEFAULT_LEGAL_VALUES[70] = new String[] { "TA", "TE" };
		DEFAULT_LEGAL_VALUES[71] = "TH";
		DEFAULT_LEGAL_VALUES[72] = "TM";
		DEFAULT_LEGAL_VALUES[73] = "TN";
		DEFAULT_LEGAL_VALUES[74] = "TP";
		DEFAULT_LEGAL_VALUES[75] = "TR";
		DEFAULT_LEGAL_VALUES[76] = "TY";
		DEFAULT_LEGAL_VALUES[77] = "UG";
		DEFAULT_LEGAL_VALUES[78] = new String[] { "UP", "UR" };
		DEFAULT_LEGAL_VALUES[79] = "VM";
		DEFAULT_LEGAL_VALUES[80] = "VP";
		DEFAULT_LEGAL_VALUES[81] = "WH";
		DEFAULT_LEGAL_VALUES[82] = "WI";
		DEFAULT_LEGAL_VALUES[83] = "WR";
		DEFAULT_LEGAL_VALUES[84] = "ZZ";
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
		currentValues[0] = "IC";
		valueOverrides.put("10-1", currentValues);
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
