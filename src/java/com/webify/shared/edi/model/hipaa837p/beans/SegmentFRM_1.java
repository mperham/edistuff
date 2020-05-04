package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentFRM_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentFRM_1.class);

	public static final String SEGMENT_NAME = "FRM";
	public static final int FIELD_COUNT = 5;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Frm01;
	public String getFrm01() { return Frm01; }
	public void setFrm01(String val) { Frm01 = val; }

	private String Frm02;
	public String getFrm02() { return Frm02; }
	public void setFrm02(String val) {
		if (Field1073.validateValue(val)) {
			Frm02 = val;
		} else {
			throw new IllegalArgumentException("Field 'FRM02' cannot have value: " + val);
		}
	}

	private String Frm03;
	public String getFrm03() { return Frm03; }
	public void setFrm03(String val) { Frm03 = val; }

	private Date Frm04;
	public Date getFrm04() { return Frm04; }
	public void setFrm04(Date val) { Frm04 = val; }

	private java.math.BigDecimal Frm05;
	public java.math.BigDecimal getFrm05() { return Frm05; }
	public void setFrm05(java.math.BigDecimal val) { Frm05 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment FRM on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Frm01 = eis.getStringValue(fields, 1, 1, 20, true);
		if (Frm01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'FRM01' missing");
		}
		Frm02 = eis.getStringValue(fields, 2, 1, 1, false);
		Field1073.validateInputValue(eis, "FRM02", Frm02, ordinal, 2);
		Frm03 = eis.getStringValue(fields, 3, 1, 30, false);
		Frm04 = eis.getDateValue(fields, 4, false);
		Frm05 = eis.getDecimalValue(fields, 5, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// REQUIRE_ONE_OF
		if (Frm02 == null && Frm03 == null && Frm04 == null && Frm05 == null) {
			eis.addError("Segment 'Frm' requires at least one field of the following to be set: Frm02, Frm03, Frm04, Frm05");
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("FRM");
		if (Frm01 == null) {
			eos.addError("Emitting null mandatory field 'FRM01'");
		}

		eos.writeField(Frm01);
		eos.writeField(Frm02);
		eos.writeField(Frm03);
		eos.writeField(Frm04);
		eos.writeField(Frm05);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentFRM_1 copy = new SegmentFRM_1();
		copy.setLineNumber(this.lineNumber);
		copy.Frm01 = this.Frm01;
		copy.Frm02 = this.Frm02;
		copy.Frm03 = this.Frm03;
		copy.Frm04 = this.Frm04;
		copy.Frm05 = this.Frm05;
		return copy;
	}
}
