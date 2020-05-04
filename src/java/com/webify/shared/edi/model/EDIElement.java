package com.webify.shared.edi.model;


import java.io.IOException;


/**
 * @author mperham
 * @version $Id: EDIElement.java 2 2004-07-05 20:20:46Z mperham $
 */
public interface EDIElement {

    /*
     void parse(EDIInputStream eis) throws IOException, EDIParseException;
     */
    void emit(EDIOutputStream eos) throws IOException;

    EDIElement createCopy();
}
