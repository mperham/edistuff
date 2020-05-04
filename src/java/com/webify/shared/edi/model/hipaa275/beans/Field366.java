package com.webify.shared.edi.model.hipaa275.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field366 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[88];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1A", "1I" };
		DEFAULT_LEGAL_VALUES[1] = "3A";
		DEFAULT_LEGAL_VALUES[2] = new String[] { "A1", "A6" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "AA", "AJ" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "AL", "AN" };
		DEFAULT_LEGAL_VALUES[5] = "AP";
		DEFAULT_LEGAL_VALUES[6] = new String[] { "AR", "AX" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "BA", "BD" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "BI", "BM" };
		DEFAULT_LEGAL_VALUES[9] = "BP";
		DEFAULT_LEGAL_VALUES[10] = "BS";
		DEFAULT_LEGAL_VALUES[11] = "BU";
		DEFAULT_LEGAL_VALUES[12] = "C1";
		DEFAULT_LEGAL_VALUES[13] = "C2";
		DEFAULT_LEGAL_VALUES[14] = new String[] { "CA", "CP" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "CR", "DA" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "DC", "DF" };
		DEFAULT_LEGAL_VALUES[17] = "DI";
		DEFAULT_LEGAL_VALUES[18] = "DM";
		DEFAULT_LEGAL_VALUES[19] = "DN";
		DEFAULT_LEGAL_VALUES[20] = "DV";
		DEFAULT_LEGAL_VALUES[21] = "E1";
		DEFAULT_LEGAL_VALUES[22] = "E2";
		DEFAULT_LEGAL_VALUES[23] = new String[] { "EA", "ED" };
		DEFAULT_LEGAL_VALUES[24] = "EF";
		DEFAULT_LEGAL_VALUES[25] = "EG";
		DEFAULT_LEGAL_VALUES[26] = new String[] { "EM", "EP" };
		DEFAULT_LEGAL_VALUES[27] = "ES";
		DEFAULT_LEGAL_VALUES[28] = "EV";
		DEFAULT_LEGAL_VALUES[29] = "EX";
		DEFAULT_LEGAL_VALUES[30] = new String[] { "FA", "FD" };
		DEFAULT_LEGAL_VALUES[31] = "FF";
		DEFAULT_LEGAL_VALUES[32] = new String[] { "FL", "FR" };
		DEFAULT_LEGAL_VALUES[33] = new String[] { "GA", "GC" };
		DEFAULT_LEGAL_VALUES[34] = "GE";
		DEFAULT_LEGAL_VALUES[35] = "GR";
		DEFAULT_LEGAL_VALUES[36] = "HM";
		DEFAULT_LEGAL_VALUES[37] = "HR";
		DEFAULT_LEGAL_VALUES[38] = "IC";
		DEFAULT_LEGAL_VALUES[39] = "IO";
		DEFAULT_LEGAL_VALUES[40] = "IP";
		DEFAULT_LEGAL_VALUES[41] = "IS";
		DEFAULT_LEGAL_VALUES[42] = new String[] { "KA", "KC" };
		DEFAULT_LEGAL_VALUES[43] = "KP";
		DEFAULT_LEGAL_VALUES[44] = "KT";
		DEFAULT_LEGAL_VALUES[45] = "LD";
		DEFAULT_LEGAL_VALUES[46] = "LG";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "MA", "ME" };
		DEFAULT_LEGAL_VALUES[48] = "MG";
		DEFAULT_LEGAL_VALUES[49] = new String[] { "MK", "MM" };
		DEFAULT_LEGAL_VALUES[50] = "NA";
		DEFAULT_LEGAL_VALUES[51] = "NC";
		DEFAULT_LEGAL_VALUES[52] = "NP";
		DEFAULT_LEGAL_VALUES[53] = "NT";
		DEFAULT_LEGAL_VALUES[54] = "OA";
		DEFAULT_LEGAL_VALUES[55] = "OC";
		DEFAULT_LEGAL_VALUES[56] = "OD";
		DEFAULT_LEGAL_VALUES[57] = "OS";
		DEFAULT_LEGAL_VALUES[58] = "OW";
		DEFAULT_LEGAL_VALUES[59] = new String[] { "PA", "QA" };
		DEFAULT_LEGAL_VALUES[60] = "QC";
		DEFAULT_LEGAL_VALUES[61] = "QI";
		DEFAULT_LEGAL_VALUES[62] = "QM";
		DEFAULT_LEGAL_VALUES[63] = "QP";
		DEFAULT_LEGAL_VALUES[64] = "QR";
		DEFAULT_LEGAL_VALUES[65] = "QY";
		DEFAULT_LEGAL_VALUES[66] = new String[] { "RA", "RG" };
		DEFAULT_LEGAL_VALUES[67] = "RP";
		DEFAULT_LEGAL_VALUES[68] = "RQ";
		DEFAULT_LEGAL_VALUES[69] = "RS";
		DEFAULT_LEGAL_VALUES[70] = new String[] { "RZ", "SW" };
		DEFAULT_LEGAL_VALUES[71] = "SY";
		DEFAULT_LEGAL_VALUES[72] = new String[] { "TA", "TE" };
		DEFAULT_LEGAL_VALUES[73] = "TH";
		DEFAULT_LEGAL_VALUES[74] = "TM";
		DEFAULT_LEGAL_VALUES[75] = "TN";
		DEFAULT_LEGAL_VALUES[76] = "TP";
		DEFAULT_LEGAL_VALUES[77] = "TR";
		DEFAULT_LEGAL_VALUES[78] = "TY";
		DEFAULT_LEGAL_VALUES[79] = "UG";
		DEFAULT_LEGAL_VALUES[80] = new String[] { "UP", "UR" };
		DEFAULT_LEGAL_VALUES[81] = "VM";
		DEFAULT_LEGAL_VALUES[82] = "VP";
		DEFAULT_LEGAL_VALUES[83] = "WH";
		DEFAULT_LEGAL_VALUES[84] = "WI";
		DEFAULT_LEGAL_VALUES[85] = "WR";
		DEFAULT_LEGAL_VALUES[86] = "WV";
		DEFAULT_LEGAL_VALUES[87] = "ZZ";
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