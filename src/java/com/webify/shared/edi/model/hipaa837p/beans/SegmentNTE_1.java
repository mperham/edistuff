package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentNTE_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentNTE_1.class);

	public static final String SEGMENT_NAME = "NTE";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Nte01;
	public String getNte01() { return Nte01; }
	public void setNte01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'NTE01' may not be null");
		}
		if (Field363.validateValue(val)) {
			Nte01 = val;
		} else {
			throw new IllegalArgumentException("Field 'NTE01' cannot have value: " + val);
		}
	}

	private String Nte02;
	public String getNte02() { return Nte02; }
	public void setNte02(String val) { Nte02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment NTE on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Nte01 = eis.getStringValue(fields, 1, 3, 3, true);
		Field363.validateInputValue(eis, "NTE01", Nte01, ordinal, 1);
		if (Nte01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'NTE01' missing");
		}
		Nte02 = eis.getStringValue(fields, 2, 1, 80, true);
		if (Nte02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'NTE02' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("NTE");
		if (Nte01 == null) {
			eos.addError("Emitting null mandatory field 'NTE01'");
		}

		eos.writeField(Nte01);
		if (Nte02 == null) {
			eos.addError("Emitting null mandatory field 'NTE02'");
		}

		eos.writeField(Nte02);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentNTE_1 copy = new SegmentNTE_1();
		copy.setLineNumber(this.lineNumber);
		copy.Nte01 = this.Nte01;
		copy.Nte02 = this.Nte02;
		return copy;
	}
}
