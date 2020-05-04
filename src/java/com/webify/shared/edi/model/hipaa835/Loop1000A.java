package com.webify.shared.edi.model.hipaa835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa835.beans.BaseLoop1000A;

/*
 * BaseLoop1000A subclass, put any business logic in this class
 */
public class Loop1000A extends BaseLoop1000A {

	private static final Log log = LogFactory.getLog(Loop1000A.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
