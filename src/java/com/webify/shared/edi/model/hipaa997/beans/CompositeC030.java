package com.webify.shared.edi.model.hipaa997.beans;

import com.webify.shared.edi.model.*;
import java.io.IOException;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class CompositeC030 implements EDICompositeField {

	public static final String COMPOSITE_NAME = "C030";
	public static final int ELEMENT_COUNT = 2;

	private String ordinal = null;
	void setOrdinal(String ord) { ordinal = ord; }

	// Elements
	private Integer C030_01;
	public Integer getC030_01() { return C030_01; }
	public void setC030_01(Integer val) { C030_01 = val; }

	private Integer C030_02;
	public Integer getC030_02() { return C030_02; }
	public void setC030_02(Integer val) { C030_02 = val; }

	public String[] getElements() {
		String[] values = new String[ELEMENT_COUNT];
		values[0] = EDIUtils.stringValue(C030_01);
		values[1] = EDIUtils.stringValue(C030_02);
		return values;
	}

	public void setElements(String[] values) throws EDIParseException {
		if (values == null || values.length != ELEMENT_COUNT) {
			throw new EDIParseException("values array must be non-null and contain " + ELEMENT_COUNT + " elements");
		}
		C030_01 = EDIUtils.getIntegerValue(values, 0, true);
		if (C030_01 == null) {
			throw new EDIParseException("Field 'C030_01' is mandatory");
		}
		C030_02 = EDIUtils.getIntegerValue(values, 1, false);
	}

	public void parse(EDIInputStream eis, String fieldValue) throws IOException {
		String[] elements = eis.getCompositeValue(fieldValue, ELEMENT_COUNT);
		C030_01 = eis.getIntegerValue(elements, 0, true);
		if (C030_01 == null) {
			eis.addError("Field 'C030_01' is mandatory");
		}
		C030_02 = eis.getIntegerValue(elements, 1, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startComposite();
		if (C030_01 == null) {
			eos.addError("Emitting null mandatory field 'C030_01'");
		}
		eos.writeElement(C030_01);
		eos.writeElement(C030_02);
		eos.endComposite();
	}

	public EDIElement createCopy() {
		CompositeC030 copy = new CompositeC030();
		copy.C030_01 = this.C030_01;
		copy.C030_02 = this.C030_02;
		return copy;
	}
}
