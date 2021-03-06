package com.webify.shared.edi.model.hipaa275.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field98 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[261];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "00", "99" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "001", "008" };
		DEFAULT_LEGAL_VALUES[2] = "0A";
		DEFAULT_LEGAL_VALUES[3] = "0B";
		DEFAULT_LEGAL_VALUES[4] = new String[] { "0D", "0J" };
		DEFAULT_LEGAL_VALUES[5] = new String[] { "1A", "8Y" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "9A", "9L" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "9N", "9Z" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "A1", "A9" };
		DEFAULT_LEGAL_VALUES[9] = "AA";
		DEFAULT_LEGAL_VALUES[10] = new String[] { "AA1", "AA9" };
		DEFAULT_LEGAL_VALUES[11] = new String[] { "AAA", "AAQ" };
		DEFAULT_LEGAL_VALUES[12] = new String[] { "AAS", "AAW" };
		DEFAULT_LEGAL_VALUES[13] = "AB";
		DEFAULT_LEGAL_VALUES[14] = new String[] { "AB1", "AB9" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "ABB", "ABX" };
		DEFAULT_LEGAL_VALUES[16] = "AC";
		DEFAULT_LEGAL_VALUES[17] = new String[] { "AC1", "AC3" };
		DEFAULT_LEGAL_VALUES[18] = "ACB";
		DEFAULT_LEGAL_VALUES[19] = "ACC";
		DEFAULT_LEGAL_VALUES[20] = new String[] { "ACE", "ACZ" };
		DEFAULT_LEGAL_VALUES[21] = "AD";
		DEFAULT_LEGAL_VALUES[22] = new String[] { "ADA", "ADF" };
		DEFAULT_LEGAL_VALUES[23] = "ADH";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "ADJ", "ADZ" };
		DEFAULT_LEGAL_VALUES[25] = "AE";
		DEFAULT_LEGAL_VALUES[26] = new String[] { "AEA", "AEG" };
		DEFAULT_LEGAL_VALUES[27] = new String[] { "AEI", "AEL" };
		DEFAULT_LEGAL_VALUES[28] = new String[] { "AF", "AL" };
		DEFAULT_LEGAL_VALUES[29] = "ALA";
		DEFAULT_LEGAL_VALUES[30] = "ALO";
		DEFAULT_LEGAL_VALUES[31] = new String[] { "AM", "AP" };
		DEFAULT_LEGAL_VALUES[32] = "APR";
		DEFAULT_LEGAL_VALUES[33] = new String[] { "AQ", "AT" };
		DEFAULT_LEGAL_VALUES[34] = "ATA";
		DEFAULT_LEGAL_VALUES[35] = "AU";
		DEFAULT_LEGAL_VALUES[36] = "AUO";
		DEFAULT_LEGAL_VALUES[37] = new String[] { "AV", "AZ" };
		DEFAULT_LEGAL_VALUES[38] = new String[] { "B1", "B9" };
		DEFAULT_LEGAL_VALUES[39] = "BA";
		DEFAULT_LEGAL_VALUES[40] = "BAL";
		DEFAULT_LEGAL_VALUES[41] = new String[] { "BB", "BK" };
		DEFAULT_LEGAL_VALUES[42] = "BKR";
		DEFAULT_LEGAL_VALUES[43] = "BL";
		DEFAULT_LEGAL_VALUES[44] = "BLD";
		DEFAULT_LEGAL_VALUES[45] = "BLT";
		DEFAULT_LEGAL_VALUES[46] = new String[] { "BM", "BO" };
		DEFAULT_LEGAL_VALUES[47] = "BOW";
		DEFAULT_LEGAL_VALUES[48] = new String[] { "BP", "BR" };
		DEFAULT_LEGAL_VALUES[49] = "BRN";
		DEFAULT_LEGAL_VALUES[50] = new String[] { "BS", "BU" };
		DEFAULT_LEGAL_VALUES[51] = "BUS";
		DEFAULT_LEGAL_VALUES[52] = new String[] { "BV", "BZ" };
		DEFAULT_LEGAL_VALUES[53] = new String[] { "C0", "C9" };
		DEFAULT_LEGAL_VALUES[54] = new String[] { "CA", "CH" };
		DEFAULT_LEGAL_VALUES[55] = "CHA";
		DEFAULT_LEGAL_VALUES[56] = new String[] { "CI", "CL" };
		DEFAULT_LEGAL_VALUES[57] = "CLT";
		DEFAULT_LEGAL_VALUES[58] = "CM";
		DEFAULT_LEGAL_VALUES[59] = "CMW";
		DEFAULT_LEGAL_VALUES[60] = "CN";
		DEFAULT_LEGAL_VALUES[61] = "CNP";
		DEFAULT_LEGAL_VALUES[62] = "CNR";
		DEFAULT_LEGAL_VALUES[63] = "CNS";
		DEFAULT_LEGAL_VALUES[64] = "CO";
		DEFAULT_LEGAL_VALUES[65] = "COD";
		DEFAULT_LEGAL_VALUES[66] = "COL";
		DEFAULT_LEGAL_VALUES[67] = "COM";
		DEFAULT_LEGAL_VALUES[68] = "COR";
		DEFAULT_LEGAL_VALUES[69] = new String[] { "CP", "CZ" };
		DEFAULT_LEGAL_VALUES[70] = new String[] { "D1", "D9" };
		DEFAULT_LEGAL_VALUES[71] = new String[] { "DA", "DC" };
		DEFAULT_LEGAL_VALUES[72] = "DCC";
		DEFAULT_LEGAL_VALUES[73] = new String[] { "DD", "DI" };
		DEFAULT_LEGAL_VALUES[74] = "DIR";
		DEFAULT_LEGAL_VALUES[75] = new String[] { "DJ", "DZ" };
		DEFAULT_LEGAL_VALUES[76] = new String[] { "E0", "E9" };
		DEFAULT_LEGAL_VALUES[77] = "EA";
		DEFAULT_LEGAL_VALUES[78] = "EAA";
		DEFAULT_LEGAL_VALUES[79] = "EAB";
		DEFAULT_LEGAL_VALUES[80] = new String[] { "EAD", "EAZ" };
		DEFAULT_LEGAL_VALUES[81] = "EB";
		DEFAULT_LEGAL_VALUES[82] = new String[] { "EBA", "EBS" };
		DEFAULT_LEGAL_VALUES[83] = new String[] { "EC", "EN" };
		DEFAULT_LEGAL_VALUES[84] = "ENR";
		DEFAULT_LEGAL_VALUES[85] = new String[] { "EO", "ER" };
		DEFAULT_LEGAL_VALUES[86] = new String[] { "ET", "EX" };
		DEFAULT_LEGAL_VALUES[87] = "EXS";
		DEFAULT_LEGAL_VALUES[88] = "EY";
		DEFAULT_LEGAL_VALUES[89] = "EZ";
		DEFAULT_LEGAL_VALUES[90] = new String[] { "F1", "F9" };
		DEFAULT_LEGAL_VALUES[91] = new String[] { "FA", "FG" };
		DEFAULT_LEGAL_VALUES[92] = "FGT";
		DEFAULT_LEGAL_VALUES[93] = new String[] { "FH", "FJ" };
		DEFAULT_LEGAL_VALUES[94] = new String[] { "FL", "FR" };
		DEFAULT_LEGAL_VALUES[95] = "FRL";
		DEFAULT_LEGAL_VALUES[96] = "FS";
		DEFAULT_LEGAL_VALUES[97] = "FSR";
		DEFAULT_LEGAL_VALUES[98] = new String[] { "FT", "FZ" };
		DEFAULT_LEGAL_VALUES[99] = new String[] { "G0", "G3" };
		DEFAULT_LEGAL_VALUES[100] = new String[] { "G5", "G9" };
		DEFAULT_LEGAL_VALUES[101] = "GA";
		DEFAULT_LEGAL_VALUES[102] = "GB";
		DEFAULT_LEGAL_VALUES[103] = "GBA";
		DEFAULT_LEGAL_VALUES[104] = "GBP";
		DEFAULT_LEGAL_VALUES[105] = new String[] { "GC", "GI" };
		DEFAULT_LEGAL_VALUES[106] = "GIR";
		DEFAULT_LEGAL_VALUES[107] = new String[] { "GJ", "GZ" };
		DEFAULT_LEGAL_VALUES[108] = new String[] { "H1", "H3" };
		DEFAULT_LEGAL_VALUES[109] = new String[] { "H5", "H7" };
		DEFAULT_LEGAL_VALUES[110] = "H9";
		DEFAULT_LEGAL_VALUES[111] = new String[] { "HA", "HM" };
		DEFAULT_LEGAL_VALUES[112] = "HMI";
		DEFAULT_LEGAL_VALUES[113] = "HN";
		DEFAULT_LEGAL_VALUES[114] = "HO";
		DEFAULT_LEGAL_VALUES[115] = "HOM";
		DEFAULT_LEGAL_VALUES[116] = "HON";
		DEFAULT_LEGAL_VALUES[117] = new String[] { "HP", "HZ" };
		DEFAULT_LEGAL_VALUES[118] = "I1";
		DEFAULT_LEGAL_VALUES[119] = "I3";
		DEFAULT_LEGAL_VALUES[120] = "I4";
		DEFAULT_LEGAL_VALUES[121] = "I9";
		DEFAULT_LEGAL_VALUES[122] = "IA";
		DEFAULT_LEGAL_VALUES[123] = "IAA";
		DEFAULT_LEGAL_VALUES[124] = new String[] { "IAC", "IAI" };
		DEFAULT_LEGAL_VALUES[125] = new String[] { "IAK", "IAW" };
		DEFAULT_LEGAL_VALUES[126] = "IAY";
		DEFAULT_LEGAL_VALUES[127] = "IAZ";
		DEFAULT_LEGAL_VALUES[128] = "IB";
		DEFAULT_LEGAL_VALUES[129] = "IC";
		DEFAULT_LEGAL_VALUES[130] = "ICP";
		DEFAULT_LEGAL_VALUES[131] = new String[] { "ID", "IF" };
		DEFAULT_LEGAL_VALUES[132] = new String[] { "II", "IM" };
		DEFAULT_LEGAL_VALUES[133] = "IMM";
		DEFAULT_LEGAL_VALUES[134] = "IN";
		DEFAULT_LEGAL_VALUES[135] = "INT";
		DEFAULT_LEGAL_VALUES[136] = "INV";
		DEFAULT_LEGAL_VALUES[137] = new String[] { "IO", "IV" };
		DEFAULT_LEGAL_VALUES[138] = new String[] { "J1", "J9" };
		DEFAULT_LEGAL_VALUES[139] = new String[] { "JA", "JZ" };
		DEFAULT_LEGAL_VALUES[140] = new String[] { "K1", "K9" };
		DEFAULT_LEGAL_VALUES[141] = new String[] { "KA", "KZ" };
		DEFAULT_LEGAL_VALUES[142] = new String[] { "L1", "L3" };
		DEFAULT_LEGAL_VALUES[143] = "L5";
		DEFAULT_LEGAL_VALUES[144] = "L8";
		DEFAULT_LEGAL_VALUES[145] = "L9";
		DEFAULT_LEGAL_VALUES[146] = new String[] { "LA", "LC" };
		DEFAULT_LEGAL_VALUES[147] = "LCN";
		DEFAULT_LEGAL_VALUES[148] = new String[] { "LD", "LG" };
		DEFAULT_LEGAL_VALUES[149] = "LGS";
		DEFAULT_LEGAL_VALUES[150] = new String[] { "LH", "LW" };
		DEFAULT_LEGAL_VALUES[151] = "LY";
		DEFAULT_LEGAL_VALUES[152] = new String[] { "LYM", "LYP" };
		DEFAULT_LEGAL_VALUES[153] = "LZ";
		DEFAULT_LEGAL_VALUES[154] = new String[] { "M1", "M9" };
		DEFAULT_LEGAL_VALUES[155] = new String[] { "MA", "MS" };
		DEFAULT_LEGAL_VALUES[156] = "MSC";
		DEFAULT_LEGAL_VALUES[157] = "MT";
		DEFAULT_LEGAL_VALUES[158] = "MTR";
		DEFAULT_LEGAL_VALUES[159] = new String[] { "MU", "MZ" };
		DEFAULT_LEGAL_VALUES[160] = new String[] { "N1", "N9" };
		DEFAULT_LEGAL_VALUES[161] = "NB";
		DEFAULT_LEGAL_VALUES[162] = "NC";
		DEFAULT_LEGAL_VALUES[163] = "NCT";
		DEFAULT_LEGAL_VALUES[164] = new String[] { "ND", "NN" };
		DEFAULT_LEGAL_VALUES[165] = "NP";
		DEFAULT_LEGAL_VALUES[166] = "NPC";
		DEFAULT_LEGAL_VALUES[167] = new String[] { "NQ", "NZ" };
		DEFAULT_LEGAL_VALUES[168] = new String[] { "O1", "O8" };
		DEFAULT_LEGAL_VALUES[169] = new String[] { "OA", "OI" };
		DEFAULT_LEGAL_VALUES[170] = new String[] { "OL", "OP" };
		DEFAULT_LEGAL_VALUES[171] = "OR";
		DEFAULT_LEGAL_VALUES[172] = "ORI";
		DEFAULT_LEGAL_VALUES[173] = "OS";
		DEFAULT_LEGAL_VALUES[174] = "OSH";
		DEFAULT_LEGAL_VALUES[175] = "OT";
		DEFAULT_LEGAL_VALUES[176] = "OU";
		DEFAULT_LEGAL_VALUES[177] = "OUC";
		DEFAULT_LEGAL_VALUES[178] = new String[] { "OV", "OZ" };
		DEFAULT_LEGAL_VALUES[179] = new String[] { "P0", "P9" };
		DEFAULT_LEGAL_VALUES[180] = new String[] { "PA", "PI" };
		DEFAULT_LEGAL_VALUES[181] = "PIC";
		DEFAULT_LEGAL_VALUES[182] = new String[] { "PJ", "PL" };
		DEFAULT_LEGAL_VALUES[183] = "PLC";
		DEFAULT_LEGAL_VALUES[184] = "PLR";
		DEFAULT_LEGAL_VALUES[185] = "PM";
		DEFAULT_LEGAL_VALUES[186] = "PMC";
		DEFAULT_LEGAL_VALUES[187] = "PMF";
		DEFAULT_LEGAL_VALUES[188] = new String[] { "PN", "PP" };
		DEFAULT_LEGAL_VALUES[189] = "PPC";
		DEFAULT_LEGAL_VALUES[190] = "PPS";
		DEFAULT_LEGAL_VALUES[191] = "PQ";
		DEFAULT_LEGAL_VALUES[192] = "PR";
		DEFAULT_LEGAL_VALUES[193] = "PRE";
		DEFAULT_LEGAL_VALUES[194] = "PRO";
		DEFAULT_LEGAL_VALUES[195] = "PRP";
		DEFAULT_LEGAL_VALUES[196] = new String[] { "PS", "PU" };
		DEFAULT_LEGAL_VALUES[197] = "PUR";
		DEFAULT_LEGAL_VALUES[198] = new String[] { "PV", "PZ" };
		DEFAULT_LEGAL_VALUES[199] = new String[] { "Q1", "Q9" };
		DEFAULT_LEGAL_VALUES[200] = new String[] { "QA", "QZ" };
		DEFAULT_LEGAL_VALUES[201] = new String[] { "R0", "R9" };
		DEFAULT_LEGAL_VALUES[202] = new String[] { "RA", "RC" };
		DEFAULT_LEGAL_VALUES[203] = "RCR";
		DEFAULT_LEGAL_VALUES[204] = "RD";
		DEFAULT_LEGAL_VALUES[205] = "REC";
		DEFAULT_LEGAL_VALUES[206] = "RF";
		DEFAULT_LEGAL_VALUES[207] = "RG";
		DEFAULT_LEGAL_VALUES[208] = "RGA";
		DEFAULT_LEGAL_VALUES[209] = new String[] { "RH", "RZ" };
		DEFAULT_LEGAL_VALUES[210] = new String[] { "S0", "S9" };
		DEFAULT_LEGAL_VALUES[211] = new String[] { "SA", "SE" };
		DEFAULT_LEGAL_VALUES[212] = "SEP";
		DEFAULT_LEGAL_VALUES[213] = new String[] { "SF", "SI" };
		DEFAULT_LEGAL_VALUES[214] = "SIC";
		DEFAULT_LEGAL_VALUES[215] = new String[] { "SJ", "SU" };
		DEFAULT_LEGAL_VALUES[216] = "SUS";
		DEFAULT_LEGAL_VALUES[217] = new String[] { "SV", "SZ" };
		DEFAULT_LEGAL_VALUES[218] = new String[] { "T1", "T4" };
		DEFAULT_LEGAL_VALUES[219] = "T6";
		DEFAULT_LEGAL_VALUES[220] = "T8";
		DEFAULT_LEGAL_VALUES[221] = "T9";
		DEFAULT_LEGAL_VALUES[222] = new String[] { "TA", "TE" };
		DEFAULT_LEGAL_VALUES[223] = "TEC";
		DEFAULT_LEGAL_VALUES[224] = new String[] { "TF", "TO" };
		DEFAULT_LEGAL_VALUES[225] = "TOW";
		DEFAULT_LEGAL_VALUES[226] = "TP";
		DEFAULT_LEGAL_VALUES[227] = "TPM";
		DEFAULT_LEGAL_VALUES[228] = new String[] { "TQ", "TS" };
		DEFAULT_LEGAL_VALUES[229] = "TSD";
		DEFAULT_LEGAL_VALUES[230] = "TSE";
		DEFAULT_LEGAL_VALUES[231] = "TSR";
		DEFAULT_LEGAL_VALUES[232] = "TT";
		DEFAULT_LEGAL_VALUES[233] = "TTP";
		DEFAULT_LEGAL_VALUES[234] = new String[] { "TU", "TZ" };
		DEFAULT_LEGAL_VALUES[235] = new String[] { "U1", "U9" };
		DEFAULT_LEGAL_VALUES[236] = new String[] { "UA", "UU" };
		DEFAULT_LEGAL_VALUES[237] = new String[] { "UW", "UZ" };
		DEFAULT_LEGAL_VALUES[238] = new String[] { "V1", "V6" };
		DEFAULT_LEGAL_VALUES[239] = "V8";
		DEFAULT_LEGAL_VALUES[240] = "V9";
		DEFAULT_LEGAL_VALUES[241] = new String[] { "VA", "VE" };
		DEFAULT_LEGAL_VALUES[242] = "VER";
		DEFAULT_LEGAL_VALUES[243] = new String[] { "VF", "VI" };
		DEFAULT_LEGAL_VALUES[244] = "VIC";
		DEFAULT_LEGAL_VALUES[245] = new String[] { "VJ", "VY" };
		DEFAULT_LEGAL_VALUES[246] = new String[] { "W1", "W4" };
		DEFAULT_LEGAL_VALUES[247] = "W8";
		DEFAULT_LEGAL_VALUES[248] = "W9";
		DEFAULT_LEGAL_VALUES[249] = new String[] { "WA", "WJ" };
		DEFAULT_LEGAL_VALUES[250] = "WL";
		DEFAULT_LEGAL_VALUES[251] = new String[] { "WN", "WP" };
		DEFAULT_LEGAL_VALUES[252] = new String[] { "WR", "WZ" };
		DEFAULT_LEGAL_VALUES[253] = new String[] { "X1", "X8" };
		DEFAULT_LEGAL_VALUES[254] = "XA";
		DEFAULT_LEGAL_VALUES[255] = new String[] { "XC", "XZ" };
		DEFAULT_LEGAL_VALUES[256] = "Y2";
		DEFAULT_LEGAL_VALUES[257] = new String[] { "YA", "YZ" };
		DEFAULT_LEGAL_VALUES[258] = new String[] { "Z1", "Z9" };
		DEFAULT_LEGAL_VALUES[259] = new String[] { "ZA", "ZH" };
		DEFAULT_LEGAL_VALUES[260] = new String[] { "ZJ", "ZZ" };
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
