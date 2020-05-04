package com.webify.shared.edi.model.hipaa271;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa271.beans.BaseHipaa271Document;

/*
 * BaseHipaa271Document subclass, put any business logic in this class
 */
public class Hipaa271Document extends BaseHipaa271Document {

	private static final Log log = LogFactory.getLog(Hipaa271Document.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
