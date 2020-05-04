package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentHL_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentHL_1.class);

	public static final String SEGMENT_NAME = "HL";
	public static final int FIELD_COUNT = 4;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Hl01;
	public String getHl01() { return Hl01; }
	public void setHl01(String val) { Hl01 = val; }

	private String Hl03;
	public String getHl03() { return Hl03; }
	public void setHl03(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'HL03' may not be null");
		}
		if (Field735.validateValue(val)) {
			Hl03 = val;
		} else {
			throw new IllegalArgumentException("Field 'HL03' cannot have value: " + val);
		}
	}

	private String Hl04;
	public String getHl04() { return Hl04; }
	public void setHl04(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'HL04' may not be null");
		}
		if (Field736.validateValue(val)) {
			Hl04 = val;
		} else {
			throw new IllegalArgumentException("Field 'HL04' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment HL on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Hl01 = eis.getStringValue(fields, 1, 1, 12, true);
		if (Hl01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'HL01' missing");
		}
		Hl03 = eis.getStringValue(fields, 3, 1, 2, true);
		Field735.validateInputValue(eis, "HL03", Hl03, ordinal, 3);
		if (Hl03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'HL03' missing");
		}
		Hl04 = eis.getStringValue(fields, 4, 1, 1, true);
		Field736.validateInputValue(eis, "HL04", Hl04, ordinal, 4);
		if (Hl04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'HL04' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("HL");
		if (Hl01 == null) {
			eos.addError("Emitting null mandatory field 'HL01'");
		}

		eos.writeField(Hl01);
		eos.writeNullField();
		if (Hl03 == null) {
			eos.addError("Emitting null mandatory field 'HL03'");
		}

		eos.writeField(Hl03);
		if (Hl04 == null) {
			eos.addError("Emitting null mandatory field 'HL04'");
		}

		eos.writeField(Hl04);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentHL_1 copy = new SegmentHL_1();
		copy.setLineNumber(this.lineNumber);
		copy.Hl01 = this.Hl01;
		copy.Hl03 = this.Hl03;
		copy.Hl04 = this.Hl04;
		return copy;
	}
}
