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
		"41"
	};

	// Segments
	private SegmentNM1_1 Nm1;
	public SegmentNM1_1 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_1 seg) { Nm1 = seg; }

	private SegmentN2_1 N2;
	public SegmentN2_1 getN2() { return N2; }
	public void setN2(SegmentN2_1 seg) { N2 = seg; }

	private List Per;
	public SegmentPER_1 getPer(int idx) { 
		if (Per == null || idx >= Per.size()) {
			throw new ArrayIndexOutOfBoundsException("Per");
		}
		return (SegmentPER_1) Per.get(idx);
	}
	public List getPer() {
		return Per;
	}
	public void setPer(List segs) { Per = segs; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 1000A");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("NM1")) {
			eis.addError("A single instance of Segment NM1 is required.");
		} else {
			Nm1 = new SegmentNM1_1();
			Nm1.setOrdinal(4);
			Nm1.parse(eis);
		}

		if (eis.peekSegment("N2")) {
			N2 = new SegmentN2_1();
			N2.setOrdinal(5);
			N2.parse(eis);
		}

		while (eis.peekSegment("PER")) {
			if (Per == null) Per = new ArrayList();
			SegmentPER_1 tmp = new SegmentPER_1();
			tmp.setOrdinal(6);
			tmp.parse(eis);
			Per.add(tmp);
			if (Per.size() > 2) {
				eis.addError("Segment PER has too many instances.  It can only repeat 2 times");
				eis.eatSegments("PER");
				break;
			}
		}
		if (Per.size() == 0) {
			eis.addError("Segment 'PER' is marked MUST_USE.  It is required but no instances were found.");
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Nm1 != null) {
			Nm1.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'NM1'");
		}

		if (N2 != null) {
			N2.emit(eos);
		}

		if (Per != null) {
			int idx = 0, size = Per.size();
			while (idx < size) {
				getPer(idx++).emit(eos);
			}
		} else {
			eos.addError("Missing mandatory segment 'PER'");
		}

	}

	public EDIElement createCopy() {
		Loop1000A thisCopy = new Loop1000A();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_1)Nm1.createCopy());
		}

		if (N2 != null) {
			thisCopy.setN2((SegmentN2_1)N2.createCopy());
		}

		if (Per != null) {
			thisCopy.setPer(new ArrayList());
			int idx = 0, size = Per.size();
			while (idx < size) {
				thisCopy.getPer().add(getPer(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}