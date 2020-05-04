package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1069 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[25];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "15" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "17", "34" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "36", "41" };
		DEFAULT_LEGAL_VALUES[3] = "43";
		DEFAULT_LEGAL_VALUES[4] = new String[] { "45", "53" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "55", "68" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "70", "76" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "78", "84" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "86", "88" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "90", "99" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "A1", "A9" };
		DEFAULT_LEGAL_VALUES[11] = new String[] { "B1", "B9" };
		DEFAULT_LEGAL_VALUES[12] = new String[] { "C1", "C5" };
		DEFAULT_LEGAL_VALUES[13] = "C8";
		DEFAULT_LEGAL_VALUES[14] = "C9";
		DEFAULT_LEGAL_VALUES[15] = new String[] { "D1", "D9" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "E1", "E9" };
		DEFAULT_LEGAL_VALUES[17] = new String[] { "F1", "F3" };
		DEFAULT_LEGAL_VALUES[18] = new String[] { "F6", "F9" };
		DEFAULT_LEGAL_VALUES[19] = new String[] { "G2", "G9" };
		DEFAULT_LEGAL_VALUES[20] = "H1";
		DEFAULT_LEGAL_VALUES[21] = "H4";
		DEFAULT_LEGAL_VALUES[22] = "N1";
		DEFAULT_LEGAL_VALUES[23] = "OT";
		DEFAULT_LEGAL_VALUES[24] = "ZZ";
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
		currentValues[0] = "18";
		valueOverrides.put("21-2", currentValues);

		currentValues = new Object[15];
		currentValues[0] = "01";
		currentValues[1] = "04";
		currentValues[2] = "05";
		currentValues[3] = "07";
		currentValues[4] = "10";
		currentValues[5] = "15";
		currentValues[6] = new String[] { "17", "24" };
		currentValues[7] = "29";
		currentValues[8] = "32";
		currentValues[9] = "33";
		currentValues[10] = "36";
		currentValues[11] = new String[] { "39", "41" };
		currentValues[12] = "43";
		currentValues[13] = "53";
		currentValues[14] = "G8";
		valueOverrides.put("98-2", currentValues);

		currentValues = new Object[16];
		currentValues[0] = "01";
		currentValues[1] = "04";
		currentValues[2] = "05";
		currentValues[3] = "07";
		currentValues[4] = "10";
		currentValues[5] = "15";
		currentValues[6] = "17";
		currentValues[7] = new String[] { "19", "24" };
		currentValues[8] = "29";
		currentValues[9] = "32";
		currentValues[10] = "33";
		currentValues[11] = "36";
		currentValues[12] = new String[] { "39", "41" };
		currentValues[13] = "43";
		currentValues[14] = "53";
		currentValues[15] = "G8";
		valueOverrides.put("161-1", currentValues);

		currentValues = new Object[15];
		currentValues[0] = "01";
		currentValues[1] = "04";
		currentValues[2] = "05";
		currentValues[3] = "07";
		currentValues[4] = "10";
		currentValues[5] = "15";
		currentValues[6] = new String[] { "17", "24" };
		currentValues[7] = "29";
		currentValues[8] = "32";
		currentValues[9] = "33";
		currentValues[10] = "36";
		currentValues[11] = new String[] { "39", "41" };
		currentValues[12] = "43";
		currentValues[13] = "53";
		currentValues[14] = "G8";
		valueOverrides.put("228-2", currentValues);
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
