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
public class BaseLoop2330B extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2330B.class);

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
	private SegmentNM1_2 Nm1;
	public SegmentNM1_2 getNm1() { return Nm1; }
	public void setNm1(SegmentNM1_2 seg) { Nm1 = seg; }

	private SegmentN3_1 N3;
	public SegmentN3_1 getN3() { return N3; }
	public void setN3(SegmentN3_1 seg) { N3 = seg; }

	private SegmentN4_1 N4;
	public SegmentN4_1 getN4() { return N4; }
	public void setN4(SegmentN4_1 seg) { N4 = seg; }

	private SegmentDTP_1 Dtp;
	public SegmentDTP_1 getDtp() { return Dtp; }
	public void setDtp(SegmentDTP_1 seg) { Dtp = seg; }

	private List Ref01;
	public SegmentREF_1 getRef01(int idx) { 
		if (Ref01 == null || idx >= Ref01.size()) {
			throw new ArrayIndexOutOfBoundsException("Ref01");
		}
		return (SegmentREF_1) Ref01.get(idx);
	}
	public List getRef01() {
		return Ref01;
	}
	public void setRef01(List segs) { Ref01 = segs; }

	private SegmentREF_1 Ref02;
	public SegmentREF_1 getRef02() { return Ref02; }
	public void setRef02(SegmentREF_1 seg) { Ref02 = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2330B");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("NM1")) {
			eis.addError("A single instance of Segment NM1 is required.");
		} else {
			Nm1 = new SegmentNM1_2();
			Nm1.setOrdinal(249);
			Nm1.parse(eis);
		}

		if (eis.peekSegment("N3")) {
			N3 = new SegmentN3_1();
			N3.setOrdinal(250);
			N3.parse(eis);
		}

		if (eis.peekSegment("N4")) {
			N4 = new SegmentN4_1();
			N4.setOrdinal(251);
			N4.parse(eis);
		}

		if (eis.peekSegment("DTP")) {
			Dtp = new SegmentDTP_1();
			Dtp.setOrdinal(252);
			Dtp.parse(eis);
		}

		while (eis.peekSegment("REF", 1, new String[] { "2U", "F8", "FY", "NF", "TJ" })) {
			if (Ref01 == null) Ref01 = new ArrayList();
			SegmentREF_1 tmp = new SegmentREF_1();
			tmp.setOrdinal(253);
			tmp.parse(eis);
			Ref01.add(tmp);
			if (Ref01.size() > 2) {
				eis.addError("Segment REF has too many instances.  It can only repeat 2 times");
				eis.eatSegments("REF");
				break;
			}
		}

		if (eis.peekSegment("REF", 1, new String[] { "9F", "G1" })) {
			Ref02 = new SegmentREF_1();
			Ref02.setOrdinal(254);
			Ref02.parse(eis);
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

		if (N3 != null) {
			N3.emit(eos);
		}

		if (N4 != null) {
			N4.emit(eos);
		}

		if (Dtp != null) {
			Dtp.emit(eos);
		}

		if (Ref01 != null) {
			int idx = 0, size = Ref01.size();
			while (idx < size) {
				getRef01(idx++).emit(eos);
			}
		}

		if (Ref02 != null) {
			Ref02.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2330B thisCopy = new Loop2330B();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_2)Nm1.createCopy());
		}

		if (N3 != null) {
			thisCopy.setN3((SegmentN3_1)N3.createCopy());
		}

		if (N4 != null) {
			thisCopy.setN4((SegmentN4_1)N4.createCopy());
		}

		if (Dtp != null) {
			thisCopy.setDtp((SegmentDTP_1)Dtp.createCopy());
		}

		if (Ref01 != null) {
			thisCopy.setRef01(new ArrayList());
			int idx = 0, size = Ref01.size();
			while (idx < size) {
				thisCopy.getRef01().add(getRef01(idx++).createCopy());
			}
		}

		if (Ref02 != null) {
			thisCopy.setRef02((SegmentREF_1)Ref02.createCopy());
		}

		return thisCopy;
	}

}
