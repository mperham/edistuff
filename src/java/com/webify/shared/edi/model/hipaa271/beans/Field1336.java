package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1336 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[37];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "D";
		DEFAULT_LEGAL_VALUES[1] = new String[] { "12", "16" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "41", "43" };
		DEFAULT_LEGAL_VALUES[3] = "47";
		DEFAULT_LEGAL_VALUES[4] = "AP";
		DEFAULT_LEGAL_VALUES[5] = "C1";
		DEFAULT_LEGAL_VALUES[6] = "CO";
		DEFAULT_LEGAL_VALUES[7] = "CP";
		DEFAULT_LEGAL_VALUES[8] = "DB";
		DEFAULT_LEGAL_VALUES[9] = "EP";
		DEFAULT_LEGAL_VALUES[10] = "FF";
		DEFAULT_LEGAL_VALUES[11] = "GP";
		DEFAULT_LEGAL_VALUES[12] = "HM";
		DEFAULT_LEGAL_VALUES[13] = "HN";
		DEFAULT_LEGAL_VALUES[14] = "HS";
		DEFAULT_LEGAL_VALUES[15] = "IN";
		DEFAULT_LEGAL_VALUES[16] = "IP";
		DEFAULT_LEGAL_VALUES[17] = "LC";
		DEFAULT_LEGAL_VALUES[18] = "LD";
		DEFAULT_LEGAL_VALUES[19] = "LI";
		DEFAULT_LEGAL_VALUES[20] = "LT";
		DEFAULT_LEGAL_VALUES[21] = new String[] { "MA", "MC" };
		DEFAULT_LEGAL_VALUES[22] = "MH";
		DEFAULT_LEGAL_VALUES[23] = "MI";
		DEFAULT_LEGAL_VALUES[24] = "MP";
		DEFAULT_LEGAL_VALUES[25] = "OT";
		DEFAULT_LEGAL_VALUES[26] = "PE";
		DEFAULT_LEGAL_VALUES[27] = "PL";
		DEFAULT_LEGAL_VALUES[28] = "PP";
		DEFAULT_LEGAL_VALUES[29] = "PR";
		DEFAULT_LEGAL_VALUES[30] = "PS";
		DEFAULT_LEGAL_VALUES[31] = "QM";
		DEFAULT_LEGAL_VALUES[32] = "RP";
		DEFAULT_LEGAL_VALUES[33] = "SP";
		DEFAULT_LEGAL_VALUES[34] = "TF";
		DEFAULT_LEGAL_VALUES[35] = "WC";
		DEFAULT_LEGAL_VALUES[36] = "WU";
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
