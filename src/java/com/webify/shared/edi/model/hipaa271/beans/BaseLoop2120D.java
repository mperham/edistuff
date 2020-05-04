package com.webify.shared.edi.model.hipaa271.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa271.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2120D extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2120D.class);

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

	private SegmentN3_1 N3;
	public SegmentN3_1 getN3() { return N3; }
	public void setN3(SegmentN3_1 seg) { N3 = seg; }

	private SegmentN4_1 N4;
	public SegmentN4_1 getN4() { return N4; }
	public void setN4(SegmentN4_1 seg) { N4 = seg; }

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

	private SegmentPRV_1 Prv;
	public SegmentPRV_1 getPrv() { return Prv; }
	public void setPrv(SegmentPRV_1 seg) { Prv = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2120D");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("NM1")) {
			Nm1 = new SegmentNM1_3();
			Nm1.setOrdinal(57);
			Nm1.parse(eis);
		}

		if (eis.peekSegment("N3")) {
			N3 = new SegmentN3_1();
			N3.setOrdinal(58);
			N3.parse(eis);
		}

		if (eis.peekSegment("N4")) {
			N4 = new SegmentN4_1();
			N4.setOrdinal(59);
			N4.parse(eis);
		}

		while (eis.peekSegment("PER")) {
			if (Per == null) Per = new ArrayList();
			SegmentPER_1 tmp = new SegmentPER_1();
			tmp.setOrdinal(60);
			tmp.parse(eis);
			Per.add(tmp);
			if (Per.size() > 3) {
				eis.addError("Segment PER has too many instances.  It can only repeat 3 times");
				eis.eatSegments("PER");
				break;
			}
		}

		if (eis.peekSegment("PRV")) {
			Prv = new SegmentPRV_1();
			Prv.setOrdinal(61);
			Prv.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Nm1 != null) {
			Nm1.emit(eos);
		}

		if (N3 != null) {
			N3.emit(eos);
		}

		if (N4 != null) {
			N4.emit(eos);
		}

		if (Per != null) {
			int idx = 0, size = Per.size();
			while (idx < size) {
				getPer(idx++).emit(eos);
			}
		}

		if (Prv != null) {
			Prv.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2120D thisCopy = new Loop2120D();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_3)Nm1.createCopy());
		}

		if (N3 != null) {
			thisCopy.setN3((SegmentN3_1)N3.createCopy());
		}

		if (N4 != null) {
			thisCopy.setN4((SegmentN4_1)N4.createCopy());
		}

		if (Per != null) {
			thisCopy.setPer(new ArrayList());
			int idx = 0, size = Per.size();
			while (idx < size) {
				thisCopy.getPer().add(getPer(idx++).createCopy());
			}
		}

		if (Prv != null) {
			thisCopy.setPrv((SegmentPRV_1)Prv.createCopy());
		}

		return thisCopy;
	}

}
