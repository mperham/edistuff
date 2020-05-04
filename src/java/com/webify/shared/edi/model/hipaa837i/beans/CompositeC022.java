package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC022 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C022";
	public static final int ELEMENT_COUNT = 7;

	private String ordinal = null;
	void setOrdinal(String ord) { ordinal = ord; }

	// Elements
	private String C022_01;
	public String getC022_01() { return C022_01; }
	public void setC022_01(String val) {
		if (Field1270.validateValue(val)) {
			C022_01 = val;
		} else {
			throw new IllegalArgumentException("Field 'C022_01' cannot have value: " + val);
		}
	}

	private String C022_02;
	public String getC022_02() { return C022_02; }
	public void setC022_02(String val) { C022_02 = val; }

	private String C022_03;
	public String getC022_03() { return C022_03; }
	public void setC022_03(String val) {
		if (Field1250.validateValue(val)) {
			C022_03 = val;
		} else {
			throw new IllegalArgumentException("Field 'C022_03' cannot have value: " + val);
		}
	}

	private String C022_04;
	public String getC022_04() { return C022_04; }
	public void setC022_04(String val) { C022_04 = val; }

	private java.math.BigDecimal C022_05;
	public java.math.BigDecimal getC022_05() { return C022_05; }
	public void setC022_05(java.math.BigDecimal val) { C022_05 = val; }

	private java.math.BigDecimal C022_06;
	public java.math.BigDecimal getC022_06() { return C022_06; }
	public void setC022_06(java.math.BigDecimal val) { C022_06 = val; }

	private String C022_07;
	public String getC022_07() { return C022_07; }
	public void setC022_07(String val) { C022_07 = val; }

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C022_01);
		values[1] = EDIUtils.stringValue(C022_02);
		values[2] = EDIUtils.stringValue(C022_03);
		values[3] = EDIUtils.stringValue(C022_04);
		values[4] = EDIUtils.stringValue(C022_05);
		values[5] = EDIUtils.stringValue(C022_06);
		values[6] = EDIUtils.stringValue(C022_07);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C022_01 = EDIUtils.getStringValue(values, 0, 1, 3, false);
		String overrideKey0 = ordinal + "-" + 50;
		Object[] lvalues0 = (Object[]) Field1270.getLegalValues(overrideKey0);
		if (!EDIUtils.validateValue(C022_01, lvalues0)) {
			throw new EDIParseException("Illegal value '" + C022_01 + "' for field C022_01");
		}
		C022_02 = EDIUtils.getStringValue(values, 1, 1, 30, false);
		C022_03 = EDIUtils.getStringValue(values, 2, 2, 3, false);
		String overrideKey2 = ordinal + "-" + 52;
		Object[] lvalues2 = (Object[]) Field1250.getLegalValues(overrideKey2);
		if (!EDIUtils.validateValue(C022_03, lvalues2)) {
			throw new EDIParseException("Illegal value '" + C022_03 + "' for field C022_03");
		}
		C022_04 = EDIUtils.getStringValue(values, 3, 1, 35, false);
		C022_05 = EDIUtils.getDecimalValue(values, 4, false);
		C022_06 = EDIUtils.getDecimalValue(values, 5, false);
		C022_07 = EDIUtils.getStringValue(values, 6, 1, 30, false);
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C022_01 = eis.getStringValue(elements, 0, 1, 3, false);
		Field1270.validateInputValue(eis, "C022_01", C022_01, ordinal, 50);
		C022_02 = eis.getStringValue(elements, 1, 1, 30, false);
		C022_03 = eis.getStringValue(elements, 2, 2, 3, false);
		Field1250.validateInputValue(eis, "C022_03", C022_03, ordinal, 52);
		C022_04 = eis.getStringValue(elements, 3, 1, 35, false);
		C022_05 = eis.getDecimalValue(elements, 4, false);
		C022_06 = eis.getDecimalValue(elements, 5, false);
		C022_07 = eis.getStringValue(elements, 6, 1, 30, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		eos.writeElement(C022_01);
		eos.writeElement(C022_02);
		eos.writeElement(C022_03);
		eos.writeElement(C022_04);
		eos.writeElement(C022_05);
		eos.writeElement(C022_06);
		eos.writeElement(C022_07);
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC022 copy = new CompositeC022();
		copy.C022_01 = this.C022_01;
		copy.C022_02 = this.C022_02;
		copy.C022_03 = this.C022_03;
		copy.C022_04 = this.C022_04;
		copy.C022_05 = this.C022_05;
		copy.C022_06 = this.C022_06;
		copy.C022_07 = this.C022_07;
		return copy;
	}
}