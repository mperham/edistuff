package com.webify.shared.edi.model.standard;

/**
 * @author dranatunga
 * @version $Id: $
 */
public abstract class OrganizationInfo {

    public abstract String getOrganizationName();

    public String toString() {
        return "Organization " + getOrganizationName();
    }
}
