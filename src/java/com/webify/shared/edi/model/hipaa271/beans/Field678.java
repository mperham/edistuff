package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field678 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[8];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "A", "H" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "J", "Z" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "SA", "SD" };
		DEFAULT_LEGAL_VALUES[4] = "SG";
		DEFAULT_LEGAL_VALUES[5] = "SL";
		DEFAULT_LEGAL_VALUES[6] = "SP";
		DEFAULT_LEGAL_VALUES[7] = new String[] { "SX", "SZ" };
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

		currentValues = new Object[7];
		currentValues[0] = new String[] { "1", "9" };
		currentValues[1] = new String[] { "A", "H" };
		currentValues[2] = new String[] { "J", "Y" };
		currentValues[3] = "SG";
		currentValues[4] = "SL";
		currentValues[5] = "SP";
		currentValues[6] = new String[] { "SX", "SZ" };
		valueOverrides.put("50-7", currentValues);

		currentValues = new Object[7];
		currentValues[0] = new String[] { "1", "9" };
		currentValues[1] = new String[] { "A", "H" };
		currentValues[2] = new String[] { "J", "Y" };
		currentValues[3] = "SG";
		currentValues[4] = "SL";
		currentValues[5] = "SP";
		currentValues[6] = new String[] { "SX", "SZ" };
		valueOverrides.put("25-7", currentValues);
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
