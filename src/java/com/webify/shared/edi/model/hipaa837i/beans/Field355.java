package com.webify.shared.edi.model.hipaa837i.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field355 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[161];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "41" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "43", "48" };
		DEFAULT_LEGAL_VALUES[2] = new String[] { "50", "54" };
		DEFAULT_LEGAL_VALUES[3] = new String[] { "56", "74" };
		DEFAULT_LEGAL_VALUES[4] = new String[] { "76", "87" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "89", "99" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "1A", "1R" };
		DEFAULT_LEGAL_VALUES[7] = "1X";
		DEFAULT_LEGAL_VALUES[8] = new String[] { "2A", "2C" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "2F", "2N" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "2P", "2R" };
		DEFAULT_LEGAL_VALUES[11] = new String[] { "2U", "2Z" };
		DEFAULT_LEGAL_VALUES[12] = "3B";
		DEFAULT_LEGAL_VALUES[13] = "3C";
		DEFAULT_LEGAL_VALUES[14] = new String[] { "3E", "3I" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "4A", "4X" };
		DEFAULT_LEGAL_VALUES[16] = new String[] { "5A", "5C" };
		DEFAULT_LEGAL_VALUES[17] = new String[] { "5E", "5K" };
		DEFAULT_LEGAL_VALUES[18] = "5P";
		DEFAULT_LEGAL_VALUES[19] = "5Q";
		DEFAULT_LEGAL_VALUES[20] = "8C";
		DEFAULT_LEGAL_VALUES[21] = "8D";
		DEFAULT_LEGAL_VALUES[22] = "8P";
		DEFAULT_LEGAL_VALUES[23] = "8R";
		DEFAULT_LEGAL_VALUES[24] = "8S";
		DEFAULT_LEGAL_VALUES[25] = "8U";
		DEFAULT_LEGAL_VALUES[26] = "A8";
		DEFAULT_LEGAL_VALUES[27] = new String[] { "AA", "AZ" };
		DEFAULT_LEGAL_VALUES[28] = new String[] { "B0", "B9" };
		DEFAULT_LEGAL_VALUES[29] = new String[] { "BA", "BZ" };
		DEFAULT_LEGAL_VALUES[30] = new String[] { "C0", "C9" };
		DEFAULT_LEGAL_VALUES[31] = new String[] { "CA", "CZ" };
		DEFAULT_LEGAL_VALUES[32] = "D2";
		DEFAULT_LEGAL_VALUES[33] = "D3";
		DEFAULT_LEGAL_VALUES[34] = "D5";
		DEFAULT_LEGAL_VALUES[35] = "D8";
		DEFAULT_LEGAL_VALUES[36] = "D9";
		DEFAULT_LEGAL_VALUES[37] = new String[] { "DA", "DU" };
		DEFAULT_LEGAL_VALUES[38] = new String[] { "DW", "DZ" };
		DEFAULT_LEGAL_VALUES[39] = "E1";
		DEFAULT_LEGAL_VALUES[40] = new String[] { "E3", "E5" };
		DEFAULT_LEGAL_VALUES[41] = new String[] { "E7", "E9" };
		DEFAULT_LEGAL_VALUES[42] = new String[] { "EA", "EH" };
		DEFAULT_LEGAL_VALUES[43] = "EJ";
		DEFAULT_LEGAL_VALUES[44] = "EM";
		DEFAULT_LEGAL_VALUES[45] = "EP";
		DEFAULT_LEGAL_VALUES[46] = "EQ";
		DEFAULT_LEGAL_VALUES[47] = "EV";
		DEFAULT_LEGAL_VALUES[48] = new String[] { "EX", "EZ" };
		DEFAULT_LEGAL_VALUES[49] = new String[] { "F1", "F6" };
		DEFAULT_LEGAL_VALUES[50] = "F9";
		DEFAULT_LEGAL_VALUES[51] = new String[] { "FA", "FH" };
		DEFAULT_LEGAL_VALUES[52] = new String[] { "FJ", "FM" };
		DEFAULT_LEGAL_VALUES[53] = "FO";
		DEFAULT_LEGAL_VALUES[54] = "FP";
		DEFAULT_LEGAL_VALUES[55] = new String[] { "FR", "FT" };
		DEFAULT_LEGAL_VALUES[56] = "FZ";
		DEFAULT_LEGAL_VALUES[57] = new String[] { "G2", "G5" };
		DEFAULT_LEGAL_VALUES[58] = "G7";
		DEFAULT_LEGAL_VALUES[59] = new String[] { "GA", "GZ" };
		DEFAULT_LEGAL_VALUES[60] = "H1";
		DEFAULT_LEGAL_VALUES[61] = "H2";
		DEFAULT_LEGAL_VALUES[62] = "H4";
		DEFAULT_LEGAL_VALUES[63] = new String[] { "HA", "HW" };
		DEFAULT_LEGAL_VALUES[64] = new String[] { "HY", "IC" };
		DEFAULT_LEGAL_VALUES[65] = "IE";
		DEFAULT_LEGAL_VALUES[66] = "IF";
		DEFAULT_LEGAL_VALUES[67] = "IH";
		DEFAULT_LEGAL_VALUES[68] = "II";
		DEFAULT_LEGAL_VALUES[69] = new String[] { "IK", "IN" };
		DEFAULT_LEGAL_VALUES[70] = "IP";
		DEFAULT_LEGAL_VALUES[71] = new String[] { "IT", "IW" };
		DEFAULT_LEGAL_VALUES[72] = "J2";
		DEFAULT_LEGAL_VALUES[73] = "JA";
		DEFAULT_LEGAL_VALUES[74] = "JB";
		DEFAULT_LEGAL_VALUES[75] = "JE";
		DEFAULT_LEGAL_VALUES[76] = "JG";
		DEFAULT_LEGAL_VALUES[77] = "JK";
		DEFAULT_LEGAL_VALUES[78] = "JM";
		DEFAULT_LEGAL_VALUES[79] = "JO";
		DEFAULT_LEGAL_VALUES[80] = "JR";
		DEFAULT_LEGAL_VALUES[81] = "JU";
		DEFAULT_LEGAL_VALUES[82] = new String[] { "K1", "K7" };
		DEFAULT_LEGAL_VALUES[83] = "K9";
		DEFAULT_LEGAL_VALUES[84] = new String[] { "KA", "KM" };
		DEFAULT_LEGAL_VALUES[85] = new String[] { "KO", "KX" };
		DEFAULT_LEGAL_VALUES[86] = "L2";
		DEFAULT_LEGAL_VALUES[87] = new String[] { "LA", "LC" };
		DEFAULT_LEGAL_VALUES[88] = new String[] { "LE", "LT" };
		DEFAULT_LEGAL_VALUES[89] = "LX";
		DEFAULT_LEGAL_VALUES[90] = "LY";
		DEFAULT_LEGAL_VALUES[91] = new String[] { "M0", "M9" };
		DEFAULT_LEGAL_VALUES[92] = new String[] { "MA", "MZ" };
		DEFAULT_LEGAL_VALUES[93] = new String[] { "N1", "N4" };
		DEFAULT_LEGAL_VALUES[94] = "N6";
		DEFAULT_LEGAL_VALUES[95] = "N7";
		DEFAULT_LEGAL_VALUES[96] = "N9";
		DEFAULT_LEGAL_VALUES[97] = new String[] { "NA", "NJ" };
		DEFAULT_LEGAL_VALUES[98] = new String[] { "NL", "NN" };
		DEFAULT_LEGAL_VALUES[99] = new String[] { "NQ", "NY" };
		DEFAULT_LEGAL_VALUES[100] = "OA";
		DEFAULT_LEGAL_VALUES[101] = "OC";
		DEFAULT_LEGAL_VALUES[102] = "ON";
		DEFAULT_LEGAL_VALUES[103] = "OP";
		DEFAULT_LEGAL_VALUES[104] = "OT";
		DEFAULT_LEGAL_VALUES[105] = "OZ";
		DEFAULT_LEGAL_VALUES[106] = new String[] { "P0", "P9" };
		DEFAULT_LEGAL_VALUES[107] = new String[] { "PA", "PZ" };
		DEFAULT_LEGAL_VALUES[108] = new String[] { "Q1", "Q7" };
		DEFAULT_LEGAL_VALUES[109] = new String[] { "QA", "QE" };
		DEFAULT_LEGAL_VALUES[110] = "QH";
		DEFAULT_LEGAL_VALUES[111] = "QK";
		DEFAULT_LEGAL_VALUES[112] = new String[] { "QR", "QU" };
		DEFAULT_LEGAL_VALUES[113] = new String[] { "R1", "R9" };
		DEFAULT_LEGAL_VALUES[114] = new String[] { "RA", "RE" };
		DEFAULT_LEGAL_VALUES[115] = "RG";
		DEFAULT_LEGAL_VALUES[116] = "RH";
		DEFAULT_LEGAL_VALUES[117] = new String[] { "RK", "RP" };
		DEFAULT_LEGAL_VALUES[118] = new String[] { "RS", "RU" };
		DEFAULT_LEGAL_VALUES[119] = new String[] { "S1", "S9" };
		DEFAULT_LEGAL_VALUES[120] = new String[] { "SA", "ST" };
		DEFAULT_LEGAL_VALUES[121] = new String[] { "SV", "SZ" };
		DEFAULT_LEGAL_VALUES[122] = new String[] { "T0", "T9" };
		DEFAULT_LEGAL_VALUES[123] = new String[] { "TA", "TZ" };
		DEFAULT_LEGAL_VALUES[124] = new String[] { "U1", "U3" };
		DEFAULT_LEGAL_VALUES[125] = "U5";
		DEFAULT_LEGAL_VALUES[126] = new String[] { "UA", "UF" };
		DEFAULT_LEGAL_VALUES[127] = "UH";
		DEFAULT_LEGAL_VALUES[128] = new String[] { "UL", "UN" };
		DEFAULT_LEGAL_VALUES[129] = new String[] { "UP", "UZ" };
		DEFAULT_LEGAL_VALUES[130] = "V1";
		DEFAULT_LEGAL_VALUES[131] = "V2";
		DEFAULT_LEGAL_VALUES[132] = "VA";
		DEFAULT_LEGAL_VALUES[133] = "VC";
		DEFAULT_LEGAL_VALUES[134] = "VI";
		DEFAULT_LEGAL_VALUES[135] = "VP";
		DEFAULT_LEGAL_VALUES[136] = "VR";
		DEFAULT_LEGAL_VALUES[137] = "VS";
		DEFAULT_LEGAL_VALUES[138] = "W2";
		DEFAULT_LEGAL_VALUES[139] = "WA";
		DEFAULT_LEGAL_VALUES[140] = "WB";
		DEFAULT_LEGAL_VALUES[141] = "WD";
		DEFAULT_LEGAL_VALUES[142] = "WE";
		DEFAULT_LEGAL_VALUES[143] = new String[] { "WG", "WI" };
		DEFAULT_LEGAL_VALUES[144] = "WK";
		DEFAULT_LEGAL_VALUES[145] = "WM";
		DEFAULT_LEGAL_VALUES[146] = "WP";
		DEFAULT_LEGAL_VALUES[147] = "WR";
		DEFAULT_LEGAL_VALUES[148] = "WW";
		DEFAULT_LEGAL_VALUES[149] = new String[] { "X1", "X9" };
		DEFAULT_LEGAL_VALUES[150] = "XP";
		DEFAULT_LEGAL_VALUES[151] = new String[] { "Y1", "Y4" };
		DEFAULT_LEGAL_VALUES[152] = "YD";
		DEFAULT_LEGAL_VALUES[153] = "YL";
		DEFAULT_LEGAL_VALUES[154] = "YR";
		DEFAULT_LEGAL_VALUES[155] = "YT";
		DEFAULT_LEGAL_VALUES[156] = new String[] { "Z1", "Z6" };
		DEFAULT_LEGAL_VALUES[157] = "Z8";
		DEFAULT_LEGAL_VALUES[158] = new String[] { "ZA", "ZC" };
		DEFAULT_LEGAL_VALUES[159] = "ZP";
		DEFAULT_LEGAL_VALUES[160] = "ZZ";
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
		currentValues[0] = "DA";
		currentValues[1] = "UN";
		valueOverrides.put("208-11", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "GR";
		valueOverrides.put("161-7", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DA";
		valueOverrides.put("207-3-1", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "DA";
		currentValues[1] = "MO";
		currentValues[2] = "Q1";
		currentValues[3] = "WK";
		valueOverrides.put("80-3", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "DA";
		currentValues[1] = "UN";
		valueOverrides.put("295-11", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "DA";
		currentValues[1] = "F2";
		currentValues[2] = "UN";
		valueOverrides.put("268-4", currentValues);

		currentValues = new Object[134];
		currentValues[0] = new String[] { "AA", "AZ" };
		currentValues[1] = new String[] { "B0", "B9" };
		currentValues[2] = new String[] { "BA", "BZ" };
		currentValues[3] = new String[] { "C0", "C9" };
		currentValues[4] = new String[] { "CA", "CZ" };
		currentValues[5] = "D2";
		currentValues[6] = "D3";
		currentValues[7] = "D5";
		currentValues[8] = "D8";
		currentValues[9] = "D9";
		currentValues[10] = new String[] { "DA", "DU" };
		currentValues[11] = new String[] { "DW", "DZ" };
		currentValues[12] = "E1";
		currentValues[13] = new String[] { "E3", "E5" };
		currentValues[14] = new String[] { "E7", "E9" };
		currentValues[15] = new String[] { "EA", "EH" };
		currentValues[16] = "EJ";
		currentValues[17] = "EM";
		currentValues[18] = "EP";
		currentValues[19] = "EQ";
		currentValues[20] = "EV";
		currentValues[21] = new String[] { "EX", "EZ" };
		currentValues[22] = new String[] { "F1", "F6" };
		currentValues[23] = "F9";
		currentValues[24] = new String[] { "FA", "FH" };
		currentValues[25] = new String[] { "FJ", "FM" };
		currentValues[26] = "FO";
		currentValues[27] = "FP";
		currentValues[28] = new String[] { "FR", "FT" };
		currentValues[29] = "FZ";
		currentValues[30] = new String[] { "G2", "G5" };
		currentValues[31] = "G7";
		currentValues[32] = new String[] { "GA", "GZ" };
		currentValues[33] = "H1";
		currentValues[34] = "H2";
		currentValues[35] = "H4";
		currentValues[36] = new String[] { "HA", "HW" };
		currentValues[37] = new String[] { "HY", "IC" };
		currentValues[38] = "IE";
		currentValues[39] = "IF";
		currentValues[40] = "IH";
		currentValues[41] = "II";
		currentValues[42] = new String[] { "IK", "IN" };
		currentValues[43] = "IP";
		currentValues[44] = new String[] { "IT", "IW" };
		currentValues[45] = "J2";
		currentValues[46] = "JA";
		currentValues[47] = "JB";
		currentValues[48] = "JE";
		currentValues[49] = "JG";
		currentValues[50] = "JK";
		currentValues[51] = "JM";
		currentValues[52] = "JO";
		currentValues[53] = "JR";
		currentValues[54] = "JU";
		currentValues[55] = new String[] { "K1", "K7" };
		currentValues[56] = "K9";
		currentValues[57] = new String[] { "KA", "KM" };
		currentValues[58] = new String[] { "KO", "KX" };
		currentValues[59] = "L2";
		currentValues[60] = new String[] { "LA", "LC" };
		currentValues[61] = new String[] { "LE", "LT" };
		currentValues[62] = "LX";
		currentValues[63] = "LY";
		currentValues[64] = new String[] { "M0", "M9" };
		currentValues[65] = new String[] { "MA", "MZ" };
		currentValues[66] = new String[] { "N1", "N4" };
		currentValues[67] = "N6";
		currentValues[68] = "N7";
		currentValues[69] = "N9";
		currentValues[70] = new String[] { "NA", "NJ" };
		currentValues[71] = new String[] { "NL", "NN" };
		currentValues[72] = new String[] { "NQ", "NY" };
		currentValues[73] = "OA";
		currentValues[74] = "OC";
		currentValues[75] = "ON";
		currentValues[76] = "OP";
		currentValues[77] = "OT";
		currentValues[78] = "OZ";
		currentValues[79] = new String[] { "P0", "P9" };
		currentValues[80] = new String[] { "PA", "PZ" };
		currentValues[81] = new String[] { "Q1", "Q7" };
		currentValues[82] = new String[] { "QA", "QE" };
		currentValues[83] = "QH";
		currentValues[84] = "QK";
		currentValues[85] = new String[] { "QR", "QU" };
		currentValues[86] = new String[] { "R1", "R9" };
		currentValues[87] = new String[] { "RA", "RE" };
		currentValues[88] = "RG";
		currentValues[89] = "RH";
		currentValues[90] = new String[] { "RK", "RP" };
		currentValues[91] = new String[] { "RS", "RU" };
		currentValues[92] = new String[] { "S1", "S9" };
		currentValues[93] = new String[] { "SA", "ST" };
		currentValues[94] = new String[] { "SV", "SZ" };
		currentValues[95] = new String[] { "T0", "T9" };
		currentValues[96] = new String[] { "TA", "TZ" };
		currentValues[97] = new String[] { "U1", "U3" };
		currentValues[98] = "U5";
		currentValues[99] = new String[] { "UA", "UF" };
		currentValues[100] = "UH";
		currentValues[101] = new String[] { "UL", "UN" };
		currentValues[102] = new String[] { "UP", "UZ" };
		currentValues[103] = "V1";
		currentValues[104] = "V2";
		currentValues[105] = "VA";
		currentValues[106] = "VC";
		currentValues[107] = "VI";
		currentValues[108] = "VP";
		currentValues[109] = "VR";
		currentValues[110] = "VS";
		currentValues[111] = "W2";
		currentValues[112] = "WA";
		currentValues[113] = "WB";
		currentValues[114] = "WD";
		currentValues[115] = "WE";
		currentValues[116] = new String[] { "WG", "WI" };
		currentValues[117] = "WK";
		currentValues[118] = "WM";
		currentValues[119] = "WP";
		currentValues[120] = "WR";
		currentValues[121] = "WW";
		currentValues[122] = new String[] { "X1", "X9" };
		currentValues[123] = "XP";
		currentValues[124] = new String[] { "Y1", "Y4" };
		currentValues[125] = "YD";
		currentValues[126] = "YL";
		currentValues[127] = "YR";
		currentValues[128] = "YT";
		currentValues[129] = new String[] { "Z1", "Z6" };
		currentValues[130] = "Z8";
		currentValues[131] = new String[] { "ZA", "ZC" };
		currentValues[132] = "ZP";
		currentValues[133] = "ZZ";
		valueOverrides.put("77-3-4", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "F2";
		currentValues[1] = "GR";
		currentValues[2] = "ML";
		currentValues[3] = "UN";
		valueOverrides.put("297-5-1", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "F2";
		currentValues[1] = "GR";
		currentValues[2] = "ML";
		currentValues[3] = "UN";
		valueOverrides.put("293-5-1", currentValues);

		currentValues = new Object[134];
		currentValues[0] = new String[] { "AA", "AZ" };
		currentValues[1] = new String[] { "B0", "B9" };
		currentValues[2] = new String[] { "BA", "BZ" };
		currentValues[3] = new String[] { "C0", "C9" };
		currentValues[4] = new String[] { "CA", "CZ" };
		currentValues[5] = "D2";
		currentValues[6] = "D3";
		currentValues[7] = "D5";
		currentValues[8] = "D8";
		currentValues[9] = "D9";
		currentValues[10] = new String[] { "DA", "DU" };
		currentValues[11] = new String[] { "DW", "DZ" };
		currentValues[12] = "E1";
		currentValues[13] = new String[] { "E3", "E5" };
		currentValues[14] = new String[] { "E7", "E9" };
		currentValues[15] = new String[] { "EA", "EH" };
		currentValues[16] = "EJ";
		currentValues[17] = "EM";
		currentValues[18] = "EP";
		currentValues[19] = "EQ";
		currentValues[20] = "EV";
		currentValues[21] = new String[] { "EX", "EZ" };
		currentValues[22] = new String[] { "F1", "F6" };
		currentValues[23] = "F9";
		currentValues[24] = new String[] { "FA", "FH" };
		currentValues[25] = new String[] { "FJ", "FM" };
		currentValues[26] = "FO";
		currentValues[27] = "FP";
		currentValues[28] = new String[] { "FR", "FT" };
		currentValues[29] = "FZ";
		currentValues[30] = new String[] { "G2", "G5" };
		currentValues[31] = "G7";
		currentValues[32] = new String[] { "GA", "GZ" };
		currentValues[33] = "H1";
		currentValues[34] = "H2";
		currentValues[35] = "H4";
		currentValues[36] = new String[] { "HA", "HW" };
		currentValues[37] = new String[] { "HY", "IC" };
		currentValues[38] = "IE";
		currentValues[39] = "IF";
		currentValues[40] = "IH";
		currentValues[41] = "II";
		currentValues[42] = new String[] { "IK", "IN" };
		currentValues[43] = "IP";
		currentValues[44] = new String[] { "IT", "IW" };
		currentValues[45] = "J2";
		currentValues[46] = "JA";
		currentValues[47] = "JB";
		currentValues[48] = "JE";
		currentValues[49] = "JG";
		currentValues[50] = "JK";
		currentValues[51] = "JM";
		currentValues[52] = "JO";
		currentValues[53] = "JR";
		currentValues[54] = "JU";
		currentValues[55] = new String[] { "K1", "K7" };
		currentValues[56] = "K9";
		currentValues[57] = new String[] { "KA", "KM" };
		currentValues[58] = new String[] { "KO", "KX" };
		currentValues[59] = "L2";
		currentValues[60] = new String[] { "LA", "LC" };
		currentValues[61] = new String[] { "LE", "LT" };
		currentValues[62] = "LX";
		currentValues[63] = "LY";
		currentValues[64] = new String[] { "M0", "M9" };
		currentValues[65] = new String[] { "MA", "MZ" };
		currentValues[66] = new String[] { "N1", "N4" };
		currentValues[67] = "N6";
		currentValues[68] = "N7";
		currentValues[69] = "N9";
		currentValues[70] = new String[] { "NA", "NJ" };
		currentValues[71] = new String[] { "NL", "NN" };
		currentValues[72] = new String[] { "NQ", "NY" };
		currentValues[73] = "OA";
		currentValues[74] = "OC";
		currentValues[75] = "ON";
		currentValues[76] = "OP";
		currentValues[77] = "OT";
		currentValues[78] = "OZ";
		currentValues[79] = new String[] { "P0", "P9" };
		currentValues[80] = new String[] { "PA", "PZ" };
		currentValues[81] = new String[] { "Q1", "Q7" };
		currentValues[82] = new String[] { "QA", "QE" };
		currentValues[83] = "QH";
		currentValues[84] = "QK";
		currentValues[85] = new String[] { "QR", "QU" };
		currentValues[86] = new String[] { "R1", "R9" };
		currentValues[87] = new String[] { "RA", "RE" };
		currentValues[88] = "RG";
		currentValues[89] = "RH";
		currentValues[90] = new String[] { "RK", "RP" };
		currentValues[91] = new String[] { "RS", "RU" };
		currentValues[92] = new String[] { "S1", "S9" };
		currentValues[93] = new String[] { "SA", "ST" };
		currentValues[94] = new String[] { "SV", "SZ" };
		currentValues[95] = new String[] { "T0", "T9" };
		currentValues[96] = new String[] { "TA", "TZ" };
		currentValues[97] = new String[] { "U1", "U3" };
		currentValues[98] = "U5";
		currentValues[99] = new String[] { "UA", "UF" };
		currentValues[100] = "UH";
		currentValues[101] = new String[] { "UL", "UN" };
		currentValues[102] = new String[] { "UP", "UZ" };
		currentValues[103] = "V1";
		currentValues[104] = "V2";
		currentValues[105] = "VA";
		currentValues[106] = "VC";
		currentValues[107] = "VI";
		currentValues[108] = "VP";
		currentValues[109] = "VR";
		currentValues[110] = "VS";
		currentValues[111] = "W2";
		currentValues[112] = "WA";
		currentValues[113] = "WB";
		currentValues[114] = "WD";
		currentValues[115] = "WE";
		currentValues[116] = new String[] { "WG", "WI" };
		currentValues[117] = "WK";
		currentValues[118] = "WM";
		currentValues[119] = "WP";
		currentValues[120] = "WR";
		currentValues[121] = "WW";
		currentValues[122] = new String[] { "X1", "X9" };
		currentValues[123] = "XP";
		currentValues[124] = new String[] { "Y1", "Y4" };
		currentValues[125] = "YD";
		currentValues[126] = "YL";
		currentValues[127] = "YR";
		currentValues[128] = "YT";
		currentValues[129] = new String[] { "Z1", "Z6" };
		currentValues[130] = "Z8";
		currentValues[131] = new String[] { "ZA", "ZC" };
		currentValues[132] = "ZP";
		currentValues[133] = "ZZ";
		valueOverrides.put("207-3-4", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "DA";
		currentValues[1] = "UN";
		valueOverrides.put("291-11", currentValues);

		currentValues = new Object[3];
		currentValues[0] = "DA";
		currentValues[1] = "F2";
		currentValues[2] = "UN";
		valueOverrides.put("138-4", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "DA";
		currentValues[1] = "UN";
		valueOverrides.put("78-11", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "DA";
		currentValues[1] = "MO";
		currentValues[2] = "Q1";
		currentValues[3] = "WK";
		valueOverrides.put("210-3", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "DA";
		valueOverrides.put("77-3-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "GR";
		valueOverrides.put("22-7", currentValues);
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
