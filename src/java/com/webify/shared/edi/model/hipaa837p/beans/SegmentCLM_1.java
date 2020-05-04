package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentCLM_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentCLM_1.class);

	public static final String SEGMENT_NAME = "CLM";
	public static final int FIELD_COUNT = 20;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Clm01;
	public String getClm01() { return Clm01; }
	public void setClm01(String val) { Clm01 = val; }

	private java.math.BigDecimal Clm02;
	public java.math.BigDecimal getClm02() { return Clm02; }
	public void setClm02(java.math.BigDecimal val) { Clm02 = val; }

	private CompositeC023 Clm05;
	public CompositeC023 getClm05() { return Clm05; }
	public void setClm05(CompositeC023 val) { Clm05 = val; }

	private String Clm06;
	public String getClm06() { return Clm06; }
	public void setClm06(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'CLM06' may not be null");
		}
		if (Field1073.validateValue(val)) {
			Clm06 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM06' cannot have value: " + val);
		}
	}

	private String Clm07;
	public String getClm07() { return Clm07; }
	public void setClm07(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'CLM07' may not be null");
		}
		if (Field1359.validateValue(val)) {
			Clm07 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM07' cannot have value: " + val);
		}
	}

	private String Clm08;
	public String getClm08() { return Clm08; }
	public void setClm08(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'CLM08' may not be null");
		}
		if (Field1073.validateValue(val)) {
			Clm08 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM08' cannot have value: " + val);
		}
	}

	private String Clm09;
	public String getClm09() { return Clm09; }
	public void setClm09(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'CLM09' may not be null");
		}
		if (Field1363.validateValue(val)) {
			Clm09 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM09' cannot have value: " + val);
		}
	}

	private String Clm10;
	public String getClm10() { return Clm10; }
	public void setClm10(String val) {
		if (Field1351.validateValue(val)) {
			Clm10 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM10' cannot have value: " + val);
		}
	}

	private CompositeC024 Clm11;
	public CompositeC024 getClm11() { return Clm11; }
	public void setClm11(CompositeC024 val) { Clm11 = val; }

	private String Clm12;
	public String getClm12() { return Clm12; }
	public void setClm12(String val) {
		if (Field1366.validateValue(val)) {
			Clm12 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM12' cannot have value: " + val);
		}
	}

	private String Clm16;
	public String getClm16() { return Clm16; }
	public void setClm16(String val) {
		if (Field1360.validateValue(val)) {
			Clm16 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM16' cannot have value: " + val);
		}
	}

	private String Clm20;
	public String getClm20() { return Clm20; }
	public void setClm20(String val) {
		if (Field1514.validateValue(val)) {
			Clm20 = val;
		} else {
			throw new IllegalArgumentException("Field 'CLM20' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment CLM on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Clm01 = eis.getStringValue(fields, 1, 1, 38, true);
		if (Clm01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'CLM01' missing");
		}
		Clm02 = eis.getDecimalValue(fields, 2, true);
		if (Clm02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'CLM02' missing");
		}
		if (eis.checkBounds(fields, 5, true)) {
			Clm05 = new CompositeC023();
			Clm05.setOrdinal(ordinal + "-" + 5);
			Clm05.parse(eis, fields[5]);
		}
		if (Clm05 == null || "".equals(fields[5].trim())) {
			eis.addError("Field 'CLM05' missing");
		}
		Clm06 = eis.getStringValue(fields, 6, 1, 1, true);
		Field1073.validateInputValue(eis, "CLM06", Clm06, ordinal, 6);
		if (Clm06 == null || "".equals(fields[6].trim())) {
			eis.addError("Field 'CLM06' missing");
		}
		Clm07 = eis.getStringValue(fields, 7, 1, 1, true);
		Field1359.validateInputValue(eis, "CLM07", Clm07, ordinal, 7);
		if (Clm07 == null || "".equals(fields[7].trim())) {
			eis.addError("Field 'CLM07' missing");
		}
		Clm08 = eis.getStringValue(fields, 8, 1, 1, true);
		Field1073.validateInputValue(eis, "CLM08", Clm08, ordinal, 8);
		if (Clm08 == null || "".equals(fields[8].trim())) {
			eis.addError("Field 'CLM08' missing");
		}
		Clm09 = eis.getStringValue(fields, 9, 1, 1, true);
		Field1363.validateInputValue(eis, "CLM09", Clm09, ordinal, 9);
		if (Clm09 == null || "".equals(fields[9].trim())) {
			eis.addError("Field 'CLM09' missing");
		}
		Clm10 = eis.getStringValue(fields, 10, 1, 1, false);
		Field1351.validateInputValue(eis, "CLM10", Clm10, ordinal, 10);
		if (eis.checkBounds(fields, 11, false)) {
			Clm11 = new CompositeC024();
			Clm11.setOrdinal(ordinal + "-" + 11);
			Clm11.parse(eis, fields[11]);
		}
		Clm12 = eis.getStringValue(fields, 12, 2, 3, false);
		Field1366.validateInputValue(eis, "CLM12", Clm12, ordinal, 12);
		Clm16 = eis.getStringValue(fields, 16, 1, 1, false);
		Field1360.validateInputValue(eis, "CLM16", Clm16, ordinal, 16);
		Clm20 = eis.getStringValue(fields, 20, 1, 2, false);
		Field1514.validateInputValue(eis, "CLM20", Clm20, ordinal, 20);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("CLM");
		if (Clm01 == null) {
			eos.addError("Emitting null mandatory field 'CLM01'");
		}

		eos.writeField(Clm01);
		if (Clm02 == null) {
			eos.addError("Emitting null mandatory field 'CLM02'");
		}

		eos.writeField(Clm02);
		eos.writeNullField();
		eos.writeNullField();
		if (Clm05 == null) {
			eos.addError("Emitting null mandatory field 'CLM05'");
		}

		if (Clm05 != null) {
			Clm05.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Clm06 == null) {
			eos.addError("Emitting null mandatory field 'CLM06'");
		}

		eos.writeField(Clm06);
		if (Clm07 == null) {
			eos.addError("Emitting null mandatory field 'CLM07'");
		}

		eos.writeField(Clm07);
		if (Clm08 == null) {
			eos.addError("Emitting null mandatory field 'CLM08'");
		}

		eos.writeField(Clm08);
		if (Clm09 == null) {
			eos.addError("Emitting null mandatory field 'CLM09'");
		}

		eos.writeField(Clm09);
		eos.writeField(Clm10);
		if (Clm11 != null) {
			Clm11.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Clm12);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeField(Clm16);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeField(Clm20);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentCLM_1 copy = new SegmentCLM_1();
		copy.setLineNumber(this.lineNumber);
		copy.Clm01 = this.Clm01;
		copy.Clm02 = this.Clm02;
		if (getClm05() != null) copy.setClm05((CompositeC023)getClm05().createCopy());
		copy.Clm06 = this.Clm06;
		copy.Clm07 = this.Clm07;
		copy.Clm08 = this.Clm08;
		copy.Clm09 = this.Clm09;
		copy.Clm10 = this.Clm10;
		if (getClm11() != null) copy.setClm11((CompositeC024)getClm11().createCopy());
		copy.Clm12 = this.Clm12;
		copy.Clm16 = this.Clm16;
		copy.Clm20 = this.Clm20;
		return copy;
	}
}