package com.webify.shared.edi.model.hipaa276;

import com.webify.shared.edi.model.*;
import com.webify.shared.edi.model.hipaa276.beans.BaseLoop2200D;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * BaseLoop2200D subclass, put any business logic in this class
 */
public class Loop2200D extends BaseLoop2200D {

    private static final Log log = LogFactory.getLog(Loop2200D.class);

    /*
     * Uncomment this to hook into the input validation.  This method is
     * called when an EDI file is parsed into a document.
    protected void validate(EDIInputStream eis) {
        super.validate(eis);
    }
    */
}
