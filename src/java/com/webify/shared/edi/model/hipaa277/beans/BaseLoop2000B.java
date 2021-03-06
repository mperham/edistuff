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
public class BaseLoop2000B extends EDILoop {

	private static final Log log = LogFactory.getLog(Loop2000B.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	public static final String[] TRIGGER_VALUES = new String[] {
		"21"
	};

	private List children;
	public void setChildList(List kids) { children = kids; }
	public List getChildList() { 
		if (children == null) return Collections.EMPTY_LIST;
		return children;
	}

	public void addChild(Loop2000C kid) {
		if (children == null) children = new ArrayList();
		children.add(kid);
	}
	public Loop2000C[] getChildren() { 
		List kids = getChildList();
		return (Loop2000C[]) kids.toArray(new Loop2000C[kids.size()]);
	}
	public Loop2000C getChild(int idx) { 
		if (children == null || idx >= children.size()) {
			throw new ArrayIndexOutOfBoundsException(Integer.toString(idx));
		}
		return (Loop2000C) children.get(idx);
	}

	private Loop2000A parent;
	public Loop2000A getParent() { return parent; }
	public void setParent(Loop2000A dad) { parent = dad; }

	// Segments
	private SegmentHL_2 Hl;
	public SegmentHL_2 getHl() { return Hl; }
	public void setHl(SegmentHL_2 seg) { Hl = seg; }


	// Loops
	private List loop2100B;
	public Loop2100B getLoop2100B(int idx) { 
		if (loop2100B == null || idx >= loop2100B.size()) {
			throw new ArrayIndexOutOfBoundsException("loop2100B");
		}
		return (Loop2100B) loop2100B.get(idx);
	}
	public List getLoop2100B() {
		return loop2100B;
	}
	public void setLoop2100B(List loop) { loop2100B = loop; }


	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop 2000B");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (!eis.peekSegment("HL")) {
			eis.addError("A single instance of Segment HL is required.");
		} else {
			Hl = new SegmentHL_2();
			Hl.setOrdinal(6);
			Hl.parse(eis);
		}

		while (true) {
			if (eis.peekSegment("NM1")) {
				if (loop2100B == null) loop2100B = new ArrayList();
				Loop2100B tmp = new Loop2100B();
				tmp.parse(eis);
				loop2100B.add(tmp);
			}
			else {
				break;
			}
		}

		if (loop2100B == null) {
			eis.addError("Loop 2100B must be used.");
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

		if (loop2100B != null) {
			int idx = 0, size = loop2100B.size();
			while (idx < size) {
				getLoop2100B(idx++).emit(eos);
			}
		} else {
			eos.addError("Missing mandatory segment 'LOOP2100B'");
		}

	}

	public EDIElement createCopy() {
		Loop2000B thisCopy = new Loop2000B();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Hl != null) {
			thisCopy.setHl((SegmentHL_2)Hl.createCopy());
		}

		if (loop2100B != null) {
			thisCopy.setLoop2100B(new ArrayList());
			int idx = 0, size = loop2100B.size();
			while (idx < size) {
				thisCopy.getLoop2100B().add(getLoop2100B(idx++).createCopy());
			}
		}

		return thisCopy;
	}

}
