package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2420C;

/*
 * BaseLoop2420C subclass, put any business logic in this class
 */
public class Loop2420C extends BaseLoop2420C {

	private static final Log log = LogFactory.getLog(Loop2420C.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
