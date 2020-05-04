package objectmodel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;

import com.webify.shared.edi.model.EDIInputStream;
import com.webify.shared.edi.model.EDIInterchange;
import com.webify.shared.edi.model.EDIParseError;
import com.webify.shared.edi.model.EDIParseException;


/**
 * @author mperham
 * @version $Id: LoadGoodExamplesTest.java 662 2004-11-19 17:02:12Z mperham $
 */
public class LoadGoodExamplesTest extends TestCase {
    
    private static final Log log = LogFactory.getLog(LoadGoodExamplesTest.class);
    
    protected void setUp() {
        // This method will be called before _EACH_ testXXX() method is called.
        // Initialize or reset any instance variables here
    }
    
    protected void tearDown() {
        // This method will be called after _EACH_ testXXX() method is called.
        // Initialize or reset any instance variables here
    }
    
    private void loadExamples(String xa) throws IOException, EDIParseException {
        int j = 1;
        while (true) {
            String resourceName = "/objectmodel/edidata/" + xa + "." + (j++) + ".edi";
            InputStream is = null;
            try {
                is = this.getClass().getResourceAsStream(resourceName);
            }
            catch (Exception ex) {
                break;
            }
            
            if (is == null) {
                break;
            }
            
            try {
                EDIInputStream eis = new EDIInputStream(is);
                EDIInterchange inter = new EDIInterchange();
                inter.parse(eis);
                
                if (eis.hasErrors()) {
                    log.error("Got errors parsing " + resourceName);
                    List errors = eis.getErrors();
                    for (Iterator it = errors.iterator(); it.hasNext();) {
                        EDIParseError element = (EDIParseError) it.next();
                        log.error(element);
                    }
                }
                assertFalse("Got errors parsing " + resourceName, eis.hasErrors());
                
            }
            catch (Exception ex) {
                log.error("Problem in " + resourceName, ex);
				fail(ex.getMessage());
            }
            finally {
                is.close();
            }
        }
    }
    
    public void testLoad270() throws IOException, EDIParseException {
        loadExamples("270");
    }
    
    public void testLoad271() throws IOException, EDIParseException {
        loadExamples("271");
    }

    public void testLoad275() throws IOException, EDIParseException {
        loadExamples("275");
    }

    public void testLoad276() throws IOException, EDIParseException {
        loadExamples("276");
    }

    public void testLoad277() throws IOException, EDIParseException {
        loadExamples("277");
    }

    public void testLoad835() throws IOException, EDIParseException {
        loadExamples("835");
    }
    
    public void testLoad837p() throws IOException, EDIParseException {
        loadExamples("837p");
    }
    
    public void testLoad837i() throws IOException, EDIParseException {
        loadExamples("837i");
    }
    
    public void testLoad837d() throws IOException, EDIParseException {
        loadExamples("837d");
    }
    
    public void testLoad997() throws IOException, EDIParseException {
        loadExamples("997");
    }
    
}
