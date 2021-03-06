package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC003_4 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C003";
	public static final int ELEMENT_COUNT = 2;

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

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C003_01);
		values[1] = EDIUtils.stringValue(C003_02);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C003_01 = EDIUtils.getStringValue(values, 0, 2, 2, true);
		String overrideKey0 = ordinal + "-" + 21;
		Object[] lvalues0 = (Object[]) Field235.getLegalValues(overrideKey0);
		if (!EDIUtils.validateValue(C003_01, lvalues0)) {
			throw new EDIParseException("Illegal value '" + C003_01 + "' for field C003_01");
		}
		if (C003_01 == null) {
			throw new EDIParseException("Field 'C003_01' is mandatory");
		}
		C003_02 = EDIUtils.getStringValue(values, 1, 1, 48, true);
		if (C003_02 == null) {
			throw new EDIParseException("Field 'C003_02' is mandatory");
		}
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C003_01 = eis.getStringValue(elements, 0, 2, 2, true);
		Field235.validateInputValue(eis, "C003_01", C003_01, ordinal, 21);
		if (C003_01 == null) {
			eis.addError("Field 'C003_01' is mandatory");
		}
		C003_02 = eis.getStringValue(elements, 1, 1, 48, true);
		if (C003_02 == null) {
			eis.addError("Field 'C003_02' is mandatory");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		if (C003_01 == null) {
			eos.addError("Emitting null mandatory field 'C003_01'");
		}
		eos.writeElement(C003_01);
		if (C003_02 == null) {
			eos.addError("Emitting null mandatory field 'C003_02'");
		}
		eos.writeElement(C003_02);
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.writeNullElement();
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC003_4 copy = new CompositeC003_4();
		copy.C003_01 = this.C003_01;
		copy.C003_02 = this.C003_02;
		return copy;
	}
}
