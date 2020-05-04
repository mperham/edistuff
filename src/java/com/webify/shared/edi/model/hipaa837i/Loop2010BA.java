package com.webify.shared.edi.model.hipaa837i;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837i.beans.BaseLoop2010BA;
import com.webify.shared.edi.model.hipaa837i.beans.SegmentDMG_1;
import com.webify.shared.edi.model.standard.AddressInfo;
import com.webify.shared.edi.model.standard.PersonInfo;
import com.webify.shared.edi.model.standard.SubscriberInfo;

import java.util.Date;

/*
 * BaseLoop2010BA subclass, put any business logic in this class
 */
public class Loop2010BA extends BaseLoop2010BA {
    private static final String NM102_PERSON = "1";
    private static final Log log = LogFactory.getLog(Loop2010BA.class);
    private PersonInfo personInfo = null;
    private AddressInfo addressInfo = null;
    private SubscriberInfo subscriberInfo = null;


    public PersonInfo getPersonInfo() {
        if (personInfo == null) {
            personInfo = new PersonInfo() {
                public String getLastName() {
                    return getNm1().getNm103();
                }

                public String getFirstName() {
                    return getNm1().getNm104();
                }

                public String getMiddleName() {
                    return getNm1().getNm105();
                }

                public Date getDateOfBirth() {
                    SegmentDMG_1 dmg = getDmg();
                    return (dmg == null) ? null : parseCcYyMmDd(dmg.getDmg02());
                }
            };
        }
        return personInfo;
    }

    public AddressInfo getAddressInfo() {
        if ((addressInfo == null) && (getN3() != null) && (getN4() != null)) {
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

    public SubscriberInfo getSubscriberInfo() {
        if (subscriberInfo == null) {
            subscriberInfo = new SubscriberInfo() {
                public PersonInfo getPersonInfo() {
                    return Loop2010BA.this.getPersonInfo();
                }

                public AddressInfo getAddressInfo() {
                    return Loop2010BA.this.getAddressInfo();
                }

                public String getPrimaryIdentifier() {
                    return getNm1().getNm109();
                }
            };
        }
        return subscriberInfo;
    }
	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
}
