package com.webify.shared.edi.model.hipaa277.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa277.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoop2000D extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2000D.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"22"
	};

	private List children;
	public void setChildList(List kids) { children = kids; }
	public List getChildList() { 
		if (children == null) return Collections.EMPTY_LIST;
		return children;
	}

	public void addChild(Loop2000E kid) {
		if (children == null) children = new ArrayList();
		children.add(kid);
	}
	public Loop2000E[] getChildren() { 
		List kids = getChildList();
		return (Loop2000E[]) kids.toArray(new Loop2000E[kids.size()]);
	}
	public Loop2000E getChild(int idx) { 
		if (children == null || idx >= children.size()) {
			throw new ArrayIndexOutOfBoundsException(Integer.toString(idx));
		}
		return (Loop2000E) children.get(idx);
	}

	private Loop2000C parent;
	public Loop2000C getParent() { return parent; }
	public void setParent(Loop2000C dad) { parent = dad; }

	// Segments
	private SegmentHL_2 Hl;
	public SegmentHL_2 getHl() { return Hl; }
	public void setHl(SegmentHL_2 seg) { Hl = seg; }

	private SegmentDMG_1 Dmg;
	public SegmentDMG_1 getDmg() { return Dmg; }
	public void setDmg(SegmentDMG_1 seg) { Dmg = seg; }


	// Loops
	private Loop2100D loop2100D;
	public Loop2100D getLoop2100D() { return loop2100D; }
	public void setLoop2100D(Loop2100D loop) { loop2100D = loop; }

	private List loop2200D;
	public Loop2200D getLoop2200D(int idx) { 
		if (loop2200D == null || idx >= loop2200D.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2200D");
		}
		return (Loop2200D) loop2200D.get(idx);
	}
	public List getLoop2200D() {
		return loop2200D;
	}
	public void setLoop2200D(List loop) { loop2200D = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2000D");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("HL")) {
			eis.addError("A single instance of Segment HL is required.");
		} else {
			Hl = new SegmentHL_2();
			Hl.setOrdinal(10);
			Hl.parse(eis);
		}

		if (eis.peekSegment("DMG")) {
			Dmg = new SegmentDMG_1();
			Dmg.setOrdinal(11);
			Dmg.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("NM1")) {
				if (loop2100D != null) {
					eis.addError("Only one instance of Loop 2100D is allowed.");
				} else {
					loop2100D = new Loop2100D();
					loop2100D.parse(eis);
				}
			}
			else if (eis.peekSegment("TRN")) {
				if (loop2200D == null) loop2200D = new ArrayList();
				Loop2200D tmp = new Loop2200D();
				tmp.parse(eis);
				loop2200D.add(tmp);
			}
			else {
				break;
			}
		}

		if (loop2100D == null) {
			eis.addError("An instance of Loop 2100D is required.");
		}
		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Hl != null) {
			Hl.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'HL'");
		}

		if (Dmg != null) {
			Dmg.emit(eos);
		}

		if (loop2100D != null) {
			loop2100D.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'LOOP2100D'");
		}

		if (loop2200D != null) {
			int idx = 0, size = loop2200D.size();
			while (idx < size) {
				getLoop2200D(idx++).emit(eos);
			}
		}

	}

	public EDIElement createCopy() {
		Loop2000D thisCopy = new Loop2000D();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Hl != null) {
			thisCopy.setHl((SegmentHL_2)Hl.createCopy());
		}

		if (Dmg != null) {
			thisCopy.setDmg((SegmentDMG_1)Dmg.createCopy());
		}

		if (loop2100D != null) {
			thisCopy.setLoop2100D((Loop2100D)loop2100D.createCopy());
		}

		if (loop2200D != null) {
			thisCopy.setLoop2200D(new ArrayList());
			int idx = 0, size = loop2200D.size();
			while (idx < size) {
				thisCopy.getLoop2200D().add(getLoop2200D(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}
