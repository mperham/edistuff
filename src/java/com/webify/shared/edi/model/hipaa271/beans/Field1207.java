package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1207 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[18];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "CHD";
		DEFAULT_LEGAL_VALUES[1] = "DEP";
		DEFAULT_LEGAL_VALUES[2] = "E1D";
		DEFAULT_LEGAL_VALUES[3] = "E2D";
		DEFAULT_LEGAL_VALUES[4] = "E3D";
		DEFAULT_LEGAL_VALUES[5] = "E5D";
		DEFAULT_LEGAL_VALUES[6] = "E6D";
		DEFAULT_LEGAL_VALUES[7] = "E7D";
		DEFAULT_LEGAL_VALUES[8] = "E8D";
		DEFAULT_LEGAL_VALUES[9] = "E9D";
		DEFAULT_LEGAL_VALUES[10] = "ECH";
		DEFAULT_LEGAL_VALUES[11] = "EMP";
		DEFAULT_LEGAL_VALUES[12] = "ESP";
		DEFAULT_LEGAL_VALUES[13] = "FAM";
		DEFAULT_LEGAL_VALUES[14] = "IND";
		DEFAULT_LEGAL_VALUES[15] = "SPC";
		DEFAULT_LEGAL_VALUES[16] = "SPO";
		DEFAULT_LEGAL_VALUES[17] = "TWO";
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

		currentValues = new Object[8];
		currentValues[0] = "CHD";
		currentValues[1] = "DEP";
		currentValues[2] = "ECH";
		currentValues[3] = "ESP";
		currentValues[4] = "FAM";
		currentValues[5] = "IND";
		currentValues[6] = "SPC";
		currentValues[7] = "SPO";
		valueOverrides.put("49-2", currentValues);

		currentValues = new Object[9];
		currentValues[0] = "CHD";
		currentValues[1] = "DEP";
		currentValues[2] = "ECH";
		currentValues[3] = "EMP";
		currentValues[4] = "ESP";
		currentValues[5] = "FAM";
		currentValues[6] = "IND";
		currentValues[7] = "SPC";
		currentValues[8] = "SPO";
		valueOverrides.put("24-2", currentValues);
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
