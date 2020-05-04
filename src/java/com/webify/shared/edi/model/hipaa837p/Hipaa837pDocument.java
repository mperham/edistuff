package com.webify.shared.edi.model.hipaa837p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.hipaa837p.beans.BaseHipaa837pDocument;
import com.webify.shared.edi.model.hipaa837p.beans.SegmentPWK_1;

/**
 * BaseHipaa837pDocument subclass, put any business logic in this class.
 *
 * @version $Id: Hipaa837pDocument.java 75 2004-09-17 01:08:15Z mperham $
 */
public class Hipaa837pDocument extends BaseHipaa837pDocument {

    private static final Log log = LogFactory.getLog(Hipaa837pDocument.class);

    /*
     * Uncomment this to hook into the input validation. This method is called when an EDI file is parsed into
     * a document. protected void validate(EDIInputStream eis) { super.validate(eis); }
     */

    public void removeClaim(int lineNumber) throws NoSuchElementException {
        Loop2000A[] providers = getChildren();
        if (providers.length == 0) {
            throw new NoSuchElementException("No loop 2000A associated with line number " + lineNumber);
        }

        // get the Loop2000A associated with this linenumber
        Loop2000A provider = null;
        for (int i = 0; i < providers.length; i++) {
            if (providers[i].getStartLineNumber() <= lineNumber
                    && providers[i].getEndLineNumber() >= lineNumber) {
                provider = providers[i];
                break;
            }
        }

        //error is at document level / loop 1000A , 1000B reject it.
        if (provider == null) {
            if (this.getLoop1000B().getEndLineNumber() >= lineNumber) {
                this.getChildList().clear();
                return;
            }
            //if the error section is already removed
            throw new NoSuchElementException("No loop 2000A associated with line number " + lineNumber);

        }

        Loop2000B[] subscribers = provider.getChildren();
        if (subscribers.length == 0) {
            throw new NoSuchElementException("No loop 2000B associated with line number " + lineNumber);
        }

        // get the Loop2000B associated with this linenumber
        Loop2000B subscriber = null;
        for (int j = 0; j < subscribers.length; j++) {
            if (subscribers[j].getStartLineNumber() <= lineNumber
                    && subscribers[j].getEndLineNumber() >= lineNumber) {
                subscriber = subscribers[j];
                break;
            }
        }
        // this if a provider the error is at provider level
        if (subscriber == null) {
            if (provider.getLoop2010AB() != null
                    && provider.getLoop2010AB().getEndLineNumber() >= lineNumber) {
                this.getChildList().remove(provider);
                return;
            }
            else if (provider.getLoop2010AA().getEndLineNumber() >= lineNumber) {
                this.getChildList().remove(provider);
                return;
            }
            throw new NoSuchElementException("No loop 2000B associated with line number " + lineNumber);
        }

        if (subscriber.getChildren() != null && subscriber.getChildren().length > 0) {
            removePatientDependent(lineNumber, provider, subscriber);
        }
        else {
            removePatientSelf(lineNumber, provider, subscriber);
        }
    }

    /**
     * @param lineNumber
     * @param provider
     * @param subscriber
     */
    private void removePatientSelf(int lineNumber, Loop2000A provider, Loop2000B subscriber) {
        List loop2300s = subscriber.getLoop2300();
        int index = 0;
        boolean found = false;
        for (Iterator lit = loop2300s.iterator(); lit.hasNext(); index++) {
            Loop2300 claim = (Loop2300) lit.next();
            if (claim.getStartLineNumber() <= lineNumber && claim.getEndLineNumber() >= lineNumber) {
                found = true;
                break;
            }
        }
        if (!found) {
            provider.getChildList().remove(subscriber);
        }
        else {

            // remove the Loop2300 before the one whose line number is greater than
            // the given line number. In the case where the last Loop2300 is the
            // one we want to remove, found will be false and so we use the index as is.
            Loop2300 evilLoop = (Loop2300) loop2300s.remove(index);

            // if that was the only claim for this subscriber, remove the
            // subscriber also
            if (loop2300s.size() == 0) {
                provider.getChildList().remove(subscriber);
            }
        }
        // remove provider if no subscriber exist
        if (provider.getChildList().size() == 0) {
            this.getChildList().remove(provider);
        }
    }

