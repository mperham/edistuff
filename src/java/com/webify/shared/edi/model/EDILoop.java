package com.webify.shared.edi.model;


/**
 * @author mperham
 * @version $Id: EDILoop.java 2 2004-07-05 20:20:46Z mperham $
 */
public abstract class EDILoop implements EDIElement {

    /**
     * Called on a loop once it has been parsed from an EDI
     * file.  This method should handle any higher level
     * validation required for this loop and its child
     * structures.
     */
    protected void validate(EDIInputStream eis) {
    }

    public abstract int getStartLineNumber();

    public abstract int getEndLineNumber();

}
