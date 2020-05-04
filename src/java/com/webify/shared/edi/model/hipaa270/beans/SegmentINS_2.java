package com.webify.shared.edi.model.hipaa270.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentINS_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentINS_2.class);

	public static final String SEGMENT_NAME = "INS";
	public static final int FIELD_COUNT = 17;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Ins01;
	public String getIns01() { return Ins01; }
	public void setIns01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'INS01' may not be null");
		}
		if (Field1073.validateValue(val)) {
			Ins01 = val;
		} else {
			throw new IllegalArgumentException("Field 'INS01' cannot have value: " + val);
		}
	}

	private String Ins02;
	public String getIns02() { return Ins02; }
	public void setIns02(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'INS02' may not be null");
		}
		if (Field1069.validateValue(val)) {
			Ins02 = val;
		} else {
			throw new IllegalArgumentException("Field 'INS02' cannot have value: " + val);
		}
	}

	private Integer Ins17;
	public Integer getIns17() { return Ins17; }
	public void setIns17(Integer val) { Ins17 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment INS on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Ins01 = eis.getStringValue(fields, 1, 1, 1, true);
		Field1073.validateInputValue(eis, "INS01", Ins01, ordinal, 1);
		if (Ins01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'INS01' missing");
		}
		Ins02 = eis.getStringValue(fields, 2, 2, 2, true);
		Field1069.validateInputValue(eis, "INS02", Ins02, ordinal, 2);
		if (Ins02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'INS02' missing");
		}
		Ins17 = eis.getIntegerValue(fields, 17, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("INS");
		if (Ins01 == null) {
			eos.addError("Emitting null mandatory field 'INS01'");
		}

		eos.writeField(Ins01);
		if (Ins02 == null) {
			eos.addError("Emitting null mandatory field 'INS02'");
		}

		eos.writeField(Ins02);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeField(Ins17);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentINS_2 copy = new SegmentINS_2();
		copy.setLineNumber(this.lineNumber);
		copy.Ins01 = this.Ins01;
		copy.Ins02 = this.Ins02;
		copy.Ins17 = this.Ins17;
		return copy;
	}
}