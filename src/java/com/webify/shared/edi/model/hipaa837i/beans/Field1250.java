package com.webify.shared.edi.model.hipaa837i.beans;

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
		DEFAULT_LEGAL_VALUES[11] = "DTS";
		DEFAULT_LEGAL_VALUES[12] = "EH";
		DEFAULT_LEGAL_VALUES[13] = "KA";
		DEFAULT_LEGAL_VALUES[14] = "MD";
		DEFAULT_LEGAL_VALUES[15] = "MM";
		DEFAULT_LEGAL_VALUES[16] = "RD";
		DEFAULT_LEGAL_VALUES[17] = "RD2";
		DEFAULT_LEGAL_VALUES[18] = new String[] { "RD4", "RD6" };
		DEFAULT_LEGAL_VALUES[19] = "RD8";
		DEFAULT_LEGAL_VALUES[20] = "RDM";
		DEFAULT_LEGAL_VALUES[21] = "RDT";
		DEFAULT_LEGAL_VALUES[22] = "RMD";
		DEFAULT_LEGAL_VALUES[23] = "RMY";
		DEFAULT_LEGAL_VALUES[24] = "RTM";
		DEFAULT_LEGAL_VALUES[25] = "RTS";
		DEFAULT_LEGAL_VALUES[26] = "TC";
		DEFAULT_LEGAL_VALUES[27] = "TM";
		DEFAULT_LEGAL_VALUES[28] = new String[] { "TQ", "TU" };
		DEFAULT_LEGAL_VALUES[29] = "UN";
		DEFAULT_LEGAL_VALUES[30] = "YM";
		DEFAULT_LEGAL_VALUES[31] = "YMM";
		DEFAULT_LEGAL_VALUES[32] = "YY";
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
		valueOverrides.put("203-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-3-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("289-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-4-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-12-3", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "D8";
		currentValues[1] = "RD8";
		valueOverrides.put("141-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "TM";
		valueOverrides.put("39-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("252-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DT";
		valueOverrides.put("171-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-12-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("70-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("111-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-4-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-4-3", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "D8";
		currentValues[1] = "RD8";
		valueOverrides.put("170-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("165-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-3-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-3-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-12-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("142-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-2-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("193-15", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-2-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("63-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("272-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "TM";
		valueOverrides.put("169-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("72-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-11-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-2-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-12-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-12-3", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "D8";
		currentValues[1] = "RD8";
		valueOverrides.put("271-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("200-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-4-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-3-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-12-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DT";
		valueOverrides.put("41-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-2-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-4-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-3-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("241-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("193-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-7-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("159-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("26-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-1-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-3-3", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "D8";
		currentValues[1] = "RD8";
		valueOverrides.put("40-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("71-10-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("203-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-2-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-9-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-5-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-8-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("122-2", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("73-6-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("63-15", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("201-4-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "RD8";
		valueOverrides.put("202-2-3", currentValues);
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