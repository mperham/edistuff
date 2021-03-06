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
public abstract class BaseHipaa837pDocument extends EDITransaction {

	public static final String DOCUMENT_ID = "837p";
	public static final List STANDARDS_IDS = new ArrayList();

	static {
		STANDARDS_IDS.add("004010X098A1,837");
	}


	private static final Log log = LogFactory.getLog(Hipaa837pDocument.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	private List children;
	public void setChildList(List kids) { children = kids; }
	public List getChildList() { 
		if (children == null) return Collections.EMPTY_LIST;
		return children;
	}

	public void addChild(Loop2000A kid) {
		if (children == null) children = new ArrayList();
		children.add(kid);
	}
	public Loop2000A[] getChildren() { 
		List kids = getChildList();
		return (Loop2000A[]) kids.toArray(new Loop2000A[kids.size()]);
	}
	public Loop2000A getChild(int idx) { 
		if (children == null || idx >= children.size()) {
			throw new ArrayIndexOutOfBoundsException(Integer.toString(idx));
		}
		return (Loop2000A) children.get(idx);
	}

	// Segments
	private SegmentST_1 St;
	public SegmentST_1 getSt() { return St; }
	public void setSt(SegmentST_1 seg) { St = seg; }

	private SegmentBHT_1 Bht;
	public SegmentBHT_1 getBht() { return Bht; }
	public void setBht(SegmentBHT_1 seg) { Bht = seg; }

	private SegmentREF_1 Ref;
	public SegmentREF_1 getRef() { return Ref; }
	public void setRef(SegmentREF_1 seg) { Ref = seg; }

	private SegmentSE_1 Se;
	public SegmentSE_1 getSe() { return Se; }
	public void setSe(SegmentSE_1 seg) { Se = seg; }


	// Loops
	private Loop1000A loop1000A;
	public Loop1000A getLoop1000A() { return loop1000A; }
	public void setLoop1000A(Loop1000A loop) { loop1000A = loop; }

	private Loop1000B loop1000B;
	public Loop1000B getLoop1000B() { return loop1000B; }
	public void setLoop1000B(Loop1000B loop) { loop1000B = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 837p");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("ST")) {
			eis.addError("A single instance of Segment ST is required.");
		} else {
			St = new SegmentST_1();
			St.setOrdinal(1);
			St.parse(eis);
		}

		if (!eis.peekSegment("BHT")) {
			eis.addError("A single instance of Segment BHT is required.");
		} else {
			Bht = new SegmentBHT_1();
			Bht.setOrdinal(2);
			Bht.parse(eis);
		}

		if (!eis.peekSegment("REF")) {
			eis.addError("A single instance of Segment REF is required.");
		} else {
			Ref = new SegmentREF_1();
			Ref.setOrdinal(3);
			Ref.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("NM1", 1, Loop1000A.TRIGGER_VALUES)) {
				if (loop1000A != null) {
					eis.addError("Only one instance of Loop 1000A is allowed.");
				} else {
					loop1000A = new Loop1000A();
					loop1000A.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop1000B.TRIGGER_VALUES)) {
				if (loop1000B != null) {
					eis.addError("Only one instance of Loop 1000B is allowed.");
				} else {
					loop1000B = new Loop1000B();
					loop1000B.parse(eis);
				}
			}
			else {
				break;
			}
		}

		if (loop1000A == null) {
			eis.addError("An instance of Loop 1000A is required.");
		}
		if (loop1000B == null) {
			eis.addError("An instance of Loop 1000B is required.");
		}
		while (eis.peekSegment("HL", 3, Loop2000A.TRIGGER_VALUES)) {
			Loop2000A current2000A = new Loop2000A();
			current2000A.parse(eis);
			current2000A.setParent((Hipaa837pDocument)this);
			while (eis.peekSegment("HL", 3, Loop2000B.TRIGGER_VALUES)) {
				Loop2000B current2000B = new Loop2000B();
				current2000B.parse(eis);
				current2000B.setParent(current2000A);
				while (eis.peekSegment("HL", 3, Loop2000C.TRIGGER_VALUES)) {
					Loop2000C current2000C = new Loop2000C();
					current2000C.parse(eis);
					current2000C.setParent(current2000B);
					current2000C.setEndLineNumber(eis.getCurrentSegmentNumber());
					current2000B.addChild(current2000C);
				}
				current2000B.setEndLineNumber(eis.getCurrentSegmentNumber());
				current2000A.addChild(current2000B);
			}
			current2000A.setEndLineNumber(eis.getCurrentSegmentNumber());
			this.addChild(current2000A);
		}

