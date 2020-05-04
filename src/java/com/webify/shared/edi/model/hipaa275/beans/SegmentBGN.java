package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentBGN implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentBGN.class);

	public static final String SEGMENT_NAME = "BGN";
	public static final int FIELD_COUNT = 9;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Bgn01;
	public String getBgn01() { return Bgn01; }
	public void setBgn01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'BGN01' may not be null");
		}
		if (Field353.validateValue(val)) {
			Bgn01 = val;
		} else {
			throw new IllegalArgumentException("Field 'BGN01' cannot have value: " + val);
		}
	}

	private String Bgn02;
	public String getBgn02() { return Bgn02; }
	public void setBgn02(String val) { Bgn02 = val; }

	private Date Bgn03;
	public Date getBgn03() { return Bgn03; }
	public void setBgn03(Date val) { Bgn03 = val; }

	private String Bgn04;
	public String getBgn04() { return Bgn04; }
	public void setBgn04(String val) { Bgn04 = val; }

	private String Bgn05;
	public String getBgn05() { return Bgn05; }
	public void setBgn05(String val) {
		if (Field623.validateValue(val)) {
			Bgn05 = val;
		} else {
			throw new IllegalArgumentException("Field 'BGN05' cannot have value: " + val);
		}
	}

	private String Bgn06;
	public String getBgn06() { return Bgn06; }
	public void setBgn06(String val) { Bgn06 = val; }

	private String Bgn07;
	public String getBgn07() { return Bgn07; }
	public void setBgn07(String val) {
		if (Field640.validateValue(val)) {
			Bgn07 = val;
		} else {
			throw new IllegalArgumentException("Field 'BGN07' cannot have value: " + val);
		}
	}

	private String Bgn08;
	public String getBgn08() { return Bgn08; }
	public void setBgn08(String val) {
		if (Field306.validateValue(val)) {
			Bgn08 = val;
		} else {
			throw new IllegalArgumentException("Field 'BGN08' cannot have value: " + val);
		}
	}

	private String Bgn09;
	public String getBgn09() { return Bgn09; }
	public void setBgn09(String val) {
		if (Field786.validateValue(val)) {
			Bgn09 = val;
		} else {
			throw new IllegalArgumentException("Field 'BGN09' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment BGN on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Bgn01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field353.validateInputValue(eis, "BGN01", Bgn01, ordinal, 1);
		if (Bgn01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'BGN01' missing");
		}
		Bgn02 = eis.getStringValue(fields, 2, 1, 50, true);
		if (Bgn02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'BGN02' missing");
		}
		Bgn03 = eis.getDateValue(fields, 3, true);
		if (Bgn03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'BGN03' missing");
		}
		Bgn04 = eis.getStringValue(fields, 4, 4, 8, false);
		Bgn05 = eis.getStringValue(fields, 5, 2, 2, false);
		Field623.validateInputValue(eis, "BGN05", Bgn05, ordinal, 5);
		Bgn06 = eis.getStringValue(fields, 6, 1, 50, false);
		Bgn07 = eis.getStringValue(fields, 7, 2, 2, false);
		Field640.validateInputValue(eis, "BGN07", Bgn07, ordinal, 7);
		Bgn08 = eis.getStringValue(fields, 8, 1, 2, false);
		Field306.validateInputValue(eis, "BGN08", Bgn08, ordinal, 8);
		Bgn09 = eis.getStringValue(fields, 9, 2, 2, false);
		Field786.validateInputValue(eis, "BGN09", Bgn09, ordinal, 9);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// CONDITIONAL
		if (Bgn05 != null) {
			if (Bgn04 == null) {
				eis.addError("If 'Bgn05' is set, the following must be set also: Bgn04");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("BGN");
		if (Bgn01 == null) {
			eos.addError("Emitting null mandatory field 'BGN01'");
		}

		eos.writeField(Bgn01);
		if (Bgn02 == null) {
			eos.addError("Emitting null mandatory field 'BGN02'");
		}

		eos.writeField(Bgn02);
		if (Bgn03 == null) {
			eos.addError("Emitting null mandatory field 'BGN03'");
		}

		eos.writeField(Bgn03);
		eos.writeField(Bgn04);
		eos.writeField(Bgn05);
		eos.writeField(Bgn06);
		eos.writeField(Bgn07);
		eos.writeField(Bgn08);
		eos.writeField(Bgn09);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentBGN copy = new SegmentBGN();
		copy.setLineNumber(this.lineNumber);
		copy.Bgn01 = this.Bgn01;
		copy.Bgn02 = this.Bgn02;
		copy.Bgn03 = this.Bgn03;
		copy.Bgn04 = this.Bgn04;
		copy.Bgn05 = this.Bgn05;
		copy.Bgn06 = this.Bgn06;
		copy.Bgn07 = this.Bgn07;
		copy.Bgn08 = this.Bgn08;
		copy.Bgn09 = this.Bgn09;
		return copy;
	}
}
