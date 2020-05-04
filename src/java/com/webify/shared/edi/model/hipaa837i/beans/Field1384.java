package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1384 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[6];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "A", "H" };
		DEFAULT_LEGAL_VALUES[1] = "L";
		DEFAULT_LEGAL_VALUES[2] = "M";
		DEFAULT_LEGAL_VALUES[3] = "O";
		DEFAULT_LEGAL_VALUES[4] = "P";
		DEFAULT_LEGAL_VALUES[5] = new String[] { "R", "T" };
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

		currentValues = new Object[5];
		currentValues[0] = new String[] { "A", "H" };
		currentValues[1] = "L";
		currentValues[2] = "M";
		currentValues[3] = "O";
		currentValues[4] = new String[] { "R", "T" };
		valueOverrides.put("63-17", currentValues);

		currentValues = new Object[5];
		currentValues[0] = new String[] { "A", "H" };
		currentValues[1] = "L";
		currentValues[2] = "M";
		currentValues[3] = "O";
		currentValues[4] = new String[] { "R", "T" };
		valueOverrides.put("193-17", currentValues);
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
