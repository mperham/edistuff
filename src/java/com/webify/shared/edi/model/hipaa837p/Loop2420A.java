package com.webify.shared.edi.model.hipaa837p;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837p.beans.BaseLoop2420A;

/*
 * BaseLoop2420A subclass, put any business logic in this class
 */
public class Loop2420A extends BaseLoop2420A {

	private static final Log log = LogFactory.getLog(Loop2420A.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
