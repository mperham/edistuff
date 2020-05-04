package com.webify.shared.edi.model.hipaa271;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa271.beans.BaseLoop2110C;

/*
 * BaseLoop2110C subclass, put any business logic in this class
 */
public class Loop2110C extends BaseLoop2110C {

	private static final Log log = LogFactory.getLog(Loop2110C.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
