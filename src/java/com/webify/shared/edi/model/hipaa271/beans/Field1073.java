package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1073 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[4];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "N";
		DEFAULT_LEGAL_VALUES[1] = "U";
		DEFAULT_LEGAL_VALUES[2] = "W";
		DEFAULT_LEGAL_VALUES[3] = "Y";
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
		currentValues[0] = "N";
		valueOverrides.put("47-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("8-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("20-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "Y";
		valueOverrides.put("22-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("45-1", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "N";
		currentValues[1] = "U";
		currentValues[2] = "Y";
		valueOverrides.put("49-11", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "N";
		currentValues[1] = "U";
		currentValues[2] = "Y";
		valueOverrides.put("49-12", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "N";
		currentValues[1] = "U";
		currentValues[2] = "Y";
		valueOverrides.put("24-11", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("12-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("47-10", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "N";
		currentValues[1] = "U";
		currentValues[2] = "Y";
		valueOverrides.put("24-12", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("28-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("22-10", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("4-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "N";
		currentValues[1] = "Y";
		valueOverrides.put("53-1", currentValues);
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