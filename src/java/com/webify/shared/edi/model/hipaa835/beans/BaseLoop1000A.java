package com.webify.shared.edi.model.hipaa835.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa835.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop1000A extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop1000A.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"PR"
	};

	// Segments
	private SegmentN1_1 N1;
	public SegmentN1_1 getN1() { return N1; }
	public void setN1(SegmentN1_1 seg) { N1 = seg; }

	private SegmentN3_1 N3;
	public SegmentN3_1 getN3() { return N3; }
	public void setN3(SegmentN3_1 seg) { N3 = seg; }

	private SegmentN4_1 N4;
	public SegmentN4_1 getN4() { return N4; }
	public void setN4(SegmentN4_1 seg) { N4 = seg; }

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

	private SegmentPER_1 Per;
	public SegmentPER_1 getPer() { return Per; }
	public void setPer(SegmentPER_1 seg) { Per = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 1000A");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("N1")) {
			eis.addError("A single instance of Segment N1 is required.");
		} else {
			N1 = new SegmentN1_1();
			N1.setOrdinal(8);
			N1.parse(eis);
		}

		if (!eis.peekSegment("N3")) {
			eis.addError("A single instance of Segment N3 is required.");
		} else {
			N3 = new SegmentN3_1();
			N3.setOrdinal(9);
			N3.parse(eis);
		}

		if (!eis.peekSegment("N4")) {
			eis.addError("A single instance of Segment N4 is required.");
		} else {
			N4 = new SegmentN4_1();
			N4.setOrdinal(10);
			N4.parse(eis);
		}

		while (eis.peekSegment("REF")) {
			if (Ref == null) Ref = new ArrayList();
			SegmentREF_1 tmp = new SegmentREF_1();
			tmp.setOrdinal(11);
			tmp.parse(eis);
			Ref.add(tmp);
			if (Ref.size() > 4) {
				eis.addError("Segment REF has too many instances.  It can only repeat 4 times");
				eis.eatSegments("REF");
				break;
			}
		}

		if (eis.peekSegment("PER")) {
			Per = new SegmentPER_1();
			Per.setOrdinal(12);
			Per.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (N1 != null) {
			N1.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'N1'");
		}

		if (N3 != null) {
			N3.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'N3'");
		}

		if (N4 != null) {
			N4.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'N4'");
		}

		if (Ref != null) {
			int idx = 0, size = Ref.size();
			while (idx < size) {
				getRef(idx++).emit(eos);
			}
		}

		if (Per != null) {
			Per.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop1000A thisCopy = new Loop1000A();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (N1 != null) {
			thisCopy.setN1((SegmentN1_1)N1.createCopy());
		}

		if (N3 != null) {
			thisCopy.setN3((SegmentN3_1)N3.createCopy());
		}

		if (N4 != null) {
			thisCopy.setN4((SegmentN4_1)N4.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef(new ArrayList());
			int idx = 0, size = Ref.size();
			while (idx < size) {
				thisCopy.getRef().add(getRef(idx++).createCopy());
			}
		}

		if (Per != null) {
			thisCopy.setPer((SegmentPER_1)Per.createCopy());
		}

		return thisCopy;
	}

}
