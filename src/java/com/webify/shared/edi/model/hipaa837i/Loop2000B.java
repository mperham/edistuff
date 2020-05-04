package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.base837.Common2000B;
import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2000B;
import com.webify.shared.edi.model.standard.SubscriberInfo;

/*
 * BaseLoop2000B subclass, put any business logic in this class
 */
public class Loop2000B extends BaseLoop2000B implements Common2000B {

	private static final Log log = LogFactory.getLog(Loop2000B.class);

    public SubscriberInfo getSubscriberInfo() {
        return getLoop2010BA().getSubscriberInfo();
    }

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
