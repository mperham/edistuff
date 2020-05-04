package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop1000B;

/*
 * BaseLoop1000B subclass, put any business logic in this class
 */
public class Loop1000B extends BaseLoop1000B {

	private static final Log log = LogFactory.getLog(Loop1000B.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
