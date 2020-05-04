package com.webify.shared.edi.model.hipaa837p.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field594 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[8];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = "B";
		DEFAULT_LEGAL_VALUES[2] = "C";
		DEFAULT_LEGAL_VALUES[3] = "H";
		DEFAULT_LEGAL_VALUES[4] = "Q";
		DEFAULT_LEGAL_VALUES[5] = "S";
		DEFAULT_LEGAL_VALUES[6] = "U";
		DEFAULT_LEGAL_VALUES[7] = "Z";
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

		currentValues = new Object[3];
		currentValues[0] = "1";
		currentValues[1] = "4";
		currentValues[2] = "6";
		valueOverrides.put("430-6", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "1";
		currentValues[1] = "4";
		currentValues[2] = "6";
		valueOverrides.put("435-6", currentValues);
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
