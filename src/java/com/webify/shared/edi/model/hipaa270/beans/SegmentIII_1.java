package com.webify.shared.edi.model.hipaa270.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentIII_1 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentIII_1.class);

	public static final String SEGMENT_NAME = "III";
	public static final int FIELD_COUNT = 2;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Iii01;
	public String getIii01() { return Iii01; }
	public void setIii01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'III01' may not be null");
		}
		if (Field1270.validateValue(val)) {
			Iii01 = val;
		} else {
			throw new IllegalArgumentException("Field 'III01' cannot have value: " + val);
		}
	}

	private String Iii02;
	public String getIii02() { return Iii02; }
	public void setIii02(String val) { Iii02 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment III on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Iii01 = eis.getStringValue(fields, 1, 1, 3, true);
		Field1270.validateInputValue(eis, "III01", Iii01, ordinal, 1);
		if (Iii01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'III01' missing");
		}
		Iii02 = eis.getStringValue(fields, 2, 1, 30, true);
		if (Iii02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'III02' missing");
		}
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Iii01 != null) setCount++;
			if (Iii02 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Iii01, Iii02");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("III");
		if (Iii01 == null) {
			eos.addError("Emitting null mandatory field 'III01'");
		}

		eos.writeField(Iii01);
		if (Iii02 == null) {
			eos.addError("Emitting null mandatory field 'III02'");
		}

		eos.writeField(Iii02);
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
		SegmentIII_1 copy = new SegmentIII_1();
		copy.setLineNumber(this.lineNumber);
		copy.Iii01 = this.Iii01;
		copy.Iii02 = this.Iii02;
		return copy;
	}
}
