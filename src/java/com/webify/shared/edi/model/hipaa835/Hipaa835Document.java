package com.webify.shared.edi.model.hipaa835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa835.beans.BaseHipaa835Document;

/*
 * BaseHipaa835Document subclass, put any business logic in this class
 */
public class Hipaa835Document extends BaseHipaa835Document {

	private static final Log log = LogFactory.getLog(Hipaa835Document.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
