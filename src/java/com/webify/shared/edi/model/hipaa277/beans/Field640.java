package com.webify.shared.edi.model.hipaa277.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field640 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[170];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "11" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "13", "30" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "33", "39" };
		DEFAULT_LEGAL_VALUES[3] = "3M";
		DEFAULT_LEGAL_VALUES[4] = "40";
		DEFAULT_LEGAL_VALUES[5] = "41";
		DEFAULT_LEGAL_VALUES[6] = "60";
		DEFAULT_LEGAL_VALUES[7] = new String[] { "62", "69" };
		DEFAULT_LEGAL_VALUES[8] = "6A";
		DEFAULT_LEGAL_VALUES[9] = "6C";
		DEFAULT_LEGAL_VALUES[10] = "6N";
		DEFAULT_LEGAL_VALUES[11] = "6R";
		DEFAULT_LEGAL_VALUES[12] = "6S";
		DEFAULT_LEGAL_VALUES[13] = new String[] { "70", "83" };
		DEFAULT_LEGAL_VALUES[14] = "85";
		DEFAULT_LEGAL_VALUES[15] = "87";
		DEFAULT_LEGAL_VALUES[16] = "88";
		DEFAULT_LEGAL_VALUES[17] = "91";
		DEFAULT_LEGAL_VALUES[18] = "94";
		DEFAULT_LEGAL_VALUES[19] = "95";
		DEFAULT_LEGAL_VALUES[20] = new String[] { "97", "99" };
		DEFAULT_LEGAL_VALUES[21] = "A0";
		DEFAULT_LEGAL_VALUES[22] = "A1";
		DEFAULT_LEGAL_VALUES[23] = new String[] { "A3", "A7" };
		DEFAULT_LEGAL_VALUES[24] = new String[] { "AA", "AG" };
		DEFAULT_LEGAL_VALUES[25] = "AI";
		DEFAULT_LEGAL_VALUES[26] = "AM";
		DEFAULT_LEGAL_VALUES[27] = "AN";
		DEFAULT_LEGAL_VALUES[28] = new String[] { "AP", "AT" };
		DEFAULT_LEGAL_VALUES[29] = "AV";
		DEFAULT_LEGAL_VALUES[30] = "AW";
		DEFAULT_LEGAL_VALUES[31] = new String[] { "AZ", "BB" };
		DEFAULT_LEGAL_VALUES[32] = "BD";
		DEFAULT_LEGAL_VALUES[33] = "BF";
		DEFAULT_LEGAL_VALUES[34] = "BH";
		DEFAULT_LEGAL_VALUES[35] = new String[] { "BJ", "BP" };
		DEFAULT_LEGAL_VALUES[36] = new String[] { "BR", "BW" };
		DEFAULT_LEGAL_VALUES[37] = new String[] { "C0", "C3" };
		DEFAULT_LEGAL_VALUES[38] = new String[] { "CA", "CP" };
		DEFAULT_LEGAL_VALUES[39] = new String[] { "CR", "CZ" };
		DEFAULT_LEGAL_VALUES[40] = "D1";
		DEFAULT_LEGAL_VALUES[41] = "D4";
		DEFAULT_LEGAL_VALUES[42] = new String[] { "DA", "DI" };
		DEFAULT_LEGAL_VALUES[43] = "DK";
		DEFAULT_LEGAL_VALUES[44] = "DL";
		DEFAULT_LEGAL_VALUES[45] = new String[] { "DN", "DU" };
		DEFAULT_LEGAL_VALUES[46] = "EA";
		DEFAULT_LEGAL_VALUES[47] = "EB";
		DEFAULT_LEGAL_VALUES[48] = "EF";
		DEFAULT_LEGAL_VALUES[49] = "EI";
		DEFAULT_LEGAL_VALUES[50] = "EM";
		DEFAULT_LEGAL_VALUES[51] = "EP";
		DEFAULT_LEGAL_VALUES[52] = "ER";
		DEFAULT_LEGAL_VALUES[53] = "EX";
		DEFAULT_LEGAL_VALUES[54] = new String[] { "FA", "FG" };
		DEFAULT_LEGAL_VALUES[55] = "FI";
		DEFAULT_LEGAL_VALUES[56] = new String[] { "FL", "FN" };
		DEFAULT_LEGAL_VALUES[57] = "FP";
		DEFAULT_LEGAL_VALUES[58] = new String[] { "FR", "FT" };
		DEFAULT_LEGAL_VALUES[59] = "GA";
		DEFAULT_LEGAL_VALUES[60] = "GI";
		DEFAULT_LEGAL_VALUES[61] = "GR";
		DEFAULT_LEGAL_VALUES[62] = "HP";
		DEFAULT_LEGAL_VALUES[63] = "I1";
		DEFAULT_LEGAL_VALUES[64] = new String[] { "IA", "IF" };
		DEFAULT_LEGAL_VALUES[65] = "II";
		DEFAULT_LEGAL_VALUES[66] = new String[] { "IM", "IO" };
		DEFAULT_LEGAL_VALUES[67] = "IR";
		DEFAULT_LEGAL_VALUES[68] = "IU";
		DEFAULT_LEGAL_VALUES[69] = "IW";
		DEFAULT_LEGAL_VALUES[70] = "IX";
		DEFAULT_LEGAL_VALUES[71] = "IZ";
		DEFAULT_LEGAL_VALUES[72] = "JM";
		DEFAULT_LEGAL_VALUES[73] = "JO";
		DEFAULT_LEGAL_VALUES[74] = "JR";
		DEFAULT_LEGAL_VALUES[75] = "JS";
		DEFAULT_LEGAL_VALUES[76] = "JU";
		DEFAULT_LEGAL_VALUES[77] = "JX";
		DEFAULT_LEGAL_VALUES[78] = new String[] { "KB", "KN" };
		DEFAULT_LEGAL_VALUES[79] = "KS";
		DEFAULT_LEGAL_VALUES[80] = "KT";
		DEFAULT_LEGAL_VALUES[81] = new String[] { "LC", "LF" };
		DEFAULT_LEGAL_VALUES[82] = new String[] { "LN", "LP" };
		DEFAULT_LEGAL_VALUES[83] = "LR";
		DEFAULT_LEGAL_VALUES[84] = "LV";
		DEFAULT_LEGAL_VALUES[85] = "M1";
		DEFAULT_LEGAL_VALUES[86] = new String[] { "MA", "MF" };
		DEFAULT_LEGAL_VALUES[87] = "MI";
		DEFAULT_LEGAL_VALUES[88] = "ML";
		DEFAULT_LEGAL_VALUES[89] = "MM";
		DEFAULT_LEGAL_VALUES[90] = "MP";
		DEFAULT_LEGAL_VALUES[91] = "MR";
		DEFAULT_LEGAL_VALUES[92] = "MS";
		DEFAULT_LEGAL_VALUES[93] = "MU";
		DEFAULT_LEGAL_VALUES[94] = new String[] { "N1", "N8" };
		DEFAULT_LEGAL_VALUES[95] = new String[] { "NA", "NM" };
		DEFAULT_LEGAL_VALUES[96] = new String[] { "NO", "NR" };
		DEFAULT_LEGAL_VALUES[97] = "NT";
		DEFAULT_LEGAL_VALUES[98] = "NU";
		DEFAULT_LEGAL_VALUES[99] = "OC";
		DEFAULT_LEGAL_VALUES[100] = "OF";
		DEFAULT_LEGAL_VALUES[101] = "OP";
		DEFAULT_LEGAL_VALUES[102] = "OR";
		DEFAULT_LEGAL_VALUES[103] = "P1";
		DEFAULT_LEGAL_VALUES[104] = new String[] { "PA", "PG" };
		DEFAULT_LEGAL_VALUES[105] = "PI";
		DEFAULT_LEGAL_VALUES[106] = "PL";
		DEFAULT_LEGAL_VALUES[107] = "PM";
		DEFAULT_LEGAL_VALUES[108] = "PO";
		DEFAULT_LEGAL_VALUES[109] = "PP";
		DEFAULT_LEGAL_VALUES[110] = new String[] { "PR", "PX" };
		DEFAULT_LEGAL_VALUES[111] = new String[] { "PZ", "QH" };
		DEFAULT_LEGAL_VALUES[112] = new String[] { "QJ", "QL" };
		DEFAULT_LEGAL_VALUES[113] = "QP";
		DEFAULT_LEGAL_VALUES[114] = "QR";
		DEFAULT_LEGAL_VALUES[115] = new String[] { "R1", "R8" };
		DEFAULT_LEGAL_VALUES[116] = new String[] { "RA", "RH" };
		DEFAULT_LEGAL_VALUES[117] = "RK";
		DEFAULT_LEGAL_VALUES[118] = "RM";
		DEFAULT_LEGAL_VALUES[119] = "RP";
		DEFAULT_LEGAL_VALUES[120] = "RQ";
		DEFAULT_LEGAL_VALUES[121] = new String[] { "RS", "RU" };
		DEFAULT_LEGAL_VALUES[122] = "RZ";
		DEFAULT_LEGAL_VALUES[123] = new String[] { "S1", "S4" };
		DEFAULT_LEGAL_VALUES[124] = new String[] { "SA", "SH" };
		DEFAULT_LEGAL_VALUES[125] = "SL";
		DEFAULT_LEGAL_VALUES[126] = "SM";
		DEFAULT_LEGAL_VALUES[127] = new String[] { "SO", "SV" };
		DEFAULT_LEGAL_VALUES[128] = "TD";
		DEFAULT_LEGAL_VALUES[129] = new String[] { "TG", "TK" };
		DEFAULT_LEGAL_VALUES[130] = "TP";
		DEFAULT_LEGAL_VALUES[131] = new String[] { "TR", "TT" };
		DEFAULT_LEGAL_VALUES[132] = "TX";
		DEFAULT_LEGAL_VALUES[133] = "U1";
		DEFAULT_LEGAL_VALUES[134] = "U2";
		DEFAULT_LEGAL_VALUES[135] = "U4";
		DEFAULT_LEGAL_VALUES[136] = "U5";
		DEFAULT_LEGAL_VALUES[137] = "U9";
		DEFAULT_LEGAL_VALUES[138] = "UA";
		DEFAULT_LEGAL_VALUES[139] = "UC";
		DEFAULT_LEGAL_VALUES[140] = "UD";
		DEFAULT_LEGAL_VALUES[141] = "UF";
		DEFAULT_LEGAL_VALUES[142] = "UI";
		DEFAULT_LEGAL_VALUES[143] = "UM";
		DEFAULT_LEGAL_VALUES[144] = "UO";
		DEFAULT_LEGAL_VALUES[145] = "UP";
		DEFAULT_LEGAL_VALUES[146] = "UR";
		DEFAULT_LEGAL_VALUES[147] = "UT";
		DEFAULT_LEGAL_VALUES[148] = "V1";
		DEFAULT_LEGAL_VALUES[149] = "VH";
		DEFAULT_LEGAL_VALUES[150] = "VJ";
		DEFAULT_LEGAL_VALUES[151] = new String[] { "VL", "VR" };
		DEFAULT_LEGAL_VALUES[152] = "W1";
		DEFAULT_LEGAL_VALUES[153] = "W4";
		DEFAULT_LEGAL_VALUES[154] = "W5";
		DEFAULT_LEGAL_VALUES[155] = "WA";
		DEFAULT_LEGAL_VALUES[156] = "WC";
		DEFAULT_LEGAL_VALUES[157] = "WD";
		DEFAULT_LEGAL_VALUES[158] = "WH";
		DEFAULT_LEGAL_VALUES[159] = "WO";
		DEFAULT_LEGAL_VALUES[160] = "WS";
		DEFAULT_LEGAL_VALUES[161] = "WT";
		DEFAULT_LEGAL_VALUES[162] = "X1";
		DEFAULT_LEGAL_VALUES[163] = new String[] { "XA", "XD" };
		DEFAULT_LEGAL_VALUES[164] = new String[] { "XX", "XZ" };
		DEFAULT_LEGAL_VALUES[165] = "YI";
		DEFAULT_LEGAL_VALUES[166] = "YR";
		DEFAULT_LEGAL_VALUES[167] = new String[] { "ZA", "ZU" };
		DEFAULT_LEGAL_VALUES[168] = "ZW";
		DEFAULT_LEGAL_VALUES[169] = "ZZ";
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
		currentValues[0] = "DG";
		valueOverrides.put("2-6", currentValues);
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
