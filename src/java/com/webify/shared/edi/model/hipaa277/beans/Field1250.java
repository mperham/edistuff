package com.webify.shared.edi.model.hipaa277.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1250 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[33];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "CC";
		DEFAULT_LEGAL_VALUES[1] = "CD";
		DEFAULT_LEGAL_VALUES[2] = "CM";
		DEFAULT_LEGAL_VALUES[3] = "CQ";
		DEFAULT_LEGAL_VALUES[4] = "CY";
		DEFAULT_LEGAL_VALUES[5] = "D6";
		DEFAULT_LEGAL_VALUES[6] = "D8";
		DEFAULT_LEGAL_VALUES[7] = "DA";
		DEFAULT_LEGAL_VALUES[8] = "DB";
		DEFAULT_LEGAL_VALUES[9] = "DD";
		DEFAULT_LEGAL_VALUES[10] = "DT";
		DEFAULT_LEGAL_VALUES[11] = "EH";
		DEFAULT_LEGAL_VALUES[12] = "KA";
		DEFAULT_LEGAL_VALUES[13] = "MD";
		DEFAULT_LEGAL_VALUES[14] = "MM";
		DEFAULT_LEGAL_VALUES[15] = "RD";
		DEFAULT_LEGAL_VALUES[16] = "TC";
		DEFAULT_LEGAL_VALUES[17] = "TM";
		DEFAULT_LEGAL_VALUES[18] = new String[] { "TQ", "TU" };
		DEFAULT_LEGAL_VALUES[19] = "UN";
		DEFAULT_LEGAL_VALUES[20] = "YM";
		DEFAULT_LEGAL_VALUES[21] = "YY";
		DEFAULT_LEGAL_VALUES[22] = "DTS";
		DEFAULT_LEGAL_VALUES[23] = "RD2";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "RD4", "RD6" };
		DEFAULT_LEGAL_VALUES[25] = "RD8";
		DEFAULT_LEGAL_VALUES[26] = "RDM";
		DEFAULT_LEGAL_VALUES[27] = "RDT";
		DEFAULT_LEGAL_VALUES[28] = "RMD";
		DEFAULT_LEGAL_VALUES[29] = "RMY";
		DEFAULT_LEGAL_VALUES[30] = "RTM";
		DEFAULT_LEGAL_VALUES[31] = "RTS";
		DEFAULT_LEGAL_VALUES[32] = "YMM";
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
		currentValues[0] = "D8";
		valueOverrides.put("24-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("35-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("31-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("22-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("18-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("11-1", currentValues);
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
