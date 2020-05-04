package com.webify.shared.edi.model.hipaa275;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa275.beans.BaseLoopUnnamed4;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * BaseLoopUnnamed4 subclass, put any business logic in this class
 */
public class LoopUnnamed4 extends BaseLoopUnnamed4 {

	private static final Log log = LogFactory.getLog(LoopUnnamed4.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
