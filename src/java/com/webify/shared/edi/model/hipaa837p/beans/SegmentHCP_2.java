package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentHCP_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentHCP_2.class);

	public static final String SEGMENT_NAME = "HCP";
	public static final int FIELD_COUNT = 15;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Hcp01;
	public String getHcp01() { return Hcp01; }
	public void setHcp01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'HCP01' may not be null");
		}
		if (Field1473.validateValue(val)) {
			Hcp01 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP01' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Hcp02;
	public java.math.BigDecimal getHcp02() { return Hcp02; }
	public void setHcp02(java.math.BigDecimal val) { Hcp02 = val; }

	private java.math.BigDecimal Hcp03;
	public java.math.BigDecimal getHcp03() { return Hcp03; }
	public void setHcp03(java.math.BigDecimal val) { Hcp03 = val; }

	private String Hcp04;
	public String getHcp04() { return Hcp04; }
	public void setHcp04(String val) { Hcp04 = val; }

	private java.math.BigDecimal Hcp05;
	public java.math.BigDecimal getHcp05() { return Hcp05; }
	public void setHcp05(java.math.BigDecimal val) { Hcp05 = val; }

	private String Hcp06;
	public String getHcp06() { return Hcp06; }
	public void setHcp06(String val) { Hcp06 = val; }

	private java.math.BigDecimal Hcp07;
	public java.math.BigDecimal getHcp07() { return Hcp07; }
	public void setHcp07(java.math.BigDecimal val) { Hcp07 = val; }

	private String Hcp09;
	public String getHcp09() { return Hcp09; }
	public void setHcp09(String val) {
		if (Field235.validateValue(val)) {
			Hcp09 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP09' cannot have value: " + val);
		}
	}

	private String Hcp10;
	public String getHcp10() { return Hcp10; }
	public void setHcp10(String val) { Hcp10 = val; }

	private String Hcp11;
	public String getHcp11() { return Hcp11; }
	public void setHcp11(String val) {
		if (Field355.validateValue(val)) {
			Hcp11 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP11' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Hcp12;
	public java.math.BigDecimal getHcp12() { return Hcp12; }
	public void setHcp12(java.math.BigDecimal val) { Hcp12 = val; }

	private String Hcp13;
	public String getHcp13() { return Hcp13; }
	public void setHcp13(String val) {
		if (Field901.validateValue(val)) {
			Hcp13 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP13' cannot have value: " + val);
		}
	}

	private String Hcp14;
	public String getHcp14() { return Hcp14; }
	public void setHcp14(String val) {
		if (Field1526.validateValue(val)) {
			Hcp14 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP14' cannot have value: " + val);
		}
	}

	private String Hcp15;
	public String getHcp15() { return Hcp15; }
	public void setHcp15(String val) {
		if (Field1527.validateValue(val)) {
			Hcp15 = val;
		} else {
			throw new IllegalArgumentException("Field 'HCP15' cannot have value: " + val);
		}
	}


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment HCP on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Hcp01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field1473.validateInputValue(eis, "HCP01", Hcp01, ordinal, 1);
		if (Hcp01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'HCP01' missing");
		}
		Hcp02 = eis.getDecimalValue(fields, 2, true);
		if (Hcp02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'HCP02' missing");
		}
		Hcp03 = eis.getDecimalValue(fields, 3, false);
		Hcp04 = eis.getStringValue(fields, 4, 1, 30, false);
		Hcp05 = eis.getDecimalValue(fields, 5, false);
		Hcp06 = eis.getStringValue(fields, 6, 1, 30, false);
		Hcp07 = eis.getDecimalValue(fields, 7, false);
		Hcp09 = eis.getStringValue(fields, 9, 2, 2, false);
		Field235.validateInputValue(eis, "HCP09", Hcp09, ordinal, 9);
		Hcp10 = eis.getStringValue(fields, 10, 1, 48, false);
		Hcp11 = eis.getStringValue(fields, 11, 2, 2, false);
		Field355.validateInputValue(eis, "HCP11", Hcp11, ordinal, 11);
		Hcp12 = eis.getDecimalValue(fields, 12, false);
		Hcp13 = eis.getStringValue(fields, 13, 2, 2, false);
		Field901.validateInputValue(eis, "HCP13", Hcp13, ordinal, 13);
		Hcp14 = eis.getStringValue(fields, 14, 1, 2, false);
		Field1526.validateInputValue(eis, "HCP14", Hcp14, ordinal, 14);
		Hcp15 = eis.getStringValue(fields, 15, 1, 2, false);
		Field1527.validateInputValue(eis, "HCP15", Hcp15, ordinal, 15);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Hcp09 != null) setCount++;
			if (Hcp10 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Hcp09, Hcp10");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Hcp11 != null) setCount++;
			if (Hcp12 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Hcp11, Hcp12");
			}
		}

		// REQUIRE_ONE_OF
		if (Hcp01 == null && Hcp13 == null) {
			eis.addError("Segment 'Hcp' requires at least one field of the following to be set: Hcp01, Hcp13");
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("HCP");
		if (Hcp01 == null) {
			eos.addError("Emitting null mandatory field 'HCP01'");
		}

		eos.writeField(Hcp01);
		if (Hcp02 == null) {
			eos.addError("Emitting null mandatory field 'HCP02'");
		}

		eos.writeField(Hcp02);
		eos.writeField(Hcp03);
		eos.writeField(Hcp04);
		eos.writeField(Hcp05);
		eos.writeField(Hcp06);
		eos.writeField(Hcp07);
		eos.writeNullField();
		eos.writeField(Hcp09);
		eos.writeField(Hcp10);
		eos.writeField(Hcp11);
		eos.writeField(Hcp12);
		eos.writeField(Hcp13);
		eos.writeField(Hcp14);
		eos.writeField(Hcp15);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentHCP_2 copy = new SegmentHCP_2();
		copy.setLineNumber(this.lineNumber);
		copy.Hcp01 = this.Hcp01;
		copy.Hcp02 = this.Hcp02;
		copy.Hcp03 = this.Hcp03;
		copy.Hcp04 = this.Hcp04;
		copy.Hcp05 = this.Hcp05;
		copy.Hcp06 = this.Hcp06;
		copy.Hcp07 = this.Hcp07;
		copy.Hcp09 = this.Hcp09;
		copy.Hcp10 = this.Hcp10;
		copy.Hcp11 = this.Hcp11;
		copy.Hcp12 = this.Hcp12;
		copy.Hcp13 = this.Hcp13;
		copy.Hcp14 = this.Hcp14;
		copy.Hcp15 = this.Hcp15;
		return copy;
	}
}
