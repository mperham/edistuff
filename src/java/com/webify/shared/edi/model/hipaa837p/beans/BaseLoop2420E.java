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
public class BaseLoop2420E extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2420E.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"DK"
	};

	// Segments
	private SegmentNM1_8 Nm1;
	public SegmentNM1_8 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_8 seg) { Nm1 = seg; }

	private SegmentN2_1 N2;
	public SegmentN2_1 getN2() { return N2; }
	public void setN2(SegmentN2_1 seg) { N2 = seg; }

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
		if (log.isDebugEnabled()) log.debug("Starting loop 2420E");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("NM1")) {
			Nm1 = new SegmentNM1_8();
			Nm1.setOrdinal(408);
			Nm1.parse(eis);
		}

		if (eis.peekSegment("N2")) {
			N2 = new SegmentN2_1();
			N2.setOrdinal(409);
			N2.parse(eis);
		}

		if (eis.peekSegment("N3")) {
			N3 = new SegmentN3_1();
			N3.setOrdinal(410);
			N3.parse(eis);
		}

		if (eis.peekSegment("N4")) {
			N4 = new SegmentN4_1();
			N4.setOrdinal(411);
			N4.parse(eis);
		}

		while (eis.peekSegment("REF")) {
			if (Ref == null) Ref = new ArrayList();
			SegmentREF_1 tmp = new SegmentREF_1();
			tmp.setOrdinal(412);
			tmp.parse(eis);
			Ref.add(tmp);
			if (Ref.size() > 5) {
				eis.addError("Segment REF has too many instances.  It can only repeat 5 times");
				eis.eatSegments("REF");
				break;
			}
		}

		if (eis.peekSegment("PER")) {
			Per = new SegmentPER_1();
			Per.setOrdinal(413);
			Per.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Nm1 != null) {
			Nm1.emit(eos);
		}

		if (N2 != null) {
			N2.emit(eos);
		}

		if (N3 != null) {
			N3.emit(eos);
		}

		if (N4 != null) {
			N4.emit(eos);
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
		Loop2420E thisCopy = new Loop2420E();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_8)Nm1.createCopy());
		}

		if (N2 != null) {
			thisCopy.setN2((SegmentN2_1)N2.createCopy());
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