package com.webify.shared.edi.model;


/**
 * @author mperham
 * @version $Id: EDISegment.java 2 2004-07-05 20:20:46Z mperham $
 */
public abstract class EDISegment implements EDIElement {

    public abstract int getLineNumber();
}
