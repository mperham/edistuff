package com.webify.shared.edi.model.base837;

import com.webify.shared.edi.model.standard.SubscriberInfo;

/**
 * Exposes data common across {@link com.webify.shared.edi.model.hipaa837i.Loop2000B 837i}
 * and {@link com.webify.shared.edi.model.hipaa837p.Loop2000B 837p}
 * @author dranatunga
 * @version $Id: $
 */
public interface Common2000B {

    SubscriberInfo getSubscriberInfo();
    
}
