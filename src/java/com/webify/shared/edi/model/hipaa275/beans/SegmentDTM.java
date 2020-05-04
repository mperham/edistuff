package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentDTM implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentDTM.class);

	public static final String SEGMENT_NAME = "DTM";
	public static final int FIELD_COUNT = 6;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Dtm01;
	public String getDtm01() { return Dtm01; }
	public void setDtm01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'DTM01' may not be null");
		}
		if (Field374.validateValue(val)) {
			Dtm01 = val;
		} else {
			throw new IllegalArgumentException("Field 'DTM01' cannot have value: " + val);
		}
	}

	private Date Dtm02;
	public Date getDtm02() { return Dtm02; }
	public void setDtm02(Date val) { Dtm02 = val; }

	private String Dtm03;
	public String getDtm03() { return Dtm03; }
	public void setDtm03(String val) { Dtm03 = val; }

	private String Dtm04;
	public String getDtm04() { return Dtm04; }
	public void setDtm04(String val) {
		if (Field623.validateValue(val)) {
			Dtm04 = val;
		} else {
			throw new IllegalArgumentException("Field 'DTM04' cannot have value: " + val);
		}
	}

	private String Dtm05;
	public String getDtm05() { return Dtm05; }
	public void setDtm05(String val) {
		if (Field1250.validateValue(val)) {
			Dtm05 = val;
		} else {
			throw new IllegalArgumentException("Field 'DTM05' cannot have value: " + val);
		}
	}

	private String Dtm06;
	public String getDtm06() { return Dtm06; }
	public void setDtm06(String val) { Dtm06 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment DTM on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Dtm01 = eis.getStringValue(fields, 1, 3, 3, true);
		Field374.validateInputValue(eis, "DTM01", Dtm01, ordinal, 1);
		if (Dtm01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'DTM01' missing");
		}
		Dtm02 = eis.getDateValue(fields, 2, false);
		Dtm03 = eis.getStringValue(fields, 3, 4, 8, false);
		Dtm04 = eis.getStringValue(fields, 4, 2, 2, false);
		Field623.validateInputValue(eis, "DTM04", Dtm04, ordinal, 4);
		Dtm05 = eis.getStringValue(fields, 5, 2, 3, false);
		Field1250.validateInputValue(eis, "DTM05", Dtm05, ordinal, 5);
		Dtm06 = eis.getStringValue(fields, 6, 1, 35, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// REQUIRE_ONE_OF
		if (Dtm02 == null && Dtm03 == null && Dtm05 == null) {
			eis.addError("Segment 'Dtm' requires at least one field of the following to be set: Dtm02, Dtm03, Dtm05");
		}

		// CONDITIONAL
		if (Dtm04 != null) {
			if (Dtm03 == null) {
				eis.addError("If 'Dtm04' is set, the following must be set also: Dtm03");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Dtm05 != null) setCount++;
			if (Dtm06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Dtm05, Dtm06");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("DTM");
		if (Dtm01 == null) {
			eos.addError("Emitting null mandatory field 'DTM01'");
		}

		eos.writeField(Dtm01);
		eos.writeField(Dtm02);
		eos.writeField(Dtm03);
		eos.writeField(Dtm04);
		eos.writeField(Dtm05);
		eos.writeField(Dtm06);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentDTM copy = new SegmentDTM();
		copy.setLineNumber(this.lineNumber);
		copy.Dtm01 = this.Dtm01;
		copy.Dtm02 = this.Dtm02;
		copy.Dtm03 = this.Dtm03;
		copy.Dtm04 = this.Dtm04;
		copy.Dtm05 = this.Dtm05;
		copy.Dtm06 = this.Dtm06;
		return copy;
	}
}