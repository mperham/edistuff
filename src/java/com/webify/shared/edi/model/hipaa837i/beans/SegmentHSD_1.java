package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentHSD_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentHSD_1.class);

	public static final String SEGMENT_NAME = "HSD";
	public static final int FIELD_COUNT = 8;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Hsd01;
	public String getHsd01() { return Hsd01; }
	public void setHsd01(String val) {
		if (Field673.validateValue(val)) {
			Hsd01 = val;
		} else {
			throw new IllegalArgumentException("Field 'HSD01' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Hsd02;
	public java.math.BigDecimal getHsd02() { return Hsd02; }
	public void setHsd02(java.math.BigDecimal val) { Hsd02 = val; }

	private String Hsd03;
	public String getHsd03() { return Hsd03; }
	public void setHsd03(String val) {
		if (Field355.validateValue(val)) {
			Hsd03 = val;
		} else {
			throw new IllegalArgumentException("Field 'HSD03' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Hsd04;
	public java.math.BigDecimal getHsd04() { return Hsd04; }
	public void setHsd04(java.math.BigDecimal val) { Hsd04 = val; }

	private String Hsd05;
	public String getHsd05() { return Hsd05; }
	public void setHsd05(String val) {
		if (Field615.validateValue(val)) {
			Hsd05 = val;
		} else {
			throw new IllegalArgumentException("Field 'HSD05' cannot have value: " + val);
		}
	}

	private Integer Hsd06;
	public Integer getHsd06() { return Hsd06; }
	public void setHsd06(Integer val) { Hsd06 = val; }

	private String Hsd07;
	public String getHsd07() { return Hsd07; }
	public void setHsd07(String val) {
		if (Field678.validateValue(val)) {
			Hsd07 = val;
		} else {
			throw new IllegalArgumentException("Field 'HSD07' cannot have value: " + val);
		}
	}

	private String Hsd08;
	public String getHsd08() { return Hsd08; }
	public void setHsd08(String val) {
		if (Field679.validateValue(val)) {
			Hsd08 = val;
		} else {
			throw new IllegalArgumentException("Field 'HSD08' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment HSD on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Hsd01 = eis.getStringValue(fields, 1, 2, 2, false);
		Field673.validateInputValue(eis, "HSD01", Hsd01, ordinal, 1);
		Hsd02 = eis.getDecimalValue(fields, 2, false);
		Hsd03 = eis.getStringValue(fields, 3, 2, 2, false);
		Field355.validateInputValue(eis, "HSD03", Hsd03, ordinal, 3);
		Hsd04 = eis.getDecimalValue(fields, 4, false);
		Hsd05 = eis.getStringValue(fields, 5, 1, 2, false);
		Field615.validateInputValue(eis, "HSD05", Hsd05, ordinal, 5);
		Hsd06 = eis.getIntegerValue(fields, 6, false);
		Hsd07 = eis.getStringValue(fields, 7, 1, 2, false);
		Field678.validateInputValue(eis, "HSD07", Hsd07, ordinal, 7);
		Hsd08 = eis.getStringValue(fields, 8, 1, 1, false);
		Field679.validateInputValue(eis, "HSD08", Hsd08, ordinal, 8);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// CONDITIONAL
		if (Hsd06 != null) {
			if (Hsd05 == null) {
				eis.addError("If 'Hsd06' is set, the following must be set also: Hsd05");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Hsd01 != null) setCount++;
			if (Hsd02 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Hsd01, Hsd02");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("HSD");
		eos.writeField(Hsd01);
		eos.writeField(Hsd02);
		eos.writeField(Hsd03);
		eos.writeField(Hsd04);
		eos.writeField(Hsd05);
		eos.writeField(Hsd06);
		eos.writeField(Hsd07);
		eos.writeField(Hsd08);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentHSD_1 copy = new SegmentHSD_1();
		copy.setLineNumber(this.lineNumber);
		copy.Hsd01 = this.Hsd01;
		copy.Hsd02 = this.Hsd02;
		copy.Hsd03 = this.Hsd03;
		copy.Hsd04 = this.Hsd04;
		copy.Hsd05 = this.Hsd05;
		copy.Hsd06 = this.Hsd06;
		copy.Hsd07 = this.Hsd07;
		copy.Hsd08 = this.Hsd08;
		return copy;
	}
}
