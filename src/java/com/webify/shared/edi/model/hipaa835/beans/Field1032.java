package com.webify.shared.edi.model.hipaa835.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1032 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[19];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "22" };
		DEFAULT_LEGAL_VALUES[1] = "AM";
		DEFAULT_LEGAL_VALUES[2] = "BL";
		DEFAULT_LEGAL_VALUES[3] = "CH";
		DEFAULT_LEGAL_VALUES[4] = "CI";
		DEFAULT_LEGAL_VALUES[5] = "CN";
		DEFAULT_LEGAL_VALUES[6] = "DS";
		DEFAULT_LEGAL_VALUES[7] = "FI";
		DEFAULT_LEGAL_VALUES[8] = "HM";
		DEFAULT_LEGAL_VALUES[9] = "LI";
		DEFAULT_LEGAL_VALUES[10] = "LM";
		DEFAULT_LEGAL_VALUES[11] = new String[] { "MA", "MC" };
		DEFAULT_LEGAL_VALUES[12] = "MH";
		DEFAULT_LEGAL_VALUES[13] = "OF";
		DEFAULT_LEGAL_VALUES[14] = "SA";
		DEFAULT_LEGAL_VALUES[15] = "TV";
		DEFAULT_LEGAL_VALUES[16] = "VA";
		DEFAULT_LEGAL_VALUES[17] = new String[] { "WB", "WE" };
		DEFAULT_LEGAL_VALUES[18] = "ZZ";
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

		currentValues = new Object[11];
		currentValues[0] = new String[] { "12", "16" };
		currentValues[1] = "AM";
		currentValues[2] = "CH";
		currentValues[3] = "DS";
		currentValues[4] = "HM";
		currentValues[5] = "LM";
		currentValues[6] = new String[] { "MA", "MC" };
		currentValues[7] = "OF";
		currentValues[8] = "TV";
		currentValues[9] = "VA";
		currentValues[10] = "WC";
		valueOverrides.put("20-6", currentValues);
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
