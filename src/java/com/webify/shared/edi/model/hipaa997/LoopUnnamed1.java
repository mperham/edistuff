package com.webify.shared.edi.model.hipaa997;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa997.beans.BaseLoopUnnamed1;

/*
 * BaseLoopUnnamed1 subclass, put any business logic in this class
 */
public class LoopUnnamed1 extends BaseLoopUnnamed1 {

	private static final Log log = LogFactory.getLog(LoopUnnamed1.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
