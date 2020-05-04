package com.webify.shared.edi.model.hipaa275.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field1270 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[374];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = "0";
		DEFAULT_LEGAL_VALUES[1] = "1";
		DEFAULT_LEGAL_VALUES[2] = new String[] { "3", "5" };
		DEFAULT_LEGAL_VALUES[3] = "7";
		DEFAULT_LEGAL_VALUES[4] = "8";
		DEFAULT_LEGAL_VALUES[5] = new String[] { "10", "50" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "52", "63" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "65", "69" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "71", "75" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "78", "85" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "87", "99" };
		DEFAULT_LEGAL_VALUES[11] = new String[] { "100", "109" };
		DEFAULT_LEGAL_VALUES[12] = "A";
		DEFAULT_LEGAL_VALUES[13] = new String[] { "A1", "A9" };
		DEFAULT_LEGAL_VALUES[14] = "AA";
		DEFAULT_LEGAL_VALUES[15] = "AAA";
		DEFAULT_LEGAL_VALUES[16] = new String[] { "AAD", "AAY" };
		DEFAULT_LEGAL_VALUES[17] = "AB";
		DEFAULT_LEGAL_VALUES[18] = "ABR";
		DEFAULT_LEGAL_VALUES[19] = "ABS";
		DEFAULT_LEGAL_VALUES[20] = "AC";
		DEFAULT_LEGAL_VALUES[21] = "ACR";
		DEFAULT_LEGAL_VALUES[22] = "AD";
		DEFAULT_LEGAL_VALUES[23] = "ADJ";
		DEFAULT_LEGAL_VALUES[24] = new String[] { "AE", "AJ" };
		DEFAULT_LEGAL_VALUES[25] = "AJT";
		DEFAULT_LEGAL_VALUES[26] = "AK";
		DEFAULT_LEGAL_VALUES[27] = "AL";
		DEFAULT_LEGAL_VALUES[28] = "ALM";
		DEFAULT_LEGAL_VALUES[29] = "ALP";
		DEFAULT_LEGAL_VALUES[30] = new String[] { "AM", "AO" };
		DEFAULT_LEGAL_VALUES[31] = "APE";
		DEFAULT_LEGAL_VALUES[32] = "AQ";
		DEFAULT_LEGAL_VALUES[33] = "AR";
		DEFAULT_LEGAL_VALUES[34] = "ARI";
		DEFAULT_LEGAL_VALUES[35] = "AS";
		DEFAULT_LEGAL_VALUES[36] = "AT";
		DEFAULT_LEGAL_VALUES[37] = "ATT";
		DEFAULT_LEGAL_VALUES[38] = new String[] { "AU", "AZ" };
		DEFAULT_LEGAL_VALUES[39] = "B";
		DEFAULT_LEGAL_VALUES[40] = new String[] { "BA", "BC" };
		DEFAULT_LEGAL_VALUES[41] = "BCC";
		DEFAULT_LEGAL_VALUES[42] = "BCR";
		DEFAULT_LEGAL_VALUES[43] = new String[] { "BD", "BL" };
		DEFAULT_LEGAL_VALUES[44] = new String[] { "BN", "BP" };
		DEFAULT_LEGAL_VALUES[45] = "BPL";
		DEFAULT_LEGAL_VALUES[46] = "BQ";
		DEFAULT_LEGAL_VALUES[47] = "BR";
		DEFAULT_LEGAL_VALUES[48] = "BRL";
		DEFAULT_LEGAL_VALUES[49] = "BS";
		DEFAULT_LEGAL_VALUES[50] = "BSL";
		DEFAULT_LEGAL_VALUES[51] = "BSP";
		DEFAULT_LEGAL_VALUES[52] = "BT";
		DEFAULT_LEGAL_VALUES[53] = "BTC";
		DEFAULT_LEGAL_VALUES[54] = "BU";
		DEFAULT_LEGAL_VALUES[55] = "BUI";
		DEFAULT_LEGAL_VALUES[56] = new String[] { "BV", "BZ" };
		DEFAULT_LEGAL_VALUES[57] = "C";
		DEFAULT_LEGAL_VALUES[58] = new String[] { "C1", "C3" };
		DEFAULT_LEGAL_VALUES[59] = "CA";
		DEFAULT_LEGAL_VALUES[60] = "CAH";
		DEFAULT_LEGAL_VALUES[61] = new String[] { "CB", "CF" };
		DEFAULT_LEGAL_VALUES[62] = "CFI";
		DEFAULT_LEGAL_VALUES[63] = "CG";
		DEFAULT_LEGAL_VALUES[64] = "CH";
		DEFAULT_LEGAL_VALUES[65] = "CHG";
		DEFAULT_LEGAL_VALUES[66] = "CI";
		DEFAULT_LEGAL_VALUES[67] = "CIE";
		DEFAULT_LEGAL_VALUES[68] = new String[] { "CJ", "CL" };
		DEFAULT_LEGAL_VALUES[69] = "CLP";
		DEFAULT_LEGAL_VALUES[70] = "CM";
		DEFAULT_LEGAL_VALUES[71] = "CML";
		DEFAULT_LEGAL_VALUES[72] = "CN";
		DEFAULT_LEGAL_VALUES[73] = "CNC";
		DEFAULT_LEGAL_VALUES[74] = "CO";
		DEFAULT_LEGAL_VALUES[75] = "COG";
		DEFAULT_LEGAL_VALUES[76] = "CP";
		DEFAULT_LEGAL_VALUES[77] = "CPS";
		DEFAULT_LEGAL_VALUES[78] = "CQ";
		DEFAULT_LEGAL_VALUES[79] = "CR";
		DEFAULT_LEGAL_VALUES[80] = "CRC";
		DEFAULT_LEGAL_VALUES[81] = "CS";
		DEFAULT_LEGAL_VALUES[82] = "CSD";
		DEFAULT_LEGAL_VALUES[83] = "CSF";
		DEFAULT_LEGAL_VALUES[84] = new String[] { "CT", "CW" };
		DEFAULT_LEGAL_VALUES[85] = "CZ";
		DEFAULT_LEGAL_VALUES[86] = "D";
		DEFAULT_LEGAL_VALUES[87] = new String[] { "D1", "D5" };
		DEFAULT_LEGAL_VALUES[88] = "DA";
		DEFAULT_LEGAL_VALUES[89] = "DB";
		DEFAULT_LEGAL_VALUES[90] = "DBS";
		DEFAULT_LEGAL_VALUES[91] = new String[] { "DC", "DG" };
		DEFAULT_LEGAL_VALUES[92] = "DGO";
		DEFAULT_LEGAL_VALUES[93] = new String[] { "DH", "DL" };
		DEFAULT_LEGAL_VALUES[94] = "DLO";
		DEFAULT_LEGAL_VALUES[95] = "DLP";
		DEFAULT_LEGAL_VALUES[96] = new String[] { "DM", "DO" };
		DEFAULT_LEGAL_VALUES[97] = "DOF";
		DEFAULT_LEGAL_VALUES[98] = "DP";
		DEFAULT_LEGAL_VALUES[99] = "DPE";
		DEFAULT_LEGAL_VALUES[100] = "DPL";
		DEFAULT_LEGAL_VALUES[101] = "DQ";
		DEFAULT_LEGAL_VALUES[102] = "DR";
		DEFAULT_LEGAL_VALUES[103] = "DRL";
		DEFAULT_LEGAL_VALUES[104] = "DS";
		DEFAULT_LEGAL_VALUES[105] = "DSR";
		DEFAULT_LEGAL_VALUES[106] = "DSS";
		DEFAULT_LEGAL_VALUES[107] = "DT";
		DEFAULT_LEGAL_VALUES[108] = "DU";
		DEFAULT_LEGAL_VALUES[109] = new String[] { "DW", "DZ" };
		DEFAULT_LEGAL_VALUES[110] = "E";
		DEFAULT_LEGAL_VALUES[111] = "EA";
		DEFAULT_LEGAL_VALUES[112] = new String[] { "EAA", "EAZ" };
		DEFAULT_LEGAL_VALUES[113] = "EB";
		DEFAULT_LEGAL_VALUES[114] = new String[] { "EBA", "EBZ" };
		DEFAULT_LEGAL_VALUES[115] = "EC";
		DEFAULT_LEGAL_VALUES[116] = new String[] { "ECA", "ECZ" };
		DEFAULT_LEGAL_VALUES[117] = "ED";
		DEFAULT_LEGAL_VALUES[118] = new String[] { "EDA", "EDZ" };
		DEFAULT_LEGAL_VALUES[119] = "EE";
		DEFAULT_LEGAL_VALUES[120] = new String[] { "EEA", "EES" };
		DEFAULT_LEGAL_VALUES[121] = new String[] { "EF", "EM" };
		DEFAULT_LEGAL_VALUES[122] = "EMC";
		DEFAULT_LEGAL_VALUES[123] = "EN";
		DEFAULT_LEGAL_VALUES[124] = "EO";
		DEFAULT_LEGAL_VALUES[125] = "EQ";
		DEFAULT_LEGAL_VALUES[126] = "EQR";
		DEFAULT_LEGAL_VALUES[127] = "ER";
		DEFAULT_LEGAL_VALUES[128] = "ES";
		DEFAULT_LEGAL_VALUES[129] = "ESL";
		DEFAULT_LEGAL_VALUES[130] = "ET";
		DEFAULT_LEGAL_VALUES[131] = "ETL";
		DEFAULT_LEGAL_VALUES[132] = new String[] { "EU", "EW" };
		DEFAULT_LEGAL_VALUES[133] = "EWC";
		DEFAULT_LEGAL_VALUES[134] = "EWR";
		DEFAULT_LEGAL_VALUES[135] = "EX";
		DEFAULT_LEGAL_VALUES[136] = "EXD";
		DEFAULT_LEGAL_VALUES[137] = "EY";
		DEFAULT_LEGAL_VALUES[138] = "EZ";
		DEFAULT_LEGAL_VALUES[139] = "F";
		DEFAULT_LEGAL_VALUES[140] = "FA";
		DEFAULT_LEGAL_VALUES[141] = "FAP";
		DEFAULT_LEGAL_VALUES[142] = "FB";
		DEFAULT_LEGAL_VALUES[143] = "FC";
		DEFAULT_LEGAL_VALUES[144] = "FC1";
		DEFAULT_LEGAL_VALUES[145] = new String[] { "FD", "FF" };
		DEFAULT_LEGAL_VALUES[146] = "FF1";
		DEFAULT_LEGAL_VALUES[147] = "FG";
		DEFAULT_LEGAL_VALUES[148] = "FH";
		DEFAULT_LEGAL_VALUES[149] = "FH1";
		DEFAULT_LEGAL_VALUES[150] = "FI";
		DEFAULT_LEGAL_VALUES[151] = "FIR";
		DEFAULT_LEGAL_VALUES[152] = new String[] { "FJ", "FL" };
		DEFAULT_LEGAL_VALUES[153] = "FL1";
		DEFAULT_LEGAL_VALUES[154] = "FM";
		DEFAULT_LEGAL_VALUES[155] = "FMS";
		DEFAULT_LEGAL_VALUES[156] = new String[] { "FN", "FP" };
		DEFAULT_LEGAL_VALUES[157] = "FP1";
		DEFAULT_LEGAL_VALUES[158] = "FQ";
		DEFAULT_LEGAL_VALUES[159] = "FR";
		DEFAULT_LEGAL_VALUES[160] = "FRP";
		DEFAULT_LEGAL_VALUES[161] = "FS";
		DEFAULT_LEGAL_VALUES[162] = "FT";
		DEFAULT_LEGAL_VALUES[163] = "FT1";
		DEFAULT_LEGAL_VALUES[164] = new String[] { "FU", "FX" };
		DEFAULT_LEGAL_VALUES[165] = "FZ";
		DEFAULT_LEGAL_VALUES[166] = "G";
		DEFAULT_LEGAL_VALUES[167] = "G1";
		DEFAULT_LEGAL_VALUES[168] = new String[] { "GA", "GG" };
		DEFAULT_LEGAL_VALUES[169] = new String[] { "GI", "GK" };
		DEFAULT_LEGAL_VALUES[170] = new String[] { "GQ", "GZ" };
		DEFAULT_LEGAL_VALUES[171] = "H";
		DEFAULT_LEGAL_VALUES[172] = new String[] { "HA", "HG" };
		DEFAULT_LEGAL_VALUES[173] = new String[] { "HI", "HM" };
		DEFAULT_LEGAL_VALUES[174] = "HO";
		DEFAULT_LEGAL_VALUES[175] = "HRC";
		DEFAULT_LEGAL_VALUES[176] = "HS";
		DEFAULT_LEGAL_VALUES[177] = "HZR";
		DEFAULT_LEGAL_VALUES[178] = "I";
		DEFAULT_LEGAL_VALUES[179] = "IC";
		DEFAULT_LEGAL_VALUES[180] = "ID";
		DEFAULT_LEGAL_VALUES[181] = "IF";
		DEFAULT_LEGAL_VALUES[182] = "IMC";
		DEFAULT_LEGAL_VALUES[183] = "IMP";
		DEFAULT_LEGAL_VALUES[184] = "IND";
		DEFAULT_LEGAL_VALUES[185] = "IPA";
		DEFAULT_LEGAL_VALUES[186] = "IQ";
		DEFAULT_LEGAL_VALUES[187] = "IRR";
		DEFAULT_LEGAL_VALUES[188] = "IRT";
		DEFAULT_LEGAL_VALUES[189] = "IT";
		DEFAULT_LEGAL_VALUES[190] = "J";
		DEFAULT_LEGAL_VALUES[191] = new String[] { "J0", "J9" };
		DEFAULT_LEGAL_VALUES[192] = new String[] { "JA", "JC" };
		DEFAULT_LEGAL_VALUES[193] = "JCL";
		DEFAULT_LEGAL_VALUES[194] = new String[] { "JD", "JI" };
		DEFAULT_LEGAL_VALUES[195] = new String[] { "JK", "JO" };
		DEFAULT_LEGAL_VALUES[196] = "JOL";
		DEFAULT_LEGAL_VALUES[197] = "JP";
		DEFAULT_LEGAL_VALUES[198] = "K";
		DEFAULT_LEGAL_VALUES[199] = new String[] { "KA", "KM" };
		DEFAULT_LEGAL_VALUES[200] = new String[] { "KO", "KQ" };
		DEFAULT_LEGAL_VALUES[201] = new String[] { "KS", "KU" };
		DEFAULT_LEGAL_VALUES[202] = "KW";
		DEFAULT_LEGAL_VALUES[203] = "KYL";
		DEFAULT_LEGAL_VALUES[204] = "KZ";
		DEFAULT_LEGAL_VALUES[205] = "L";
		DEFAULT_LEGAL_VALUES[206] = new String[] { "LA", "LH" };
		DEFAULT_LEGAL_VALUES[207] = "LIN";
		DEFAULT_LEGAL_VALUES[208] = "LJ";
		DEFAULT_LEGAL_VALUES[209] = "LK";
		DEFAULT_LEGAL_VALUES[210] = new String[] { "LM", "LO" };
		DEFAULT_LEGAL_VALUES[211] = "LOC";
		DEFAULT_LEGAL_VALUES[212] = "LOI";
		DEFAULT_LEGAL_VALUES[213] = new String[] { "LP", "LS" };
		DEFAULT_LEGAL_VALUES[214] = "LSC";
		DEFAULT_LEGAL_VALUES[215] = "LT";
		DEFAULT_LEGAL_VALUES[216] = "LZ";
		DEFAULT_LEGAL_VALUES[217] = "M";
		DEFAULT_LEGAL_VALUES[218] = new String[] { "MA", "MC" };
		DEFAULT_LEGAL_VALUES[219] = "MCC";
		DEFAULT_LEGAL_VALUES[220] = "MCD";
		DEFAULT_LEGAL_VALUES[221] = "ME";
		DEFAULT_LEGAL_VALUES[222] = "MEC";
		DEFAULT_LEGAL_VALUES[223] = new String[] { "MI", "ML" };
		DEFAULT_LEGAL_VALUES[224] = "MN";
		DEFAULT_LEGAL_VALUES[225] = "MOC";
		DEFAULT_LEGAL_VALUES[226] = "MRI";
		DEFAULT_LEGAL_VALUES[227] = "MS";
		DEFAULT_LEGAL_VALUES[228] = "MT";
		DEFAULT_LEGAL_VALUES[229] = "N";
		DEFAULT_LEGAL_VALUES[230] = "NA";
		DEFAULT_LEGAL_VALUES[231] = "NAC";
		DEFAULT_LEGAL_VALUES[232] = "NAF";
		DEFAULT_LEGAL_VALUES[233] = "NAS";
		DEFAULT_LEGAL_VALUES[234] = new String[] { "NB", "ND" };
		DEFAULT_LEGAL_VALUES[235] = "NDC";
		DEFAULT_LEGAL_VALUES[236] = "NE";
		DEFAULT_LEGAL_VALUES[237] = "NF";
		DEFAULT_LEGAL_VALUES[238] = "NH";
		DEFAULT_LEGAL_VALUES[239] = "NI";
		DEFAULT_LEGAL_VALUES[240] = "NIR";
		DEFAULT_LEGAL_VALUES[241] = "NJ";
		DEFAULT_LEGAL_VALUES[242] = "NK";
		DEFAULT_LEGAL_VALUES[243] = "NP";
		DEFAULT_LEGAL_VALUES[244] = "NPC";
		DEFAULT_LEGAL_VALUES[245] = new String[] { "NR", "NT" };
		DEFAULT_LEGAL_VALUES[246] = "O";
		DEFAULT_LEGAL_VALUES[247] = new String[] { "O1", "O4" };
		DEFAULT_LEGAL_VALUES[248] = "OC";
		DEFAULT_LEGAL_VALUES[249] = "P";
		DEFAULT_LEGAL_VALUES[250] = new String[] { "PA", "PC" };
		DEFAULT_LEGAL_VALUES[251] = "PCR";
		DEFAULT_LEGAL_VALUES[252] = "PD";
		DEFAULT_LEGAL_VALUES[253] = "PDA";
		DEFAULT_LEGAL_VALUES[254] = "PGS";
		DEFAULT_LEGAL_VALUES[255] = "PI";
		DEFAULT_LEGAL_VALUES[256] = "PIT";
		DEFAULT_LEGAL_VALUES[257] = "PL";
		DEFAULT_LEGAL_VALUES[258] = "PLC";
		DEFAULT_LEGAL_VALUES[259] = "PLS";
		DEFAULT_LEGAL_VALUES[260] = "POB";
		DEFAULT_LEGAL_VALUES[261] = "PPD";
		DEFAULT_LEGAL_VALUES[262] = "PPP";
		DEFAULT_LEGAL_VALUES[263] = "PPS";
		DEFAULT_LEGAL_VALUES[264] = "PPV";
		DEFAULT_LEGAL_VALUES[265] = "PQA";
		DEFAULT_LEGAL_VALUES[266] = "PR";
		DEFAULT_LEGAL_VALUES[267] = "PRA";
		DEFAULT_LEGAL_VALUES[268] = "PRC";
		DEFAULT_LEGAL_VALUES[269] = "PRI";
		DEFAULT_LEGAL_VALUES[270] = "PRR";
		DEFAULT_LEGAL_VALUES[271] = "PRT";
		DEFAULT_LEGAL_VALUES[272] = "PS";
		DEFAULT_LEGAL_VALUES[273] = "PT";
		DEFAULT_LEGAL_VALUES[274] = "PWA";
		DEFAULT_LEGAL_VALUES[275] = "PWI";
		DEFAULT_LEGAL_VALUES[276] = new String[] { "PWR", "PWT" };
		DEFAULT_LEGAL_VALUES[277] = "Q";
		DEFAULT_LEGAL_VALUES[278] = new String[] { "QA", "QC" };
		DEFAULT_LEGAL_VALUES[279] = "QDR";
		DEFAULT_LEGAL_VALUES[280] = new String[] { "QE", "QK" };
		DEFAULT_LEGAL_VALUES[281] = "QS";
		DEFAULT_LEGAL_VALUES[282] = "QT";
		DEFAULT_LEGAL_VALUES[283] = "R";
		DEFAULT_LEGAL_VALUES[284] = new String[] { "R1", "R4" };
		DEFAULT_LEGAL_VALUES[285] = "RA";
		DEFAULT_LEGAL_VALUES[286] = "RAS";
		DEFAULT_LEGAL_VALUES[287] = "RC";
		DEFAULT_LEGAL_VALUES[288] = "RCA";
		DEFAULT_LEGAL_VALUES[289] = "RD";
		DEFAULT_LEGAL_VALUES[290] = "RE";
		DEFAULT_LEGAL_VALUES[291] = "REC";
		DEFAULT_LEGAL_VALUES[292] = "RED";
		DEFAULT_LEGAL_VALUES[293] = "REN";
		DEFAULT_LEGAL_VALUES[294] = "RET";
		DEFAULT_LEGAL_VALUES[295] = "RI";
		DEFAULT_LEGAL_VALUES[296] = "RQ";
		DEFAULT_LEGAL_VALUES[297] = "RSS";
		DEFAULT_LEGAL_VALUES[298] = "RT";
		DEFAULT_LEGAL_VALUES[299] = "RTC";
		DEFAULT_LEGAL_VALUES[300] = "RUM";
		DEFAULT_LEGAL_VALUES[301] = "RX";
		DEFAULT_LEGAL_VALUES[302] = "S";
		DEFAULT_LEGAL_VALUES[303] = "SA";
		DEFAULT_LEGAL_VALUES[304] = "SAT";
		DEFAULT_LEGAL_VALUES[305] = "SB";
		DEFAULT_LEGAL_VALUES[306] = "SBA";
		DEFAULT_LEGAL_VALUES[307] = "SC";
		DEFAULT_LEGAL_VALUES[308] = "SCI";
		DEFAULT_LEGAL_VALUES[309] = "SD";
		DEFAULT_LEGAL_VALUES[310] = "SE";
		DEFAULT_LEGAL_VALUES[311] = "SEC";
		DEFAULT_LEGAL_VALUES[312] = "SET";
		DEFAULT_LEGAL_VALUES[313] = new String[] { "SF", "SH" };
		DEFAULT_LEGAL_VALUES[314] = new String[] { "SHL", "SHZ" };
		DEFAULT_LEGAL_VALUES[315] = "SI";
		DEFAULT_LEGAL_VALUES[316] = new String[] { "SIA", "SIZ" };
		DEFAULT_LEGAL_VALUES[317] = "SJ";
		DEFAULT_LEGAL_VALUES[318] = new String[] { "SJA", "SKZ" };
		DEFAULT_LEGAL_VALUES[319] = "SL";
		DEFAULT_LEGAL_VALUES[320] = "SLA";
		DEFAULT_LEGAL_VALUES[321] = "SLS";
		DEFAULT_LEGAL_VALUES[322] = new String[] { "SMB", "SMD" };
		DEFAULT_LEGAL_VALUES[323] = "SMI";
		DEFAULT_LEGAL_VALUES[324] = "SMT";
		DEFAULT_LEGAL_VALUES[325] = "SO";
		DEFAULT_LEGAL_VALUES[326] = "SP";
		DEFAULT_LEGAL_VALUES[327] = "SPE";
		DEFAULT_LEGAL_VALUES[328] = "SR";
		DEFAULT_LEGAL_VALUES[329] = "SRL";
		DEFAULT_LEGAL_VALUES[330] = "SRR";
		DEFAULT_LEGAL_VALUES[331] = "SS";
		DEFAULT_LEGAL_VALUES[332] = "SSC";
		DEFAULT_LEGAL_VALUES[333] = "ST";
		DEFAULT_LEGAL_VALUES[334] = "STC";
		DEFAULT_LEGAL_VALUES[335] = "STF";
		DEFAULT_LEGAL_VALUES[336] = "SUI";
		DEFAULT_LEGAL_VALUES[337] = "SVC";
		DEFAULT_LEGAL_VALUES[338] = "SWR";
		DEFAULT_LEGAL_VALUES[339] = "T";
		DEFAULT_LEGAL_VALUES[340] = new String[] { "T00", "T09" };
		DEFAULT_LEGAL_VALUES[341] = new String[] { "T10", "T19" };
		DEFAULT_LEGAL_VALUES[342] = new String[] { "T20", "T29" };
		DEFAULT_LEGAL_VALUES[343] = new String[] { "T30", "T35" };
		DEFAULT_LEGAL_VALUES[344] = "TB";
		DEFAULT_LEGAL_VALUES[345] = "TC";
		DEFAULT_LEGAL_VALUES[346] = "TCD";
		DEFAULT_LEGAL_VALUES[347] = "TCL";
		DEFAULT_LEGAL_VALUES[348] = new String[] { "TD", "TF" };
		DEFAULT_LEGAL_VALUES[349] = "TFR";
		DEFAULT_LEGAL_VALUES[350] = "TG";
		DEFAULT_LEGAL_VALUES[351] = "TL";
		DEFAULT_LEGAL_VALUES[352] = "TOL";
		DEFAULT_LEGAL_VALUES[353] = new String[] { "TP", "TR" };
		DEFAULT_LEGAL_VALUES[354] = "TT";
		DEFAULT_LEGAL_VALUES[355] = "TTL";
		DEFAULT_LEGAL_VALUES[356] = "TX";
		DEFAULT_LEGAL_VALUES[357] = "TY";
		DEFAULT_LEGAL_VALUES[358] = "U";
		DEFAULT_LEGAL_VALUES[359] = "UNP";
		DEFAULT_LEGAL_VALUES[360] = "UPC";
		DEFAULT_LEGAL_VALUES[361] = "UPT";
		DEFAULT_LEGAL_VALUES[362] = new String[] { "UR", "UU" };
		DEFAULT_LEGAL_VALUES[363] = "V";
		DEFAULT_LEGAL_VALUES[364] = "VAL";
		DEFAULT_LEGAL_VALUES[365] = "W";
		DEFAULT_LEGAL_VALUES[366] = "WDL";
		DEFAULT_LEGAL_VALUES[367] = "WRC";
		DEFAULT_LEGAL_VALUES[368] = "WSD";
		DEFAULT_LEGAL_VALUES[369] = "X";
		DEFAULT_LEGAL_VALUES[370] = "XD";
		DEFAULT_LEGAL_VALUES[371] = "Y";
		DEFAULT_LEGAL_VALUES[372] = "Z";
		DEFAULT_LEGAL_VALUES[373] = "ZZ";
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
