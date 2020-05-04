package com.webify.shared.edi.model.hipaa271.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentNM1_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentNM1_1.class);

	public static final String SEGMENT_NAME = "NM1";
	public static final int FIELD_COUNT = 9;

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

	private String Nm103;
	public String getNm103() { return Nm103; }
	public void setNm103(String val) { Nm103 = val; }

	private String Nm104;
	public String getNm104() { return Nm104; }
	public void setNm104(String val) { Nm104 = val; }

	private String Nm105;
	public String getNm105() { return Nm105; }
	public void setNm105(String val) { Nm105 = val; }

	private String Nm107;
	public String getNm107() { return Nm107; }
	public void setNm107(String val) { Nm107 = val; }

	private String Nm108;
	public String getNm108() { return Nm108; }
	public void setNm108(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'NM108' may not be null");
		}
		if (Field66.validateValue(val)) {
			Nm108 = val;
		} else {
			throw new IllegalArgumentException("Field 'NM108' cannot have value: " + val);
		}
	}

	private String Nm109;
	public String getNm109() { return Nm109; }
	public void setNm109(String val) { Nm109 = val; }


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
		Nm103 = eis.getStringValue(fields, 3, 1, 35, false);
		Nm104 = eis.getStringValue(fields, 4, 1, 25, false);
		Nm105 = eis.getStringValue(fields, 5, 1, 25, false);
		Nm107 = eis.getStringValue(fields, 7, 1, 10, false);
		Nm108 = eis.getStringValue(fields, 8, 1, 2, true);
		Field66.validateInputValue(eis, "NM108", Nm108, ordinal, 8);
		if (Nm108 == null || "".equals(fields[8].trim())) {
			eis.addError("Field 'NM108' missing");
		}
		Nm109 = eis.getStringValue(fields, 9, 2, 80, true);
		if (Nm109 == null || "".equals(fields[9].trim())) {
			eis.addError("Field 'NM109' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Nm108 != null) setCount++;
			if (Nm109 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Nm108, Nm109");
			}
		}

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
		eos.writeField(Nm103);
		eos.writeField(Nm104);
		eos.writeField(Nm105);
		eos.writeNullField();
		eos.writeField(Nm107);
		if (Nm108 == null) {
			eos.addError("Emitting null mandatory field 'NM108'");
		}

		eos.writeField(Nm108);
		if (Nm109 == null) {
			eos.addError("Emitting null mandatory field 'NM109'");
		}

		eos.writeField(Nm109);
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentNM1_1 copy = new SegmentNM1_1();
		copy.setLineNumber(this.lineNumber);
		copy.Nm101 = this.Nm101;
		copy.Nm102 = this.Nm102;
		copy.Nm103 = this.Nm103;
		copy.Nm104 = this.Nm104;
		copy.Nm105 = this.Nm105;
		copy.Nm107 = this.Nm107;
		copy.Nm108 = this.Nm108;
		copy.Nm109 = this.Nm109;
		return copy;
	}
}