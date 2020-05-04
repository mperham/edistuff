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
public class BaseLoop2330C extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2330C.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"QC"
	};

	// Segments
	private SegmentNM1_8 Nm1;
	public SegmentNM1_8 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_8 seg) { Nm1 = seg; }

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
		if (log.isDebugEnabled()) log.debug("Starting loop 2330C");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("NM1")) {
			Nm1 = new SegmentNM1_8();
			Nm1.setOrdinal(255);
			Nm1.parse(eis);
		}

		while (eis.peekSegment("REF")) {
			if (Ref == null) Ref = new ArrayList();
			SegmentREF_1 tmp = new SegmentREF_1();
			tmp.setOrdinal(256);
			tmp.parse(eis);
			Ref.add(tmp);
			if (Ref.size() > 3) {
				eis.addError("Segment REF has too many instances.  It can only repeat 3 times");
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

		if (Ref != null) {
			int idx = 0, size = Ref.size();
			while (idx < size) {
				getRef(idx++).emit(eos);
			}
		}

	}

	public EDIElement createCopy() {
		Loop2330C thisCopy = new Loop2330C();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_8)Nm1.createCopy());
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
