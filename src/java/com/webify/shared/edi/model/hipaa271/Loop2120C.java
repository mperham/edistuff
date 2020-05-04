package com.webify.shared.edi.model.hipaa271;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa271.beans.BaseLoop2120C;

/*
 * BaseLoop2120C subclass, put any business logic in this class
 */
public class Loop2120C extends BaseLoop2120C {

	private static final Log log = LogFactory.getLog(Loop2120C.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
