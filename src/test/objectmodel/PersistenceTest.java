package objectmodel;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

import com.webify.shared.edi.model.EDIInputStream;
import com.webify.shared.edi.model.EDIInterchange;
import com.webify.shared.edi.model.EDIParseException;
import com.webify.shared.edi.model.hipaa270.Hipaa270Document;
import com.webify.shared.edi.model.hipaa275.Hipaa275Document;


/**
 * @author mperham
 * @version $Id: PersistenceTest.java 647 2004-11-19 00:51:56Z mperham $
 */
public class PersistenceTest extends TestCase {
    
    public void test275() throws IOException, EDIParseException {
        String resourceName = "/objectmodel/edidata/persist.275.edi";
        InputStream is = this.getClass().getResourceAsStream(resourceName);
        int inputSize = is.available();
        
        try {
            EDIInputStream eis = new EDIInputStream(is);
            EDIInterchange inter = new EDIInterchange();
            inter.parse(eis);
            
            assertFalse("Got errors parsing " + resourceName, eis.hasErrors());
            assertTrue("Bad 275 document", inter.getDocuments().get(0) instanceof Hipaa275Document);
            
            byte[] bs = inter.emit();
            int outputSize = bs.length;
            assertEquals("Output size did not match input size", outputSize, inputSize);
        }
        finally {
            is.close();
        }        
    }

    public void test270() throws IOException, EDIParseException {
        String resourceName = "/objectmodel/edidata/persist.270.edi";
        InputStream is = this.getClass().getResourceAsStream(resourceName);
        int inputSize = is.available();
        
        try {
            EDIInputStream eis = new EDIInputStream(is);
            EDIInterchange inter = new EDIInterchange();
            inter.parse(eis);
            
            assertFalse("Got errors parsing " + resourceName, eis.hasErrors());
            assertTrue("Bad 270 document", inter.getDocuments().get(0) instanceof Hipaa270Document);
            
            byte[] bs = inter.emit();
            int outputSize = bs.length;
            assertEquals("Output size did not match input size", outputSize, inputSize);
        }
        finally {
            is.close();
        }        
    }
    
    public void testCopy() throws Exception {
        String resourceName = "/objectmodel/edidata/837p.1.edi";
        InputStream is = this.getClass().getResourceAsStream(resourceName);
        
        try {
            EDIInputStream eis = new EDIInputStream(is);
            EDIInterchange inter = new EDIInterchange();
            inter.parse(eis);
            
            EDIInterchange inter2 = (EDIInterchange) inter.createCopy();
            byte[] copy1 = inter.emit();            
            byte[] copy2 = inter2.emit();
            
            assertEquals("Copy != original", new String(copy1), new String(copy2));
        }
        finally {
            is.close();
        }
    }
}
