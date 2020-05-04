package com.webify.shared.edi.model;


/**
 * @author mperham
 * @version $Id: EDIParseException.java 2 2004-07-05 20:20:46Z mperham $
 */
public class EDIParseException extends Exception {

    public EDIParseException() {
        super();
    }

    public EDIParseException(String arg0) {
        super(arg0);
    }

    public EDIParseException(Throwable arg0) {
        super(arg0);
    }

    public EDIParseException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
}
