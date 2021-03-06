package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentTRN implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentTRN.class);

	public static final String SEGMENT_NAME = "TRN";
	public static final int FIELD_COUNT = 4;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Trn01;
	public String getTrn01() { return Trn01; }
	public void setTrn01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'TRN01' may not be null");
		}
		if (Field481.validateValue(val)) {
			Trn01 = val;
		} else {
			throw new IllegalArgumentException("Field 'TRN01' cannot have value: " + val);
		}
	}

	private String Trn02;
	public String getTrn02() { return Trn02; }
	public void setTrn02(String val) { Trn02 = val; }

	private String Trn03;
	public String getTrn03() { return Trn03; }
	public void setTrn03(String val) { Trn03 = val; }

	private String Trn04;
	public String getTrn04() { return Trn04; }
	public void setTrn04(String val) { Trn04 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment TRN on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Trn01 = eis.getStringValue(fields, 1, 1, 2, true);
		Field481.validateInputValue(eis, "TRN01", Trn01, ordinal, 1);
		if (Trn01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'TRN01' missing");
		}
		Trn02 = eis.getStringValue(fields, 2, 1, 50, true);
		if (Trn02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'TRN02' missing");
		}
		Trn03 = eis.getStringValue(fields, 3, 10, 10, false);
		Trn04 = eis.getStringValue(fields, 4, 1, 50, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("TRN");
		if (Trn01 == null) {
			eos.addError("Emitting null mandatory field 'TRN01'");
		}

		eos.writeField(Trn01);
		if (Trn02 == null) {
			eos.addError("Emitting null mandatory field 'TRN02'");
		}

		eos.writeField(Trn02);
		eos.writeField(Trn03);
		eos.writeField(Trn04);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentTRN copy = new SegmentTRN();
		copy.setLineNumber(this.lineNumber);
		copy.Trn01 = this.Trn01;
		copy.Trn02 = this.Trn02;
		copy.Trn03 = this.Trn03;
		copy.Trn04 = this.Trn04;
		return copy;
	}
}
