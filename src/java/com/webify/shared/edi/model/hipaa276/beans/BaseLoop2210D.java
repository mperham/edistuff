package com.webify.shared.edi.model.hipaa276.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa276.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2210D extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2210D.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentSVC_2 Svc;
	public SegmentSVC_2 getSvc() { return Svc; }
	public void setSvc(SegmentSVC_2 seg) { Svc = seg; }

	private SegmentREF_1 Ref;
	public SegmentREF_1 getRef() { return Ref; }
	public void setRef(SegmentREF_1 seg) { Ref = seg; }

	private SegmentDTP_1 Dtp;
	public SegmentDTP_1 getDtp() { return Dtp; }
	public void setDtp(SegmentDTP_1 seg) { Dtp = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2210D");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("SVC")) {
			Svc = new SegmentSVC_2();
			Svc.setOrdinal(19);
			Svc.parse(eis);
		}

		if (eis.peekSegment("REF")) {
			Ref = new SegmentREF_1();
			Ref.setOrdinal(20);
			Ref.parse(eis);
		}

		if (!eis.peekSegment("DTP")) {
			eis.addError("A single instance of Segment DTP is required.");
		} else {
			Dtp = new SegmentDTP_1();
			Dtp.setOrdinal(21);
			Dtp.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Svc != null) {
			Svc.emit(eos);
		}

		if (Ref != null) {
			Ref.emit(eos);
		}

		if (Dtp != null) {
			Dtp.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'DTP'");
		}

	}

	public EDIElement createCopy() {
		Loop2210D thisCopy = new Loop2210D();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Svc != null) {
			thisCopy.setSvc((SegmentSVC_2)Svc.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef((SegmentREF_1)Ref.createCopy());
		}

		if (Dtp != null) {
			thisCopy.setDtp((SegmentDTP_1)Dtp.createCopy());
		}

		return thisCopy;
	}

}
