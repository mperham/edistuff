package com.webify.shared.edi.model.hipaa835.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1029 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[10];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "10", "30" };
		DEFAULT_LEGAL_VALUES[2] = "AD";
		DEFAULT_LEGAL_VALUES[3] = "AP";
		DEFAULT_LEGAL_VALUES[4] = "CC";
		DEFAULT_LEGAL_VALUES[5] = "CL";
		DEFAULT_LEGAL_VALUES[6] = "CP";
		DEFAULT_LEGAL_VALUES[7] = "I";
		DEFAULT_LEGAL_VALUES[8] = new String[] { "RA", "RD" };
		DEFAULT_LEGAL_VALUES[9] = "RO";
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
		currentValues[0] = new String[] { "1", "5" };
		currentValues[1] = "10";
		currentValues[2] = "13";
		currentValues[3] = new String[] { "15", "17" };
		currentValues[4] = new String[] { "19", "23" };
		currentValues[5] = "25";
		currentValues[6] = "27";
		valueOverrides.put("20-2", currentValues);
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
