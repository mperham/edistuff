package com.webify.shared.edi.model.hipaa275;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa275.beans.BaseHipaa275Document;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * BaseHipaa275Document subclass, put any business logic in this class
 */
public class Hipaa275Document extends BaseHipaa275Document {

	private static final Log log = LogFactory.getLog(Hipaa275Document.class);

	static {
		STANDARDS_IDS.add("004050X151,275");
	}

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
