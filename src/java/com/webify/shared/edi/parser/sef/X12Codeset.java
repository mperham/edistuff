package com.webify.shared.edi.parser.sef;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * @author mperham
 * @version $Id: X12Codeset.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12Codeset {

    private String id;
    private List values = new LinkedList();
    private Object[] legalValues = null;

    private Map overrides = new HashMap();

    public Collection getOverrides() {
        return overrides.values();
    }

    public Map getOverrideMap() {
        return overrides;
    }

    public X12Codeset getOverride(short sord, short ford, short cord) {
        String key = sord + "-" + ford;

        if (cord != 0) {
            key += "-" + cord;
        }
        return (X12Codeset) overrides.get(key);
    }

    public void addOverride(X12Codeset oride, short sord, short ford, short cord) {
        String key = sord + "-" + ford;

        if (cord != 0) {
            key += "-" + cord;
        }
        overrides.put(key, oride);
    }

    public String getId() {
        return id;
    }

    public void setId(String string) {
        id = string;
    }

    void addValue(String min, String max) {
        if (max == null) {
            values.add(min);
        }
        else {
            values.add(new StringRange(min, max));
        }
    }

    void compact() {
        legalValues = values.toArray(new Object[values.size()]);
        values = null;
    }

    public int size() {
        if (values != null) {
            return values.size();
        }
        return legalValues.length;
    }

    public boolean within(String value) {
        if (legalValues.length == 0) {
            // unspecified so assume anything is legal
            return true;
        }

        for (int i = 0; i < legalValues.length; i++) {
            Object legal = legalValues[i];

            if (legal instanceof String) {
                int result = ((String) legal).compareTo(value);

                if (result == 0) {
                    return true;
                }
                else if (result > 0) {
                    // SEF gives us the codeset values in increasing value therefore we can
                    // "cheat" and short circuit the iteration if the legal value is greater than
                    // the testee (since all further legal values will be greater than the current
                    // legal value).
                    System.out.println("Legal value: \"" + legal + "\" greater than: " + value);
                    return false;
                }
            }
            else if (((StringRange) legal).within(value)) {
                return true;
            }
        }
        return false;
    }

    public class StringRange {
        private String min, max;
        public StringRange(String min, String max) {
            if (min.length() != max.length()) {
                throw new IllegalArgumentException(
                        getId() + " Lengths not equal: " + min + "   " + max);
            }
            this.min = min;
            this.max = max;
        }

        public boolean within(String a) {
            if (a == null) {
                return false;
            }
            if (min.length() != a.length()) {
                return false;
            }
            return ((min.compareTo(a) <= 0) && (max.compareTo(a) >= 0));
        }

        public String getMax() {
            return max;
        }

        public String getMin() {
            return min;
        }

    }

    public Object[] getLegalValues() {
        return legalValues;
    }

}
