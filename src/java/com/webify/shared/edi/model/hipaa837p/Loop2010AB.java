package com.webify.shared.edi.model.hipaa837p;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837p.beans.BaseLoop2010AB;

/*
 * BaseLoop2010AB subclass, put any business logic in this class
 */
public class Loop2010AB extends BaseLoop2010AB {

	private static final Log log = LogFactory.getLog(Loop2010AB.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
