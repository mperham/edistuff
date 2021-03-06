package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1065 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[4];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "C", "E" };
		DEFAULT_LEGAL_VALUES[2] = "G";
		DEFAULT_LEGAL_VALUES[3] = "L";
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
		currentValues[0] = "1";
		currentValues[1] = "2";
		valueOverrides.put("57-2", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "1";
		currentValues[1] = "2";
		valueOverrides.put("5-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "1";
		valueOverrides.put("40-2", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "1";
		currentValues[1] = "2";
		valueOverrides.put("10-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "1";
		valueOverrides.put("15-2", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "1";
		currentValues[1] = "2";
		valueOverrides.put("32-2", currentValues);
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
