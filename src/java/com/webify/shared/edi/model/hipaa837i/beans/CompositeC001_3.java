package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC001_3 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C001";
	public static final int ELEMENT_COUNT = 1;

	private String ordinal = null;
	void setOrdinal(String ord) { ordinal = ord; }

	// Elements
	private String C001_01;
	public String getC001_01() { return C001_01; }
	public void setC001_01(String val) {
		if (Field355.validateValue(val)) {
			C001_01 = val;
		} else {
			throw new IllegalArgumentException("Field 'C001_01' cannot have value: " + val);
		}
	}

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C001_01);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C001_01 = EDIUtils.getStringValue(values, 0, 2, 2, true);
		String overrideKey0 = ordinal + "-" + 1;
		Object[] lvalues0 = (Object[]) Field355.getLegalValues(overrideKey0);
		if (!EDIUtils.validateValue(C001_01, lvalues0)) {
			throw new EDIParseException("Illegal value '" + C001_01 + "' for field C001_01");
		}
		if (C001_01 == null) {
			throw new EDIParseException("Field 'C001_01' is mandatory");
		}
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C001_01 = eis.getStringValue(elements, 0, 2, 2, true);
		Field355.validateInputValue(eis, "C001_01", C001_01, ordinal, 1);
		if (C001_01 == null) {
			eis.addError("Field 'C001_01' is mandatory");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		if (C001_01 == null) {
			eos.addError("Emitting null mandatory field 'C001_01'");
		}
		eos.writeElement(C001_01);
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC001_3 copy = new CompositeC001_3();
		copy.C001_01 = this.C001_01;
		return copy;
	}
}
