package com.webify.shared.edi.model.standard;

/**
 * @author dranatunga
 * @version $Id: $
 */
public abstract class ProviderInfo {

    public abstract OrganizationInfo getOrganizationInfo();

    public abstract AddressInfo getAddressInfo();

    public abstract String getPrimaryIdentifier();

    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append("Provider ").append(getPrimaryIdentifier());
        buffer.append(" - ");
        buffer.append(getOrganizationInfo());
        buffer.append(" - ");
        buffer.append(getAddressInfo());
        return buffer.toString();
    }
}
