package com.webify.shared.edi.model.hipaa271.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC003 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C003";
	public static final int ELEMENT_COUNT = 7;

	private String ordinal = null;
	void setOrdinal(String ord) { ordinal = ord; }

	// Elements
	private String C003_01;
	public String getC003_01() { return C003_01; }
	public void setC003_01(String val) {
		if (Field235.validateValue(val)) {
			C003_01 = val;
		} else {
			throw new IllegalArgumentException("Field 'C003_01' cannot have value: " + val);
		}
	}

	private String C003_02;
	public String getC003_02() { return C003_02; }
	public void setC003_02(String val) { C003_02 = val; }

	private String C003_03;
	public String getC003_03() { return C003_03; }
	public void setC003_03(String val) { C003_03 = val; }

	private String C003_04;
	public String getC003_04() { return C003_04; }
	public void setC003_04(String val) { C003_04 = val; }

	private String C003_05;
	public String getC003_05() { return C003_05; }
	public void setC003_05(String val) { C003_05 = val; }

	private String C003_06;
	public String getC003_06() { return C003_06; }
	public void setC003_06(String val) { C003_06 = val; }

	private String C003_07;
	public String getC003_07() { return C003_07; }
	public void setC003_07(String val) { C003_07 = val; }

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C003_01);
		values[1] = EDIUtils.stringValue(C003_02);
		values[2] = EDIUtils.stringValue(C003_03);
		values[3] = EDIUtils.stringValue(C003_04);
		values[4] = EDIUtils.stringValue(C003_05);
		values[5] = EDIUtils.stringValue(C003_06);
		values[6] = EDIUtils.stringValue(C003_07);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C003_01 = EDIUtils.getStringValue(values, 0, 2, 2, false);
		String overrideKey0 = ordinal + "-" + 21;
		Object[] lvalues0 = (Object[]) Field235.getLegalValues(overrideKey0);
		if (!EDIUtils.validateValue(C003_01, lvalues0)) {
			throw new EDIParseException("Illegal value '" + C003_01 + "' for field C003_01");
		}
		C003_02 = EDIUtils.getStringValue(values, 1, 1, 48, false);
		C003_03 = EDIUtils.getStringValue(values, 2, 2, 2, false);
		C003_04 = EDIUtils.getStringValue(values, 3, 2, 2, false);
		C003_05 = EDIUtils.getStringValue(values, 4, 2, 2, false);
		C003_06 = EDIUtils.getStringValue(values, 5, 2, 2, false);
		C003_07 = EDIUtils.getStringValue(values, 6, 1, 80, false);
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C003_01 = eis.getStringValue(elements, 0, 2, 2, false);
		Field235.validateInputValue(eis, "C003_01", C003_01, ordinal, 21);
		C003_02 = eis.getStringValue(elements, 1, 1, 48, false);
		C003_03 = eis.getStringValue(elements, 2, 2, 2, false);
		C003_04 = eis.getStringValue(elements, 3, 2, 2, false);
		C003_05 = eis.getStringValue(elements, 4, 2, 2, false);
		C003_06 = eis.getStringValue(elements, 5, 2, 2, false);
		C003_07 = eis.getStringValue(elements, 6, 1, 80, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		eos.writeElement(C003_01);
		eos.writeElement(C003_02);
		eos.writeElement(C003_03);
		eos.writeElement(C003_04);
		eos.writeElement(C003_05);
		eos.writeElement(C003_06);
		eos.writeElement(C003_07);
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC003 copy = new CompositeC003();
		copy.C003_01 = this.C003_01;
		copy.C003_02 = this.C003_02;
		copy.C003_03 = this.C003_03;
		copy.C003_04 = this.C003_04;
		copy.C003_05 = this.C003_05;
		copy.C003_06 = this.C003_06;
		copy.C003_07 = this.C003_07;
		return copy;
	}
}
