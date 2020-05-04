package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field143 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[112];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "100";
		DEFAULT_LEGAL_VALUES[1] = "101";
		DEFAULT_LEGAL_VALUES[2] = new String[] { "104", "110" };
		DEFAULT_LEGAL_VALUES[3] = "112";
		DEFAULT_LEGAL_VALUES[4] = "120";
		DEFAULT_LEGAL_VALUES[5] = "121";
		DEFAULT_LEGAL_VALUES[6] = new String[] { "124", "131" };
		DEFAULT_LEGAL_VALUES[7] = "135";
		DEFAULT_LEGAL_VALUES[8] = new String[] { "138", "144" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "146", "155" };
		DEFAULT_LEGAL_VALUES[10] = "157";
		DEFAULT_LEGAL_VALUES[11] = new String[] { "159", "161" };
		DEFAULT_LEGAL_VALUES[12] = "163";
		DEFAULT_LEGAL_VALUES[13] = "170";
		DEFAULT_LEGAL_VALUES[14] = "175";
		DEFAULT_LEGAL_VALUES[15] = "176";
		DEFAULT_LEGAL_VALUES[16] = "180";
		DEFAULT_LEGAL_VALUES[17] = "185";
		DEFAULT_LEGAL_VALUES[18] = "186";
		DEFAULT_LEGAL_VALUES[19] = new String[] { "188", "191" };
		DEFAULT_LEGAL_VALUES[20] = new String[] { "194", "206" };
		DEFAULT_LEGAL_VALUES[21] = new String[] { "210", "220" };
		DEFAULT_LEGAL_VALUES[22] = new String[] { "222", "225" };
		DEFAULT_LEGAL_VALUES[23] = "242";
		DEFAULT_LEGAL_VALUES[24] = "244";
		DEFAULT_LEGAL_VALUES[25] = new String[] { "248", "252" };
		DEFAULT_LEGAL_VALUES[26] = "255";
		DEFAULT_LEGAL_VALUES[27] = "256";
		DEFAULT_LEGAL_VALUES[28] = new String[] { "260", "268" };
		DEFAULT_LEGAL_VALUES[29] = new String[] { "270", "273" };
		DEFAULT_LEGAL_VALUES[30] = new String[] { "275", "278" };
		DEFAULT_LEGAL_VALUES[31] = "280";
		DEFAULT_LEGAL_VALUES[32] = "285";
		DEFAULT_LEGAL_VALUES[33] = "286";
		DEFAULT_LEGAL_VALUES[34] = "288";
		DEFAULT_LEGAL_VALUES[35] = "290";
		DEFAULT_LEGAL_VALUES[36] = "300";
		DEFAULT_LEGAL_VALUES[37] = "301";
		DEFAULT_LEGAL_VALUES[38] = "303";
		DEFAULT_LEGAL_VALUES[39] = "304";
		DEFAULT_LEGAL_VALUES[40] = "306";
		DEFAULT_LEGAL_VALUES[41] = new String[] { "309", "313" };
		DEFAULT_LEGAL_VALUES[42] = "315";
		DEFAULT_LEGAL_VALUES[43] = "317";
		DEFAULT_LEGAL_VALUES[44] = "319";
		DEFAULT_LEGAL_VALUES[45] = new String[] { "321", "326" };
		DEFAULT_LEGAL_VALUES[46] = "350";
		DEFAULT_LEGAL_VALUES[47] = new String[] { "352", "358" };
		DEFAULT_LEGAL_VALUES[48] = "361";
		DEFAULT_LEGAL_VALUES[49] = "362";
		DEFAULT_LEGAL_VALUES[50] = "404";
		DEFAULT_LEGAL_VALUES[51] = "410";
		DEFAULT_LEGAL_VALUES[52] = "411";
		DEFAULT_LEGAL_VALUES[53] = "414";
		DEFAULT_LEGAL_VALUES[54] = new String[] { "417", "423" };
		DEFAULT_LEGAL_VALUES[55] = "425";
		DEFAULT_LEGAL_VALUES[56] = "426";
		DEFAULT_LEGAL_VALUES[57] = "429";
		DEFAULT_LEGAL_VALUES[58] = new String[] { "431", "437" };
		DEFAULT_LEGAL_VALUES[59] = "440";
		DEFAULT_LEGAL_VALUES[60] = new String[] { "451", "453" };
		DEFAULT_LEGAL_VALUES[61] = "455";
		DEFAULT_LEGAL_VALUES[62] = "456";
		DEFAULT_LEGAL_VALUES[63] = "460";
		DEFAULT_LEGAL_VALUES[64] = "463";
		DEFAULT_LEGAL_VALUES[65] = "466";
		DEFAULT_LEGAL_VALUES[66] = "468";
		DEFAULT_LEGAL_VALUES[67] = "470";
		DEFAULT_LEGAL_VALUES[68] = "475";
		DEFAULT_LEGAL_VALUES[69] = "485";
		DEFAULT_LEGAL_VALUES[70] = "486";
		DEFAULT_LEGAL_VALUES[71] = "490";
		DEFAULT_LEGAL_VALUES[72] = "492";
		DEFAULT_LEGAL_VALUES[73] = "494";
		DEFAULT_LEGAL_VALUES[74] = "500";
		DEFAULT_LEGAL_VALUES[75] = "501";
		DEFAULT_LEGAL_VALUES[76] = "503";
		DEFAULT_LEGAL_VALUES[77] = "504";
		DEFAULT_LEGAL_VALUES[78] = "511";
		DEFAULT_LEGAL_VALUES[79] = "517";
		DEFAULT_LEGAL_VALUES[80] = "521";
		DEFAULT_LEGAL_VALUES[81] = "527";
		DEFAULT_LEGAL_VALUES[82] = "536";
		DEFAULT_LEGAL_VALUES[83] = "540";
		DEFAULT_LEGAL_VALUES[84] = "561";
		DEFAULT_LEGAL_VALUES[85] = "567";
		DEFAULT_LEGAL_VALUES[86] = "568";
		DEFAULT_LEGAL_VALUES[87] = "601";
		DEFAULT_LEGAL_VALUES[88] = "602";
		DEFAULT_LEGAL_VALUES[89] = "620";
		DEFAULT_LEGAL_VALUES[90] = "622";
		DEFAULT_LEGAL_VALUES[91] = "625";
		DEFAULT_LEGAL_VALUES[92] = "650";
		DEFAULT_LEGAL_VALUES[93] = "715";
		DEFAULT_LEGAL_VALUES[94] = "805";
		DEFAULT_LEGAL_VALUES[95] = "806";
		DEFAULT_LEGAL_VALUES[96] = new String[] { "810", "816" };
		DEFAULT_LEGAL_VALUES[97] = new String[] { "818", "824" };
		DEFAULT_LEGAL_VALUES[98] = new String[] { "826", "872" };
		DEFAULT_LEGAL_VALUES[99] = new String[] { "875", "889" };
		DEFAULT_LEGAL_VALUES[100] = "891";
		DEFAULT_LEGAL_VALUES[101] = new String[] { "893", "896" };
		DEFAULT_LEGAL_VALUES[102] = "920";
		DEFAULT_LEGAL_VALUES[103] = new String[] { "924", "926" };
		DEFAULT_LEGAL_VALUES[104] = "928";
		DEFAULT_LEGAL_VALUES[105] = "940";
		DEFAULT_LEGAL_VALUES[106] = new String[] { "943", "945" };
		DEFAULT_LEGAL_VALUES[107] = "947";
		DEFAULT_LEGAL_VALUES[108] = "980";
		DEFAULT_LEGAL_VALUES[109] = "990";
		DEFAULT_LEGAL_VALUES[110] = "994";
		DEFAULT_LEGAL_VALUES[111] = new String[] { "996", "998" };
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
		currentValues[0] = "837";
		valueOverrides.put("1-1", currentValues);
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
