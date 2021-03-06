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
public class BaseLoop2320 extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2320.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentSBR_2 Sbr;
	public SegmentSBR_2 getSbr() { return Sbr; }
	public void setSbr(SegmentSBR_2 seg) { Sbr = seg; }

	private List Cas;
	public SegmentCAS_1 getCas(int idx) { 
		if (Cas == null || idx >= Cas.size()) {
			throw new ArrayIndexOutOfBoundsException("Cas");
		}
		return (SegmentCAS_1) Cas.get(idx);
	}
	public List getCas() {
		return Cas;
	}
	public void setCas(List segs) { Cas = segs; }

	private SegmentAMT_1 Amt01;
	public SegmentAMT_1 getAmt01() { return Amt01; }
	public void setAmt01(SegmentAMT_1 seg) { Amt01 = seg; }

	private SegmentAMT_1 Amt02;
	public SegmentAMT_1 getAmt02() { return Amt02; }
	public void setAmt02(SegmentAMT_1 seg) { Amt02 = seg; }

	private SegmentAMT_1 Amt03;
	public SegmentAMT_1 getAmt03() { return Amt03; }
	public void setAmt03(SegmentAMT_1 seg) { Amt03 = seg; }

	private SegmentAMT_1 Amt04;
	public SegmentAMT_1 getAmt04() { return Amt04; }
	public void setAmt04(SegmentAMT_1 seg) { Amt04 = seg; }

	private SegmentAMT_1 Amt05;
	public SegmentAMT_1 getAmt05() { return Amt05; }
	public void setAmt05(SegmentAMT_1 seg) { Amt05 = seg; }

	private SegmentAMT_1 Amt06;
	public SegmentAMT_1 getAmt06() { return Amt06; }
	public void setAmt06(SegmentAMT_1 seg) { Amt06 = seg; }

	private SegmentAMT_1 Amt07;
	public SegmentAMT_1 getAmt07() { return Amt07; }
	public void setAmt07(SegmentAMT_1 seg) { Amt07 = seg; }

	private SegmentAMT_1 Amt08;
	public SegmentAMT_1 getAmt08() { return Amt08; }
	public void setAmt08(SegmentAMT_1 seg) { Amt08 = seg; }

	private SegmentAMT_1 Amt09;
	public SegmentAMT_1 getAmt09() { return Amt09; }
	public void setAmt09(SegmentAMT_1 seg) { Amt09 = seg; }

	private SegmentAMT_1 Amt10;
	public SegmentAMT_1 getAmt10() { return Amt10; }
	public void setAmt10(SegmentAMT_1 seg) { Amt10 = seg; }

	private SegmentDMG_1 Dmg;
	public SegmentDMG_1 getDmg() { return Dmg; }
	public void setDmg(SegmentDMG_1 seg) { Dmg = seg; }

	private SegmentOI_1 Oi;
	public SegmentOI_1 getOi() { return Oi; }
	public void setOi(SegmentOI_1 seg) { Oi = seg; }

	private SegmentMOA Moa;
	public SegmentMOA getMoa() { return Moa; }
	public void setMoa(SegmentMOA seg) { Moa = seg; }


	// Loops
	private Loop2330A loop2330A;
	public Loop2330A getLoop2330A() { return loop2330A; }
	public void setLoop2330A(Loop2330A loop) { loop2330A = loop; }

	private Loop2330B loop2330B;
	public Loop2330B getLoop2330B() { return loop2330B; }
	public void setLoop2330B(Loop2330B loop) { loop2330B = loop; }

	private Loop2330C loop2330C;
	public Loop2330C getLoop2330C() { return loop2330C; }
	public void setLoop2330C(Loop2330C loop) { loop2330C = loop; }

	private List loop2330D;
	public Loop2330D getLoop2330D(int idx) { 
		if (loop2330D == null || idx >= loop2330D.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2330D");
		}
		return (Loop2330D) loop2330D.get(idx);
	}
	public List getLoop2330D() {
		return loop2330D;
	}
	public void setLoop2330D(List loop) { loop2330D = loop; }

	private Loop2330E loop2330E;
	public Loop2330E getLoop2330E() { return loop2330E; }
	public void setLoop2330E(Loop2330E loop) { loop2330E = loop; }

	private Loop2330F loop2330F;
	public Loop2330F getLoop2330F() { return loop2330F; }
	public void setLoop2330F(Loop2330F loop) { loop2330F = loop; }

	private Loop2330G loop2330G;
	public Loop2330G getLoop2330G() { return loop2330G; }
	public void setLoop2330G(Loop2330G loop) { loop2330G = loop; }

	private Loop2330H loop2330H;
	public Loop2330H getLoop2330H() { return loop2330H; }
	public void setLoop2330H(Loop2330H loop) { loop2330H = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2320");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("SBR")) {
			Sbr = new SegmentSBR_2();
			Sbr.setOrdinal(307);
			Sbr.parse(eis);
		}

		while (eis.peekSegment("CAS")) {
			if (Cas == null) Cas = new ArrayList();
			SegmentCAS_1 tmp = new SegmentCAS_1();
			tmp.setOrdinal(308);
			tmp.parse(eis);
			Cas.add(tmp);
			if (Cas.size() > 5) {
				eis.addError("Segment CAS has too many instances.  It can only repeat 5 times");
				eis.eatSegments("CAS");
				break;
			}
		}

		if (eis.peekSegment("AMT", 1, "D")) {
			Amt01 = new SegmentAMT_1();
			Amt01.setOrdinal(309);
			Amt01.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "AAE")) {
			Amt02 = new SegmentAMT_1();
			Amt02.setOrdinal(310);
			Amt02.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "B6")) {
			Amt03 = new SegmentAMT_1();
			Amt03.setOrdinal(311);
			Amt03.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "F2")) {
			Amt04 = new SegmentAMT_1();
			Amt04.setOrdinal(312);
			Amt04.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "AU")) {
			Amt05 = new SegmentAMT_1();
			Amt05.setOrdinal(313);
			Amt05.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "D8")) {
			Amt06 = new SegmentAMT_1();
			Amt06.setOrdinal(314);
			Amt06.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "DY")) {
			Amt07 = new SegmentAMT_1();
			Amt07.setOrdinal(315);
			Amt07.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "F5")) {
			Amt08 = new SegmentAMT_1();
			Amt08.setOrdinal(316);
			Amt08.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "T")) {
			Amt09 = new SegmentAMT_1();
			Amt09.setOrdinal(317);
			Amt09.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "T2")) {
			Amt10 = new SegmentAMT_1();
			Amt10.setOrdinal(318);
			Amt10.parse(eis);
		}
		if (eis.peekSegment("AMT")) {
			eis.addError("Segment AMT could not be parsed.");
			eis.eatSegments("AMT");
		}

		if (eis.peekSegment("DMG")) {
			Dmg = new SegmentDMG_1();
			Dmg.setOrdinal(319);
			Dmg.parse(eis);
		}

		if (!eis.peekSegment("OI")) {
			eis.addError("A single instance of Segment OI is required.");
		} else {
			Oi = new SegmentOI_1();
			Oi.setOrdinal(320);
			Oi.parse(eis);
		}

		if (eis.peekSegment("MOA")) {
			Moa = new SegmentMOA();
			Moa.setOrdinal(321);
			Moa.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("NM1", 1, Loop2330A.TRIGGER_VALUES)) {
				if (loop2330A != null) {
					eis.addError("Only one instance of Loop 2330A is allowed.");
				} else {
					loop2330A = new Loop2330A();
					loop2330A.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330B.TRIGGER_VALUES)) {
				if (loop2330B != null) {
					eis.addError("Only one instance of Loop 2330B is allowed.");
				} else {
					loop2330B = new Loop2330B();
					loop2330B.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330C.TRIGGER_VALUES)) {
				if (loop2330C != null) {
					eis.addError("Only one instance of Loop 2330C is allowed.");
				} else {
					loop2330C = new Loop2330C();
					loop2330C.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330D.TRIGGER_VALUES)) {
				if (loop2330D == null) loop2330D = new ArrayList();
				Loop2330D tmp = new Loop2330D();
				tmp.parse(eis);
				loop2330D.add(tmp);
			}
			else if (eis.peekSegment("NM1", 1, Loop2330E.TRIGGER_VALUES)) {
				if (loop2330E != null) {
					eis.addError("Only one instance of Loop 2330E is allowed.");
				} else {
					loop2330E = new Loop2330E();
					loop2330E.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330F.TRIGGER_VALUES)) {
				if (loop2330F != null) {
					eis.addError("Only one instance of Loop 2330F is allowed.");
				} else {
					loop2330F = new Loop2330F();
					loop2330F.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330G.TRIGGER_VALUES)) {
				if (loop2330G != null) {
					eis.addError("Only one instance of Loop 2330G is allowed.");
				} else {
					loop2330G = new Loop2330G();
					loop2330G.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2330H.TRIGGER_VALUES)) {
				if (loop2330H != null) {
					eis.addError("Only one instance of Loop 2330H is allowed.");
				} else {
					loop2330H = new Loop2330H();
					loop2330H.parse(eis);
				}
			}
			else {
				break;
			}
		}

		if (loop2330A == null) {
			eis.addError("An instance of Loop 2330A is required.");
		}
		if (loop2330B == null) {
			eis.addError("An instance of Loop 2330B is required.");
		}
		if (loop2330D != null && loop2330D.size() > 2) {
			eis.addError("Loop 2330D has too many instances.  It can repeat only 2 times");
		}
		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Sbr != null) {
			Sbr.emit(eos);
		}

		if (Cas != null) {
			int idx = 0, size = Cas.size();
			while (idx < size) {
				getCas(idx++).emit(eos);
			}
		}

		if (Amt01 != null) {
			Amt01.emit(eos);
		}

		if (Amt02 != null) {
			Amt02.emit(eos);
		}

		if (Amt03 != null) {
			Amt03.emit(eos);
		}

		if (Amt04 != null) {
			Amt04.emit(eos);
		}

		if (Amt05 != null) {
			Amt05.emit(eos);
		}

		if (Amt06 != null) {
			Amt06.emit(eos);
		}

		if (Amt07 != null) {
			Amt07.emit(eos);
		}

		if (Amt08 != null) {
			Amt08.emit(eos);
		}

		if (Amt09 != null) {
			Amt09.emit(eos);
		}

		if (Amt10 != null) {
			Amt10.emit(eos);
		}

		if (Dmg != null) {
			Dmg.emit(eos);
		}

		if (Oi != null) {
			Oi.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'OI'");
		}

		if (Moa != null) {
			Moa.emit(eos);
		}

		if (loop2330A != null) {
			loop2330A.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LOOP2330A'");
		}

		if (loop2330B != null) {
			loop2330B.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LOOP2330B'");
		}

		if (loop2330C != null) {
			loop2330C.emit(eos);
		}

		if (loop2330D != null) {
			int idx = 0, size = loop2330D.size();
			while (idx < size) {
				getLoop2330D(idx++).emit(eos);
			}
		}

		if (loop2330E != null) {
			loop2330E.emit(eos);
		}

		if (loop2330F != null) {
			loop2330F.emit(eos);
		}

		if (loop2330G != null) {
			loop2330G.emit(eos);
		}

		if (loop2330H != null) {
			loop2330H.emit(eos);
		}

	}

	public EDIElement createCopy() {
		Loop2320 thisCopy = new Loop2320();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Sbr != null) {
			thisCopy.setSbr((SegmentSBR_2)Sbr.createCopy());
		}

		if (Cas != null) {
			thisCopy.setCas(new ArrayList());
			int idx = 0, size = Cas.size();
			while (idx < size) {
				thisCopy.getCas().add(getCas(idx++).createCopy());
			}
		}

		if (Amt01 != null) {
			thisCopy.setAmt01((SegmentAMT_1)Amt01.createCopy());
		}

		if (Amt02 != null) {
			thisCopy.setAmt02((SegmentAMT_1)Amt02.createCopy());
		}

		if (Amt03 != null) {
			thisCopy.setAmt03((SegmentAMT_1)Amt03.createCopy());
		}

		if (Amt04 != null) {
			thisCopy.setAmt04((SegmentAMT_1)Amt04.createCopy());
		}

		if (Amt05 != null) {
			thisCopy.setAmt05((SegmentAMT_1)Amt05.createCopy());
		}

		if (Amt06 != null) {
			thisCopy.setAmt06((SegmentAMT_1)Amt06.createCopy());
		}

		if (Amt07 != null) {
			thisCopy.setAmt07((SegmentAMT_1)Amt07.createCopy());
		}

		if (Amt08 != null) {
			thisCopy.setAmt08((SegmentAMT_1)Amt08.createCopy());
		}

		if (Amt09 != null) {
			thisCopy.setAmt09((SegmentAMT_1)Amt09.createCopy());
		}

		if (Amt10 != null) {
			thisCopy.setAmt10((SegmentAMT_1)Amt10.createCopy());
		}

		if (Dmg != null) {
			thisCopy.setDmg((SegmentDMG_1)Dmg.createCopy());
		}

		if (Oi != null) {
			thisCopy.setOi((SegmentOI_1)Oi.createCopy());
		}

		if (Moa != null) {
			thisCopy.setMoa((SegmentMOA)Moa.createCopy());
		}

		if (loop2330A != null) {
			thisCopy.setLoop2330A((Loop2330A)loop2330A.createCopy());
		}

		if (loop2330B != null) {
			thisCopy.setLoop2330B((Loop2330B)loop2330B.createCopy());
		}

		if (loop2330C != null) {
			thisCopy.setLoop2330C((Loop2330C)loop2330C.createCopy());
		}

		if (loop2330D != null) {
			thisCopy.setLoop2330D(new ArrayList());
			int idx = 0, size = loop2330D.size();
			while (idx < size) {
				thisCopy.getLoop2330D().add(getLoop2330D(idx++).createCopy());
			}
		}

		if (loop2330E != null) {
			thisCopy.setLoop2330E((Loop2330E)loop2330E.createCopy());
		}

		if (loop2330F != null) {
			thisCopy.setLoop2330F((Loop2330F)loop2330F.createCopy());
		}

		if (loop2330G != null) {
			thisCopy.setLoop2330G((Loop2330G)loop2330G.createCopy());
		}

		if (loop2330H != null) {
			thisCopy.setLoop2330H((Loop2330H)loop2330H.createCopy());
		}

		return thisCopy;
	}

}
