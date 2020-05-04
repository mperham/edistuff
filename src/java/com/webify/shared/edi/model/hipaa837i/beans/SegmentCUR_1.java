package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentCUR_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentCUR_1.class);

	public static final String SEGMENT_NAME = "CUR";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Cur01;
	public String getCur01() { return Cur01; }
	public void setCur01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'CUR01' may not be null");
		}
		if (Field98.validateValue(val)) {
			Cur01 = val;
		} else {
			throw new IllegalArgumentException("Field 'CUR01' cannot have value: " + val);
		}
	}

	private String Cur02;
	public String getCur02() { return Cur02; }
	public void setCur02(String val) { Cur02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment CUR on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Cur01 = eis.getStringValue(fields, 1, 2, 3, true);
		Field98.validateInputValue(eis, "CUR01", Cur01, ordinal, 1);
		if (Cur01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'CUR01' missing");
		}
		Cur02 = eis.getStringValue(fields, 2, 3, 3, true);
		if (Cur02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'CUR02' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("CUR");
		if (Cur01 == null) {
			eos.addError("Emitting null mandatory field 'CUR01'");
		}

		eos.writeField(Cur01);
		if (Cur02 == null) {
			eos.addError("Emitting null mandatory field 'CUR02'");
		}

		eos.writeField(Cur02);
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
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentCUR_1 copy = new SegmentCUR_1();
		copy.setLineNumber(this.lineNumber);
		copy.Cur01 = this.Cur01;
		copy.Cur02 = this.Cur02;
		return copy;
	}
}
