package com.webify.shared.edi.model.hipaa275;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa275.beans.BaseLoopUnnamed3;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * BaseLoopUnnamed3 subclass, put any business logic in this class
 */
public class LoopUnnamed3 extends BaseLoopUnnamed3 {

	private static final Log log = LogFactory.getLog(LoopUnnamed3.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
