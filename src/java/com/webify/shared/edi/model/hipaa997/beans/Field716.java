package com.webify.shared.edi.model.hipaa997.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field716 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[23];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "1";
		DEFAULT_LEGAL_VALUES[1] = "2";
		DEFAULT_LEGAL_VALUES[2] = "3";
		DEFAULT_LEGAL_VALUES[3] = "4";
		DEFAULT_LEGAL_VALUES[4] = "5";
		DEFAULT_LEGAL_VALUES[5] = "6";
		DEFAULT_LEGAL_VALUES[6] = "10";
		DEFAULT_LEGAL_VALUES[7] = "11";
		DEFAULT_LEGAL_VALUES[8] = "12";
		DEFAULT_LEGAL_VALUES[9] = "13";
		DEFAULT_LEGAL_VALUES[10] = "14";
		DEFAULT_LEGAL_VALUES[11] = "15";
		DEFAULT_LEGAL_VALUES[12] = "16";
		DEFAULT_LEGAL_VALUES[13] = "17";
		DEFAULT_LEGAL_VALUES[14] = "18";
		DEFAULT_LEGAL_VALUES[15] = "19";
		DEFAULT_LEGAL_VALUES[16] = "20";
		DEFAULT_LEGAL_VALUES[17] = "21";
		DEFAULT_LEGAL_VALUES[18] = "22";
		DEFAULT_LEGAL_VALUES[19] = "23";
		DEFAULT_LEGAL_VALUES[20] = "24";
		DEFAULT_LEGAL_VALUES[21] = "25";
		DEFAULT_LEGAL_VALUES[22] = "26";
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
