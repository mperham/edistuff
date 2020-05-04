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
public class BaseLoop2310D extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2310D.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentNM1_3 Nm1;
	public SegmentNM1_3 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_3 seg) { Nm1 = seg; }

	private SegmentPRV_1 Prv;
	public SegmentPRV_1 getPrv() { return Prv; }
	public void setPrv(SegmentPRV_1 seg) { Prv = seg; }

	private List Ref;
	public SegmentREF_1 getRef(int idx) { 
		if (Ref == null || idx >= Ref.size()) {
			throw new ArrayIndexOutOfBoundsException("Ref");
		}
		return (SegmentREF_1) Ref.get(idx);
	}
	public List getRef() {
		return Ref;
	}
	public void setRef(List segs) { Ref = segs; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2310D");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("NM1")) {
			Nm1 = new SegmentNM1_3();
			Nm1.setOrdinal(220);
			Nm1.parse(eis);
		}

		if (eis.peekSegment("PRV")) {
			Prv = new SegmentPRV_1();
			Prv.setOrdinal(221);
			Prv.parse(eis);
		}

		while (eis.peekSegment("REF")) {
			if (Ref == null) Ref = new ArrayList();
			SegmentREF_1 tmp = new SegmentREF_1();
			tmp.setOrdinal(222);
			tmp.parse(eis);
			Ref.add(tmp);
			if (Ref.size() > 5) {
				eis.addError("Segment REF has too many instances.  It can only repeat 5 times");
				eis.eatSegments("REF");
				break;
			}
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Nm1 != null) {
			Nm1.emit(eos);
		}

		if (Prv != null) {
			Prv.emit(eos);
		}

		if (Ref != null) {
			int idx = 0, size = Ref.size();
			while (idx < size) {
				getRef(idx++).emit(eos);
			}
		}

	}

	public EDIElement createCopy() {
		Loop2310D thisCopy = new Loop2310D();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_3)Nm1.createCopy());
		}

		if (Prv != null) {
			thisCopy.setPrv((SegmentPRV_1)Prv.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef(new ArrayList());
			int idx = 0, size = Ref.size();
			while (idx < size) {
				thisCopy.getRef().add(getRef(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}