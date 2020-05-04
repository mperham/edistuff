package com.webify.shared.edi.parser.sef;


import java.io.PrintWriter;


/**
 * A transaction is really just a top-level loop.
 *
 * @author mperham
 * @version $Id: X12Transaction.java 2 2004-07-05 20:20:46Z mperham $
 */
public class X12Transaction extends X12Loop {

    private short id = 0; // 837 for claim, etc.
    private short currentPosition = 0;
    private short currentIncrement = 10;

    private String documentId, standardsId;

    public String toString() {
        StringBuffer sb = new StringBuffer();

        toDebugString(sb, 0);
        return sb.toString();
    }

    public short getId() {
        return id;
    }

    public void setId(short s) {
        id = s;
    }

    public short getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(short s) {
        currentPosition = s;
    }

    public short getCurrentIncrement() {
        return currentIncrement;
    }

    public void setCurrentIncrement(short s) {
        currentIncrement = s;
    }

    public short getNextPosition() {
        currentPosition += currentIncrement;
        return currentPosition;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getStandardsId() {
        return standardsId;
    }

    public void setDocumentId(String string) {
        documentId = string;
    }

    public void setStandardsId(String string) {
        standardsId = string;
    }

    protected void emitHeader(PrintWriter out, String xaType) {
        out.println("public abstract class BaseHipaa" + xaType + "Document extends EDITransaction {");
        out.println();
        out.println("\tpublic static final String DOCUMENT_ID = \"" + getDocumentId() + "\";");
        out.println("\tpublic static final List STANDARDS_IDS = new ArrayList();");
        out.println();
        out.println("\tstatic {");
        out.println(
                "\t\tSTANDARDS_IDS.add(\"" + getStandardsId() + ","
                + getDocumentId().substring(0, 3) + "\");");
        out.println("\t}");
        out.println();
    }

    public String getJavaType() {
        return "Hipaa" + getDocumentId() + "Document";
    }

}
