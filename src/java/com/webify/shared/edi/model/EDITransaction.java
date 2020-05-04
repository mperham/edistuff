package com.webify.shared.edi.model;


import java.io.IOException;


/**
 * @author mperham
 * @version $Id: EDITransaction.java 2 2004-07-05 20:20:46Z mperham $
 */
public abstract class EDITransaction implements EDIElement {

    public abstract void parse(EDIInputStream eis) throws EDIParseException, IOException;

    protected void validate(EDIInputStream eis) {
    }

}
