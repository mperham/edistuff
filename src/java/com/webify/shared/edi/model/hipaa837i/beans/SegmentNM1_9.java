package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentNM1_9 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentNM1_9.class);

	public static final String SEGMENT_NAME = "NM1";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Nm101;
	public String getNm101() { return Nm101; }
	public void setNm101(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'NM101' may not be null");
		}
		if (Field98.validateValue(val)) {
			Nm101 = val;
		} else {
			throw new IllegalArgumentException("Field 'NM101' cannot have value: " + val);
		}
	}

	private String Nm102;
	public String getNm102() { return Nm102; }
	public void setNm102(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'NM102' may not be null");
		}
		if (Field1065.validateValue(val)) {
			Nm102 = val;
		} else {
			throw new IllegalArgumentException("Field 'NM102' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment NM1 on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Nm101 = eis.getStringValue(fields, 1, 2, 3, true);
		Field98.validateInputValue(eis, "NM101", Nm101, ordinal, 1);
		if (Nm101 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'NM101' missing");
		}
		Nm102 = eis.getStringValue(fields, 2, 1, 1, true);
		Field1065.validateInputValue(eis, "NM102", Nm102, ordinal, 2);
		if (Nm102 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'NM102' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("NM1");
		if (Nm101 == null) {
			eos.addError("Emitting null mandatory field 'NM101'");
		}

		eos.writeField(Nm101);
		if (Nm102 == null) {
			eos.addError("Emitting null mandatory field 'NM102'");
		}

		eos.writeField(Nm102);
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
		SegmentNM1_9 copy = new SegmentNM1_9();
		copy.setLineNumber(this.lineNumber);
		copy.Nm101 = this.Nm101;
		copy.Nm102 = this.Nm102;
		return copy;
	}
}
