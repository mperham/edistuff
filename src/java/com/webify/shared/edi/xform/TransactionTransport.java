package com.webify.shared.edi.xform;

import com.webify.shared.edi.model.EDITransaction;

/**
 * Used in EDI document transforms to allow in-line processing of results. For example, when  EDI documents
 * are being debulked, each single claim is written to {@link #transport(EDITransaction) transport(...)}
 * as they become available.
 * @author dranatunga
 * @version $Id: $
 */
public interface TransactionTransport {

    /**
     * Allows the transport to process an EDI document. Implementations should not modify the object
     * passed in, as callers are not required to copy before calling.
     * @param transaction
     */
    void transport(final EDITransaction transaction);
}
