package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentLIN_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentLIN_2.class);

	public static final String SEGMENT_NAME = "LIN";
	public static final int FIELD_COUNT = 3;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Lin02;
	public String getLin02() { return Lin02; }
	public void setLin02(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'LIN02' may not be null");
		}
		if (Field235.validateValue(val)) {
			Lin02 = val;
		} else {
			throw new IllegalArgumentException("Field 'LIN02' cannot have value: " + val);
		}
	}

	private String Lin03;
	public String getLin03() { return Lin03; }
	public void setLin03(String val) { Lin03 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment LIN on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Lin02 = eis.getStringValue(fields, 2, 2, 2, true);
		Field235.validateInputValue(eis, "LIN02", Lin02, ordinal, 2);
		if (Lin02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'LIN02' missing");
		}
		Lin03 = eis.getStringValue(fields, 3, 1, 48, true);
		if (Lin03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'LIN03' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("LIN");
		eos.writeNullField();
		if (Lin02 == null) {
			eos.addError("Emitting null mandatory field 'LIN02'");
		}

		eos.writeField(Lin02);
		if (Lin03 == null) {
			eos.addError("Emitting null mandatory field 'LIN03'");
		}

		eos.writeField(Lin03);
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
		SegmentLIN_2 copy = new SegmentLIN_2();
		copy.setLineNumber(this.lineNumber);
		copy.Lin02 = this.Lin02;
		copy.Lin03 = this.Lin03;
		return copy;
	}
}
