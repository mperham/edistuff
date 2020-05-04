package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import java.io.*;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class SegmentPWK_2 implements EDIElement {
	private static final Log log = LogFactory.getLog(SegmentPWK_2.class);

	public static final String SEGMENT_NAME = "PWK";
	public static final int FIELD_COUNT = 6;

	private int lineNumber = 0;
	public int getLineNumber() { return lineNumber; }
	/** Do NOT use this method - it is not public by choice... */
	public void setLineNumber(int foo) { lineNumber = foo; }

	private int ordinal = 0;
	public int getOrdinal() { return ordinal; }
	void setOrdinal(int ord) { ordinal = ord; }

	// Fields
	private String Pwk01;
	public String getPwk01() { return Pwk01; }
	public void setPwk01(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'PWK01' may not be null");
		}
		if (Field755.validateValue(val)) {
			Pwk01 = val;
		} else {
			throw new IllegalArgumentException("Field 'PWK01' cannot have value: " + val);
		}
	}

	private String Pwk02;
	public String getPwk02() { return Pwk02; }
	public void setPwk02(String val) {
		if (val == null) {
			throw new NullPointerException("Field 'PWK02' may not be null");
		}
		if (Field756.validateValue(val)) {
			Pwk02 = val;
		} else {
			throw new IllegalArgumentException("Field 'PWK02' cannot have value: " + val);
		}
	}

	private String Pwk05;
	public String getPwk05() { return Pwk05; }
	public void setPwk05(String val) {
		if (Field66.validateValue(val)) {
			Pwk05 = val;
		} else {
			throw new IllegalArgumentException("Field 'PWK05' cannot have value: " + val);
		}
	}

	private String Pwk06;
	public String getPwk06() { return Pwk06; }
	public void setPwk06(String val) { Pwk06 = val; }


	public void parse(EDIInputStream eis) throws IOException {
		lineNumber = eis.getCurrentSegmentNumber();
		if (log.isDebugEnabled()) log.debug("Starting segment PWK on line " + lineNumber);
		String[] fields = eis.readSegment(SEGMENT_NAME, FIELD_COUNT);
		Pwk01 = eis.getStringValue(fields, 1, 2, 2, true);
		Field755.validateInputValue(eis, "PWK01", Pwk01, ordinal, 1);
		if (Pwk01 == null || "".equals(fields[1].trim())) {
			eis.addError("Field 'PWK01' missing");
		}
		Pwk02 = eis.getStringValue(fields, 2, 1, 2, true);
		Field756.validateInputValue(eis, "PWK02", Pwk02, ordinal, 2);
		if (Pwk02 == null || "".equals(fields[2].trim())) {
			eis.addError("Field 'PWK02' missing");
		}
		Pwk05 = eis.getStringValue(fields, 5, 1, 2, false);
		Field66.validateInputValue(eis, "PWK05", Pwk05, ordinal, 5);
		Pwk06 = eis.getStringValue(fields, 6, 2, 80, false);
		validate(eis);
	}

	protected void validate(EDIInputStream eis) {
		// PAIRED
		{
			int setCount = 0;
			if (Pwk05 != null) setCount++;
			if (Pwk06 != null) setCount++;
			if (setCount > 0 && setCount < 2) {
				eis.addError("If any of the following properties are set, all must be set: Pwk05, Pwk06");
			}
		}

	}

	public void emit(EDIOutputStream eos) throws IOException {
		eos.startSegment("PWK");
		if (Pwk01 == null) {
			eos.addError("Emitting null mandatory field 'PWK01'");
		}

		eos.writeField(Pwk01);
		if (Pwk02 == null) {
			eos.addError("Emitting null mandatory field 'PWK02'");
		}

		eos.writeField(Pwk02);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeField(Pwk05);
		eos.writeField(Pwk06);
		eos.writeNullField();
		eos.writeNullField();
		eos.writeNullField();
		eos.endSegment();
	}

	public EDIElement createCopy() {
		SegmentPWK_2 copy = new SegmentPWK_2();
		copy.setLineNumber(this.lineNumber);
		copy.Pwk01 = this.Pwk01;
		copy.Pwk02 = this.Pwk02;
		copy.Pwk05 = this.Pwk05;
		copy.Pwk06 = this.Pwk06;
		return copy;
	}
}
