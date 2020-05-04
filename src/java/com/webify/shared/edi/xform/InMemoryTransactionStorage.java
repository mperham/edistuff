package com.webify.shared.edi.xform;

import com.webify.shared.edi.model.EDITransaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dranatunga
 * @version $Id: $
 */
public class InMemoryTransactionStorage implements TransactionTransport {

    private final List _storage = new ArrayList();

    public void transport(EDITransaction transaction) {
        _storage.add(transaction.createCopy());
    }

    public List getAll() {
        return Collections.unmodifiableList(_storage);
    }
}
