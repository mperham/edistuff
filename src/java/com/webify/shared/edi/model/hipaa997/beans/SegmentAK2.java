package com.webify.shared.edi.model.hipaa997.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentAK2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentAK2.class);

	public static final String SEGMENT_NAME = "AK2";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Ak201;
	public String getAk201() { return Ak201; }
	public void setAk201(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'AK201' may not be null");
		}
		if (Field143.validateValue(val)) {
			Ak201 = val;
		} else {
			throw new IllegalArgumentException("Field 'AK201' cannot have value: " + val);
		}
	}

	private String Ak202;
	public String getAk202() { return Ak202; }
	public void setAk202(String val) { Ak202 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment AK2 on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Ak201 = eis.getStringValue(fields, 1, 3, 3, true);
		Field143.validateInputValue(eis, "AK201", Ak201, ordinal, 1);
		if (Ak201 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'AK201' missing");
		}
		Ak202 = eis.getStringValue(fields, 2, 4, 9, true);
		if (Ak202 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'AK202' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("AK2");
		if (Ak201 == null) {
			eos.addError("Emitting null mandatory field 'AK201'");
		}

		eos.writeField(Ak201);
		if (Ak202 == null) {
			eos.addError("Emitting null mandatory field 'AK202'");
		}

		eos.writeField(Ak202);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentAK2 copy = new SegmentAK2();
		copy.setLineNumber(this.lineNumber);
		copy.Ak201 = this.Ak201;
		copy.Ak202 = this.Ak202;
		return copy;
	}
}