		if (!eis.peekSegment("SE")) {
			eis.addError("A single instance of Segment SE is required.");
		} else {
			Se = new SegmentSE_1();
			Se.setOrdinal(425);
			Se.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (St != null) {
			St.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'ST'");
		}

		if (Bht != null) {
			Bht.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'BHT'");
		}

		if (Ref != null) {
			Ref.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'REF'");
		}

		if (loop1000A != null) {
			loop1000A.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LOOP1000A'");
		}

		if (loop1000B != null) {
			loop1000B.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LOOP1000B'");
		}

		int hlidx = 1;
		for (int i = 0; i < this.getChildList().size(); i++) {
			Loop2000A current2000A = this.getChild(i);
			int current2000AHL = hlidx++;
			current2000A.getHl().setHl01(Integer.toString(current2000AHL));
			current2000A.getHl().setHl04((current2000A.getChildList().size() > 0 ? "1" : "0"));
			current2000A.emit(eos);
			for (int j = 0; j < current2000A.getChildList().size(); j++) {
				Loop2000B current2000B = current2000A.getChild(j);
				int current2000BHL = hlidx++;
				current2000B.getHl().setHl01(Integer.toString(current2000BHL));
				current2000B.getHl().setHl02(Integer.toString(current2000AHL));
				current2000B.getHl().setHl04((current2000B.getChildList().size() > 0 ? "1" : "0"));
				current2000B.emit(eos);
				for (int k = 0; k < current2000B.getChildList().size(); k++) {
					Loop2000C current2000C = current2000B.getChild(k);
					int current2000CHL = hlidx++;
					current2000C.getHl().setHl01(Integer.toString(current2000CHL));
					current2000C.getHl().setHl02(Integer.toString(current2000BHL));
					current2000C.getHl().setHl04("0");
					current2000C.emit(eos);
				}
			}
		}

		if (Se != null) {
			Se.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'SE'");
		}

	}

	public EDIElement createCopy() {
		Hipaa837pDocument thisCopy = new Hipaa837pDocument();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (St != null) {
			thisCopy.setSt((SegmentST_1)St.createCopy());
		}

		if (Bht != null) {
			thisCopy.setBht((SegmentBHT_1)Bht.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef((SegmentREF_1)Ref.createCopy());
		}

		if (loop1000A != null) {
			thisCopy.setLoop1000A((Loop1000A)loop1000A.createCopy());
		}

		if (loop1000B != null) {
			thisCopy.setLoop1000B((Loop1000B)loop1000B.createCopy());
		}

		for (int i = 0; i < this.getChildList().size(); i++) {
			Loop2000A current2000A = this.getChild(i);
			Loop2000A current2000ACopy = (Loop2000A) current2000A.createCopy();
			thisCopy.addChild(current2000ACopy);
			for (int j = 0; j < current2000A.getChildList().size(); j++) {
				Loop2000B current2000B = current2000A.getChild(j);
				Loop2000B current2000BCopy = (Loop2000B) current2000B.createCopy();
				current2000ACopy.addChild(current2000BCopy);
				for (int k = 0; k < current2000B.getChildList().size(); k++) {
					Loop2000C current2000C = current2000B.getChild(k);
					Loop2000C current2000CCopy = (Loop2000C) current2000C.createCopy();
					current2000BCopy.addChild(current2000CCopy);
				}
			}
		}

		if (Se != null) {
			thisCopy.setSe((SegmentSE_1)Se.createCopy());
		}

		return thisCopy;
	}

}
