package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentBHT_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentBHT_1.class);

	public static final String SEGMENT_NAME = "BHT";
	public static final int FIELD_COUNT = 6;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Bht01;
	public String getBht01() { return Bht01; }
	public void setBht01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'BHT01' may not be null");
		}
		if (Field1005.validateValue(val)) {
			Bht01 = val;
		} else {
			throw new IllegalArgumentException("Field 'BHT01' cannot have value: " + val);
		}
	}

	private String Bht02;
	public String getBht02() { return Bht02; }
	public void setBht02(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'BHT02' may not be null");
		}
		if (Field353.validateValue(val)) {
			Bht02 = val;
		} else {
			throw new IllegalArgumentException("Field 'BHT02' cannot have value: " + val);
		}
	}

	private String Bht03;
	public String getBht03() { return Bht03; }
	public void setBht03(String val) { Bht03 = val; }

	private Date Bht04;
	public Date getBht04() { return Bht04; }
	public void setBht04(Date val) { Bht04 = val; }

	private String Bht05;
	public String getBht05() { return Bht05; }
	public void setBht05(String val) { Bht05 = val; }

	private String Bht06;
	public String getBht06() { return Bht06; }
	public void setBht06(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'BHT06' may not be null");
		}
		if (Field640.validateValue(val)) {
			Bht06 = val;
		} else {
			throw new IllegalArgumentException("Field 'BHT06' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment BHT on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Bht01 = eis.getStringValue(fields, 1, 4, 4, true);
		Field1005.validateInputValue(eis, "BHT01", Bht01, ordinal, 1);
		if (Bht01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'BHT01' missing");
		}
		Bht02 = eis.getStringValue(fields, 2, 2, 2, true);
		Field353.validateInputValue(eis, "BHT02", Bht02, ordinal, 2);
		if (Bht02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'BHT02' missing");
		}
		Bht03 = eis.getStringValue(fields, 3, 1, 30, true);
		if (Bht03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'BHT03' missing");
		}
		Bht04 = eis.getDateValue(fields, 4, true);
		if (Bht04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'BHT04' missing");
		}
		Bht05 = eis.getStringValue(fields, 5, 4, 8, true);
		if (Bht05 == null || "".equals(fields[5].trim())) {
			eis.addError("Field 'BHT05' missing");
		}
		Bht06 = eis.getStringValue(fields, 6, 2, 2, true);
		Field640.validateInputValue(eis, "BHT06", Bht06, ordinal, 6);
		if (Bht06 == null || "".equals(fields[6].trim())) {
			eis.addError("Field 'BHT06' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("BHT");
		if (Bht01 == null) {
			eos.addError("Emitting null mandatory field 'BHT01'");
		}

		eos.writeField(Bht01);
		if (Bht02 == null) {
			eos.addError("Emitting null mandatory field 'BHT02'");
		}

		eos.writeField(Bht02);
		if (Bht03 == null) {
			eos.addError("Emitting null mandatory field 'BHT03'");
		}

		eos.writeField(Bht03);
		if (Bht04 == null) {
			eos.addError("Emitting null mandatory field 'BHT04'");
		}

		eos.writeField(Bht04);
		if (Bht05 == null) {
			eos.addError("Emitting null mandatory field 'BHT05'");
		}

		eos.writeField(Bht05);
		if (Bht06 == null) {
			eos.addError("Emitting null mandatory field 'BHT06'");
		}

		eos.writeField(Bht06);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentBHT_1 copy = new SegmentBHT_1();
		copy.setLineNumber(this.lineNumber);
		copy.Bht01 = this.Bht01;
		copy.Bht02 = this.Bht02;
		copy.Bht03 = this.Bht03;
		copy.Bht04 = this.Bht04;
		copy.Bht05 = this.Bht05;
		copy.Bht06 = this.Bht06;
		return copy;
	}
}
