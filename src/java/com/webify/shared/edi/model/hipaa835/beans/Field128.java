package com.webify.shared.edi.model.hipaa835.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field128 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[365];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "61" };
		DEFAULT_LEGAL_VALUES[1] = new String[] { "63", "99" };
		DEFAULT_LEGAL_VALUES[2] = "0A";
		DEFAULT_LEGAL_VALUES[3] = "0B";
		DEFAULT_LEGAL_VALUES[4] = new String[] { "0D", "0N" };
		DEFAULT_LEGAL_VALUES[5] = "0P";
		DEFAULT_LEGAL_VALUES[6] = new String[] { "1A", "7U" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "7W", "8S" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "8U", "9N" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "9P", "9Z" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "A0", "A9" };
		DEFAULT_LEGAL_VALUES[11] = "AA";
		DEFAULT_LEGAL_VALUES[12] = new String[] { "AAA", "AAZ" };
		DEFAULT_LEGAL_VALUES[13] = "AB";
		DEFAULT_LEGAL_VALUES[14] = new String[] { "ABA", "ABH" };
		DEFAULT_LEGAL_VALUES[15] = new String[] { "ABJ", "ABV" };
		DEFAULT_LEGAL_VALUES[16] = "ABY";
		DEFAULT_LEGAL_VALUES[17] = "AC";
		DEFAULT_LEGAL_VALUES[18] = new String[] { "ACA", "ACK" };
		DEFAULT_LEGAL_VALUES[19] = new String[] { "ACR", "ACT" };
		DEFAULT_LEGAL_VALUES[20] = "AD";
		DEFAULT_LEGAL_VALUES[21] = new String[] { "ADA", "ADI" };
		DEFAULT_LEGAL_VALUES[22] = "ADM";
		DEFAULT_LEGAL_VALUES[23] = "AE";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "AEA", "AEM" };
		DEFAULT_LEGAL_VALUES[25] = new String[] { "AF", "AH" };
		DEFAULT_LEGAL_VALUES[26] = "AHC";
		DEFAULT_LEGAL_VALUES[27] = new String[] { "AI", "AL" };
		DEFAULT_LEGAL_VALUES[28] = "ALC";
		DEFAULT_LEGAL_VALUES[29] = new String[] { "ALG", "ALJ" };
		DEFAULT_LEGAL_VALUES[30] = "ALT";
		DEFAULT_LEGAL_VALUES[31] = new String[] { "AM", "AP" };
		DEFAULT_LEGAL_VALUES[32] = "API";
		DEFAULT_LEGAL_VALUES[33] = new String[] { "AQ", "AS" };
		DEFAULT_LEGAL_VALUES[34] = "ASL";
		DEFAULT_LEGAL_VALUES[35] = "ASP";
		DEFAULT_LEGAL_VALUES[36] = "AST";
		DEFAULT_LEGAL_VALUES[37] = "AT";
		DEFAULT_LEGAL_VALUES[38] = "ATC";
		DEFAULT_LEGAL_VALUES[39] = new String[] { "AU", "AZ" };
		DEFAULT_LEGAL_VALUES[40] = new String[] { "B1", "B9" };
		DEFAULT_LEGAL_VALUES[41] = "BA";
		DEFAULT_LEGAL_VALUES[42] = new String[] { "BAA", "BAI" };
		DEFAULT_LEGAL_VALUES[43] = "BB";
		DEFAULT_LEGAL_VALUES[44] = "BC";
		DEFAULT_LEGAL_VALUES[45] = "BCI";
		DEFAULT_LEGAL_VALUES[46] = new String[] { "BD", "BK" };
		DEFAULT_LEGAL_VALUES[47] = "BKT";
		DEFAULT_LEGAL_VALUES[48] = "BL";
		DEFAULT_LEGAL_VALUES[49] = "BLT";
		DEFAULT_LEGAL_VALUES[50] = "BM";
		DEFAULT_LEGAL_VALUES[51] = "BMM";
		DEFAULT_LEGAL_VALUES[52] = "BN";
		DEFAULT_LEGAL_VALUES[53] = "BO";
		DEFAULT_LEGAL_VALUES[54] = "BOI";
		DEFAULT_LEGAL_VALUES[55] = new String[] { "BP", "BZ" };
		DEFAULT_LEGAL_VALUES[56] = new String[] { "C0", "C9" };
		DEFAULT_LEGAL_VALUES[57] = "CA";
		DEFAULT_LEGAL_VALUES[58] = "CB";
		DEFAULT_LEGAL_VALUES[59] = "CBG";
		DEFAULT_LEGAL_VALUES[60] = "CC";
		DEFAULT_LEGAL_VALUES[61] = "CD";
		DEFAULT_LEGAL_VALUES[62] = "CDN";
		DEFAULT_LEGAL_VALUES[63] = new String[] { "CE", "CI" };
		DEFAULT_LEGAL_VALUES[64] = "CIR";
		DEFAULT_LEGAL_VALUES[65] = "CIT";
		DEFAULT_LEGAL_VALUES[66] = new String[] { "CJ", "CM" };
		DEFAULT_LEGAL_VALUES[67] = "CMN";
		DEFAULT_LEGAL_VALUES[68] = "CMP";
		DEFAULT_LEGAL_VALUES[69] = "CMT";
		DEFAULT_LEGAL_VALUES[70] = "CN";
		DEFAULT_LEGAL_VALUES[71] = "CNO";
		DEFAULT_LEGAL_VALUES[72] = "CO";
		DEFAULT_LEGAL_VALUES[73] = "COL";
		DEFAULT_LEGAL_VALUES[74] = "COT";
		DEFAULT_LEGAL_VALUES[75] = "CP";
		DEFAULT_LEGAL_VALUES[76] = "CPA";
		DEFAULT_LEGAL_VALUES[77] = "CPT";
		DEFAULT_LEGAL_VALUES[78] = "CQ";
		DEFAULT_LEGAL_VALUES[79] = "CR";
		DEFAULT_LEGAL_VALUES[80] = "CRN";
		DEFAULT_LEGAL_VALUES[81] = "CRS";
		DEFAULT_LEGAL_VALUES[82] = "CS";
		DEFAULT_LEGAL_VALUES[83] = "CSC";
		DEFAULT_LEGAL_VALUES[84] = "CSG";
		DEFAULT_LEGAL_VALUES[85] = "CST";
		DEFAULT_LEGAL_VALUES[86] = "CT";
		DEFAULT_LEGAL_VALUES[87] = "CTS";
		DEFAULT_LEGAL_VALUES[88] = new String[] { "CU", "CY" };
		DEFAULT_LEGAL_VALUES[89] = "CYC";
		DEFAULT_LEGAL_VALUES[90] = "CZ";
		DEFAULT_LEGAL_VALUES[91] = new String[] { "D0", "D9" };
		DEFAULT_LEGAL_VALUES[92] = new String[] { "DA", "DH" };
		DEFAULT_LEGAL_VALUES[93] = "DHH";
		DEFAULT_LEGAL_VALUES[94] = "DI";
		DEFAULT_LEGAL_VALUES[95] = "DIS";
		DEFAULT_LEGAL_VALUES[96] = new String[] { "DJ", "DN" };
		DEFAULT_LEGAL_VALUES[97] = "DNR";
		DEFAULT_LEGAL_VALUES[98] = "DNS";
		DEFAULT_LEGAL_VALUES[99] = "DO";
		DEFAULT_LEGAL_VALUES[100] = "DOA";
		DEFAULT_LEGAL_VALUES[101] = "DOC";
		DEFAULT_LEGAL_VALUES[102] = "DOE";
		DEFAULT_LEGAL_VALUES[103] = "DOI";
		DEFAULT_LEGAL_VALUES[104] = "DOJ";
		DEFAULT_LEGAL_VALUES[105] = "DOL";
		DEFAULT_LEGAL_VALUES[106] = "DON";
		DEFAULT_LEGAL_VALUES[107] = "DOS";
		DEFAULT_LEGAL_VALUES[108] = "DOT";
		DEFAULT_LEGAL_VALUES[109] = new String[] { "DP", "DR" };
		DEFAULT_LEGAL_VALUES[110] = "DRN";
		DEFAULT_LEGAL_VALUES[111] = "DS";
		DEFAULT_LEGAL_VALUES[112] = "DSC";
		DEFAULT_LEGAL_VALUES[113] = "DSI";
		DEFAULT_LEGAL_VALUES[114] = "DST";
		DEFAULT_LEGAL_VALUES[115] = "DT";
		DEFAULT_LEGAL_VALUES[116] = "DTS";
		DEFAULT_LEGAL_VALUES[117] = "DU";
		DEFAULT_LEGAL_VALUES[118] = "DUN";
		DEFAULT_LEGAL_VALUES[119] = new String[] { "DV", "DZ" };
		DEFAULT_LEGAL_VALUES[120] = new String[] { "E1", "E9" };
		DEFAULT_LEGAL_VALUES[121] = new String[] { "EA", "ED" };
		DEFAULT_LEGAL_VALUES[122] = "EDA";
		DEFAULT_LEGAL_VALUES[123] = new String[] { "EE", "EM" };
		DEFAULT_LEGAL_VALUES[124] = "EMM";
		DEFAULT_LEGAL_VALUES[125] = "EN";
		DEFAULT_LEGAL_VALUES[126] = "END";
		DEFAULT_LEGAL_VALUES[127] = "EO";
		DEFAULT_LEGAL_VALUES[128] = "EP";
		DEFAULT_LEGAL_VALUES[129] = "EPA";
		DEFAULT_LEGAL_VALUES[130] = "EPB";
		DEFAULT_LEGAL_VALUES[131] = new String[] { "EQ", "ES" };
		DEFAULT_LEGAL_VALUES[132] = "ESN";
		DEFAULT_LEGAL_VALUES[133] = new String[] { "ET", "EZ" };
		DEFAULT_LEGAL_VALUES[134] = new String[] { "F1", "F9" };
		DEFAULT_LEGAL_VALUES[135] = new String[] { "FA", "FC" };
		DEFAULT_LEGAL_VALUES[136] = "FCN";
		DEFAULT_LEGAL_VALUES[137] = new String[] { "FD", "FL" };
		DEFAULT_LEGAL_VALUES[138] = "FLZ";
		DEFAULT_LEGAL_VALUES[139] = "FM";
		DEFAULT_LEGAL_VALUES[140] = "FMP";
		DEFAULT_LEGAL_VALUES[141] = "FN";
		DEFAULT_LEGAL_VALUES[142] = "FND";
		DEFAULT_LEGAL_VALUES[143] = new String[] { "FO", "FS" };
		DEFAULT_LEGAL_VALUES[144] = "FSN";
		DEFAULT_LEGAL_VALUES[145] = "FT";
		DEFAULT_LEGAL_VALUES[146] = "FTN";
		DEFAULT_LEGAL_VALUES[147] = new String[] { "FU", "FW" };
		DEFAULT_LEGAL_VALUES[148] = "FWC";
		DEFAULT_LEGAL_VALUES[149] = new String[] { "FX", "FZ" };
		DEFAULT_LEGAL_VALUES[150] = new String[] { "G1", "G9" };
		DEFAULT_LEGAL_VALUES[151] = new String[] { "GA", "GW" };
		DEFAULT_LEGAL_VALUES[152] = "GWS";
		DEFAULT_LEGAL_VALUES[153] = new String[] { "GX", "GZ" };
		DEFAULT_LEGAL_VALUES[154] = new String[] { "H1", "H9" };
		DEFAULT_LEGAL_VALUES[155] = new String[] { "HA", "HH" };
		DEFAULT_LEGAL_VALUES[156] = "HHT";
		DEFAULT_LEGAL_VALUES[157] = new String[] { "HI", "HM" };
		DEFAULT_LEGAL_VALUES[158] = "HMB";
		DEFAULT_LEGAL_VALUES[159] = new String[] { "HN", "HP" };
		DEFAULT_LEGAL_VALUES[160] = "HPI";
		DEFAULT_LEGAL_VALUES[161] = new String[] { "HQ", "HU" };
		DEFAULT_LEGAL_VALUES[162] = "HUD";
		DEFAULT_LEGAL_VALUES[163] = new String[] { "HV", "HZ" };
		DEFAULT_LEGAL_VALUES[164] = new String[] { "I1", "I5" };
		DEFAULT_LEGAL_VALUES[165] = new String[] { "I7", "I9" };
		DEFAULT_LEGAL_VALUES[166] = new String[] { "IA", "IC" };
		DEFAULT_LEGAL_VALUES[167] = "ICD";
		DEFAULT_LEGAL_VALUES[168] = new String[] { "ID", "IF" };
		DEFAULT_LEGAL_VALUES[169] = "IFT";
		DEFAULT_LEGAL_VALUES[170] = new String[] { "IG", "II" };
		DEFAULT_LEGAL_VALUES[171] = "IID";
		DEFAULT_LEGAL_VALUES[172] = new String[] { "IJ", "IM" };
		DEFAULT_LEGAL_VALUES[173] = "IMP";
		DEFAULT_LEGAL_VALUES[174] = "IMS";
		DEFAULT_LEGAL_VALUES[175] = "IN";
		DEFAULT_LEGAL_VALUES[176] = "IND";
		DEFAULT_LEGAL_VALUES[177] = new String[] { "IO", "IR" };
		DEFAULT_LEGAL_VALUES[178] = "IRN";
		DEFAULT_LEGAL_VALUES[179] = "IRP";
		DEFAULT_LEGAL_VALUES[180] = "IS";
		DEFAULT_LEGAL_VALUES[181] = "ISC";
		DEFAULT_LEGAL_VALUES[182] = "ISN";
		DEFAULT_LEGAL_VALUES[183] = "ISS";
		DEFAULT_LEGAL_VALUES[184] = new String[] { "IT", "IX" };
		DEFAULT_LEGAL_VALUES[185] = "IZ";
		DEFAULT_LEGAL_VALUES[186] = new String[] { "J0", "J9" };
		DEFAULT_LEGAL_VALUES[187] = new String[] { "JA", "JF" };
		DEFAULT_LEGAL_VALUES[188] = "JH";
		DEFAULT_LEGAL_VALUES[189] = "JI";
		DEFAULT_LEGAL_VALUES[190] = new String[] { "JK", "JZ" };
		DEFAULT_LEGAL_VALUES[191] = new String[] { "K0", "K9" };
		DEFAULT_LEGAL_VALUES[192] = new String[] { "KA", "KE" };
		DEFAULT_LEGAL_VALUES[193] = new String[] { "KG", "KZ" };
		DEFAULT_LEGAL_VALUES[194] = new String[] { "L1", "L9" };
		DEFAULT_LEGAL_VALUES[195] = new String[] { "LA", "LE" };
		DEFAULT_LEGAL_VALUES[196] = "LEN";
		DEFAULT_LEGAL_VALUES[197] = new String[] { "LF", "LI" };
		DEFAULT_LEGAL_VALUES[198] = "LIC";
		DEFAULT_LEGAL_VALUES[199] = new String[] { "LJ", "LO" };
		DEFAULT_LEGAL_VALUES[200] = "LOI";
		DEFAULT_LEGAL_VALUES[201] = new String[] { "LP", "LS" };
		DEFAULT_LEGAL_VALUES[202] = "LSD";
		DEFAULT_LEGAL_VALUES[203] = new String[] { "LT", "LV" };
		DEFAULT_LEGAL_VALUES[204] = "LVO";
		DEFAULT_LEGAL_VALUES[205] = new String[] { "LW", "LZ" };
		DEFAULT_LEGAL_VALUES[206] = new String[] { "M1", "M3" };
		DEFAULT_LEGAL_VALUES[207] = new String[] { "M5", "M9" };
		DEFAULT_LEGAL_VALUES[208] = "MA";
		DEFAULT_LEGAL_VALUES[209] = "MB";
		DEFAULT_LEGAL_VALUES[210] = "MBX";
		DEFAULT_LEGAL_VALUES[211] = "MC";
		DEFAULT_LEGAL_VALUES[212] = "MCI";
		DEFAULT_LEGAL_VALUES[213] = "MD";
		DEFAULT_LEGAL_VALUES[214] = "MDN";
		DEFAULT_LEGAL_VALUES[215] = new String[] { "ME", "MS" };
		DEFAULT_LEGAL_VALUES[216] = "MSL";
		DEFAULT_LEGAL_VALUES[217] = new String[] { "MT", "MZ" };
		DEFAULT_LEGAL_VALUES[218] = "MZO";
		DEFAULT_LEGAL_VALUES[219] = new String[] { "N0", "N9" };
		DEFAULT_LEGAL_VALUES[220] = "NA";
		DEFAULT_LEGAL_VALUES[221] = "NAS";
		DEFAULT_LEGAL_VALUES[222] = new String[] { "NB", "ND" };
		DEFAULT_LEGAL_VALUES[223] = "NDA";
		DEFAULT_LEGAL_VALUES[224] = "NDB";
		DEFAULT_LEGAL_VALUES[225] = "NE";
		DEFAULT_LEGAL_VALUES[226] = "NF";
		DEFAULT_LEGAL_VALUES[227] = "NFC";
		DEFAULT_LEGAL_VALUES[228] = "NFD";
		DEFAULT_LEGAL_VALUES[229] = "NFM";
		DEFAULT_LEGAL_VALUES[230] = "NFN";
		DEFAULT_LEGAL_VALUES[231] = "NFS";
		DEFAULT_LEGAL_VALUES[232] = new String[] { "NG", "NU" };
		DEFAULT_LEGAL_VALUES[233] = new String[] { "NW", "NZ" };
		DEFAULT_LEGAL_VALUES[234] = "O1";
		DEFAULT_LEGAL_VALUES[235] = "O2";
		DEFAULT_LEGAL_VALUES[236] = "O5";
		DEFAULT_LEGAL_VALUES[237] = new String[] { "O7", "O9" };
		DEFAULT_LEGAL_VALUES[238] = new String[] { "OA", "ON" };
		DEFAULT_LEGAL_VALUES[239] = new String[] { "OP", "OX" };
		DEFAULT_LEGAL_VALUES[240] = "OZ";
		DEFAULT_LEGAL_VALUES[241] = new String[] { "P1", "P9" };
		DEFAULT_LEGAL_VALUES[242] = "PA";
		DEFAULT_LEGAL_VALUES[243] = "PAC";
		DEFAULT_LEGAL_VALUES[244] = "PAN";
		DEFAULT_LEGAL_VALUES[245] = "PAP";
		DEFAULT_LEGAL_VALUES[246] = "PB";
		DEFAULT_LEGAL_VALUES[247] = "PC";
		DEFAULT_LEGAL_VALUES[248] = "PCC";
		DEFAULT_LEGAL_VALUES[249] = "PCN";
		DEFAULT_LEGAL_VALUES[250] = "PD";
		DEFAULT_LEGAL_VALUES[251] = "PDL";
		DEFAULT_LEGAL_VALUES[252] = new String[] { "PE", "PG" };
		DEFAULT_LEGAL_VALUES[253] = "PGC";
		DEFAULT_LEGAL_VALUES[254] = "PGN";
		DEFAULT_LEGAL_VALUES[255] = "PGS";
		DEFAULT_LEGAL_VALUES[256] = "PH";
		DEFAULT_LEGAL_VALUES[257] = "PHC";
		DEFAULT_LEGAL_VALUES[258] = "PI";
		DEFAULT_LEGAL_VALUES[259] = "PID";
		DEFAULT_LEGAL_VALUES[260] = "PIN";
		DEFAULT_LEGAL_VALUES[261] = new String[] { "PJ", "PL" };
		DEFAULT_LEGAL_VALUES[262] = "PLA";
		DEFAULT_LEGAL_VALUES[263] = "PLN";
		DEFAULT_LEGAL_VALUES[264] = "PM";
		DEFAULT_LEGAL_VALUES[265] = "PMN";
		DEFAULT_LEGAL_VALUES[266] = "PN";
		DEFAULT_LEGAL_VALUES[267] = "PNN";
		DEFAULT_LEGAL_VALUES[268] = "PO";
		DEFAULT_LEGAL_VALUES[269] = "POL";
		DEFAULT_LEGAL_VALUES[270] = new String[] { "PP", "PR" };
		DEFAULT_LEGAL_VALUES[271] = "PRS";
		DEFAULT_LEGAL_VALUES[272] = "PRT";
		DEFAULT_LEGAL_VALUES[273] = "PS";
		DEFAULT_LEGAL_VALUES[274] = "PSI";
		DEFAULT_LEGAL_VALUES[275] = new String[] { "PSL", "PSN" };
		DEFAULT_LEGAL_VALUES[276] = "PT";
		DEFAULT_LEGAL_VALUES[277] = "PTC";
		DEFAULT_LEGAL_VALUES[278] = new String[] { "PU", "PW" };
		DEFAULT_LEGAL_VALUES[279] = "PWC";
		DEFAULT_LEGAL_VALUES[280] = "PWS";
		DEFAULT_LEGAL_VALUES[281] = new String[] { "PX", "PZ" };
		DEFAULT_LEGAL_VALUES[282] = new String[] { "Q1", "Q9" };
		DEFAULT_LEGAL_VALUES[283] = new String[] { "QA", "QZ" };
		DEFAULT_LEGAL_VALUES[284] = new String[] { "R0", "R9" };
		DEFAULT_LEGAL_VALUES[285] = "RA";
		DEFAULT_LEGAL_VALUES[286] = "RAA";
		DEFAULT_LEGAL_VALUES[287] = "RAN";
		DEFAULT_LEGAL_VALUES[288] = new String[] { "RB", "RE" };
		DEFAULT_LEGAL_VALUES[289] = "REC";
		DEFAULT_LEGAL_VALUES[290] = "RF";
		DEFAULT_LEGAL_VALUES[291] = "RG";
		DEFAULT_LEGAL_VALUES[292] = "RGI";
		DEFAULT_LEGAL_VALUES[293] = "RH";
		DEFAULT_LEGAL_VALUES[294] = "RI";
		DEFAULT_LEGAL_VALUES[295] = "RIG";
		DEFAULT_LEGAL_VALUES[296] = new String[] { "RJ", "RP" };
		DEFAULT_LEGAL_VALUES[297] = "RPP";
		DEFAULT_LEGAL_VALUES[298] = "RPT";
		DEFAULT_LEGAL_VALUES[299] = "RQ";
		DEFAULT_LEGAL_VALUES[300] = "RR";
		DEFAULT_LEGAL_VALUES[301] = "RRS";
		DEFAULT_LEGAL_VALUES[302] = "RS";
		DEFAULT_LEGAL_VALUES[303] = "RSN";
		DEFAULT_LEGAL_VALUES[304] = new String[] { "RT", "RZ" };
		DEFAULT_LEGAL_VALUES[305] = new String[] { "S0", "S9" };
		DEFAULT_LEGAL_VALUES[306] = "SA";
		DEFAULT_LEGAL_VALUES[307] = "SB";
		DEFAULT_LEGAL_VALUES[308] = "SBN";
		DEFAULT_LEGAL_VALUES[309] = "SC";
		DEFAULT_LEGAL_VALUES[310] = "SCA";
		DEFAULT_LEGAL_VALUES[311] = "SD";
		DEFAULT_LEGAL_VALUES[312] = "SE";
		DEFAULT_LEGAL_VALUES[313] = "SEK";
		DEFAULT_LEGAL_VALUES[314] = "SES";
		DEFAULT_LEGAL_VALUES[315] = new String[] { "SF", "SH" };
		DEFAULT_LEGAL_VALUES[316] = "SHL";
		DEFAULT_LEGAL_VALUES[317] = new String[] { "SI", "SN" };
		DEFAULT_LEGAL_VALUES[318] = "SNH";
		DEFAULT_LEGAL_VALUES[319] = "SNV";
		DEFAULT_LEGAL_VALUES[320] = "SO";
		DEFAULT_LEGAL_VALUES[321] = "SP";
		DEFAULT_LEGAL_VALUES[322] = "SPL";
		DEFAULT_LEGAL_VALUES[323] = "SPN";
		DEFAULT_LEGAL_VALUES[324] = new String[] { "SQ", "ST" };
		DEFAULT_LEGAL_VALUES[325] = "STB";
		DEFAULT_LEGAL_VALUES[326] = "STR";
		DEFAULT_LEGAL_VALUES[327] = "SU";
		DEFAULT_LEGAL_VALUES[328] = "SUB";
		DEFAULT_LEGAL_VALUES[329] = "SUO";
		DEFAULT_LEGAL_VALUES[330] = new String[] { "SV", "SZ" };
		DEFAULT_LEGAL_VALUES[331] = new String[] { "T0", "T9" };
		DEFAULT_LEGAL_VALUES[332] = new String[] { "TA", "TD" };
		DEFAULT_LEGAL_VALUES[333] = "TDT";
		DEFAULT_LEGAL_VALUES[334] = new String[] { "TE", "TI" };
		DEFAULT_LEGAL_VALUES[335] = "TIP";
		DEFAULT_LEGAL_VALUES[336] = new String[] { "TJ", "TO" };
		DEFAULT_LEGAL_VALUES[337] = "TOC";
		DEFAULT_LEGAL_VALUES[338] = "TP";
		DEFAULT_LEGAL_VALUES[339] = "TPN";
		DEFAULT_LEGAL_VALUES[340] = new String[] { "TQ", "TS" };
		DEFAULT_LEGAL_VALUES[341] = "TSN";
		DEFAULT_LEGAL_VALUES[342] = new String[] { "TT", "TZ" };
		DEFAULT_LEGAL_VALUES[343] = new String[] { "U0", "U6" };
		DEFAULT_LEGAL_VALUES[344] = "U8";
		DEFAULT_LEGAL_VALUES[345] = "U9";
		DEFAULT_LEGAL_VALUES[346] = new String[] { "UA", "UR" };
		DEFAULT_LEGAL_VALUES[347] = "URL";
		DEFAULT_LEGAL_VALUES[348] = new String[] { "US", "UZ" };
		DEFAULT_LEGAL_VALUES[349] = new String[] { "V0", "V9" };
		DEFAULT_LEGAL_VALUES[350] = new String[] { "VA", "VZ" };
		DEFAULT_LEGAL_VALUES[351] = new String[] { "W1", "W9" };
		DEFAULT_LEGAL_VALUES[352] = new String[] { "WA", "WC" };
		DEFAULT_LEGAL_VALUES[353] = "WCS";
		DEFAULT_LEGAL_VALUES[354] = "WD";
		DEFAULT_LEGAL_VALUES[355] = "WDR";
		DEFAULT_LEGAL_VALUES[356] = new String[] { "WE", "WZ" };
		DEFAULT_LEGAL_VALUES[357] = new String[] { "X0", "X9" };
		DEFAULT_LEGAL_VALUES[358] = new String[] { "XA", "XZ" };
		DEFAULT_LEGAL_VALUES[359] = new String[] { "Y0", "Y9" };
		DEFAULT_LEGAL_VALUES[360] = new String[] { "YA", "YF" };
		DEFAULT_LEGAL_VALUES[361] = new String[] { "YH", "YT" };
		DEFAULT_LEGAL_VALUES[362] = new String[] { "YV", "YZ" };
		DEFAULT_LEGAL_VALUES[363] = new String[] { "Z1", "Z9" };
		DEFAULT_LEGAL_VALUES[364] = new String[] { "ZA", "ZZ" };
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

		currentValues = new Object[7];
		currentValues[0] = new String[] { "1A", "1D" };
		currentValues[1] = "1G";
		currentValues[2] = "1H";
		currentValues[3] = "1J";
		currentValues[4] = "SY";
		currentValues[5] = "TJ";
		currentValues[6] = "HPI";
		valueOverrides.put("40-1", currentValues);

		currentValues = new Object[7];
		currentValues[0] = "0B";
		currentValues[1] = new String[] { "1A", "1H" };
		currentValues[2] = "D3";
		currentValues[3] = "G2";
		currentValues[4] = "N5";
		currentValues[5] = "PQ";
		currentValues[6] = "TJ";
		valueOverrides.put("16-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "F2";
		valueOverrides.put("6-1", currentValues);

		currentValues = new Object[5];
		currentValues[0] = new String[] { "1A", "1D" };
		currentValues[1] = "1G";
		currentValues[2] = "1H";
		currentValues[3] = "D3";
		currentValues[4] = "G2";
		valueOverrides.put("31-1", currentValues);

		currentValues = new Object[8];
		currentValues[0] = "1S";
		currentValues[1] = "6R";
		currentValues[2] = "BB";
		currentValues[3] = "E9";
		currentValues[4] = "G1";
		currentValues[5] = "G3";
		currentValues[6] = "LU";
		currentValues[7] = "RB";
		valueOverrides.put("39-1", currentValues);

		currentValues = new Object[1];
		currentValues[0] = "EV";
		valueOverrides.put("5-1", currentValues);

		currentValues = new Object[4];
		currentValues[0] = "2U";
		currentValues[1] = "EO";
		currentValues[2] = "HI";
		currentValues[3] = "NF";
		valueOverrides.put("11-1", currentValues);

		currentValues = new Object[13];
		currentValues[0] = "1L";
		currentValues[1] = "1W";
		currentValues[2] = "9A";
		currentValues[3] = "9C";
		currentValues[4] = "A6";
		currentValues[5] = "BB";
		currentValues[6] = "CE";
		currentValues[7] = "EA";
		currentValues[8] = "F8";
		currentValues[9] = "G1";
		currentValues[10] = "G3";
		currentValues[11] = "IG";
		currentValues[12] = "SY";
		valueOverrides.put("30-1", currentValues);
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
