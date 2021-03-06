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
public class BaseLoop2000 extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2000.class);

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

	private SegmentTS3_1 Ts3;
	public SegmentTS3_1 getTs3() { return Ts3; }
	public void setTs3(SegmentTS3_1 seg) { Ts3 = seg; }

	private SegmentTS2 Ts2;
	public SegmentTS2 getTs2() { return Ts2; }
	public void setTs2(SegmentTS2 seg) { Ts2 = seg; }


	// Loops
	private List loop2100;
	public Loop2100 getLoop2100(int idx) { 
		if (loop2100 == null || idx >= loop2100.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2100");
		}
		return (Loop2100) loop2100.get(idx);
	}
	public List getLoop2100() {
		return loop2100;
	}
	public void setLoop2100(List loop) { loop2100 = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2000");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("LX")) {
			Lx = new SegmentLX_1();
			Lx.setOrdinal(17);
			Lx.parse(eis);
		}

		if (eis.peekSegment("TS3")) {
			Ts3 = new SegmentTS3_1();
			Ts3.setOrdinal(18);
			Ts3.parse(eis);
		}

		if (eis.peekSegment("TS2")) {
			Ts2 = new SegmentTS2();
			Ts2.setOrdinal(19);
			Ts2.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("CLP")) {
				if (loop2100 == null) loop2100 = new ArrayList();
				Loop2100 tmp = new Loop2100();
				tmp.parse(eis);
				loop2100.add(tmp);
			}
			else {
				break;
			}
		}

		if (loop2100 == null) {
			eis.addError("Loop 2100 must be used.");
		}
		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Lx != null) {
			Lx.emit(eos);
		}

		if (Ts3 != null) {
			Ts3.emit(eos);
		}

		if (Ts2 != null) {
			Ts2.emit(eos);
		}

		if (loop2100 != null) {
			int idx = 0, size = loop2100.size();
			while (idx < size) {
				getLoop2100(idx++).emit(eos);
			}
		} else {
			eos.addError("Missing mandatory segment 'LOOP2100'");
		}

	}

	public EDIElement createCopy() {
		Loop2000 thisCopy = new Loop2000();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Lx != null) {
			thisCopy.setLx((SegmentLX_1)Lx.createCopy());
		}

		if (Ts3 != null) {
			thisCopy.setTs3((SegmentTS3_1)Ts3.createCopy());
		}

		if (Ts2 != null) {
			thisCopy.setTs2((SegmentTS2)Ts2.createCopy());
		}

		if (loop2100 != null) {
			thisCopy.setLoop2100(new ArrayList());
			int idx = 0, size = loop2100.size();
			while (idx < size) {
				thisCopy.getLoop2100().add(getLoop2100(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}
