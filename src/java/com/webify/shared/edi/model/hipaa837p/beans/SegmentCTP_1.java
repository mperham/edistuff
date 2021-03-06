package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentCTP_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentCTP_1.class);

	public static final String SEGMENT_NAME = "CTP";
	public static final int FIELD_COUNT = 5;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private java.math.BigDecimal Ctp03;
	public java.math.BigDecimal getCtp03() { return Ctp03; }
	public void setCtp03(java.math.BigDecimal val) { Ctp03 = val; }

	private java.math.BigDecimal Ctp04;
	public java.math.BigDecimal getCtp04() { return Ctp04; }
	public void setCtp04(java.math.BigDecimal val) { Ctp04 = val; }

	private CompositeC001 Ctp05;
	public CompositeC001 getCtp05() { return Ctp05; }
	public void setCtp05(CompositeC001 val) { Ctp05 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment CTP on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Ctp03 = eis.getDecimalValue(fields, 3, true);
		if (Ctp03 == null || "".equals(fields[3].trim())) {
			eis.addError("Field 'CTP03' missing");
		}
		Ctp04 = eis.getDecimalValue(fields, 4, true);
		if (Ctp04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'CTP04' missing");
		}
		if (eis.checkBounds(fields, 5, true)) {
			Ctp05 = new CompositeC001();
			Ctp05.setOrdinal(ordinal + "-" + 5);
			Ctp05.parse(eis, fields[5]);
		}
		if (Ctp05 == null || "".equals(fields[5].trim())) {
			eis.addError("Field 'CTP05' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Ctp04 != null) setCount++;
			if (Ctp05 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Ctp04, Ctp05");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("CTP");
		eos.writeNullField();
		eos.writeNullField();
		if (Ctp03 == null) {
			eos.addError("Emitting null mandatory field 'CTP03'");
		}

		eos.writeField(Ctp03);
		if (Ctp04 == null) {
			eos.addError("Emitting null mandatory field 'CTP04'");
		}

		eos.writeField(Ctp04);
		if (Ctp05 == null) {
			eos.addError("Emitting null mandatory field 'CTP05'");
		}

		if (Ctp05 != null) {
			Ctp05.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentCTP_1 copy = new SegmentCTP_1();
		copy.setLineNumber(this.lineNumber);
		copy.Ctp03 = this.Ctp03;
		copy.Ctp04 = this.Ctp04;
		if (getCtp05() != null) copy.setCtp05((CompositeC001)getCtp05().createCopy());
		return copy;
	}
}
