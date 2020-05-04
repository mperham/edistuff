package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2320;

/*
 * BaseLoop2320 subclass, put any business logic in this class
 */
public class Loop2320 extends BaseLoop2320 {

	private static final Log log = LogFactory.getLog(Loop2320.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