    /**
     * @param lineNumber
     * @param provider
     * @param subscriber
     */
    private void removePatientDependent(int lineNumber, Loop2000A provider, Loop2000B subscriber) {
        Loop2000C patient = null;
        Loop2000C[] patients = subscriber.getChildren();
        for (int j = 0; j < patients.length; j++) {
            if (patients[j].getStartLineNumber() <= lineNumber
                    && patients[j].getEndLineNumber() >= lineNumber) {
                patient = patients[j];
                break;
            }
        }

        if (patient == null) {

            if (subscriber.getLoop2010BD() != null
                    && subscriber.getLoop2010BD().getEndLineNumber() >= lineNumber) {
                provider.getChildList().remove(subscriber);
                checkProvider(provider);
                return;
            }
            if (subscriber.getLoop2010BC() != null
                    && subscriber.getLoop2010BC().getEndLineNumber() >= lineNumber) {
                provider.getChildList().remove(subscriber);
                checkProvider(provider);
                return;
            }
            if (subscriber.getLoop2010BB() != null
                    && subscriber.getLoop2010BB().getEndLineNumber() >= lineNumber) {
                provider.getChildList().remove(subscriber);
                checkProvider(provider);
                return;
            }

            if (subscriber.getLoop2010BA() != null
                    && subscriber.getLoop2010BA().getEndLineNumber() >= lineNumber) {
                provider.getChildList().remove(subscriber);
                checkProvider(provider);
                return;
            }

            throw new NoSuchElementException("No loop 2000C associated with line number " + lineNumber);
        }

        List loop2300s = patient.getLoop2300();
        int index = 0;
        boolean found = false;
        for (Iterator lit = loop2300s.iterator(); lit.hasNext(); index++) {
            Loop2300 claim = (Loop2300) lit.next();
            if (claim.getStartLineNumber() <= lineNumber && claim.getEndLineNumber() >= lineNumber) {
                found = true;
                break;
            }
        }
        if (!found) {
            // remove 2000C from 2000B
            subscriber.getChildList().remove(patient);
        }
        else {
            // remove 2300 from 2000C
            Loop2300 evilLoop = (Loop2300) loop2300s.remove(index);
            if (loop2300s.size() == 0) {
                // remove 2000C from 2000B
                subscriber.getChildList().remove(patient);
            }
        }
        remProvSubscriber(provider, subscriber);
    }

    /**
     * @param provider
     * @param subscriber
     */
    private void remProvSubscriber(Loop2000A provider, Loop2000B subscriber) {
        // remove 2000B from 2000A
        if (subscriber.getChildList().size() == 0) {
            provider.getChildList().remove(subscriber);
        }
        // remove 2000A from document
        if (provider.getChildList().size() == 0) {
            this.getChildList().remove(provider);
        }
    }

    /**
     * @param provider
     */
    private void checkProvider(Loop2000A provider) {
        if (provider.getChildList() == null || provider.getChildList().size() == 0) {
            this.getChildList().remove(provider);
        }

    }

    public void addPWK(SegmentPWK_1 pwk) throws NoSuchElementException {

        Loop2000A[] providers = getChildren();
        if (providers.length == 0) { throw new NoSuchElementException("No loop 2000A associated"); }

        // get the Loop2000A associated with this linenumber
        Loop2000A provider = null;
        for (int i = 0; i < providers.length; i++) {
            provider = providers[i];
            break;
        }

        if (provider == null) { throw new NoSuchElementException("No loop 2000A"); }

        Loop2000B[] subscribers = provider.getChildren();
        if (subscribers.length == 0) { throw new NoSuchElementException("No loop 2000B associated"); }

        // get the Loop2000B associated with this linenumber
        Loop2000B subscriber = null;
        for (int j = 0; j < subscribers.length; j++) {
            subscriber = subscribers[j];
            break;
        }
        // this should technically be impossible - if a provider
        // owns this line, one of its subscribers should own it also
        if (subscriber == null) { throw new NoSuchElementException("No loop 2000B associated"); }

        //if subscriber is not the patient
        if (subscriber.getSbr().getSbr02() == null || subscriber.getSbr().getSbr02().trim().equals("")) {
            Loop2000C patient = null;
            Loop2000C[] patients = subscriber.getChildren();
            for (int j = 0; j < patients.length; j++) {
                patient = patients[j];
                break;
            }

            if (patient == null) { throw new NoSuchElementException("No loop 2000C associated"); }

            List loop2300s = patient.getLoop2300();
            int index = 0;
            for (Iterator lit = loop2300s.iterator(); lit.hasNext(); index++) {
                Loop2300 claim = (Loop2300) lit.next();
                List lst = null;
                if (claim.getPwk() != null) {
                    lst = claim.getPwk();
                }
                else {
                    lst = new ArrayList();
                }
                lst.add(pwk);
                claim.setPwk(lst);
            }
        }
        else {
            List loop2300s = subscriber.getLoop2300();
            int index = 0;
            for (Iterator lit = loop2300s.iterator(); lit.hasNext(); index++) {
                Loop2300 claim = (Loop2300) lit.next();
                List lst = null;
                if (claim.getPwk() != null) {
                    lst = claim.getPwk();
                }
                else {
                    lst = new ArrayList();
                }
                lst.add(pwk);
                claim.setPwk(lst);
            }
        }
    }

}
