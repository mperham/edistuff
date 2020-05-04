package com.webify.shared.edi.model.hipaa835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa835.beans.BaseLoop2110;

/*
 * BaseLoop2110 subclass, put any business logic in this class
 */
public class Loop2110 extends BaseLoop2110 {

	private static final Log log = LogFactory.getLog(Loop2110.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
