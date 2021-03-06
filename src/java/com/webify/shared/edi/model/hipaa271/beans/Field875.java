package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field875 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[10];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "001", "010" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "012", "026" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "028", "033" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "050", "083" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "100", "102" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "104", "119" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "123", "138" };
		DEFAULT_LEGAL_VALUES[7] = "CEP";
		DEFAULT_LEGAL_VALUES[8] = "PRI";
		DEFAULT_LEGAL_VALUES[9] = "ZZZ";
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
		currentValues[0] = "001";
		valueOverrides.put("47-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "001";
		valueOverrides.put("22-3", currentValues);
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
