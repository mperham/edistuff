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
public class BaseLoop2410 extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2410.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentLIN_1 Lin;
	public SegmentLIN_1 getLin() { return Lin; }
	public void setLin(SegmentLIN_1 seg) { Lin = seg; }

	private SegmentCTP_1 Ctp;
	public SegmentCTP_1 getCtp() { return Ctp; }
	public void setCtp(SegmentCTP_1 seg) { Ctp = seg; }

	private SegmentREF_2 Ref;
	public SegmentREF_2 getRef() { return Ref; }
	public void setRef(SegmentREF_2 seg) { Ref = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2410");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("LIN")) {
			Lin = new SegmentLIN_1();
			Lin.setOrdinal(296);
			Lin.parse(eis);
		}

		if (eis.peekSegment("CTP")) {
			Ctp = new SegmentCTP_1();
			Ctp.setOrdinal(297);
			Ctp.parse(eis);
		}

		if (eis.peekSegment("REF")) {
			Ref = new SegmentREF_2();
			Ref.setOrdinal(298);
			Ref.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Lin != null) {
			Lin.emit(eos);
		}

		if (Ctp != null) {
			Ctp.emit(eos);
		}

		if (Ref != null) {
			Ref.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2410 thisCopy = new Loop2410();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Lin != null) {
			thisCopy.setLin((SegmentLIN_1)Lin.createCopy());
		}

		if (Ctp != null) {
			thisCopy.setCtp((SegmentCTP_1)Ctp.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef((SegmentREF_2)Ref.createCopy());
		}

		return thisCopy;
	}

}
