package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentHI_8 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentHI_8.class);

	public static final String SEGMENT_NAME = "HI";
	public static final int FIELD_COUNT = 12;

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

	private CompositeC022 Hi04;
	public CompositeC022 getHi04() { return Hi04; }
	public void setHi04(CompositeC022 val) { Hi04 = val; }

	private CompositeC022 Hi05;
	public CompositeC022 getHi05() { return Hi05; }
	public void setHi05(CompositeC022 val) { Hi05 = val; }

	private CompositeC022 Hi06;
	public CompositeC022 getHi06() { return Hi06; }
	public void setHi06(CompositeC022 val) { Hi06 = val; }

	private CompositeC022 Hi07;
	public CompositeC022 getHi07() { return Hi07; }
	public void setHi07(CompositeC022 val) { Hi07 = val; }

	private CompositeC022 Hi08;
	public CompositeC022 getHi08() { return Hi08; }
	public void setHi08(CompositeC022 val) { Hi08 = val; }

	private CompositeC022 Hi09;
	public CompositeC022 getHi09() { return Hi09; }
	public void setHi09(CompositeC022 val) { Hi09 = val; }

	private CompositeC022 Hi10;
	public CompositeC022 getHi10() { return Hi10; }
	public void setHi10(CompositeC022 val) { Hi10 = val; }

	private CompositeC022 Hi11;
	public CompositeC022 getHi11() { return Hi11; }
	public void setHi11(CompositeC022 val) { Hi11 = val; }

	private CompositeC022 Hi12;
	public CompositeC022 getHi12() { return Hi12; }
	public void setHi12(CompositeC022 val) { Hi12 = val; }


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
		if (eis.checkBounds(fields, 4, false)) {
			Hi04 = new CompositeC022();
			Hi04.setOrdinal(ordinal + "-" + 4);
			Hi04.parse(eis, fields[4]);
		}
		if (eis.checkBounds(fields, 5, false)) {
			Hi05 = new CompositeC022();
			Hi05.setOrdinal(ordinal + "-" + 5);
			Hi05.parse(eis, fields[5]);
		}
		if (eis.checkBounds(fields, 6, false)) {
			Hi06 = new CompositeC022();
			Hi06.setOrdinal(ordinal + "-" + 6);
			Hi06.parse(eis, fields[6]);
		}
		if (eis.checkBounds(fields, 7, false)) {
			Hi07 = new CompositeC022();
			Hi07.setOrdinal(ordinal + "-" + 7);
			Hi07.parse(eis, fields[7]);
		}
		if (eis.checkBounds(fields, 8, false)) {
			Hi08 = new CompositeC022();
			Hi08.setOrdinal(ordinal + "-" + 8);
			Hi08.parse(eis, fields[8]);
		}
		if (eis.checkBounds(fields, 9, false)) {
			Hi09 = new CompositeC022();
			Hi09.setOrdinal(ordinal + "-" + 9);
			Hi09.parse(eis, fields[9]);
		}
		if (eis.checkBounds(fields, 10, false)) {
			Hi10 = new CompositeC022();
			Hi10.setOrdinal(ordinal + "-" + 10);
			Hi10.parse(eis, fields[10]);
		}
		if (eis.checkBounds(fields, 11, false)) {
			Hi11 = new CompositeC022();
			Hi11.setOrdinal(ordinal + "-" + 11);
			Hi11.parse(eis, fields[11]);
		}
		if (eis.checkBounds(fields, 12, false)) {
			Hi12 = new CompositeC022();
			Hi12.setOrdinal(ordinal + "-" + 12);
			Hi12.parse(eis, fields[12]);
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
		if (Hi04 != null) {
			Hi04.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi05 != null) {
			Hi05.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi06 != null) {
			Hi06.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi07 != null) {
			Hi07.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi08 != null) {
			Hi08.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi09 != null) {
			Hi09.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi10 != null) {
			Hi10.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi11 != null) {
			Hi11.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Hi12 != null) {
			Hi12.emit(eos);
		} else {
			eos.writeNullField();
		}
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentHI_8 copy = new SegmentHI_8();
		copy.setLineNumber(this.lineNumber);
		if (getHi01() != null) copy.setHi01((CompositeC022)getHi01().createCopy());
		if (getHi02() != null) copy.setHi02((CompositeC022)getHi02().createCopy());
		if (getHi03() != null) copy.setHi03((CompositeC022)getHi03().createCopy());
		if (getHi04() != null) copy.setHi04((CompositeC022)getHi04().createCopy());
		if (getHi05() != null) copy.setHi05((CompositeC022)getHi05().createCopy());
		if (getHi06() != null) copy.setHi06((CompositeC022)getHi06().createCopy());
		if (getHi07() != null) copy.setHi07((CompositeC022)getHi07().createCopy());
		if (getHi08() != null) copy.setHi08((CompositeC022)getHi08().createCopy());
		if (getHi09() != null) copy.setHi09((CompositeC022)getHi09().createCopy());
		if (getHi10() != null) copy.setHi10((CompositeC022)getHi10().createCopy());
		if (getHi11() != null) copy.setHi11((CompositeC022)getHi11().createCopy());
		if (getHi12() != null) copy.setHi12((CompositeC022)getHi12().createCopy());
		return copy;
	}
}
