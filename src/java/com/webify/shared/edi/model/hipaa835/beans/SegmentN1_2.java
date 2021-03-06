package com.webify.shared.edi.model.hipaa835.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentN1_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentN1_2.class);

	public static final String SEGMENT_NAME = "N1";
	public static final int FIELD_COUNT = 4;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String N101;
	public String getN101() { return N101; }
	public void setN101(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'N101' may not be null");
		}
		if (Field98.validateValue(val)) {
			N101 = val;
		} else {
			throw new IllegalArgumentException("Field 'N101' cannot have value: " + val);
		}
	}

	private String N102;
	public String getN102() { return N102; }
	public void setN102(String val) { N102 = val; }

	private String N103;
	public String getN103() { return N103; }
	public void setN103(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'N103' may not be null");
		}
		if (Field66.validateValue(val)) {
			N103 = val;
		} else {
			throw new IllegalArgumentException("Field 'N103' cannot have value: " + val);
		}
	}

	private String N104;
	public String getN104() { return N104; }
	public void setN104(String val) { N104 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment N1 on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		N101 = eis.getStringValue(fields, 1, 2, 3, true);
		Field98.validateInputValue(eis, "N101", N101, ordinal, 1);
		if (N101 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'N101' missing");
		}
		N102 = eis.getStringValue(fields, 2, 1, 60, false);
		N103 = eis.getStringValue(fields, 3, 1, 2, true);
		Field66.validateInputValue(eis, "N103", N103, ordinal, 3);
		if (N103 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'N103' missing");
		}
		N104 = eis.getStringValue(fields, 4, 2, 80, true);
		if (N104 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'N104' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (N103 != null) setCount++;
			if (N104 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: N103, N104");
			}
		}

		// REQUIRE_ONE_OF
		if (N102 == null && N103 == null) {
			eis.addError("Segment 'N1' requires at least one field of the following to be set: N102, N103");
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("N1");
		if (N101 == null) {
			eos.addError("Emitting null mandatory field 'N101'");
		}

		eos.writeField(N101);
		eos.writeField(N102);
		if (N103 == null) {
			eos.addError("Emitting null mandatory field 'N103'");
		}

		eos.writeField(N103);
		if (N104 == null) {
			eos.addError("Emitting null mandatory field 'N104'");
		}

		eos.writeField(N104);
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentN1_2 copy = new SegmentN1_2();
		copy.setLineNumber(this.lineNumber);
		copy.N101 = this.N101;
		copy.N102 = this.N102;
		copy.N103 = this.N103;
		copy.N104 = this.N104;
		return copy;
	}
}
