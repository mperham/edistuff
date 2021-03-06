package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentHI_10 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentHI_10.class);

	public static final String SEGMENT_NAME = "HI";
	public static final int FIELD_COUNT = 3;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private CompositeC022 Hi01;
	public CompositeC022 getHi01() { return Hi01; }
	public void setHi01(CompositeC022 val) { Hi01 = val; }

	private CompositeC022 Hi02;
	public CompositeC022 getHi02() { return Hi02; }
	public void setHi02(CompositeC022 val) { Hi02 = val; }

	private CompositeC022 Hi03;
	public CompositeC022 getHi03() { return Hi03; }
	public void setHi03(CompositeC022 val) { Hi03 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment HI on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		if (eis.checkBounds(fields, 1, true)) {
			Hi01 = new CompositeC022();
			Hi01.setOrdinal(ordinal + "-" + 1);
			Hi01.parse(eis, fields[1]);
		}
		if (Hi01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'HI01' missing");
		}
		if (eis.checkBounds(fields, 2, false)) {
			Hi02 = new CompositeC022();
			Hi02.setOrdinal(ordinal + "-" + 2);
			Hi02.parse(eis, fields[2]);
		}
		if (eis.checkBounds(fields, 3, false)) {
			Hi03 = new CompositeC022();
			Hi03.setOrdinal(ordinal + "-" + 3);
			Hi03.parse(eis, fields[3]);
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("HI");
		if (Hi01 == null) {
			eos.addError("Emitting null mandatory field 'HI01'");
		}

		if (Hi01 != null) {
			Hi01.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi02 != null) {
			Hi02.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi03 != null) {
			Hi03.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentHI_10 copy = new SegmentHI_10();
		copy.setLineNumber(this.lineNumber);
		if (getHi01() != null) copy.setHi01((CompositeC022)getHi01().createCopy());
		if (getHi02() != null) copy.setHi02((CompositeC022)getHi02().createCopy());
		if (getHi03() != null) copy.setHi03((CompositeC022)getHi03().createCopy());
		return copy;
	}
}
