package com.webify.shared.edi.model.hipaa835.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1033 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[8];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "CO";
		DEFAULT_LEGAL_VALUES[1] = "CR";
		DEFAULT_LEGAL_VALUES[2] = "DE";
		DEFAULT_LEGAL_VALUES[3] = "MA";
		DEFAULT_LEGAL_VALUES[4] = "NC";
		DEFAULT_LEGAL_VALUES[5] = "OA";
		DEFAULT_LEGAL_VALUES[6] = "PI";
		DEFAULT_LEGAL_VALUES[7] = "PR";
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
		currentValues[0] = "CO";
		currentValues[1] = "CR";
		currentValues[2] = "OA";
		currentValues[3] = "PI";
		currentValues[4] = "PR";
		valueOverrides.put("21-1", currentValues);

		currentValues = new Object[5];
		currentValues[0] = "CO";
		currentValues[1] = "CR";
		currentValues[2] = "OA";
		currentValues[3] = "PI";
		currentValues[4] = "PR";
		valueOverrides.put("38-1", currentValues);
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
