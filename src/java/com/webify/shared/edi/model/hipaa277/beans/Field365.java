package com.webify.shared.edi.model.hipaa277.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field365 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[35];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "AA", "AD" };
		DEFAULT_LEGAL_VALUES[1] = "AP";
		DEFAULT_LEGAL_VALUES[2] = "AS";
		DEFAULT_LEGAL_VALUES[3] = "AU";
		DEFAULT_LEGAL_VALUES[4] = "BN";
		DEFAULT_LEGAL_VALUES[5] = "BT";
		DEFAULT_LEGAL_VALUES[6] = "CA";
		DEFAULT_LEGAL_VALUES[7] = "CP";
		DEFAULT_LEGAL_VALUES[8] = "DN";
		DEFAULT_LEGAL_VALUES[9] = "ED";
		DEFAULT_LEGAL_VALUES[10] = "EM";
		DEFAULT_LEGAL_VALUES[11] = "EX";
		DEFAULT_LEGAL_VALUES[12] = "FT";
		DEFAULT_LEGAL_VALUES[13] = "FU";
		DEFAULT_LEGAL_VALUES[14] = "FX";
		DEFAULT_LEGAL_VALUES[15] = "HF";
		DEFAULT_LEGAL_VALUES[16] = "HP";
		DEFAULT_LEGAL_VALUES[17] = "IT";
		DEFAULT_LEGAL_VALUES[18] = "MN";
		DEFAULT_LEGAL_VALUES[19] = "NP";
		DEFAULT_LEGAL_VALUES[20] = "OF";
		DEFAULT_LEGAL_VALUES[21] = "OT";
		DEFAULT_LEGAL_VALUES[22] = "PA";
		DEFAULT_LEGAL_VALUES[23] = "PC";
		DEFAULT_LEGAL_VALUES[24] = "PP";
		DEFAULT_LEGAL_VALUES[25] = "PS";
		DEFAULT_LEGAL_VALUES[26] = "SP";
		DEFAULT_LEGAL_VALUES[27] = "TE";
		DEFAULT_LEGAL_VALUES[28] = new String[] { "TL", "TN" };
		DEFAULT_LEGAL_VALUES[29] = "TX";
		DEFAULT_LEGAL_VALUES[30] = "UR";
		DEFAULT_LEGAL_VALUES[31] = "VM";
		DEFAULT_LEGAL_VALUES[32] = "WC";
		DEFAULT_LEGAL_VALUES[33] = "WF";
		DEFAULT_LEGAL_VALUES[34] = "WP";
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

		currentValues = new Object[2];
		currentValues[0] = "EX";
		currentValues[1] = "FX";
		valueOverrides.put("5-7", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "EX";
		valueOverrides.put("5-5", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "ED";
		currentValues[1] = "EM";
		currentValues[2] = "TE";
		valueOverrides.put("5-3", currentValues);
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
