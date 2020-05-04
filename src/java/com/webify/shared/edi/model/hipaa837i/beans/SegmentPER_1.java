package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentPER_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentPER_1.class);

	public static final String SEGMENT_NAME = "PER";
	public static final int FIELD_COUNT = 8;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Per01;
	public String getPer01() { return Per01; }
	public void setPer01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'PER01' may not be null");
		}
		if (Field366.validateValue(val)) {
			Per01 = val;
		} else {
			throw new IllegalArgumentException("Field 'PER01' cannot have value: " + val);
		}
	}

	private String Per02;
	public String getPer02() { return Per02; }
	public void setPer02(String val) { Per02 = val; }

	private String Per03;
	public String getPer03() { return Per03; }
	public void setPer03(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'PER03' may not be null");
		}
		if (Field365.validateValue(val)) {
			Per03 = val;
		} else {
			throw new IllegalArgumentException("Field 'PER03' cannot have value: " + val);
		}
	}

	private String Per04;
	public String getPer04() { return Per04; }
	public void setPer04(String val) { Per04 = val; }

	private String Per05;
	public String getPer05() { return Per05; }
	public void setPer05(String val) {
		if (Field365.validateValue(val)) {
			Per05 = val;
		} else {
			throw new IllegalArgumentException("Field 'PER05' cannot have value: " + val);
		}
	}

	private String Per06;
	public String getPer06() { return Per06; }
	public void setPer06(String val) { Per06 = val; }

	private String Per07;
	public String getPer07() { return Per07; }
	public void setPer07(String val) {
		if (Field365.validateValue(val)) {
			Per07 = val;
		} else {
			throw new IllegalArgumentException("Field 'PER07' cannot have value: " + val);
		}
	}

	private String Per08;
	public String getPer08() { return Per08; }
	public void setPer08(String val) { Per08 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment PER on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Per01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field366.validateInputValue(eis, "PER01", Per01, ordinal, 1);
		if (Per01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'PER01' missing");
		}
		Per02 = eis.getStringValue(fields, 2, 1, 60, true);
		if (Per02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'PER02' missing");
		}
		Per03 = eis.getStringValue(fields, 3, 2, 2, true);
		Field365.validateInputValue(eis, "PER03", Per03, ordinal, 3);
		if (Per03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'PER03' missing");
		}
		Per04 = eis.getStringValue(fields, 4, 1, 80, true);
		if (Per04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'PER04' missing");
		}
		Per05 = eis.getStringValue(fields, 5, 2, 2, false);
		Field365.validateInputValue(eis, "PER05", Per05, ordinal, 5);
		Per06 = eis.getStringValue(fields, 6, 1, 80, false);
		Per07 = eis.getStringValue(fields, 7, 2, 2, false);
		Field365.validateInputValue(eis, "PER07", Per07, ordinal, 7);
		Per08 = eis.getStringValue(fields, 8, 1, 80, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Per03 != null) setCount++;
			if (Per04 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Per03, Per04");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Per05 != null) setCount++;
			if (Per06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Per05, Per06");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Per07 != null) setCount++;
			if (Per08 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Per07, Per08");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("PER");
		if (Per01 == null) {
			eos.addError("Emitting null mandatory field 'PER01'");
		}

		eos.writeField(Per01);
		if (Per02 == null) {
			eos.addError("Emitting null mandatory field 'PER02'");
		}

		eos.writeField(Per02);
		if (Per03 == null) {
			eos.addError("Emitting null mandatory field 'PER03'");
		}

		eos.writeField(Per03);
		if (Per04 == null) {
			eos.addError("Emitting null mandatory field 'PER04'");
		}

		eos.writeField(Per04);
		eos.writeField(Per05);
		eos.writeField(Per06);
		eos.writeField(Per07);
		eos.writeField(Per08);
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentPER_1 copy = new SegmentPER_1();
		copy.setLineNumber(this.lineNumber);
		copy.Per01 = this.Per01;
		copy.Per02 = this.Per02;
		copy.Per03 = this.Per03;
		copy.Per04 = this.Per04;
		copy.Per05 = this.Per05;
		copy.Per06 = this.Per06;
		copy.Per07 = this.Per07;
		copy.Per08 = this.Per08;
		return copy;
	}
}
