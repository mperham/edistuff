package com.webify.shared.edi.model.hipaa277.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentST_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentST_1.class);

	public static final String SEGMENT_NAME = "ST";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String St01;
	public String getSt01() { return St01; }
	public void setSt01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'ST01' may not be null");
		}
		if (Field143.validateValue(val)) {
			St01 = val;
		} else {
			throw new IllegalArgumentException("Field 'ST01' cannot have value: " + val);
		}
	}

	private String St02;
	public String getSt02() { return St02; }
	public void setSt02(String val) { St02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment ST on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		St01 = eis.getStringValue(fields, 1, 3, 3, true);
		Field143.validateInputValue(eis, "ST01", St01, ordinal, 1);
		if (St01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'ST01' missing");
		}
		St02 = eis.getStringValue(fields, 2, 4, 9, true);
		if (St02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'ST02' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("ST");
		if (St01 == null) {
			eos.addError("Emitting null mandatory field 'ST01'");
		}

		eos.writeField(St01);
		if (St02 == null) {
			eos.addError("Emitting null mandatory field 'ST02'");
		}

		eos.writeField(St02);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentST_1 copy = new SegmentST_1();
		copy.setLineNumber(this.lineNumber);
		copy.St01 = this.St01;
		copy.St02 = this.St02;
		return copy;
	}
}
