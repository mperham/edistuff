package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2000A;
import com.webify.shared.edi.model.standard.ProviderInfo;

/*
 * BaseLoop2000A subclass, put any business logic in this class
 */
public class Loop2000A extends BaseLoop2000A {

	private static final Log log = LogFactory.getLog(Loop2000A.class);

    public ProviderInfo getBillingProvider() {
        return getLoop2010AA().getProviderInfo();
    }

    public ProviderInfo getPayToProvider() {
        return (getLoop2010AB() == null) ? getBillingProvider() : getLoop2010AB().getProviderInfo();
    }

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
