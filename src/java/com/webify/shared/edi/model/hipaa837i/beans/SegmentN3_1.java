package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentN3_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentN3_1.class);

	public static final String SEGMENT_NAME = "N3";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String N301;
	public String getN301() { return N301; }
	public void setN301(String val) { N301 = val; }

	private String N302;
	public String getN302() { return N302; }
	public void setN302(String val) { N302 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment N3 on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		N301 = eis.getStringValue(fields, 1, 1, 55, true);
		if (N301 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'N301' missing");
		}
		N302 = eis.getStringValue(fields, 2, 1, 55, false);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("N3");
		if (N301 == null) {
			eos.addError("Emitting null mandatory field 'N301'");
		}

		eos.writeField(N301);
		eos.writeField(N302);
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentN3_1 copy = new SegmentN3_1();
		copy.setLineNumber(this.lineNumber);
		copy.N301 = this.N301;
		copy.N302 = this.N302;
		return copy;
	}
}
