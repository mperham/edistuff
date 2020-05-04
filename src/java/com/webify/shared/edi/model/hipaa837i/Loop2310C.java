package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2310C;

/*
 * BaseLoop2310C subclass, put any business logic in this class
 */
public class Loop2310C extends BaseLoop2310C {

	private static final Log log = LogFactory.getLog(Loop2310C.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
