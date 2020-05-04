package com.webify.shared.edi.model.hipaa275.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field353 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[15];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "00", "08" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "10", "22" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "24", "28" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "30", "57" };
		DEFAULT_LEGAL_VALUES[4] = "77";
		DEFAULT_LEGAL_VALUES[5] = "5C";
		DEFAULT_LEGAL_VALUES[6] = "CN";
		DEFAULT_LEGAL_VALUES[7] = "CO";
		DEFAULT_LEGAL_VALUES[8] = "EX";
		DEFAULT_LEGAL_VALUES[9] = "GR";
		DEFAULT_LEGAL_VALUES[10] = "PR";
		DEFAULT_LEGAL_VALUES[11] = "RH";
		DEFAULT_LEGAL_VALUES[12] = "RV";
		DEFAULT_LEGAL_VALUES[13] = "SU";
		DEFAULT_LEGAL_VALUES[14] = "ZZ";
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
