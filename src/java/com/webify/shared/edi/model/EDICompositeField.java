package com.webify.shared.edi.model;


/**
 * @author mperham
 * @version $Id: EDICompositeField.java 2 2004-07-05 20:20:46Z mperham $
 */
public interface EDICompositeField extends EDIElement {

    void setElements(String[] values) throws EDIParseException;

    String[] getElements();

}
