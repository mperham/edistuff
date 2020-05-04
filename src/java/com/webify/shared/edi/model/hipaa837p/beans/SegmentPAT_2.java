package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentPAT_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentPAT_2.class);

	public static final String SEGMENT_NAME = "PAT";
	public static final int FIELD_COUNT = 9;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Pat01;
	public String getPat01() { return Pat01; }
	public void setPat01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'PAT01' may not be null");
		}
		if (Field1069.validateValue(val)) {
			Pat01 = val;
		} else {
			throw new IllegalArgumentException("Field 'PAT01' cannot have value: " + val);
		}
	}

	private String Pat05;
	public String getPat05() { return Pat05; }
	public void setPat05(String val) {
		if (Field1250.validateValue(val)) {
			Pat05 = val;
		} else {
			throw new IllegalArgumentException("Field 'PAT05' cannot have value: " + val);
		}
	}

	private String Pat06;
	public String getPat06() { return Pat06; }
	public void setPat06(String val) { Pat06 = val; }

	private String Pat07;
	public String getPat07() { return Pat07; }
	public void setPat07(String val) {
		if (Field355.validateValue(val)) {
			Pat07 = val;
		} else {
			throw new IllegalArgumentException("Field 'PAT07' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Pat08;
	public java.math.BigDecimal getPat08() { return Pat08; }
	public void setPat08(java.math.BigDecimal val) { Pat08 = val; }

	private String Pat09;
	public String getPat09() { return Pat09; }
	public void setPat09(String val) {
		if (Field1073.validateValue(val)) {
			Pat09 = val;
		} else {
			throw new IllegalArgumentException("Field 'PAT09' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment PAT on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Pat01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field1069.validateInputValue(eis, "PAT01", Pat01, ordinal, 1);
		if (Pat01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'PAT01' missing");
		}
		Pat05 = eis.getStringValue(fields, 5, 2, 3, false);
		Field1250.validateInputValue(eis, "PAT05", Pat05, ordinal, 5);
		Pat06 = eis.getStringValue(fields, 6, 1, 35, false);
		Pat07 = eis.getStringValue(fields, 7, 2, 2, false);
		Field355.validateInputValue(eis, "PAT07", Pat07, ordinal, 7);
		Pat08 = eis.getDecimalValue(fields, 8, false);
		Pat09 = eis.getStringValue(fields, 9, 1, 1, false);
		Field1073.validateInputValue(eis, "PAT09", Pat09, ordinal, 9);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Pat05 != null) setCount++;
			if (Pat06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Pat05, Pat06");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Pat07 != null) setCount++;
			if (Pat08 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Pat07, Pat08");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("PAT");
		if (Pat01 == null) {
			eos.addError("Emitting null mandatory field 'PAT01'");
		}

		eos.writeField(Pat01);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeField(Pat05);
		eos.writeField(Pat06);
		eos.writeField(Pat07);
		eos.writeField(Pat08);
		eos.writeField(Pat09);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentPAT_2 copy = new SegmentPAT_2();
		copy.setLineNumber(this.lineNumber);
		copy.Pat01 = this.Pat01;
		copy.Pat05 = this.Pat05;
		copy.Pat06 = this.Pat06;
		copy.Pat07 = this.Pat07;
		copy.Pat08 = this.Pat08;
		copy.Pat09 = this.Pat09;
		return copy;
	}
}
