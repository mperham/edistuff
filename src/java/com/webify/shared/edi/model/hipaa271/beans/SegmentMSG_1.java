package com.webify.shared.edi.model.hipaa271.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentMSG_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentMSG_1.class);

	public static final String SEGMENT_NAME = "MSG";
	public static final int FIELD_COUNT = 1;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Msg01;
	public String getMsg01() { return Msg01; }
	public void setMsg01(String val) { Msg01 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment MSG on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Msg01 = eis.getStringValue(fields, 1, 1, 264, true);
		if (Msg01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'MSG01' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("MSG");
		if (Msg01 == null) {
			eos.addError("Emitting null mandatory field 'MSG01'");
		}

		eos.writeField(Msg01);
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentMSG_1 copy = new SegmentMSG_1();
		copy.setLineNumber(this.lineNumber);
		copy.Msg01 = this.Msg01;
		return copy;
	}
}
