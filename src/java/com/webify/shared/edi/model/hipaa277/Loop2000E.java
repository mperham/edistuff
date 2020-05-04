package com.webify.shared.edi.model.hipaa277;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa277.beans.BaseLoop2000E;

/*
 * BaseLoop2000E subclass, put any business logic in this class
 */
public class Loop2000E extends BaseLoop2000E {

	private static final Log log = LogFactory.getLog(Loop2000E.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
