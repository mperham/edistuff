package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentSVD_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentSVD_1.class);

	public static final String SEGMENT_NAME = "SVD";
	public static final int FIELD_COUNT = 6;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Svd01;
	public String getSvd01() { return Svd01; }
	public void setSvd01(String val) { Svd01 = val; }

	private java.math.BigDecimal Svd02;
	public java.math.BigDecimal getSvd02() { return Svd02; }
	public void setSvd02(java.math.BigDecimal val) { Svd02 = val; }

	private CompositeC003 Svd03;
	public CompositeC003 getSvd03() { return Svd03; }
	public void setSvd03(CompositeC003 val) { Svd03 = val; }

	private String Svd04;
	public String getSvd04() { return Svd04; }
	public void setSvd04(String val) { Svd04 = val; }

	private java.math.BigDecimal Svd05;
	public java.math.BigDecimal getSvd05() { return Svd05; }
	public void setSvd05(java.math.BigDecimal val) { Svd05 = val; }

	private Integer Svd06;
	public Integer getSvd06() { return Svd06; }
	public void setSvd06(Integer val) { Svd06 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment SVD on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Svd01 = eis.getStringValue(fields, 1, 2, 80, true);
		if (Svd01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'SVD01' missing");
		}
		Svd02 = eis.getDecimalValue(fields, 2, true);
		if (Svd02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'SVD02' missing");
		}
		if (eis.checkBounds(fields, 3, false)) {
			Svd03 = new CompositeC003();
			Svd03.setOrdinal(ordinal + "-" + 3);
			Svd03.parse(eis, fields[3]);
		}
		Svd04 = eis.getStringValue(fields, 4, 1, 48, true);
		if (Svd04 == null || "".equals(fields[4].trim())) {
			eis.addError("Field 'SVD04' missing");
		}
		Svd05 = eis.getDecimalValue(fields, 5, true);
		if (Svd05 == null || "".equals(fields[5].trim())) {
			eis.addError("Field 'SVD05' missing");
		}
		Svd06 = eis.getIntegerValue(fields, 6, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("SVD");
		if (Svd01 == null) {
			eos.addError("Emitting null mandatory field 'SVD01'");
		}

		eos.writeField(Svd01);
		if (Svd02 == null) {
			eos.addError("Emitting null mandatory field 'SVD02'");
		}

		eos.writeField(Svd02);
		if (Svd03 != null) {
			Svd03.emit(eos);
		} else {
			eos.writeNullField();
		}
		if (Svd04 == null) {
			eos.addError("Emitting null mandatory field 'SVD04'");
		}

		eos.writeField(Svd04);
		if (Svd05 == null) {
			eos.addError("Emitting null mandatory field 'SVD05'");
		}

		eos.writeField(Svd05);
		eos.writeField(Svd06);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentSVD_1 copy = new SegmentSVD_1();
		copy.setLineNumber(this.lineNumber);
		copy.Svd01 = this.Svd01;
		copy.Svd02 = this.Svd02;
		if (getSvd03() != null) copy.setSvd03((CompositeC003)getSvd03().createCopy());
		copy.Svd04 = this.Svd04;
		copy.Svd05 = this.Svd05;
		copy.Svd06 = this.Svd06;
		return copy;
	}
}
