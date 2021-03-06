package com.webify.shared.edi.model.hipaa837i.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa837i.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop1000B extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop1000B.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"40"
	};

	// Segments
	private SegmentNM1_2 Nm1;
	public SegmentNM1_2 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_2 seg) { Nm1 = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 1000B");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("NM1")) {
			eis.addError("A single instance of Segment NM1 is required.");
		} else {
			Nm1 = new SegmentNM1_2();
			Nm1.setOrdinal(6);
			Nm1.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Nm1 != null) {
			Nm1.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'NM1'");
		}

	}

	public EDIElement createCopy() {
		Loop1000B thisCopy = new Loop1000B();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_2)Nm1.createCopy());
		}

		return thisCopy;
	}

}
