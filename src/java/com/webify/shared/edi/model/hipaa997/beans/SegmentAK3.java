package com.webify.shared.edi.model.hipaa997.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentAK3 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentAK3.class);

	public static final String SEGMENT_NAME = "AK3";
	public static final int FIELD_COUNT = 4;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Ak301;
	public String getAk301() { return Ak301; }
	public void setAk301(String val) { Ak301 = val; }

	private Integer Ak302;
	public Integer getAk302() { return Ak302; }
	public void setAk302(Integer val) { Ak302 = val; }

	private String Ak303;
	public String getAk303() { return Ak303; }
	public void setAk303(String val) { Ak303 = val; }

	private String Ak304;
	public String getAk304() { return Ak304; }
	public void setAk304(String val) {
		if (Field720.validateValue(val)) {
			Ak304 = val;
		} else {
			throw new IllegalArgumentException("Field 'AK304' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment AK3 on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Ak301 = eis.getStringValue(fields, 1, 2, 3, true);
		if (Ak301 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'AK301' missing");
		}
		Ak302 = eis.getIntegerValue(fields, 2, true);
		if (Ak302 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'AK302' missing");
		}
		Ak303 = eis.getStringValue(fields, 3, 1, 6, false);
		Ak304 = eis.getStringValue(fields, 4, 1, 3, false);
		Field720.validateInputValue(eis, "AK304", Ak304, ordinal, 4);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("AK3");
		if (Ak301 == null) {
			eos.addError("Emitting null mandatory field 'AK301'");
		}

		eos.writeField(Ak301);
		if (Ak302 == null) {
			eos.addError("Emitting null mandatory field 'AK302'");
		}

		eos.writeField(Ak302);
		eos.writeField(Ak303);
		eos.writeField(Ak304);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentAK3 copy = new SegmentAK3();
		copy.setLineNumber(this.lineNumber);
		copy.Ak301 = this.Ak301;
		copy.Ak302 = this.Ak302;
		copy.Ak303 = this.Ak303;
		copy.Ak304 = this.Ak304;
		return copy;
	}
}