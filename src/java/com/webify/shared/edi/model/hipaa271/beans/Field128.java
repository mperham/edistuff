package com.webify.shared.edi.model.hipaa271.beans;

import java.util.*;
import com.webify.shared.edi.model.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class Field128 {

	private static final Object[] DEFAULT_LEGAL_VALUES = new Object[259];
	private static final Map valueOverrides = new HashMap();

	static {
		DEFAULT_LEGAL_VALUES[0] = new String[] { "01", "09" };
		DEFAULT_LEGAL_VALUES[1] = "0A";
		DEFAULT_LEGAL_VALUES[2] = "0B";
		DEFAULT_LEGAL_VALUES[3] = new String[] { "0D", "0N" };
		DEFAULT_LEGAL_VALUES[4] = "0P";
		DEFAULT_LEGAL_VALUES[5] = new String[] { "10", "19" };
		DEFAULT_LEGAL_VALUES[6] = new String[] { "1A", "1Z" };
		DEFAULT_LEGAL_VALUES[7] = new String[] { "20", "29" };
		DEFAULT_LEGAL_VALUES[8] = new String[] { "2A", "2Z" };
		DEFAULT_LEGAL_VALUES[9] = new String[] { "30", "39" };
		DEFAULT_LEGAL_VALUES[10] = new String[] { "3A", "3Z" };
		DEFAULT_LEGAL_VALUES[11] = new String[] { "40", "49" };
		DEFAULT_LEGAL_VALUES[12] = new String[] { "4A", "4Z" };
		DEFAULT_LEGAL_VALUES[13] = new String[] { "50", "59" };
		DEFAULT_LEGAL_VALUES[14] = new String[] { "5A", "5Z" };
		DEFAULT_LEGAL_VALUES[15] = "60";
		DEFAULT_LEGAL_VALUES[16] = "61";
		DEFAULT_LEGAL_VALUES[17] = new String[] { "63", "69" };
		DEFAULT_LEGAL_VALUES[18] = new String[] { "6A", "6Z" };
		DEFAULT_LEGAL_VALUES[19] = new String[] { "70", "79" };
		DEFAULT_LEGAL_VALUES[20] = new String[] { "7A", "7U" };
		DEFAULT_LEGAL_VALUES[21] = new String[] { "7W", "7Z" };
		DEFAULT_LEGAL_VALUES[22] = new String[] { "80", "89" };
		DEFAULT_LEGAL_VALUES[23] = new String[] { "8A", "8S" };
		DEFAULT_LEGAL_VALUES[24] = new String[] { "8U", "8Z" };
		DEFAULT_LEGAL_VALUES[25] = new String[] { "90", "99" };
		DEFAULT_LEGAL_VALUES[26] = new String[] { "9A", "9N" };
		DEFAULT_LEGAL_VALUES[27] = new String[] { "9P", "9Z" };
		DEFAULT_LEGAL_VALUES[28] = new String[] { "A0", "A9" };
		DEFAULT_LEGAL_VALUES[29] = new String[] { "AA", "AZ" };
		DEFAULT_LEGAL_VALUES[30] = new String[] { "B1", "B9" };
		DEFAULT_LEGAL_VALUES[31] = new String[] { "BA", "BZ" };
		DEFAULT_LEGAL_VALUES[32] = new String[] { "C0", "C9" };
		DEFAULT_LEGAL_VALUES[33] = new String[] { "CA", "CZ" };
		DEFAULT_LEGAL_VALUES[34] = new String[] { "D0", "D9" };
		DEFAULT_LEGAL_VALUES[35] = new String[] { "DA", "DZ" };
		DEFAULT_LEGAL_VALUES[36] = new String[] { "E1", "E9" };
		DEFAULT_LEGAL_VALUES[37] = new String[] { "EA", "EZ" };
		DEFAULT_LEGAL_VALUES[38] = new String[] { "F1", "F9" };
		DEFAULT_LEGAL_VALUES[39] = new String[] { "FA", "FZ" };
		DEFAULT_LEGAL_VALUES[40] = new String[] { "G1", "G9" };
		DEFAULT_LEGAL_VALUES[41] = new String[] { "GA", "GZ" };
		DEFAULT_LEGAL_VALUES[42] = new String[] { "H1", "H9" };
		DEFAULT_LEGAL_VALUES[43] = new String[] { "HA", "HZ" };
		DEFAULT_LEGAL_VALUES[44] = new String[] { "I1", "I5" };
		DEFAULT_LEGAL_VALUES[45] = new String[] { "I7", "I9" };
		DEFAULT_LEGAL_VALUES[46] = new String[] { "IA", "IX" };
		DEFAULT_LEGAL_VALUES[47] = "IZ";
		DEFAULT_LEGAL_VALUES[48] = new String[] { "J0", "J9" };
		DEFAULT_LEGAL_VALUES[49] = new String[] { "JA", "JF" };
		DEFAULT_LEGAL_VALUES[50] = "JH";
		DEFAULT_LEGAL_VALUES[51] = "JI";
		DEFAULT_LEGAL_VALUES[52] = new String[] { "JK", "JZ" };
		DEFAULT_LEGAL_VALUES[53] = new String[] { "K0", "K9" };
		DEFAULT_LEGAL_VALUES[54] = new String[] { "KA", "KE" };
		DEFAULT_LEGAL_VALUES[55] = new String[] { "KG", "KZ" };
		DEFAULT_LEGAL_VALUES[56] = new String[] { "L1", "L9" };
		DEFAULT_LEGAL_VALUES[57] = new String[] { "LA", "LZ" };
		DEFAULT_LEGAL_VALUES[58] = new String[] { "M1", "M3" };
		DEFAULT_LEGAL_VALUES[59] = new String[] { "M5", "M9" };
		DEFAULT_LEGAL_VALUES[60] = new String[] { "MA", "MZ" };
		DEFAULT_LEGAL_VALUES[61] = new String[] { "N0", "N9" };
		DEFAULT_LEGAL_VALUES[62] = new String[] { "NA", "NU" };
		DEFAULT_LEGAL_VALUES[63] = new String[] { "NW", "NZ" };
		DEFAULT_LEGAL_VALUES[64] = "O1";
		DEFAULT_LEGAL_VALUES[65] = "O2";
		DEFAULT_LEGAL_VALUES[66] = "O5";
		DEFAULT_LEGAL_VALUES[67] = new String[] { "O7", "O9" };
		DEFAULT_LEGAL_VALUES[68] = new String[] { "OA", "ON" };
		DEFAULT_LEGAL_VALUES[69] = new String[] { "OP", "OX" };
		DEFAULT_LEGAL_VALUES[70] = "OZ";
		DEFAULT_LEGAL_VALUES[71] = new String[] { "P1", "P9" };
		DEFAULT_LEGAL_VALUES[72] = new String[] { "PA", "PZ" };
		DEFAULT_LEGAL_VALUES[73] = new String[] { "Q1", "Q9" };
		DEFAULT_LEGAL_VALUES[74] = new String[] { "QA", "QZ" };
		DEFAULT_LEGAL_VALUES[75] = new String[] { "R0", "R9" };
		DEFAULT_LEGAL_VALUES[76] = new String[] { "RA", "RZ" };
		DEFAULT_LEGAL_VALUES[77] = new String[] { "S0", "S9" };
		DEFAULT_LEGAL_VALUES[78] = new String[] { "SA", "SZ" };
		DEFAULT_LEGAL_VALUES[79] = new String[] { "T0", "T9" };
		DEFAULT_LEGAL_VALUES[80] = new String[] { "TA", "TZ" };
		DEFAULT_LEGAL_VALUES[81] = new String[] { "U0", "U6" };
		DEFAULT_LEGAL_VALUES[82] = "U8";
		DEFAULT_LEGAL_VALUES[83] = "U9";
		DEFAULT_LEGAL_VALUES[84] = new String[] { "UA", "UZ" };
		DEFAULT_LEGAL_VALUES[85] = new String[] { "V0", "V9" };
		DEFAULT_LEGAL_VALUES[86] = new String[] { "VA", "VZ" };
		DEFAULT_LEGAL_VALUES[87] = new String[] { "W1", "W9" };
		DEFAULT_LEGAL_VALUES[88] = new String[] { "WA", "WZ" };
		DEFAULT_LEGAL_VALUES[89] = new String[] { "X0", "X9" };
		DEFAULT_LEGAL_VALUES[90] = new String[] { "XA", "XZ" };
		DEFAULT_LEGAL_VALUES[91] = new String[] { "Y0", "Y9" };
		DEFAULT_LEGAL_VALUES[92] = new String[] { "YA", "YF" };
		DEFAULT_LEGAL_VALUES[93] = new String[] { "YH", "YT" };
		DEFAULT_LEGAL_VALUES[94] = new String[] { "YV", "YZ" };
		DEFAULT_LEGAL_VALUES[95] = new String[] { "Z1", "Z9" };
		DEFAULT_LEGAL_VALUES[96] = new String[] { "ZA", "ZZ" };
		DEFAULT_LEGAL_VALUES[97] = new String[] { "AAA", "ABH" };
		DEFAULT_LEGAL_VALUES[98] = new String[] { "ABJ", "ABV" };
		DEFAULT_LEGAL_VALUES[99] = "ABY";
		DEFAULT_LEGAL_VALUES[100] = new String[] { "ACA", "ACK" };
		DEFAULT_LEGAL_VALUES[101] = new String[] { "ACR", "ACT" };
		DEFAULT_LEGAL_VALUES[102] = new String[] { "ADA", "ADI" };
		DEFAULT_LEGAL_VALUES[103] = "ADM";
		DEFAULT_LEGAL_VALUES[104] = new String[] { "AEA", "AEM" };
		DEFAULT_LEGAL_VALUES[105] = "AHC";
		DEFAULT_LEGAL_VALUES[106] = "ALC";
		DEFAULT_LEGAL_VALUES[107] = new String[] { "ALG", "ALJ" };
		DEFAULT_LEGAL_VALUES[108] = "ALT";
		DEFAULT_LEGAL_VALUES[109] = "API";
		DEFAULT_LEGAL_VALUES[110] = "ASL";
		DEFAULT_LEGAL_VALUES[111] = "ASP";
		DEFAULT_LEGAL_VALUES[112] = "AST";
		DEFAULT_LEGAL_VALUES[113] = "ATC";
		DEFAULT_LEGAL_VALUES[114] = new String[] { "BAA", "BAI" };
		DEFAULT_LEGAL_VALUES[115] = "BCI";
		DEFAULT_LEGAL_VALUES[116] = "BKT";
		DEFAULT_LEGAL_VALUES[117] = "BLT";
		DEFAULT_LEGAL_VALUES[118] = "BMM";
		DEFAULT_LEGAL_VALUES[119] = "BOI";
		DEFAULT_LEGAL_VALUES[120] = "CBG";
		DEFAULT_LEGAL_VALUES[121] = "CDN";
		DEFAULT_LEGAL_VALUES[122] = "CIR";
		DEFAULT_LEGAL_VALUES[123] = "CIT";
		DEFAULT_LEGAL_VALUES[124] = "CMN";
		DEFAULT_LEGAL_VALUES[125] = "CMP";
		DEFAULT_LEGAL_VALUES[126] = "CMT";
		DEFAULT_LEGAL_VALUES[127] = "CNO";
		DEFAULT_LEGAL_VALUES[128] = "COL";
		DEFAULT_LEGAL_VALUES[129] = "COT";
		DEFAULT_LEGAL_VALUES[130] = "CPA";
		DEFAULT_LEGAL_VALUES[131] = "CPT";
		DEFAULT_LEGAL_VALUES[132] = "CRN";
		DEFAULT_LEGAL_VALUES[133] = "CRS";
		DEFAULT_LEGAL_VALUES[134] = "CSC";
		DEFAULT_LEGAL_VALUES[135] = "CSG";
		DEFAULT_LEGAL_VALUES[136] = "CST";
		DEFAULT_LEGAL_VALUES[137] = "CTS";
		DEFAULT_LEGAL_VALUES[138] = "CYC";
		DEFAULT_LEGAL_VALUES[139] = "DHH";
		DEFAULT_LEGAL_VALUES[140] = "DIS";
		DEFAULT_LEGAL_VALUES[141] = "DNR";
		DEFAULT_LEGAL_VALUES[142] = "DNS";
		DEFAULT_LEGAL_VALUES[143] = "DOA";
		DEFAULT_LEGAL_VALUES[144] = "DOC";
		DEFAULT_LEGAL_VALUES[145] = "DOE";
		DEFAULT_LEGAL_VALUES[146] = "DOI";
		DEFAULT_LEGAL_VALUES[147] = "DOJ";
		DEFAULT_LEGAL_VALUES[148] = "DOL";
		DEFAULT_LEGAL_VALUES[149] = "DON";
		DEFAULT_LEGAL_VALUES[150] = "DOS";
		DEFAULT_LEGAL_VALUES[151] = "DOT";
		DEFAULT_LEGAL_VALUES[152] = "DRN";
		DEFAULT_LEGAL_VALUES[153] = "DSC";
		DEFAULT_LEGAL_VALUES[154] = "DSI";
		DEFAULT_LEGAL_VALUES[155] = "DST";
		DEFAULT_LEGAL_VALUES[156] = "DTS";
		DEFAULT_LEGAL_VALUES[157] = "DUN";
		DEFAULT_LEGAL_VALUES[158] = "EDA";
		DEFAULT_LEGAL_VALUES[159] = "EMM";
		DEFAULT_LEGAL_VALUES[160] = "END";
		DEFAULT_LEGAL_VALUES[161] = "EPA";
		DEFAULT_LEGAL_VALUES[162] = "EPB";
		DEFAULT_LEGAL_VALUES[163] = "ESN";
		DEFAULT_LEGAL_VALUES[164] = "FCN";
		DEFAULT_LEGAL_VALUES[165] = "FLZ";
		DEFAULT_LEGAL_VALUES[166] = "FMP";
		DEFAULT_LEGAL_VALUES[167] = "FND";
		DEFAULT_LEGAL_VALUES[168] = "FSN";
		DEFAULT_LEGAL_VALUES[169] = "FTN";
		DEFAULT_LEGAL_VALUES[170] = "FWC";
		DEFAULT_LEGAL_VALUES[171] = "GWS";
		DEFAULT_LEGAL_VALUES[172] = "HHT";
		DEFAULT_LEGAL_VALUES[173] = "HMB";
		DEFAULT_LEGAL_VALUES[174] = "HPI";
		DEFAULT_LEGAL_VALUES[175] = "HUD";
		DEFAULT_LEGAL_VALUES[176] = "ICD";
		DEFAULT_LEGAL_VALUES[177] = "IFT";
		DEFAULT_LEGAL_VALUES[178] = "IID";
		DEFAULT_LEGAL_VALUES[179] = "IMP";
		DEFAULT_LEGAL_VALUES[180] = "IMS";
		DEFAULT_LEGAL_VALUES[181] = "IND";
		DEFAULT_LEGAL_VALUES[182] = "IRN";
		DEFAULT_LEGAL_VALUES[183] = "IRP";
		DEFAULT_LEGAL_VALUES[184] = "ISC";
		DEFAULT_LEGAL_VALUES[185] = "ISN";
		DEFAULT_LEGAL_VALUES[186] = "ISS";
		DEFAULT_LEGAL_VALUES[187] = "LEN";
		DEFAULT_LEGAL_VALUES[188] = "LIC";
		DEFAULT_LEGAL_VALUES[189] = "LOI";
		DEFAULT_LEGAL_VALUES[190] = "LSD";
		DEFAULT_LEGAL_VALUES[191] = "LVO";
		DEFAULT_LEGAL_VALUES[192] = "MBX";
		DEFAULT_LEGAL_VALUES[193] = "MCI";
		DEFAULT_LEGAL_VALUES[194] = "MDN";
		DEFAULT_LEGAL_VALUES[195] = "MSL";
		DEFAULT_LEGAL_VALUES[196] = "MZO";
		DEFAULT_LEGAL_VALUES[197] = "NAS";
		DEFAULT_LEGAL_VALUES[198] = "NDA";
		DEFAULT_LEGAL_VALUES[199] = "NDB";
		DEFAULT_LEGAL_VALUES[200] = "NFC";
		DEFAULT_LEGAL_VALUES[201] = "NFD";
		DEFAULT_LEGAL_VALUES[202] = "NFM";
		DEFAULT_LEGAL_VALUES[203] = "NFN";
		DEFAULT_LEGAL_VALUES[204] = "NFS";
		DEFAULT_LEGAL_VALUES[205] = "PAC";
		DEFAULT_LEGAL_VALUES[206] = "PAN";
		DEFAULT_LEGAL_VALUES[207] = "PAP";
		DEFAULT_LEGAL_VALUES[208] = "PCC";
		DEFAULT_LEGAL_VALUES[209] = "PCN";
		DEFAULT_LEGAL_VALUES[210] = "PDL";
		DEFAULT_LEGAL_VALUES[211] = "PGC";
		DEFAULT_LEGAL_VALUES[212] = "PGN";
		DEFAULT_LEGAL_VALUES[213] = "PGS";
		DEFAULT_LEGAL_VALUES[214] = "PHC";
		DEFAULT_LEGAL_VALUES[215] = "PID";
		DEFAULT_LEGAL_VALUES[216] = "PIN";
		DEFAULT_LEGAL_VALUES[217] = "PLA";
		DEFAULT_LEGAL_VALUES[218] = "PLN";
		DEFAULT_LEGAL_VALUES[219] = "PMN";
		DEFAULT_LEGAL_VALUES[220] = "PNN";
		DEFAULT_LEGAL_VALUES[221] = "POL";
		DEFAULT_LEGAL_VALUES[222] = "PRS";
		DEFAULT_LEGAL_VALUES[223] = "PRT";
		DEFAULT_LEGAL_VALUES[224] = "PSI";
		DEFAULT_LEGAL_VALUES[225] = new String[] { "PSL", "PSN" };
		DEFAULT_LEGAL_VALUES[226] = "PTC";
		DEFAULT_LEGAL_VALUES[227] = "PWC";
		DEFAULT_LEGAL_VALUES[228] = "PWS";
		DEFAULT_LEGAL_VALUES[229] = "RAA";
		DEFAULT_LEGAL_VALUES[230] = "RAN";
		DEFAULT_LEGAL_VALUES[231] = "REC";
		DEFAULT_LEGAL_VALUES[232] = "RGI";
		DEFAULT_LEGAL_VALUES[233] = "RIG";
		DEFAULT_LEGAL_VALUES[234] = "RPP";
		DEFAULT_LEGAL_VALUES[235] = "RPT";
		DEFAULT_LEGAL_VALUES[236] = "RRS";
		DEFAULT_LEGAL_VALUES[237] = "RSN";
		DEFAULT_LEGAL_VALUES[238] = "SBN";
		DEFAULT_LEGAL_VALUES[239] = "SCA";
		DEFAULT_LEGAL_VALUES[240] = "SEK";
		DEFAULT_LEGAL_VALUES[241] = "SES";
		DEFAULT_LEGAL_VALUES[242] = "SHL";
		DEFAULT_LEGAL_VALUES[243] = "SNH";
		DEFAULT_LEGAL_VALUES[244] = "SNV";
		DEFAULT_LEGAL_VALUES[245] = "SPL";
		DEFAULT_LEGAL_VALUES[246] = "SPN";
		DEFAULT_LEGAL_VALUES[247] = "STB";
		DEFAULT_LEGAL_VALUES[248] = "STR";
		DEFAULT_LEGAL_VALUES[249] = "SUB";
		DEFAULT_LEGAL_VALUES[250] = "SUO";
		DEFAULT_LEGAL_VALUES[251] = "TDT";
		DEFAULT_LEGAL_VALUES[252] = "TIP";
		DEFAULT_LEGAL_VALUES[253] = "TOC";
		DEFAULT_LEGAL_VALUES[254] = "TPN";
		DEFAULT_LEGAL_VALUES[255] = "TSN";
		DEFAULT_LEGAL_VALUES[256] = "URL";
		DEFAULT_LEGAL_VALUES[257] = "WCS";
		DEFAULT_LEGAL_VALUES[258] = "WDR";
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

		currentValues = new Object[19];
		currentValues[0] = "18";
		currentValues[1] = "1L";
		currentValues[2] = "1W";
		currentValues[3] = "49";
		currentValues[4] = "6P";
		currentValues[5] = "EA";
		currentValues[6] = "EJ";
		currentValues[7] = "F6";
		currentValues[8] = "GH";
		currentValues[9] = "HJ";
		currentValues[10] = "IF";
		currentValues[11] = "IG";
		currentValues[12] = "M7";
		currentValues[13] = "N6";
		currentValues[14] = "NQ";
		currentValues[15] = "Q4";
		currentValues[16] = "SY";
		currentValues[17] = "A6";
		currentValues[18] = "CT";
		valueOverrides.put("41-1", currentValues);

		currentValues = new Object[20];
		currentValues[0] = "18";
		currentValues[1] = "1L";
		currentValues[2] = "1W";
		currentValues[3] = "3H";
		currentValues[4] = "49";
		currentValues[5] = "6P";
		currentValues[6] = "A6";
		currentValues[7] = "EA";
		currentValues[8] = "EJ";
		currentValues[9] = "F6";
		currentValues[10] = "GH";
		currentValues[11] = "HJ";
		currentValues[12] = "IF";
		currentValues[13] = "IG";
		currentValues[14] = "ML";
		currentValues[15] = "N6";
		currentValues[16] = "NQ";
		currentValues[17] = "Q4";
		currentValues[18] = "SY";
		currentValues[19] = "CT";
		valueOverrides.put("16-1", currentValues);

		currentValues = new Object[12];
		currentValues[0] = "18";
		currentValues[1] = "1L";
		currentValues[2] = "1W";
		currentValues[3] = "49";
		currentValues[4] = "6P";
		currentValues[5] = "9F";
		currentValues[6] = "A6";
		currentValues[7] = "F6";
		currentValues[8] = "G1";
		currentValues[9] = "IG";
		currentValues[10] = "N6";
		currentValues[11] = "NQ";
		valueOverrides.put("51-1", currentValues);

		currentValues = new Object[7];
		currentValues[0] = "9K";
		currentValues[1] = "D3";
		currentValues[2] = "EI";
		currentValues[3] = "SY";
		currentValues[4] = "TJ";
		currentValues[5] = "ZZ";
		currentValues[6] = "HPI";
		valueOverrides.put("61-2", currentValues);

		currentValues = new Object[7];
		currentValues[0] = "9K";
		currentValues[1] = "D3";
		currentValues[2] = "EI";
		currentValues[3] = "SY";
		currentValues[4] = "TJ";
		currentValues[5] = "ZZ";
		currentValues[6] = "HPI";
		valueOverrides.put("36-2", currentValues);

		currentValues = new Object[12];
		currentValues[0] = "18";
		currentValues[1] = "1L";
		currentValues[2] = "1W";
		currentValues[3] = "49";
		currentValues[4] = "6P";
		currentValues[5] = "9F";
		currentValues[6] = "A6";
		currentValues[7] = "F6";
		currentValues[8] = "G1";
		currentValues[9] = "IG";
		currentValues[10] = "N6";
		currentValues[11] = "NQ";
		valueOverrides.put("26-1", currentValues);

		currentValues = new Object[2];
		currentValues[0] = "18";
		currentValues[1] = "55";
		valueOverrides.put("6-1", currentValues);

		currentValues = new Object[15];
		currentValues[0] = "0B";
		currentValues[1] = "1C";
		currentValues[2] = "1D";
		currentValues[3] = "1J";
		currentValues[4] = "4A";
		currentValues[5] = "CT";
		currentValues[6] = "EL";
		currentValues[7] = "EO";
		currentValues[8] = "JD";
		currentValues[9] = "N5";
		currentValues[10] = "N7";
		currentValues[11] = "Q4";
		currentValues[12] = "SY";
		currentValues[13] = "TJ";
		currentValues[14] = "HPI";
		valueOverrides.put("11-1", currentValues);
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
