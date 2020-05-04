package com.webify.shared.edi.model.hipaa837p.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field522 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[120];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "1", "9" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "01", "99" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "0A", "0N" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "0P", "0U" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "1A", "1H" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "1J", "1N" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "1P", "2N" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "2P", "9Z" };
		DEFAULT_LEGAL_VALUES[8] = "A";
		DEFAULT_LEGAL_VALUES[9] = new String[] { "A0", "A9" };
		DEFAULT_LEGAL_VALUES[10] = "AA";
		DEFAULT_LEGAL_VALUES[11] = new String[] { "AAA", "AAZ" };
		DEFAULT_LEGAL_VALUES[12] = "AB";
		DEFAULT_LEGAL_VALUES[13] = new String[] { "ABA", "ABZ" };
		DEFAULT_LEGAL_VALUES[14] = "AC";
		DEFAULT_LEGAL_VALUES[15] = new String[] { "ACA", "ACZ" };
		DEFAULT_LEGAL_VALUES[16] = "AD";
		DEFAULT_LEGAL_VALUES[17] = new String[] { "ADA", "ADT" };
		DEFAULT_LEGAL_VALUES[18] = new String[] { "ADW", "ADZ" };
		DEFAULT_LEGAL_VALUES[19] = "AE";
		DEFAULT_LEGAL_VALUES[20] = new String[] { "AEB", "AEL" };
		DEFAULT_LEGAL_VALUES[21] = new String[] { "AF", "AV" };
		DEFAULT_LEGAL_VALUES[22] = "AVE";
		DEFAULT_LEGAL_VALUES[23] = new String[] { "AW", "AZ" };
		DEFAULT_LEGAL_VALUES[24] = "B";
		DEFAULT_LEGAL_VALUES[25] = new String[] { "B0", "B9" };
		DEFAULT_LEGAL_VALUES[26] = "BA";
		DEFAULT_LEGAL_VALUES[27] = new String[] { "BAA", "BAZ" };
		DEFAULT_LEGAL_VALUES[28] = "BB";
		DEFAULT_LEGAL_VALUES[29] = new String[] { "BBA", "BBG" };
		DEFAULT_LEGAL_VALUES[30] = new String[] { "BC", "BZ" };
		DEFAULT_LEGAL_VALUES[31] = "C";
		DEFAULT_LEGAL_VALUES[32] = new String[] { "C0", "C9" };
		DEFAULT_LEGAL_VALUES[33] = new String[] { "CA", "CZ" };
		DEFAULT_LEGAL_VALUES[34] = "D";
		DEFAULT_LEGAL_VALUES[35] = new String[] { "D0", "D9" };
		DEFAULT_LEGAL_VALUES[36] = new String[] { "DA", "DZ" };
		DEFAULT_LEGAL_VALUES[37] = "E";
		DEFAULT_LEGAL_VALUES[38] = new String[] { "E0", "E9" };
		DEFAULT_LEGAL_VALUES[39] = new String[] { "EA", "EZ" };
		DEFAULT_LEGAL_VALUES[40] = "F";
		DEFAULT_LEGAL_VALUES[41] = new String[] { "F0", "F9" };
		DEFAULT_LEGAL_VALUES[42] = "FA";
		DEFAULT_LEGAL_VALUES[43] = "FB";
		DEFAULT_LEGAL_VALUES[44] = "FBA";
		DEFAULT_LEGAL_VALUES[45] = new String[] { "FC", "FZ" };
		DEFAULT_LEGAL_VALUES[46] = "G";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "G0", "G9" };
		DEFAULT_LEGAL_VALUES[48] = new String[] { "GA", "GZ" };
		DEFAULT_LEGAL_VALUES[49] = "H";
		DEFAULT_LEGAL_VALUES[50] = new String[] { "H0", "H9" };
		DEFAULT_LEGAL_VALUES[51] = new String[] { "HA", "HZ" };
		DEFAULT_LEGAL_VALUES[52] = "I";
		DEFAULT_LEGAL_VALUES[53] = new String[] { "I0", "I9" };
		DEFAULT_LEGAL_VALUES[54] = new String[] { "IA", "IZ" };
		DEFAULT_LEGAL_VALUES[55] = "J";
		DEFAULT_LEGAL_VALUES[56] = new String[] { "J0", "J9" };
		DEFAULT_LEGAL_VALUES[57] = new String[] { "JA", "JZ" };
		DEFAULT_LEGAL_VALUES[58] = "K";
		DEFAULT_LEGAL_VALUES[59] = new String[] { "K0", "K9" };
		DEFAULT_LEGAL_VALUES[60] = new String[] { "KA", "KZ" };
		DEFAULT_LEGAL_VALUES[61] = "L";
		DEFAULT_LEGAL_VALUES[62] = new String[] { "L0", "L9" };
		DEFAULT_LEGAL_VALUES[63] = new String[] { "LA", "LO" };
		DEFAULT_LEGAL_VALUES[64] = "LOW";
		DEFAULT_LEGAL_VALUES[65] = new String[] { "LP", "LZ" };
		DEFAULT_LEGAL_VALUES[66] = "M";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "M0", "M9" };
		DEFAULT_LEGAL_VALUES[68] = new String[] { "MA", "MZ" };
		DEFAULT_LEGAL_VALUES[69] = "N";
		DEFAULT_LEGAL_VALUES[70] = new String[] { "N0", "N9" };
		DEFAULT_LEGAL_VALUES[71] = new String[] { "NA", "NZ" };
		DEFAULT_LEGAL_VALUES[72] = "O";
		DEFAULT_LEGAL_VALUES[73] = new String[] { "O0", "O9" };
		DEFAULT_LEGAL_VALUES[74] = new String[] { "OA", "OZ" };
		DEFAULT_LEGAL_VALUES[75] = "P";
		DEFAULT_LEGAL_VALUES[76] = new String[] { "P0", "P9" };
		DEFAULT_LEGAL_VALUES[77] = new String[] { "PA", "PC" };
		DEFAULT_LEGAL_VALUES[78] = "PCC";
		DEFAULT_LEGAL_VALUES[79] = "PCS";
		DEFAULT_LEGAL_VALUES[80] = "PCV";
		DEFAULT_LEGAL_VALUES[81] = new String[] { "PD", "PZ" };
		DEFAULT_LEGAL_VALUES[82] = "Q";
		DEFAULT_LEGAL_VALUES[83] = new String[] { "Q0", "Q9" };
		DEFAULT_LEGAL_VALUES[84] = new String[] { "QA", "QZ" };
		DEFAULT_LEGAL_VALUES[85] = "R";
		DEFAULT_LEGAL_VALUES[86] = new String[] { "R0", "R9" };
		DEFAULT_LEGAL_VALUES[87] = new String[] { "RA", "RZ" };
		DEFAULT_LEGAL_VALUES[88] = "S";
		DEFAULT_LEGAL_VALUES[89] = new String[] { "S0", "S9" };
		DEFAULT_LEGAL_VALUES[90] = new String[] { "SA", "SO" };
		DEFAULT_LEGAL_VALUES[91] = "SOF";
		DEFAULT_LEGAL_VALUES[92] = new String[] { "SP", "SZ" };
		DEFAULT_LEGAL_VALUES[93] = "T";
		DEFAULT_LEGAL_VALUES[94] = new String[] { "T0", "T9" };
		DEFAULT_LEGAL_VALUES[95] = new String[] { "TA", "TU" };
		DEFAULT_LEGAL_VALUES[96] = new String[] { "TW", "TZ" };
		DEFAULT_LEGAL_VALUES[97] = "U";
		DEFAULT_LEGAL_VALUES[98] = new String[] { "U0", "U9" };
		DEFAULT_LEGAL_VALUES[99] = new String[] { "UA", "UP" };
		DEFAULT_LEGAL_VALUES[100] = "UPF";
		DEFAULT_LEGAL_VALUES[101] = new String[] { "UQ", "UZ" };
		DEFAULT_LEGAL_VALUES[102] = "V";
		DEFAULT_LEGAL_VALUES[103] = new String[] { "V0", "V9" };
		DEFAULT_LEGAL_VALUES[104] = new String[] { "VA", "VE" };
		DEFAULT_LEGAL_VALUES[105] = "VES";
		DEFAULT_LEGAL_VALUES[106] = new String[] { "VF", "VZ" };
		DEFAULT_LEGAL_VALUES[107] = "W";
		DEFAULT_LEGAL_VALUES[108] = new String[] { "W0", "W9" };
		DEFAULT_LEGAL_VALUES[109] = new String[] { "WA", "WZ" };
		DEFAULT_LEGAL_VALUES[110] = "X";
		DEFAULT_LEGAL_VALUES[111] = new String[] { "X0", "X9" };
		DEFAULT_LEGAL_VALUES[112] = new String[] { "XA", "XZ" };
		DEFAULT_LEGAL_VALUES[113] = "Y";
		DEFAULT_LEGAL_VALUES[114] = new String[] { "Y1", "Y9" };
		DEFAULT_LEGAL_VALUES[115] = new String[] { "YA", "YO" };
		DEFAULT_LEGAL_VALUES[116] = new String[] { "YQ", "YZ" };
		DEFAULT_LEGAL_VALUES[117] = "Z";
		DEFAULT_LEGAL_VALUES[118] = new String[] { "Z0", "Z9" };
		DEFAULT_LEGAL_VALUES[119] = new String[] { "ZA", "ZZ" };
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
		currentValues[0] = "F5";
		valueOverrides.put("263-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T";
		valueOverrides.put("386-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T2";
		valueOverrides.put("124-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T";
		valueOverrides.put("192-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "B6";
		valueOverrides.put("311-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AAE";
		valueOverrides.put("387-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T";
		valueOverrides.put("317-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AAE";
		valueOverrides.put("193-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AU";
		valueOverrides.put("119-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D";
		valueOverrides.put("309-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F2";
		valueOverrides.put("118-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("314-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F2";
		valueOverrides.put("312-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T";
		valueOverrides.put("123-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "MA";
		valueOverrides.put("68-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DY";
		valueOverrides.put("315-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "NE";
		valueOverrides.put("70-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D8";
		valueOverrides.put("120-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "T2";
		valueOverrides.put("318-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F4";
		valueOverrides.put("194-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F5";
		valueOverrides.put("69-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F5";
		valueOverrides.put("316-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "B6";
		valueOverrides.put("117-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F4";
		valueOverrides.put("388-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AAE";
		valueOverrides.put("310-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DY";
		valueOverrides.put("121-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "NE";
		valueOverrides.put("264-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F5";
		valueOverrides.put("122-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "D";
		valueOverrides.put("115-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AAE";
		valueOverrides.put("116-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "MA";
		valueOverrides.put("262-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "AU";
		valueOverrides.put("313-1", currentValues);
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
