
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import objectmodel.DebulkingTest;
import objectmodel.LoadGoodExamplesTest;
import objectmodel.PersistenceTest;


/**
 * @author mperham
 * @version $Id: MasterTestSuite.java 103 2004-09-27 16:28:53Z dranatunga $
 */
public class MasterTestSuite extends TestCase {

    public MasterTestSuite() {
        super();
    }

    public MasterTestSuite(String arg0) {
        super(arg0);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(LoadGoodExamplesTest.class);
        suite.addTestSuite(PersistenceTest.class);
        suite.addTestSuite(DebulkingTest.class);
        return suite;
    }
    
}