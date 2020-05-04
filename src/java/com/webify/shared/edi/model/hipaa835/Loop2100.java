package com.webify.shared.edi.model.hipaa835;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.DateUtils;
import com.webify.shared.edi.model.hipaa835.beans.BaseLoop2100;
import com.webify.shared.edi.model.hipaa835.beans.SegmentDTM_1;
import com.webify.shared.edi.model.hipaa835.beans.SegmentNM1_1;
import com.webify.shared.edi.model.hipaa835.beans.SegmentNM1_2;
import com.webify.shared.edi.model.hipaa835.beans.SegmentNM1_3;
import com.webify.shared.edi.model.hipaa835.beans.SegmentNM1_4;

/*
 * BaseLoop2100 subclass, put any business logic in this class
 */
public class Loop2100 extends BaseLoop2100 {

	private static final Log log = LogFactory.getLog(Loop2100.class);

    private static final String L2100_DTM_PERIOD_START = "232";
    private static final String L2100_DTM_PERIOD_END = "233";
    private static final String L2110_DTM_SERVICE_START = "150";
    private static final String L2110_DTM_SERVICE_END = "151";
    private static final String L2110_DTM_SERVICE_DATE = "472";

	/*
	 * Uncomment this to hook into the input validation.  This method is
	 * called when an EDI file is parsed into a document.
	protected void validate(EDIInputStream eis) {
		super.validate(eis);
	}
	*/
	
	/**
	 * CLP.CLP01
	 */
	public String getPatientControlNumber() {
	    return getClp().getClp01();
	}
	
	/**
	 * CLP.CLP03
	 */
	public BigDecimal getTotalClaimChargeAmount() {
	    return getClp().getClp03();
	}
	
	/**
	 * CLP.CLP04
	 */
	public BigDecimal getClaimPaymentAmount() {
	    return getClp().getClp04();
	}

	/**
	 * CLP.CLP05 or
	 * CLP.CLP03 - CLP.CLP04
	 */
	public BigDecimal getPatientResponsibilityAmount() {
	    BigDecimal total = getClp().getClp05();
	    if (total == null) {
	        return getClp().getClp03().subtract(getClp().getClp04());
	    }
	    return total;
	}

	/**
	 * CLP.CLP07
	 */
	public String getClaimIcn() {
	    return getClp().getClp07();
	}
	
	public SegmentNM1_1 getPatientName() {
	    return getNm101();
	}
	
	public SegmentNM1_2 getInsuredName() {
	    return getNm102();
	}
	
	public SegmentNM1_3 getCorrectedInsuredName() {
	    return getNm103();
	}
	
	public SegmentNM1_2 getServiceProviderName() {
	    return getNm104();
	}
	
	public SegmentNM1_4 getCrossoverCarrierName() {
	    return getNm105();
	}

    /**
     * Looks through this claim and its service lines for the earliest and latest
     * treatment dates.
     * @return a two element array where the date at index 0 is the earliest, and
     *     the date at index 1 is the latest. The array itself is never null, but
     *     one or both of the values can be, if the claim and its service lines
     *     do not have any treatment (claim/service) dates listed.
     */
    public Date[] getTreatmentDateRange() {
        Date earliest = getClaimStatementStart();
        Date latest = getClaimStatementEnd();
        if (getLoop2110() != null) {
            final int svcCount = getLoop2110().size();
            for (int i = 0; i < svcCount; ++i) {
                final Loop2110 service = getLoop2110(i);
                if (service.getDtm() == null) {
                    continue;
                }
                final int dtmCount = service.getDtm().size();
                for (int j = 0; j < dtmCount; ++j) {
                    Date date = service.getDtm(j).getDtm02();
                    earliest = DateUtils.earlier(earliest, date);
                    latest = DateUtils.later(latest, date);
                }
            }
        }
        return new Date[] {earliest, latest};
    }

    /**
     * Gets the claim start date using the <code>DTM</code> segments in {@link #getDtm()}.
     * Note that this does not look at this claim's service lines.
     * @return the claim start date; null if none is found.
     */
    public Date getClaimStatementStart() {
        return findDate(getDtm(), L2100_DTM_PERIOD_START);
    }

    /**
     * Gets the claim end date using the <code>DTM</code> segments in {@link #getDtm()}.
     * Note that this does not look at this claim's service lines.
     * @return the claim end date; null if none is found.
     */
    public Date getClaimStatementEnd() {
        return findDate(getDtm(), L2100_DTM_PERIOD_END);
    }

    private Date findDate(List dtms, String qual) {
        if (dtms != null) {
            for (int i = 0; i < dtms.size(); ++i) {
                SegmentDTM_1 dtm = (SegmentDTM_1) dtms.get(i);
                if (qual.equals(dtm.getDtm01())) {
                    return dtm.getDtm02();
                }
            }
        }
        return null;
    }
}
