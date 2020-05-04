package com.webify.shared.edi.model.hipaa837i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.webify.shared.edi.model.EDITransaction;
import com.webify.shared.edi.model.hipaa837i.beans.BaseHipaa837iDocument;
import com.webify.shared.edi.model.hipaa837i.beans.SegmentPWK_1;

import com.webify.shared.edi.xform.TransactionTransport;

/**
 * Hipaa837iDocument subclass, put any business logic in this class.
 *
 * @version $Id: Hipaa837iDocument.java 103 2004-09-27 16:28:53Z dranatunga $
 */

public class Hipaa837iDocument extends BaseHipaa837iDocument {

    private static final Log log = LogFactory.getLog(Hipaa837iDocument.class);

    /**
     * Debulks this HIPAA 837i transaction. Each billing (Loop2000A) and subscriber (Loop2000B) loop
     * is expanded. In addition, where claims have patients that are distinct from subscribers, the
     * patient loops (Loop2000C) are expanded. Each expanded document is made available to
     * <code>transport</code> using {@link TransactionTransport#transport(EDITransaction)}.
     *
     * @param transport The transport that handles each debulked document.
     */
    public void debulk(TransactionTransport transport) {
        final List original = getChildList();
        if ((original != null) && (original.size() > 0)) {
            final List subst = new ArrayList(1);
            subst.add(null);
            for (Iterator i = original.iterator(); i.hasNext();) {
                final Loop2000A loop = (Loop2000A) i.next();
                subst.set(0, loop);
                setChildList(subst);
                debulk(this, loop, transport);
            }
            setChildList(original);
        }
    }

    private void debulk(Hipaa837iDocument transaction, Loop2000A loop2000a, TransactionTransport transport) {
        final List original = loop2000a.getChildList();
        if ((original != null) && (original.size() > 0)) {
            final List subst = new ArrayList(1);
            subst.add(null);
            for (Iterator i = original.iterator(); i.hasNext();) {
                final Loop2000B loop = (Loop2000B) i.next();
                subst.set(0, loop);
                loop2000a.setChildList(subst);
                debulk(transaction, loop, transport);
            }
            setChildList(original);
        }
    }

    private void debulk(Hipaa837iDocument transaction, Loop2000B loop2000b, TransactionTransport transport) {
        final List all2000c = loop2000b.getChildList();
        final List all2300 = loop2000b.getLoop2300();

        if (hasSome(all2000c)) {
            if (hasSome(all2300)) {
                throw new RuntimeException("Should not have both 2000C and 2300 loops on same 2000B");
            }
            final List subst = new ArrayList(1);
            subst.add(null);
            for (Iterator i = all2000c.iterator(); i.hasNext();) {
                final Loop2000C loop = (Loop2000C) i.next();
                subst.set(0, loop);
                loop2000b.setChildList(subst);
                debulk(transaction, loop, transport);
            }
            loop2000b.setChildList(all2000c);
        }
        else {
            if (hasSome(all2300)) {
                final List subst = new ArrayList(1);
                subst.add(null);
                for (Iterator i = all2300.iterator(); i.hasNext();) {
                    final Loop2300 loop = (Loop2300) i.next();
                    subst.set(0, loop);
                    loop2000b.setLoop2300(subst);
                    debulk(transaction, loop, transport);
                }
                loop2000b.setLoop2300(all2300);
            }
            else {
                throw new RuntimeException("Should not have a 2000B with neigher 2000C or 2300");
            }
        }
    }

    private void debulk(Hipaa837iDocument transaction, Loop2000C loop2000c, TransactionTransport transport) {
        final List original = loop2000c.getLoop2300();
        if ((original != null) && (original.size() > 0)) {
            final List subst = new ArrayList(1);
            subst.add(null);
            for (Iterator i = original.iterator(); i.hasNext();) {
                final Loop2300 loop = (Loop2300) i.next();
                subst.set(0, loop);
                loop2000c.setLoop2300(subst);
                debulk(transaction, loop, transport);
            }
            loop2000c.setLoop2300(original);
        }
    }

    private void debulk(Hipaa837iDocument transaction, Loop2300 loop2300, TransactionTransport transport) {
        transport.transport(transaction);
    }

    private static boolean hasSome(List list) {
        return ((list != null) && (list.size() > 0));
    }

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
