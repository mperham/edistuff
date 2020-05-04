package com.webify.shared.edi.model;

import java.util.Date;

/**
 * @author dranatunga
 * @version $Id: $
 */
public final class DateUtils {
    private DateUtils() { }

    public static final Date earlier(Date a, Date b) {
        if (a == null) {
            return b;
        }
        else {
            return a.before(b) ? a : b;
        }
    }

    public static final Date later(Date a, Date b) {
        if (a == null) {
            return b;
        }
        else {
            return a.after(b) ? a : b;
        }
    }
}
