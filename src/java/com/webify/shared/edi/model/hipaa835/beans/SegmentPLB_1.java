package com.webify.shared.edi.model.hipaa835.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentPLB_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentPLB_1.class);

	public static final String SEGMENT_NAME = "PLB";
	public static final int FIELD_COUNT = 14;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Plb01;
	public String getPlb01() { return Plb01; }
	public void setPlb01(String val) { Plb01 = val; }

	private Date Plb02;
	public Date getPlb02() { return Plb02; }
	public void setPlb02(Date val) { Plb02 = val; }

	private CompositeC042 Plb03;
	public CompositeC042 getPlb03() { return Plb03; }
	public void setPlb03(CompositeC042 val) { Plb03 = val; }

	private java.math.BigDecimal Plb04;
	public java.math.BigDecimal getPlb04() { return Plb04; }
	public void setPlb04(java.math.BigDecimal val) { Plb04 = val; }

	private CompositeC042 Plb05;
	public CompositeC042 getPlb05() { return Plb05; }
	public void setPlb05(CompositeC042 val) { Plb05 = val; }

	private java.math.BigDecimal Plb06;
	public java.math.BigDecimal getPlb06() { return Plb06; }
	public void setPlb06(java.math.BigDecimal val) { Plb06 = val; }

	private CompositeC042 Plb07;
	public CompositeC042 getPlb07() { return Plb07; }
	public void setPlb07(CompositeC042 val) { Plb07 = val; }

	private java.math.BigDecimal Plb08;
	public java.math.BigDecimal getPlb08() { return Plb08; }
	public void setPlb08(java.math.BigDecimal val) { Plb08 = val; }

	private CompositeC042 Plb09;
	public CompositeC042 getPlb09() { return Plb09; }
	public void setPlb09(CompositeC042 val) { Plb09 = val; }

	private java.math.BigDecimal Plb10;
	public java.math.BigDecimal getPlb10() { return Plb10; }
	public void setPlb10(java.math.BigDecimal val) { Plb10 = val; }

	private CompositeC042 Plb11;
	public CompositeC042 getPlb11() { return Plb11; }
	public void setPlb11(CompositeC042 val) { Plb11 = val; }

	private java.math.BigDecimal Plb12;
	public java.math.BigDecimal getPlb12() { return Plb12; }
	public void setPlb12(java.math.BigDecimal val) { Plb12 = val; }

	private CompositeC042 Plb13;
	public CompositeC042 getPlb13() { return Plb13; }
	public void setPlb13(CompositeC042 val) { Plb13 = val; }

	private java.math.BigDecimal Plb14;
	public java.math.BigDecimal getPlb14() { return Plb14; }
	public void setPlb14(java.math.BigDecimal val) { Plb14 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment PLB on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Plb01 = eis.getStringValue(fields, 1, 1, 30, true);
		if (Plb01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'PLB01' missing");
		}
		Plb02 = eis.getDateValue(fields, 2, true);
		if (Plb02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'PLB02' missing");
		}
		if (eis.checkBounds(fields, 3, true)) {
			Plb03 = new CompositeC042();
			Plb03.setOrdinal(ordinal + "-" + 3);
			Plb03.parse(eis, fields[3]);
		}
		if (Plb03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'PLB03' missing");
		}
		Plb04 = eis.getDecimalValue(fields, 4, true);
		if (Plb04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'PLB04' missing");
		}
		if (eis.checkBounds(fields, 5, false)) {
			Plb05 = new CompositeC042();
			Plb05.setOrdinal(ordinal + "-" + 5);
			Plb05.parse(eis, fields[5]);
		}
		Plb06 = eis.getDecimalValue(fields, 6, false);
		if (eis.checkBounds(fields, 7, false)) {
			Plb07 = new CompositeC042();
			Plb07.setOrdinal(ordinal + "-" + 7);
			Plb07.parse(eis, fields[7]);
		}
		Plb08 = eis.getDecimalValue(fields, 8, false);
		if (eis.checkBounds(fields, 9, false)) {
			Plb09 = new CompositeC042();
			Plb09.setOrdinal(ordinal + "-" + 9);
			Plb09.parse(eis, fields[9]);
		}
		Plb10 = eis.getDecimalValue(fields, 10, false);
		if (eis.checkBounds(fields, 11, false)) {
			Plb11 = new CompositeC042();
			Plb11.setOrdinal(ordinal + "-" + 11);
			Plb11.parse(eis, fields[11]);
		}
		Plb12 = eis.getDecimalValue(fields, 12, false);
		if (eis.checkBounds(fields, 13, false)) {
			Plb13 = new CompositeC042();
			Plb13.setOrdinal(ordinal + "-" + 13);
			Plb13.parse(eis, fields[13]);
		}
		Plb14 = eis.getDecimalValue(fields, 14, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Plb05 != null) setCount++;
			if (Plb06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Plb05, Plb06");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Plb07 != null) setCount++;
			if (Plb08 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Plb07, Plb08");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Plb09 != null) setCount++;
			if (Plb10 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Plb09, Plb10");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Plb11 != null) setCount++;
			if (Plb12 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Plb11, Plb12");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (Plb13 != null) setCount++;
			if (Plb14 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Plb13, Plb14");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("PLB");
		if (Plb01 == null) {
			eos.addError("Emitting null mandatory field 'PLB01'");
		}

		eos.writeField(Plb01);
		if (Plb02 == null) {
			eos.addError("Emitting null mandatory field 'PLB02'");
		}

		eos.writeField(Plb02);
		if (Plb03 == null) {
			eos.addError("Emitting null mandatory field 'PLB03'");
		}

		if (Plb03 != null) {
			Plb03.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Plb04 == null) {
			eos.addError("Emitting null mandatory field 'PLB04'");
		}

		eos.writeField(Plb04);
		if (Plb05 != null) {
			Plb05.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Plb06);
		if (Plb07 != null) {
			Plb07.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Plb08);
		if (Plb09 != null) {
			Plb09.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Plb10);
		if (Plb11 != null) {
			Plb11.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Plb12);
		if (Plb13 != null) {
			Plb13.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeField(Plb14);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentPLB_1 copy = new SegmentPLB_1();
		copy.setLineNumber(this.lineNumber);
		copy.Plb01 = this.Plb01;
		copy.Plb02 = this.Plb02;
		if (getPlb03() != null) copy.setPlb03((CompositeC042)getPlb03().createCopy());
		copy.Plb04 = this.Plb04;
		if (getPlb05() != null) copy.setPlb05((CompositeC042)getPlb05().createCopy());
		copy.Plb06 = this.Plb06;
		if (getPlb07() != null) copy.setPlb07((CompositeC042)getPlb07().createCopy());
		copy.Plb08 = this.Plb08;
		if (getPlb09() != null) copy.setPlb09((CompositeC042)getPlb09().createCopy());
		copy.Plb10 = this.Plb10;
		if (getPlb11() != null) copy.setPlb11((CompositeC042)getPlb11().createCopy());
		copy.Plb12 = this.Plb12;
		if (getPlb13() != null) copy.setPlb13((CompositeC042)getPlb13().createCopy());
		copy.Plb14 = this.Plb14;
		return copy;
	}
}