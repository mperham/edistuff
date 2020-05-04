package com.webify.shared.edi.model.hipaa997.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa997.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoopUnnamed0 extends EDILoop {

	private static final Log log = LogFactory.getLog(LoopUnnamed0.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentAK2 Ak2;
	public SegmentAK2 getAk2() { return Ak2; }
	public void setAk2(SegmentAK2 seg) { Ak2 = seg; }

	private SegmentAK5 Ak5;
	public SegmentAK5 getAk5() { return Ak5; }
	public void setAk5(SegmentAK5 seg) { Ak5 = seg; }


	// Loops
	private List loopUnnamed1;
	public LoopUnnamed1 getLoopUnnamed1(int idx) { 
		if (loopUnnamed1 == null || idx >= loopUnnamed1.size()) {
			throw new ArrayIndexOutOfBoundsException("loopUnnamed1");
		}
		return (LoopUnnamed1) loopUnnamed1.get(idx);
	}
	public List getLoopUnnamed1() {
		return loopUnnamed1;
	}
	public void setLoopUnnamed1(List loop) { loopUnnamed1 = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop Unnamed0");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("AK2")) {
			Ak2 = new SegmentAK2();
			Ak2.setOrdinal(3);
			Ak2.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("AK3")) {
				if (loopUnnamed1 == null) loopUnnamed1 = new ArrayList();
				LoopUnnamed1 tmp = new LoopUnnamed1();
				tmp.parse(eis);
				loopUnnamed1.add(tmp);
			}
			else {
				break;
			}
		}

		if (loopUnnamed1 != null && loopUnnamed1.size() > 16959) {
			eis.addError("Loop Unnamed1 has too many instances.  It can repeat only 16959 times");
		}
		if (!eis.peekSegment("AK5")) {
			eis.addError("A single instance of Segment AK5 is required.");
		} else {
			Ak5 = new SegmentAK5();
			Ak5.setOrdinal(6);
			Ak5.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Ak2 != null) {
			Ak2.emit(eos);
		}

		if (loopUnnamed1 != null) {
			int idx = 0, size = loopUnnamed1.size();
			while (idx < size) {
				getLoopUnnamed1(idx++).emit(eos);
			}
		}

		if (Ak5 != null) {
			Ak5.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'AK5'");
		}

	}

	public EDIElement createCopy() {
		LoopUnnamed0 thisCopy = new LoopUnnamed0();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Ak2 != null) {
			thisCopy.setAk2((SegmentAK2)Ak2.createCopy());
		}

		if (loopUnnamed1 != null) {
			thisCopy.setLoopUnnamed1(new ArrayList());
			int idx = 0, size = loopUnnamed1.size();
			while (idx < size) {
				thisCopy.getLoopUnnamed1().add(getLoopUnnamed1(idx++).createCopy());
			}
		}

		if (Ak5 != null) {
			thisCopy.setAk5((SegmentAK5)Ak5.createCopy());
		}

		return thisCopy;
	}

}