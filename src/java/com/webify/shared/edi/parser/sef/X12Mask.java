package com.webify.shared.edi.parser.sef;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author mperham
 * @version $Id: X12Mask.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12Mask {
    private static final X12FieldOverride DEFAULT_OVERRIDE = new X12FieldOverride();

    private List fields = null;

    public List getFields() {
        if (fields == null) {
            return Collections.EMPTY_LIST;
        }
        return fields;
    }

    public void addField(X12FieldOverride fo) {
        if (fields == null) {
            fields = new ArrayList();
        }
        fields.add(fo);
    }

    public X12FieldOverride getFieldOverride(int i) {
        if (fields.size() <= i) {
            return DEFAULT_OVERRIDE;
        }
        return (X12FieldOverride) fields.get(i);
    }

}
