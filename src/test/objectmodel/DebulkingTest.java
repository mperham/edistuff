package objectmodel;

import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import com.webify.shared.edi.model.EDIInputStream;
import com.webify.shared.edi.model.EDIInterchange;
import com.webify.shared.edi.model.EDIParseError;
import com.webify.shared.edi.model.hipaa837i.Hipaa837iDocument;
import com.webify.shared.edi.model.hipaa837i.Loop2000A;
import com.webify.shared.edi.model.hipaa837i.Loop2000B;
import com.webify.shared.edi.model.hipaa837i.Loop2000C;
import com.webify.shared.edi.xform.InMemoryTransactionStorage;

/**
 * @author dranatunga
 * @version $Id: $
 */
public class DebulkingTest extends TestCase {

    private static final String DATA_LOCATION = "/objectmodel/edidata/";

    private static final Log log = LogFactory.getLog(DebulkingTest.class);

    public void testDebulk837i() throws Exception {
        EDIInterchange interchange = loadEdi(DATA_LOCATION + "837i.2.edi");
        //printMemory();
        EDIInterchange copy = (EDIInterchange) interchange.createCopy();

        //summarize(interchange);
        //printMemory();
        InMemoryTransactionStorage transport = new InMemoryTransactionStorage();
        for (Iterator documents = interchange.getDocuments().iterator(); documents.hasNext();) {
            Object document = documents.next();
            if (document instanceof Hipaa837iDocument) {
                Hipaa837iDocument hipaa837 = (Hipaa837iDocument) document;
                hipaa837.debulk(transport);
            }
        }
        //printMemory();
        for (Iterator i = transport.getAll().iterator(); i.hasNext();) {
            Hipaa837iDocument debulked = (Hipaa837iDocument) i.next();
            //summarize(debulked);
            //log.warn(new String(debulked.emit()));
        }
    }

    private void printMemory() {
        Runtime rt = Runtime.getRuntime();
        for (int i = 0; i < 100; ++i) {
            rt.gc();
        }
        long max = rt.maxMemory();
        long free = rt.freeMemory();
        trace("--------------------------");
        trace("max = " + max/1024);
        trace("free = " + free/1024);
        trace("avail = " + (max - free)/1024);
    }

    private EDIInterchange loadEdi(String ediResource) throws Exception {
        InputStream is = this.getClass().getResourceAsStream(ediResource);
        if (is == null) {
            fail("Could not find resource " + ediResource);
        }

        try {
            EDIInputStream eis = new EDIInputStream(is);
            EDIInterchange inter = new EDIInterchange();
            inter.parse(eis);

            if (eis.hasErrors()) {
                log.error("Got errors parsing " + ediResource);
                List errors = eis.getErrors();
                for (Iterator it = errors.iterator(); it.hasNext();) {
                    EDIParseError element = (EDIParseError) it.next();
                    log.error(element);
                }
                fail("Got errors parsing " + ediResource);
            }

            return inter;
        }
        catch (Exception ex) {
            log.error("Problem in " + ediResource, ex);
            throw ex;
        }
        finally {
            is.close();
        }
    }

    private void summarize(EDIInterchange interchange) {
        trace("EDIInterchange");
        for (Iterator documents = interchange.getDocuments().iterator(); documents.hasNext();) {
            Object document = documents.next();
            if (document instanceof Hipaa837iDocument) {
                summarize((Hipaa837iDocument) document);
            }
            else {
                trace("  Document of type " + document.getClass().getName());
            }
        }
    }

    private void summarize(Hipaa837iDocument document) {
        trace("  hipaa837i");
        Loop2000A[] loop2000A = document.getChildren();
        for (int i = 0; i < loop2000A.length; ++i) {
            summarize(loop2000A[i]);
        }
    }

    private void summarize(Loop2000A loop2000a) {
        trace("    loop2000A");
        Loop2000B[] loop2000B = loop2000a.getChildren();
        for (int i = 0; i < loop2000B.length; ++i) {
            summarize(loop2000B[i]);
        }
    }

    private void summarize(Loop2000B loop2000b) {
        trace("      loop2000B");
        trace("        subscriber");
        summarize2300(loop2000b.getLoop2300());
        Loop2000C[] loop2000C = loop2000b.getChildren();
        for (int i = 0; i < loop2000C.length; ++i) {
            summarize(loop2000C[i]);
        }
    }

    private void summarize(Loop2000C loop2000c) {
        trace("        loop2000C");
        summarize2300(loop2000c.getLoop2300());
    }

    private void summarize2300(List list) {
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                trace("          loop2300");
            }
        }
    }

    private void trace(String msg) {
        //log.warn(msg);
        System.out.println(msg);
    }
}
