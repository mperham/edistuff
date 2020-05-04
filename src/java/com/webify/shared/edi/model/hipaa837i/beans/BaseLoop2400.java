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
public class BaseLoop2400 extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2400.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentLX_1 Lx;
	public SegmentLX_1 getLx() { return Lx; }
	public void setLx(SegmentLX_1 seg) { Lx = seg; }

	private SegmentSV2_2 Sv2;
	public SegmentSV2_2 getSv2() { return Sv2; }
	public void setSv2(SegmentSV2_2 seg) { Sv2 = seg; }

	private SegmentSV4_1 Sv4;
	public SegmentSV4_1 getSv4() { return Sv4; }
	public void setSv4(SegmentSV4_1 seg) { Sv4 = seg; }

	private List Pwk;
	public SegmentPWK_2 getPwk(int idx) { 
		if (Pwk == null || idx >= Pwk.size()) {
			throw new ArrayIndexOutOfBoundsException("Pwk");
		}
		return (SegmentPWK_2) Pwk.get(idx);
	}
	public List getPwk() {
		return Pwk;
	}
	public void setPwk(List segs) { Pwk = segs; }

	private SegmentDTP_1 Dtp01;
	public SegmentDTP_1 getDtp01() { return Dtp01; }
	public void setDtp01(SegmentDTP_1 seg) { Dtp01 = seg; }

	private SegmentDTP_1 Dtp02;
	public SegmentDTP_1 getDtp02() { return Dtp02; }
	public void setDtp02(SegmentDTP_1 seg) { Dtp02 = seg; }

	private SegmentAMT_1 Amt01;
	public SegmentAMT_1 getAmt01() { return Amt01; }
	public void setAmt01(SegmentAMT_1 seg) { Amt01 = seg; }

	private SegmentAMT_1 Amt02;
	public SegmentAMT_1 getAmt02() { return Amt02; }
	public void setAmt02(SegmentAMT_1 seg) { Amt02 = seg; }

	private SegmentHCP_3 Hcp;
	public SegmentHCP_3 getHcp() { return Hcp; }
	public void setHcp(SegmentHCP_3 seg) { Hcp = seg; }


	// Loops
	private List loop2410;
	public Loop2410 getLoop2410(int idx) { 
		if (loop2410 == null || idx >= loop2410.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2410");
		}
		return (Loop2410) loop2410.get(idx);
	}
	public List getLoop2410() {
		return loop2410;
	}
	public void setLoop2410(List loop) { loop2410 = loop; }

	private Loop2420A loop2420A;
	public Loop2420A getLoop2420A() { return loop2420A; }
	public void setLoop2420A(Loop2420A loop) { loop2420A = loop; }

	private Loop2420B loop2420B;
	public Loop2420B getLoop2420B() { return loop2420B; }
	public void setLoop2420B(Loop2420B loop) { loop2420B = loop; }

	private Loop2420C loop2420C;
	public Loop2420C getLoop2420C() { return loop2420C; }
	public void setLoop2420C(Loop2420C loop) { loop2420C = loop; }

	private Loop2420D loop2420D;
	public Loop2420D getLoop2420D() { return loop2420D; }
	public void setLoop2420D(Loop2420D loop) { loop2420D = loop; }

	private List loop2430;
	public Loop2430 getLoop2430(int idx) { 
		if (loop2430 == null || idx >= loop2430.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2430");
		}
		return (Loop2430) loop2430.get(idx);
	}
	public List getLoop2430() {
		return loop2430;
	}
	public void setLoop2430(List loop) { loop2430 = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2400");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("LX")) {
			eis.addError("A single instance of Segment LX is required.");
		} else {
			Lx = new SegmentLX_1();
			Lx.setOrdinal(267);
			Lx.parse(eis);
		}

		if (!eis.peekSegment("SV2")) {
			eis.addError("A single instance of Segment SV2 is required.");
		} else {
			Sv2 = new SegmentSV2_2();
			Sv2.setOrdinal(268);
			Sv2.parse(eis);
		}

		if (eis.peekSegment("SV4")) {
			Sv4 = new SegmentSV4_1();
			Sv4.setOrdinal(269);
			Sv4.parse(eis);
		}

		while (eis.peekSegment("PWK")) {
			if (Pwk == null) Pwk = new ArrayList();
			SegmentPWK_2 tmp = new SegmentPWK_2();
			tmp.setOrdinal(270);
			tmp.parse(eis);
			Pwk.add(tmp);
			if (Pwk.size() > 5) {
				eis.addError("Segment PWK has too many instances.  It can only repeat 5 times");
				eis.eatSegments("PWK");
				break;
			}
		}

		if (eis.peekSegment("DTP", 1, "472")) {
			Dtp01 = new SegmentDTP_1();
			Dtp01.setOrdinal(271);
			Dtp01.parse(eis);
		}

		if (eis.peekSegment("DTP", 1, "866")) {
			Dtp02 = new SegmentDTP_1();
			Dtp02.setOrdinal(272);
			Dtp02.parse(eis);
		}
		if (eis.peekSegment("DTP")) {
			eis.addError("Segment DTP could not be parsed.");
			eis.eatSegments("DTP");
		}

		if (eis.peekSegment("AMT", 1, "GT")) {
			Amt01 = new SegmentAMT_1();
			Amt01.setOrdinal(273);
			Amt01.parse(eis);
		}

		if (eis.peekSegment("AMT", 1, "N8")) {
			Amt02 = new SegmentAMT_1();
			Amt02.setOrdinal(274);
			Amt02.parse(eis);
		}
		if (eis.peekSegment("AMT")) {
			eis.addError("Segment AMT could not be parsed.");
			eis.eatSegments("AMT");
		}

		if (eis.peekSegment("HCP")) {
			Hcp = new SegmentHCP_3();
			Hcp.setOrdinal(295);
			Hcp.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("LIN")) {
				if (loop2410 == null) loop2410 = new ArrayList();
				Loop2410 tmp = new Loop2410();
				tmp.parse(eis);
				loop2410.add(tmp);
			}
			else if (eis.peekSegment("NM1", 1, Loop2420A.TRIGGER_VALUES)) {
				if (loop2420A != null) {
					eis.addError("Only one instance of Loop 2420A is allowed.");
				} else {
					loop2420A = new Loop2420A();
					loop2420A.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2420B.TRIGGER_VALUES)) {
				if (loop2420B != null) {
					eis.addError("Only one instance of Loop 2420B is allowed.");
				} else {
					loop2420B = new Loop2420B();
					loop2420B.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1", 1, Loop2420C.TRIGGER_VALUES)) {
				if (loop2420C != null) {
					eis.addError("Only one instance of Loop 2420C is allowed.");
				} else {
					loop2420C = new Loop2420C();
					loop2420C.parse(eis);
				}
			}
			else if (eis.peekSegment("NM1")) {
				if (loop2420D != null) {
					eis.addError("Only one instance of Loop 2420D is allowed.");
				} else {
					loop2420D = new Loop2420D();
					loop2420D.parse(eis);
				}
			}
			else if (eis.peekSegment("SVD")) {
				if (loop2430 == null) loop2430 = new ArrayList();
				Loop2430 tmp = new Loop2430();
				tmp.parse(eis);
				loop2430.add(tmp);
			}
			else {
				break;
			}
		}

		if (loop2410 != null && loop2410.size() > 25) {
			eis.addError("Loop 2410 has too many instances.  It can repeat only 25 times");
		}
		if (loop2430 != null && loop2430.size() > 25) {
			eis.addError("Loop 2430 has too many instances.  It can repeat only 25 times");
		}
		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Lx != null) {
			Lx.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LX'");
		}

		if (Sv2 != null) {
			Sv2.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'SV2'");
		}

		if (Sv4 != null) {
			Sv4.emit(eos);
		}

		if (Pwk != null) {
			int idx = 0, size = Pwk.size();
			while (idx < size) {
				getPwk(idx++).emit(eos);
			}
		}

		if (Dtp01 != null) {
			Dtp01.emit(eos);
		}

		if (Dtp02 != null) {
			Dtp02.emit(eos);
		}

		if (Amt01 != null) {
			Amt01.emit(eos);
		}

		if (Amt02 != null) {
			Amt02.emit(eos);
		}

		if (Hcp != null) {
			Hcp.emit(eos);
		}

		if (loop2410 != null) {
			int idx = 0, size = loop2410.size();
			while (idx < size) {
				getLoop2410(idx++).emit(eos);
			}
		}

		if (loop2420A != null) {
			loop2420A.emit(eos);
		}

		if (loop2420B != null) {
			loop2420B.emit(eos);
		}

		if (loop2420C != null) {
			loop2420C.emit(eos);
		}

		if (loop2420D != null) {
			loop2420D.emit(eos);
		}

		if (loop2430 != null) {
			int idx = 0, size = loop2430.size();
			while (idx < size) {
				getLoop2430(idx++).emit(eos);
			}
		}

	}

	public EDIElement createCopy() {
		Loop2400 thisCopy = new Loop2400();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Lx != null) {
			thisCopy.setLx((SegmentLX_1)Lx.createCopy());
		}

		if (Sv2 != null) {
			thisCopy.setSv2((SegmentSV2_2)Sv2.createCopy());
		}

		if (Sv4 != null) {
			thisCopy.setSv4((SegmentSV4_1)Sv4.createCopy());
		}

		if (Pwk != null) {
			thisCopy.setPwk(new ArrayList());
			int idx = 0, size = Pwk.size();
			while (idx < size) {
				thisCopy.getPwk().add(getPwk(idx++).createCopy());
			}
		}

		if (Dtp01 != null) {
			thisCopy.setDtp01((SegmentDTP_1)Dtp01.createCopy());
		}

		if (Dtp02 != null) {
			thisCopy.setDtp02((SegmentDTP_1)Dtp02.createCopy());
		}

		if (Amt01 != null) {
			thisCopy.setAmt01((SegmentAMT_1)Amt01.createCopy());
		}

		if (Amt02 != null) {
			thisCopy.setAmt02((SegmentAMT_1)Amt02.createCopy());
		}

		if (Hcp != null) {
			thisCopy.setHcp((SegmentHCP_3)Hcp.createCopy());
		}

		if (loop2410 != null) {
			thisCopy.setLoop2410(new ArrayList());
			int idx = 0, size = loop2410.size();
			while (idx < size) {
				thisCopy.getLoop2410().add(getLoop2410(idx++).createCopy());
			}
		}

		if (loop2420A != null) {
			thisCopy.setLoop2420A((Loop2420A)loop2420A.createCopy());
		}

		if (loop2420B != null) {
			thisCopy.setLoop2420B((Loop2420B)loop2420B.createCopy());
		}

		if (loop2420C != null) {
			thisCopy.setLoop2420C((Loop2420C)loop2420C.createCopy());
		}

		if (loop2420D != null) {
			thisCopy.setLoop2420D((Loop2420D)loop2420D.createCopy());
		}

		if (loop2430 != null) {
			thisCopy.setLoop2430(new ArrayList());
			int idx = 0, size = loop2430.size();
			while (idx < size) {
				thisCopy.getLoop2430().add(getLoop2430(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}
