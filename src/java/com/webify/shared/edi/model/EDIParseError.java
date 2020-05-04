package com.webify.shared.edi.model;


/**
 * @author mperham
 * @version $Id: EDIParseError.java 2 2004-07-05 20:20:46Z mperham $
 */
public class EDIParseError {
    private String message;
    private String segment;
    private int segmentNumber;
    private EDIParseException exception;

    EDIParseError(String msg, String currentSegment, int segmentCount, EDIParseException ex) {
        message = msg;
        segment = currentSegment;
        segmentNumber = segmentCount;
        exception = ex;
    }

    public String getMessage() {
        return message;
    }

    public String getSegment() {
        return segment;
    }

    public int getSegmentNumber() {
        return segmentNumber;
    }

    public String toString() {
        return "Parse Error: Segment #" + getSegmentNumber() + " [" + getSegment() + "]\n"
                + getMessage();
    }

    public EDIParseException getException() {
        return exception;
    }
}
