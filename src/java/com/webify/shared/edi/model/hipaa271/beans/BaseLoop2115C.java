package com.webify.shared.edi.model.hipaa271.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa271.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2115C extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2115C.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentIII_1 Iii;
	public SegmentIII_1 getIii() { return Iii; }
	public void setIii(SegmentIII_1 seg) { Iii = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2115C");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("III")) {
			Iii = new SegmentIII_1();
			Iii.setOrdinal(30);
			Iii.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Iii != null) {
			Iii.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2115C thisCopy = new Loop2115C();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Iii != null) {
			thisCopy.setIii((SegmentIII_1)Iii.createCopy());
		}

		return thisCopy;
	}

}