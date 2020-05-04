package com.webify.shared.edi.model.hipaa270.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa270.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2110C extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2110C.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentEQ_2 Eq;
	public SegmentEQ_2 getEq() { return Eq; }
	public void setEq(SegmentEQ_2 seg) { Eq = seg; }

	private SegmentAMT_1 Amt;
	public SegmentAMT_1 getAmt() { return Amt; }
	public void setAmt(SegmentAMT_1 seg) { Amt = seg; }

	private List Iii;
	public SegmentIII_1 getIii(int idx) { 
		if (Iii == null || idx >= Iii.size()) {
			throw new ArrayIndexOutOfBoundsException("Iii");
		}
		return (SegmentIII_1) Iii.get(idx);
	}
	public List getIii() {
		return Iii;
	}
	public void setIii(List segs) { Iii = segs; }

	private SegmentREF_2 Ref;
	public SegmentREF_2 getRef() { return Ref; }
	public void setRef(SegmentREF_2 seg) { Ref = seg; }

	private SegmentDTP_1 Dtp;
	public SegmentDTP_1 getDtp() { return Dtp; }
	public void setDtp(SegmentDTP_1 seg) { Dtp = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2110C");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("EQ")) {
			Eq = new SegmentEQ_2();
			Eq.setOrdinal(22);
			Eq.parse(eis);
		}

		if (eis.peekSegment("AMT")) {
			Amt = new SegmentAMT_1();
			Amt.setOrdinal(23);
			Amt.parse(eis);
		}

		while (eis.peekSegment("III")) {
			if (Iii == null) Iii = new ArrayList();
			SegmentIII_1 tmp = new SegmentIII_1();
			tmp.setOrdinal(24);
			tmp.parse(eis);
			Iii.add(tmp);
			if (Iii.size() > 10) {
				eis.addError("Segment III has too many instances.  It can only repeat 10 times");
				eis.eatSegments("III");
				break;
			}
		}

		if (eis.peekSegment("REF")) {
			Ref = new SegmentREF_2();
			Ref.setOrdinal(25);
			Ref.parse(eis);
		}

		if (eis.peekSegment("DTP")) {
			Dtp = new SegmentDTP_1();
			Dtp.setOrdinal(26);
			Dtp.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Eq != null) {
			Eq.emit(eos);
		}

		if (Amt != null) {
			Amt.emit(eos);
		}

		if (Iii != null) {
			int idx = 0, size = Iii.size();
			while (idx < size) {
				getIii(idx++).emit(eos);
			}
		}

		if (Ref != null) {
			Ref.emit(eos);
		}

		if (Dtp != null) {
			Dtp.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2110C thisCopy = new Loop2110C();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Eq != null) {
			thisCopy.setEq((SegmentEQ_2)Eq.createCopy());
		}

		if (Amt != null) {
			thisCopy.setAmt((SegmentAMT_1)Amt.createCopy());
		}

		if (Iii != null) {
			thisCopy.setIii(new ArrayList());
			int idx = 0, size = Iii.size();
			while (idx < size) {
				thisCopy.getIii().add(getIii(idx++).createCopy());
			}
		}

		if (Ref != null) {
			thisCopy.setRef((SegmentREF_2)Ref.createCopy());
		}

		if (Dtp != null) {
			thisCopy.setDtp((SegmentDTP_1)Dtp.createCopy());
		}

		return thisCopy;
	}

}