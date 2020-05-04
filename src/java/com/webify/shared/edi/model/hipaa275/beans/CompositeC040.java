package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC040 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C040";
	public static final int ELEMENT_COUNT = 6;

	private String ordinal = null;
	void setOrdinal(String ord) { ordinal = ord; }

	// Elements
	private String C040_01;
	public String getC040_01() { return C040_01; }
	public void setC040_01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'C040_01' may not be null");
		}
		if (Field128.validateValue(val)) {
			C040_01 = val;
		} else {
			throw new IllegalArgumentException("Field 'C040_01' cannot have value: " + val);
		}
	}

	private String C040_02;
	public String getC040_02() { return C040_02; }
	public void setC040_02(String val) { C040_02 = val; }

	private String C040_03;
	public String getC040_03() { return C040_03; }
	public void setC040_03(String val) {
		if (Field128.validateValue(val)) {
			C040_03 = val;
		} else {
			throw new IllegalArgumentException("Field 'C040_03' cannot have value: " + val);
		}
	}

	private String C040_04;
	public String getC040_04() { return C040_04; }
	public void setC040_04(String val) { C040_04 = val; }

	private String C040_05;
	public String getC040_05() { return C040_05; }
	public void setC040_05(String val) {
		if (Field128.validateValue(val)) {
			C040_05 = val;
		} else {
			throw new IllegalArgumentException("Field 'C040_05' cannot have value: " + val);
		}
	}

	private String C040_06;
	public String getC040_06() { return C040_06; }
	public void setC040_06(String val) { C040_06 = val; }

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C040_01);
		values[1] = EDIUtils.stringValue(C040_02);
		values[2] = EDIUtils.stringValue(C040_03);
		values[3] = EDIUtils.stringValue(C040_04);
		values[4] = EDIUtils.stringValue(C040_05);
		values[5] = EDIUtils.stringValue(C040_06);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C040_01 = EDIUtils.getStringValue(values, 0, 2, 3, true);
		String overrideKey0 = ordinal + "-" + 118;
		Object[] lvalues0 = (Object[]) Field128.getLegalValues(overrideKey0);
		if (!EDIUtils.validateValue(C040_01, lvalues0)) {
			throw new EDIParseException("Illegal value '" + C040_01 + "' for field C040_01");
		}
		if (C040_01 == null) {
			throw new EDIParseException("Field 'C040_01' is mandatory");
		}
		C040_02 = EDIUtils.getStringValue(values, 1, 1, 50, true);
		if (C040_02 == null) {
			throw new EDIParseException("Field 'C040_02' is mandatory");
		}
		C040_03 = EDIUtils.getStringValue(values, 2, 2, 3, false);
		String overrideKey2 = ordinal + "-" + 120;
		Object[] lvalues2 = (Object[]) Field128.getLegalValues(overrideKey2);
		if (!EDIUtils.validateValue(C040_03, lvalues2)) {
			throw new EDIParseException("Illegal value '" + C040_03 + "' for field C040_03");
		}
		C040_04 = EDIUtils.getStringValue(values, 3, 1, 50, false);
		C040_05 = EDIUtils.getStringValue(values, 4, 2, 3, false);
		String overrideKey4 = ordinal + "-" + 122;
		Object[] lvalues4 = (Object[]) Field128.getLegalValues(overrideKey4);
		if (!EDIUtils.validateValue(C040_05, lvalues4)) {
			throw new EDIParseException("Illegal value '" + C040_05 + "' for field C040_05");
		}
		C040_06 = EDIUtils.getStringValue(values, 5, 1, 50, false);
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C040_01 = eis.getStringValue(elements, 0, 2, 3, true);
		Field128.validateInputValue(eis, "C040_01", C040_01, ordinal, 118);
		if (C040_01 == null) {
			eis.addError("Field 'C040_01' is mandatory");
		}
		C040_02 = eis.getStringValue(elements, 1, 1, 50, true);
		if (C040_02 == null) {
			eis.addError("Field 'C040_02' is mandatory");
		}
		C040_03 = eis.getStringValue(elements, 2, 2, 3, false);
		Field128.validateInputValue(eis, "C040_03", C040_03, ordinal, 120);
		C040_04 = eis.getStringValue(elements, 3, 1, 50, false);
		C040_05 = eis.getStringValue(elements, 4, 2, 3, false);
		Field128.validateInputValue(eis, "C040_05", C040_05, ordinal, 122);
		C040_06 = eis.getStringValue(elements, 5, 1, 50, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (C040_03 != null) setCount++;
			if (C040_04 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: C040_03, C040_04");
			}
		}

		// PAIRED
		{
			int setCount = 0;
			if (C040_05 != null) setCount++;
			if (C040_06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: C040_05, C040_06");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		if (C040_01 == null) {
			eos.addError("Emitting null mandatory field 'C040_01'");
		}
		eos.writeElement(C040_01);
		if (C040_02 == null) {
			eos.addError("Emitting null mandatory field 'C040_02'");
		}
		eos.writeElement(C040_02);
		eos.writeElement(C040_03);
		eos.writeElement(C040_04);
		eos.writeElement(C040_05);
		eos.writeElement(C040_06);
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC040 copy = new CompositeC040();
		copy.C040_01 = this.C040_01;
		copy.C040_02 = this.C040_02;
		copy.C040_03 = this.C040_03;
		copy.C040_04 = this.C040_04;
		copy.C040_05 = this.C040_05;
		copy.C040_06 = this.C040_06;
		return copy;
	}
}
