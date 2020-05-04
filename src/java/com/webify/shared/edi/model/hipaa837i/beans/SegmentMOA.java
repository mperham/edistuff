package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentMOA implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentMOA.class);

	public static final String SEGMENT_NAME = "MOA";
	public static final int FIELD_COUNT = 9;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private java.math.BigDecimal Moa01;
	public java.math.BigDecimal getMoa01() { return Moa01; }
	public void setMoa01(java.math.BigDecimal val) { Moa01 = val; }

	private java.math.BigDecimal Moa02;
	public java.math.BigDecimal getMoa02() { return Moa02; }
	public void setMoa02(java.math.BigDecimal val) { Moa02 = val; }

	private String Moa03;
	public String getMoa03() { return Moa03; }
	public void setMoa03(String val) { Moa03 = val; }

	private String Moa04;
	public String getMoa04() { return Moa04; }
	public void setMoa04(String val) { Moa04 = val; }

	private String Moa05;
	public String getMoa05() { return Moa05; }
	public void setMoa05(String val) { Moa05 = val; }

	private String Moa06;
	public String getMoa06() { return Moa06; }
	public void setMoa06(String val) { Moa06 = val; }

	private String Moa07;
	public String getMoa07() { return Moa07; }
	public void setMoa07(String val) { Moa07 = val; }

	private java.math.BigDecimal Moa08;
	public java.math.BigDecimal getMoa08() { return Moa08; }
	public void setMoa08(java.math.BigDecimal val) { Moa08 = val; }

	private java.math.BigDecimal Moa09;
	public java.math.BigDecimal getMoa09() { return Moa09; }
	public void setMoa09(java.math.BigDecimal val) { Moa09 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment MOA on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Moa01 = eis.getDecimalValue(fields, 1, false);
		Moa02 = eis.getDecimalValue(fields, 2, false);
		Moa03 = eis.getStringValue(fields, 3, 1, 30, false);
		Moa04 = eis.getStringValue(fields, 4, 1, 30, false);
		Moa05 = eis.getStringValue(fields, 5, 1, 30, false);
		Moa06 = eis.getStringValue(fields, 6, 1, 30, false);
		Moa07 = eis.getStringValue(fields, 7, 1, 30, false);
		Moa08 = eis.getDecimalValue(fields, 8, false);
		Moa09 = eis.getDecimalValue(fields, 9, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("MOA");
		eos.writeField(Moa01);
		eos.writeField(Moa02);
		eos.writeField(Moa03);
		eos.writeField(Moa04);
		eos.writeField(Moa05);
		eos.writeField(Moa06);
		eos.writeField(Moa07);
		eos.writeField(Moa08);
		eos.writeField(Moa09);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentMOA copy = new SegmentMOA();
		copy.setLineNumber(this.lineNumber);
		copy.Moa01 = this.Moa01;
		copy.Moa02 = this.Moa02;
		copy.Moa03 = this.Moa03;
		copy.Moa04 = this.Moa04;
		copy.Moa05 = this.Moa05;
		copy.Moa06 = this.Moa06;
		copy.Moa07 = this.Moa07;
		copy.Moa08 = this.Moa08;
		copy.Moa09 = this.Moa09;
		return copy;
	}
}