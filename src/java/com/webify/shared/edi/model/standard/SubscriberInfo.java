package com.webify.shared.edi.model.standard;

/**
 * @author dranatunga
 * @version $Id: $
 */
public abstract class SubscriberInfo {

    public abstract PersonInfo getPersonInfo();

    public abstract AddressInfo getAddressInfo();

    public abstract String getPrimaryIdentifier();

    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append("Subscriber ").append(getPrimaryIdentifier());
        buffer.append(" - ");
        buffer.append(getPersonInfo());
        buffer.append(" - ");
        buffer.append(getAddressInfo());
        return buffer.toString();
    }
}
