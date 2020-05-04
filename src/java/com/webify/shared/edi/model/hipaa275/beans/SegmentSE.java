package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentSE implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentSE.class);

	public static final String SEGMENT_NAME = "SE";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private Integer Se01;
	public Integer getSe01() { return Se01; }
	public void setSe01(Integer val) { Se01 = val; }

	private String Se02;
	public String getSe02() { return Se02; }
	public void setSe02(String val) { Se02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment SE on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Se01 = eis.getIntegerValue(fields, 1, true);
		if (Se01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'SE01' missing");
		}
		Se02 = eis.getStringValue(fields, 2, 4, 9, true);
		if (Se02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'SE02' missing");
		}
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("SE");
		eos.writeField(eos.getSegmentsWritten());
		eos.writeField(Se02);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentSE copy = new SegmentSE();
		copy.setLineNumber(this.lineNumber);
		copy.Se01 = this.Se01;
		copy.Se02 = this.Se02;
		return copy;
	}
}