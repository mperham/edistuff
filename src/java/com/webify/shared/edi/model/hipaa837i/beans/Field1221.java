package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1221 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[26];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "AD";
		DEFAULT_LEGAL_VALUES[1] = "AS";
		DEFAULT_LEGAL_VALUES[2] = "AT";
		DEFAULT_LEGAL_VALUES[3] = "BI";
		DEFAULT_LEGAL_VALUES[4] = "BS";
		DEFAULT_LEGAL_VALUES[5] = "CO";
		DEFAULT_LEGAL_VALUES[6] = "CV";
		DEFAULT_LEGAL_VALUES[7] = "H";
		DEFAULT_LEGAL_VALUES[8] = "HH";
		DEFAULT_LEGAL_VALUES[9] = "LA";
		DEFAULT_LEGAL_VALUES[10] = "ON";
		DEFAULT_LEGAL_VALUES[11] = "OP";
		DEFAULT_LEGAL_VALUES[12] = "OR";
		DEFAULT_LEGAL_VALUES[13] = "OT";
		DEFAULT_LEGAL_VALUES[14] = "P1";
		DEFAULT_LEGAL_VALUES[15] = "P2";
		DEFAULT_LEGAL_VALUES[16] = "PC";
		DEFAULT_LEGAL_VALUES[17] = "PE";
		DEFAULT_LEGAL_VALUES[18] = "PT";
		DEFAULT_LEGAL_VALUES[19] = "PU";
		DEFAULT_LEGAL_VALUES[20] = "R";
		DEFAULT_LEGAL_VALUES[21] = "RF";
		DEFAULT_LEGAL_VALUES[22] = "RP";
		DEFAULT_LEGAL_VALUES[23] = "SB";
		DEFAULT_LEGAL_VALUES[24] = "SK";
		DEFAULT_LEGAL_VALUES[25] = "SU";
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

		currentValues = new Object[2];
		currentValues[0] = "OT";
		currentValues[1] = "PE";
		valueOverrides.put("218-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "BI";
		currentValues[1] = "PT";
		valueOverrides.put("8-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "OT";
		currentValues[1] = "PE";
		valueOverrides.put("282-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "OP";
		valueOverrides.put("279-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "OP";
		valueOverrides.put("85-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RP";
		valueOverrides.put("224-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RF";
		valueOverrides.put("155-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "OT";
		currentValues[1] = "PE";
		valueOverrides.put("152-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AT";
		valueOverrides.put("146-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RP";
		valueOverrides.put("94-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RF";
		valueOverrides.put("285-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "AT";
		currentValues[1] = "SU";
		valueOverrides.put("82-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "OP";
		valueOverrides.put("149-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RF";
		valueOverrides.put("221-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "OP";
		valueOverrides.put("215-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RF";
		valueOverrides.put("91-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "AT";
		currentValues[1] = "SU";
		valueOverrides.put("212-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AT";
		valueOverrides.put("276-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "OT";
		currentValues[1] = "PE";
		valueOverrides.put("88-1", currentValues);
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
