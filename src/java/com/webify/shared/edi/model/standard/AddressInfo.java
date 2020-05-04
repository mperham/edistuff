package com.webify.shared.edi.model.standard;

/**
 * @author dranatunga
 * @version $Id: $
 */
public abstract class AddressInfo {

    public abstract String getAddressLine1();

    public abstract String getAddressLine2();

    public abstract String getCity();

    public abstract String getState();

    public abstract String getZipCode();

    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        append(buffer, null, getAddressLine1(), ". ");
        append(buffer, null, getAddressLine2(), ". ");
        append(buffer, null, getCity(), null);
        append(buffer, ", ", getState(), null);
        append(buffer, " ", getZipCode(), null);
        return buffer.toString();
    }

    private static void append(StringBuffer buffer, String prefix, String value, String suffix) {
        if (value != null) {
            if (prefix != null) {
                buffer.append(prefix);
            }
            buffer.append(value);
            if (suffix != null) {
                buffer.append(suffix);
            }
        }
    }
}
