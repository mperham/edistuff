package com.webify.shared.edi.model.hipaa277;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa277.beans.BaseHipaa277Document;

/*
 * BaseHipaa277Document subclass, put any business logic in this class
 */
public class Hipaa277Document extends BaseHipaa277Document {

	private static final Log log = LogFactory.getLog(Hipaa277Document.class);

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
