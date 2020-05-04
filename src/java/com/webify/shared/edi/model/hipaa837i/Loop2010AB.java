package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2010AB;
import com.webify.shared.edi.model.hipaa837i.beans.SegmentREF_1;
import com.webify.shared.edi.model.standard.AddressInfo;
import com.webify.shared.edi.model.standard.OrganizationInfo;
import com.webify.shared.edi.model.standard.ProviderInfo;

/*
 * BaseLoop2010AB subclass, put any business logic in this class
 */
public class Loop2010AB extends BaseLoop2010AB {

    private static final Log log = LogFactory.getLog(Loop2010AB.class);

    private OrganizationInfo organizationInfo = null;
    private AddressInfo addressInfo = null;
    private ProviderInfo providerInfo = null;


    public OrganizationInfo getOrganizationInfo() {
        if (organizationInfo == null) {
            organizationInfo = new OrganizationInfo() {
                public String getOrganizationName() {
                    return getNm1().getNm103();
                }
            };
        }
        return organizationInfo;
    }

    public AddressInfo getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new AddressInfo() {
                public String getAddressLine1() {
                    return getN3().getN301();
                }

                public String getAddressLine2() {
                    return getN3().getN302();
                }

                public String getCity() {
                    return getN4().getN401();
                }

                public String getState() {
                    return getN4().getN402();
                }

                public String getZipCode() {
                    return getN4().getN403();
                }
            };
        }
        return addressInfo;
    }

    public String getPrimaryIdentifier() {
        final String nm109 = getNm1().getNm109();
        if ("XX".equals(getNm1().getNm108()) && "NPI".equals(nm109)) {
            return findSsnOrEin().getRef02();
        }
        else {
            return nm109;
        }
    }

    public ProviderInfo getProviderInfo() {
        if (providerInfo == null) {
            providerInfo = new ProviderInfo() {
                public OrganizationInfo getOrganizationInfo() {
                    return Loop2010AB.this.getOrganizationInfo();
                }

                public AddressInfo getAddressInfo() {
                    return Loop2010AB.this.getAddressInfo();
                }

                public String getPrimaryIdentifier() {
                    return Loop2010AB.this.getPrimaryIdentifier();
                }
            };
        }
        return providerInfo;
    }

    private SegmentREF_1 findSsnOrEin() {
        for (int i = 0; i < getRef().size(); ++i) {
            SegmentREF_1 ref = getRef(i);
            if ("SY".equals(ref.getRef01()) || "EI".equals(ref.getRef01())) {
                return ref;
            }
        }
        return null;
    }

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
