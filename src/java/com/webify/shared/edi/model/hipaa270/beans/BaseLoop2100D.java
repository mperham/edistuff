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
public class BaseLoop2100D extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2100D.class);

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

	private List Ref;
	public SegmentREF_2 getRef(int idx) { 
		if (Ref == null || idx >= Ref.size()) {
			throw new ArrayIndexOutOfBoundsException("Ref");
		}
		return (SegmentREF_2) Ref.get(idx);
	}
	public List getRef() {
		return Ref;
	}
	public void setRef(List segs) { Ref = segs; }

	private SegmentN3_1 N3;
	public SegmentN3_1 getN3() { return N3; }
	public void setN3(SegmentN3_1 seg) { N3 = seg; }

	private SegmentN4_2 N4;
	public SegmentN4_2 getN4() { return N4; }
	public void setN4(SegmentN4_2 seg) { N4 = seg; }

	private SegmentPRV_1 Prv;
	public SegmentPRV_1 getPrv() { return Prv; }
	public void setPrv(SegmentPRV_1 seg) { Prv = seg; }

	private SegmentDMG_1 Dmg;
	public SegmentDMG_1 getDmg() { return Dmg; }
	public void setDmg(SegmentDMG_1 seg) { Dmg = seg; }

	private SegmentINS_2 Ins;
	public SegmentINS_2 getIns() { return Ins; }
	public void setIns(SegmentINS_2 seg) { Ins = seg; }

	private List Dtp;
	public SegmentDTP_1 getDtp(int idx) { 
		if (Dtp == null || idx >= Dtp.size()) {
			throw new ArrayIndexOutOfBoundsException("Dtp");
		}
		return (SegmentDTP_1) Dtp.get(idx);
	}
	public List getDtp() {
		return Dtp;
	}
	public void setDtp(List segs) { Dtp = segs; }


	// Loops
	private List loop2110D;
	public Loop2110D getLoop2110D(int idx) { 
		if (loop2110D == null || idx >= loop2110D.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2110D");
		}
		return (Loop2110D) loop2110D.get(idx);
	}
	public List getLoop2110D() {
		return loop2110D;
	}
	public void setLoop2110D(List loop) { loop2110D = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2100D");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("NM1")) {
			eis.addError("A single instance of Segment NM1 is required.");
		} else {
			Nm1 = new SegmentNM1_3();
			Nm1.setOrdinal(29);
			Nm1.parse(eis);
		}

		while (eis.peekSegment("REF")) {
			if (Ref == null) Ref = new ArrayList();
			SegmentREF_2 tmp = new SegmentREF_2();
			tmp.setOrdinal(30);
			tmp.parse(eis);
			Ref.add(tmp);
			if (Ref.size() > 9) {
				eis.addError("Segment REF has too many instances.  It can only repeat 9 times");
				eis.eatSegments("REF");
				break;
			}
		}

		if (eis.peekSegment("N3")) {
			N3 = new SegmentN3_1();
			N3.setOrdinal(31);
			N3.parse(eis);
		}

		if (eis.peekSegment("N4")) {
			N4 = new SegmentN4_2();
			N4.setOrdinal(32);
			N4.parse(eis);
		}

		if (eis.peekSegment("PRV")) {
			Prv = new SegmentPRV_1();
			Prv.setOrdinal(33);
			Prv.parse(eis);
		}

		if (eis.peekSegment("DMG")) {
			Dmg = new SegmentDMG_1();
			Dmg.setOrdinal(34);
			Dmg.parse(eis);
		}

		if (eis.peekSegment("INS")) {
			Ins = new SegmentINS_2();
			Ins.setOrdinal(35);
			Ins.parse(eis);
		}

		while (eis.peekSegment("DTP")) {
			if (Dtp == null) Dtp = new ArrayList();
			SegmentDTP_1 tmp = new SegmentDTP_1();
			tmp.setOrdinal(36);
			tmp.parse(eis);
			Dtp.add(tmp);
			if (Dtp.size() > 2) {
				eis.addError("Segment DTP has too many instances.  It can only repeat 2 times");
				eis.eatSegments("DTP");
				break;
			}
		}

		while (true) {
			if (eis.peekSegment("EQ")) {
				if (loop2110D == null) loop2110D = new ArrayList();
				Loop2110D tmp = new Loop2110D();
				tmp.parse(eis);
				loop2110D.add(tmp);
			}
			else {
				break;
			}
		}

		if (loop2110D == null) {
			eis.addError("Loop 2110D must be used.");
		}
		if (loop2110D != null && loop2110D.size() > 99) {
			eis.addError("Loop 2110D has too many instances.  It can repeat only 99 times");
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

		if (Ref != null) {
			int idx = 0, size = Ref.size();
			while (idx < size) {
				getRef(idx++).emit(eos);
			}
		}

		if (N3 != null) {
			N3.emit(eos);
		}

		if (N4 != null) {
			N4.emit(eos);
		}

		if (Prv != null) {
			Prv.emit(eos);
		}

		if (Dmg != null) {
			Dmg.emit(eos);
		}

		if (Ins != null) {
			Ins.emit(eos);
		}

		if (Dtp != null) {
			int idx = 0, size = Dtp.size();
			while (idx < size) {
				getDtp(idx++).emit(eos);
			}
		}

		if (loop2110D != null) {
			int idx = 0, size = loop2110D.size();
			while (idx < size) {
				getLoop2110D(idx++).emit(eos);
			}
		} else {
			eos.addError("Missing mandatory segment 'LOOP2110D'");
		}

	}

	public EDIElement createCopy() {
		Loop2100D thisCopy = new Loop2100D();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Nm1 != null) {
			thisCopy.setNm1((SegmentNM1_3)Nm1.createCopy());
		}

		if (Ref != null) {
			thisCopy.setRef(new ArrayList());
			int idx = 0, size = Ref.size();
			while (idx < size) {
				thisCopy.getRef().add(getRef(idx++).createCopy());
			}
		}

		if (N3 != null) {
			thisCopy.setN3((SegmentN3_1)N3.createCopy());
		}

		if (N4 != null) {
			thisCopy.setN4((SegmentN4_2)N4.createCopy());
		}

		if (Prv != null) {
			thisCopy.setPrv((SegmentPRV_1)Prv.createCopy());
		}

		if (Dmg != null) {
			thisCopy.setDmg((SegmentDMG_1)Dmg.createCopy());
		}

		if (Ins != null) {
			thisCopy.setIns((SegmentINS_2)Ins.createCopy());
		}

		if (Dtp != null) {
			thisCopy.setDtp(new ArrayList());
			int idx = 0, size = Dtp.size();
			while (idx < size) {
				thisCopy.getDtp().add(getDtp(idx++).createCopy());
			}
		}

		if (loop2110D != null) {
			thisCopy.setLoop2110D(new ArrayList());
			int idx = 0, size = loop2110D.size();
			while (idx < size) {
				thisCopy.getLoop2110D().add(getLoop2110D(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}
