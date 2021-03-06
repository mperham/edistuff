package com.webify.shared.edi.model.hipaa275.beans;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa275.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.*;

/*
 * AUTOGENERATED FILE - DO NOT EDIT!!!
 */
public class BaseLoopUnnamed4 extends EDILoop {

	private static final Log log = LogFactory.getLog(LoopUnnamed4.class);

	private int startLineNumber, endLineNumber;
	public int getStartLineNumber() { return startLineNumber; }
	public int getEndLineNumber() { return endLineNumber; }

	/** Do NOT use this method - it is not public by choice... */
	public void setEndLineNumber(int foo) { endLineNumber = foo; }
	/** Do NOT use this method - it is not public by choice... */
	public void setStartLineNumber(int foo) { startLineNumber = foo; }

	// Segments
	private SegmentEFI Efi;
	public SegmentEFI getEfi() { return Efi; }
	public void setEfi(SegmentEFI seg) { Efi = seg; }

	private SegmentBIN Bin;
	public SegmentBIN getBin() { return Bin; }
	public void setBin(SegmentBIN seg) { Bin = seg; }


	// Loops

	public void parse(EDIInputStream eis) throws IOException {
		if (log.isDebugEnabled()) log.debug("Starting loop Unnamed4");
		startLineNumber = eis.getCurrentSegmentNumber() + 1;

		if (eis.peekSegment("EFI")) {
			Efi = new SegmentEFI();
			Efi.setOrdinal(25);
			Efi.parse(eis);
		}

		if (!eis.peekSegment("BIN")) {
			eis.addError("A single instance of Segment BIN is required.");
		} else {
			Bin = new SegmentBIN();
			Bin.setOrdinal(26);
			Bin.parse(eis);
		}

		endLineNumber = eis.getCurrentSegmentNumber();
		validate(eis);
	}

	public void emit(EDIOutputStream eos) throws IOException {
		if (Efi != null) {
			Efi.emit(eos);
		}

		if (Bin != null) {
			Bin.emit(eos);
		} else {
			eos.addError("Missing mandatory segment 'BIN'");
		}

	}

	public EDIElement createCopy() {
		LoopUnnamed4 thisCopy = new LoopUnnamed4();
		thisCopy.setStartLineNumber(this.startLineNumber);
		thisCopy.setEndLineNumber(this.endLineNumber);

		if (Efi != null) {
			thisCopy.setEfi((SegmentEFI)Efi.createCopy());
		}

		if (Bin != null) {
			thisCopy.setBin((SegmentBIN)Bin.createCopy());
		}

		return thisCopy;
	}

}
