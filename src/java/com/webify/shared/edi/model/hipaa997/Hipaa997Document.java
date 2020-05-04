package com.webify.shared.edi.model.hipaa997;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa997.beans.BaseHipaa997Document;

/**
 * BaseHipaa997Document subclass, put any business logic in this class.
 */
public class Hipaa997Document extends BaseHipaa997Document {

    private static final Log log = LogFactory.getLog(Hipaa997Document.class);

    static {
        STANDARDS_IDS.add("004010X098A1,997");
        STANDARDS_IDS.add("004010X092A1,997");
        STANDARDS_IDS.add("004010X096A1,997");
        STANDARDS_IDS.add("004010X093A1,997");
    }

/*
 * Uncomment this to hook into the input validation. This method is called when an EDI file is parsed into
 * a document.
 * protected void validate(EDIInputStream eis) { super.validate(eis); }
 */

}
