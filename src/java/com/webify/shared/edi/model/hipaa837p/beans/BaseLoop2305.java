package com.webify.shared.edi.model.hipaa837p.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa837p.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2305 extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2305.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentCR7_1 Cr7;
	public SegmentCR7_1 getCr7() { return Cr7; }
	public void setCr7(SegmentCR7_1 seg) { Cr7 = seg; }

	private List Hsd;
	public SegmentHSD_1 getHsd(int idx) { 
		if (Hsd == null || idx >= Hsd.size()) {
			throw new ArrayIndexOutOfBoundsException("Hsd");
		}
		return (SegmentHSD_1) Hsd.get(idx);
	}
	public List getHsd() {
		return Hsd;
	}
	public void setHsd(List segs) { Hsd = segs; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2305");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("CR7")) {
			Cr7 = new SegmentCR7_1();
			Cr7.setOrdinal(287);
			Cr7.parse(eis);
		}

		while (eis.peekSegment("HSD")) {
			if (Hsd == null) Hsd = new ArrayList();
			SegmentHSD_1 tmp = new SegmentHSD_1();
			tmp.setOrdinal(288);
			tmp.parse(eis);
			Hsd.add(tmp);
			if (Hsd.size() > 3) {
				eis.addError("Segment HSD has too many instances.  It can only repeat 3 times");
				eis.eatSegments("HSD");
				break;
			}
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Cr7 != null) {
			Cr7.emit(eos);
		}

		if (Hsd != null) {
			int idx = 0, size = Hsd.size();
			while (idx < size) {
				getHsd(idx++).emit(eos);
			}
		}

	}

	public EDIElement createCopy() {
		Loop2305 thisCopy = new Loop2305();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Cr7 != null) {
			thisCopy.setCr7((SegmentCR7_1)Cr7.createCopy());
		}

		if (Hsd != null) {
			thisCopy.setHsd(new ArrayList());
			int idx = 0, size = Hsd.size();
			while (idx < size) {
				thisCopy.getHsd().add(getHsd(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}