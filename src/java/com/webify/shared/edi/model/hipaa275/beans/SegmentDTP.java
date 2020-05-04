package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentDTP implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentDTP.class);

	public static final String SEGMENT_NAME = "DTP";
	public static final int FIELD_COUNT = 3;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Dtp01;
	public String getDtp01() { return Dtp01; }
	public void setDtp01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'DTP01' may not be null");
		}
		if (Field374.validateValue(val)) {
			Dtp01 = val;
		} else {
			throw new IllegalArgumentException("Field 'DTP01' cannot have value: " + val);
		}
	}

	private String Dtp02;
	public String getDtp02() { return Dtp02; }
	public void setDtp02(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'DTP02' may not be null");
		}
		if (Field1250.validateValue(val)) {
			Dtp02 = val;
		} else {
			throw new IllegalArgumentException("Field 'DTP02' cannot have value: " + val);
		}
	}

	private String Dtp03;
	public String getDtp03() { return Dtp03; }
	public void setDtp03(String val) { Dtp03 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment DTP on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Dtp01 = eis.getStringValue(fields, 1, 3, 3, true);
		Field374.validateInputValue(eis, "DTP01", Dtp01, ordinal, 1);
		if (Dtp01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'DTP01' missing");
		}
		Dtp02 = eis.getStringValue(fields, 2, 2, 3, true);
		Field1250.validateInputValue(eis, "DTP02", Dtp02, ordinal, 2);
		if (Dtp02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'DTP02' missing");
		}
		Dtp03 = eis.getStringValue(fields, 3, 1, 35, true);
		if (Dtp03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'DTP03' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("DTP");
		if (Dtp01 == null) {
			eos.addError("Emitting null mandatory field 'DTP01'");
		}

		eos.writeField(Dtp01);
		if (Dtp02 == null) {
			eos.addError("Emitting null mandatory field 'DTP02'");
		}

		eos.writeField(Dtp02);
		if (Dtp03 == null) {
			eos.addError("Emitting null mandatory field 'DTP03'");
		}

		eos.writeField(Dtp03);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentDTP copy = new SegmentDTP();
		copy.setLineNumber(this.lineNumber);
		copy.Dtp01 = this.Dtp01;
		copy.Dtp02 = this.Dtp02;
		copy.Dtp03 = this.Dtp03;
		return copy;
	}
}