package com.webify.shared.edi.model.standard;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * @author dranatunga
 * @version $Id: $
 */
public abstract class PersonInfo {
    private static final SimpleDateFormat CCYYMMDD = new SimpleDateFormat("yyyyMMdd");

    public abstract String getLastName();

    public abstract String getFirstName();

    public abstract String getMiddleName();

    public abstract Date getDateOfBirth();

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getLastName()).append(", ").append(getFirstName());
        if (getDateOfBirth() != null) {
            buffer.append(" (DOB ").append(CCYYMMDD.format(getDateOfBirth())).append(")");
        }
        return buffer.toString();
    }

    protected Date parseCcYyMmDd(String ccyymmdd) {
        synchronized(CCYYMMDD) {
            try {
                return CCYYMMDD.parse(ccyymmdd);
            }
            catch (ParseException e) {
                throw new IllegalArgumentException("Badly formatted date string " + ccyymmdd);
            }
        }
    }
}
