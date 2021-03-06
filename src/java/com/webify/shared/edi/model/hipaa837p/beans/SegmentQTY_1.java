package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentQTY_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentQTY_1.class);

	public static final String SEGMENT_NAME = "QTY";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Qty01;
	public String getQty01() { return Qty01; }
	public void setQty01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'QTY01' may not be null");
		}
		if (Field673.validateValue(val)) {
			Qty01 = val;
		} else {
			throw new IllegalArgumentException("Field 'QTY01' cannot have value: " + val);
		}
	}

	private java.math.BigDecimal Qty02;
	public java.math.BigDecimal getQty02() { return Qty02; }
	public void setQty02(java.math.BigDecimal val) { Qty02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment QTY on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Qty01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field673.validateInputValue(eis, "QTY01", Qty01, ordinal, 1);
		if (Qty01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'QTY01' missing");
		}
		Qty02 = eis.getDecimalValue(fields, 2, true);
		if (Qty02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'QTY02' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("QTY");
		if (Qty01 == null) {
			eos.addError("Emitting null mandatory field 'QTY01'");
		}

		eos.writeField(Qty01);
		if (Qty02 == null) {
			eos.addError("Emitting null mandatory field 'QTY02'");
		}

		eos.writeField(Qty02);
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentQTY_1 copy = new SegmentQTY_1();
		copy.setLineNumber(this.lineNumber);
		copy.Qty01 = this.Qty01;
		copy.Qty02 = this.Qty02;
		return copy;
	}
}
