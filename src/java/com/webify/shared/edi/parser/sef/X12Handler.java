package com.webify.shared.edi.parser.sef;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;


/**
 * This class can be used to generate an X12 EDI object model.
 * WARNING: this class is NOT thread-safe.  Only one X12Handler
 * should be instantiated at a time.
 *
 * @author mperham
 */
public class X12Handler {

    private Stack loops = new Stack();

    private Map segmentMap = new HashMap();
    private Map fieldMap = new HashMap();
    private Map compositeMap = new HashMap();
    private Map loopTriggers = new HashMap();
    private Map segmentTriggers = new HashMap();

    private X12Transaction xa = null;
    private X12Loop currentLoop = null;
    private X12Segment currentSegment = null;
    private X12Mask currentMask = null;
    private X12Codeset currentCodeset = null;
    private X12Codeset currentCodesetOverride = null;
    private X12CompositeField currentComposite = null;

    public X12Handler() {
        instance = this;
    }

    private static X12Handler instance = null;

    public static X12Handler getInstance() {
        return instance;
    }

    private String cleanString(String in) {
        StringBuffer sb = new StringBuffer(in.length());

        for (int i = 0; i < in.length(); i++) {
            if (Character.isLetterOrDigit(in.charAt(i))) {
                sb.append(in.charAt(i));
            }
        }
        return sb.toString();
    }

    public void startTransaction(String docid, String standardid, String description) {
        if (docid.indexOf("_") != -1) {
            // EDIdev SEF docIds have XXX_YYYY format and we just want the XXX part
            docid = docid.substring(0, docid.indexOf("_"));
        }
        xa = new X12Transaction();
        xa.setName(docid);
        xa.setDocumentId(docid);
        xa.setStandardsId(cleanString(standardid));
        xa.setDescription(description);
        currentLoop = xa;
    }

    public void addLoopTrigger(String loopName, String segName, int fieldIdx, String value) {
        X12LoopTrigger trigger = new X12LoopTrigger(loopName, segName, fieldIdx, value);
        loopTriggers.put(loopName, trigger);
    }

    public void addSegmentTrigger(String loopName, String segName, int segIdx, int fieldIdx, String value) {
        // no name means it is a top-level segment, not within a loop
        if (loopName == null || "".equals(loopName.trim())) {
            loopName = xa.getName();
        }
        X12SegmentTrigger trigger = new X12SegmentTrigger(loopName, segName, segIdx, fieldIdx, value);
        segmentTriggers.put(loopName + ":" + segName + getPaddedNumber(segIdx), trigger);
    }

    public void startLoop(String name, int count) {
        X12Loop newLoop = new X12Loop();

        newLoop.setName(name);
        newLoop.setMaxUsage((short) count);
        newLoop.setTrigger((X12LoopTrigger) loopTriggers.get(name));
        currentLoop.addLoop(newLoop);

        loops.push(currentLoop);
        currentLoop = newLoop;
    }

    private String lastSegment = null;
    private int repeatCount = 1;

    private short currentOrdinal = 1;

    public void addSegmentReference(String name, boolean optional, String usage, short maxUse,
            short ordinal, short mask, short positionIncrement) {

        // rarely a loop will have a segment repeat many times - we need to be able to distinguish
        // between these segments so we need to detect the repeat and append a unique number to it
        boolean isRepeat = name.equals(lastSegment);

        if (repeatCount == 1 && isRepeat) {
            lastSegment = name;
            Map m = currentLoop.getSegmentMap();
            // update initial segment
            X12SegmentReference segref = (X12SegmentReference) m.remove(name);

            segref.setName(segref.getName() + getPaddedNumber(repeatCount++));
            m.put(segref.getName(), segref);
            name += getPaddedNumber(repeatCount++);
        }
        else if (isRepeat) {
            lastSegment = name;
            name += getPaddedNumber(repeatCount++);
        }
        else if (repeatCount > 1 && !isRepeat) {
            lastSegment = name;
            repeatCount = 1;
        }
        else {
            lastSegment = name;
        }

        if (ordinal != 0) {
            currentOrdinal = ordinal;
        }
        if (positionIncrement != Short.MIN_VALUE) {
            xa.setCurrentIncrement(positionIncrement);
        }

        X12SegmentReference segment = new X12SegmentReference();

        segment.setBaseName(lastSegment);
        segment.setName(name);
        segment.setMaxUsage(maxUse);
        segment.setOptional(optional);
        segment.setMask(mask);
        segment.setOrdinal(currentOrdinal++);
        segment.setPosition(xa.getNextPosition());

        if (usage != null) {
            segment.setUsageNote(convertX12Usage(usage));
        }

        currentLoop.addSegmentReference(segment);
    }

    public void endLoop() {
        currentLoop = (X12Loop) loops.pop();
    }

    public void startSegment(String name) {
        currentSegment = (X12Segment) segmentMap.get(name);
        if (currentSegment == null) {
            X12Segment seg = new X12Segment();

            seg.setName(name);
            segmentMap.put(name, seg);
            currentSegment = seg;
        }
    }

    public void endSegment() {
        currentSegment = null;
        currentFieldOrdinal = 1;
    }

    private short currentFieldOrdinal = 1;

    public void addFieldReference(String id, short ordinal, boolean optional) {
        X12FieldReference ref = new X12FieldReference();

        ref.setId(id);
        ref.setOptional(optional);
        if (ordinal != 0) {
            ref.setOrdinal(ordinal);
            currentFieldOrdinal = ordinal;
        }

        if (countLevel > 0) {
            fieldsInGroup.add(ref);
            return;
        }
        if (currentSegment != null) {
            if (ref.getOrdinal() == 0) {
                ref.setOrdinal(currentFieldOrdinal++);
            }
            currentSegment.addField(ref);
        }
        if (currentComposite != null) {
            if (ref.getOrdinal() == 0) {
                ref.setOrdinal(currentFieldOrdinal++);
            }
            currentComposite.addSubfield(ref);
        }
    }

    // ////////////////////////////////////////////////////////////////////////////
    // Segments and Composites can use a field shortcut when listing
    // multiple of the same field like this:
    // AAA=[65][87]{5[43]}
    // which is the equivalent of repeating the [43] five times
    private int countLevel = 0;
    private Stack countLevels = new Stack();
    private Stack fieldGroups = new Stack();
    private List fieldsInGroup = null;
    private Integer count = null;

    public void startFieldGroup(Integer newcount) {
        if (countLevel > 0) {
            countLevels.push(count);
            fieldGroups.push(fieldsInGroup);
        }
        fieldsInGroup = new ArrayList();
        count = newcount;
        countLevel++;
    }

    public void endFieldGroup() {
        countLevel--;
        if (countLevel == 0) {
            for (int i = 0; i < count.intValue(); i++) {
                for (Iterator fit = fieldsInGroup.iterator(); fit.hasNext();) {
                    X12FieldReference ref = (X12FieldReference) fit.next();

                    // need to do this rather than add the ref directly
                    addFieldReference(ref.getId(), ref.getOrdinal(), ref.isOptional());
                }
            }
        }
        else {
            List curFields = fieldsInGroup;

            fieldsInGroup = (List) fieldGroups.pop();
            for (int i = 0; i < count.intValue(); i++) {
                for (Iterator fit = curFields.iterator(); fit.hasNext();) {
                    X12FieldReference ref = (X12FieldReference) fit.next();

                    fieldsInGroup.add(ref);
                }
            }
            count = (Integer) countLevels.pop();
        }
    }

    // ////////////////////////////////////////////////////////////////////////////


    public void startComposite(String id) {
        currentComposite = new X12CompositeField();
        currentComposite.setId(id);
        currentComposite.setName(id);
        compositeMap.put(id, currentComposite);
    }

    public void endComposite() {
        currentComposite = null;
        currentFieldOrdinal = 1;
    }

    public void startMask() {
        currentMask = new X12Mask();
        if (currentSegment != null) {
            currentSegment.addMask(currentMask);
        }
        if (currentComposite != null) {
            currentComposite.addMask(currentMask);
        }
    }

    public void addMaskField(int maskNum, String usage, String mandatory, String compMask, String min, String max, String repeat) {
        currentMask.addField(new X12FieldOverride(usage, mandatory, compMask, min, max, repeat));
    }

    public void addFieldRule(String typeStr, String elements) {
        int type = convertX12RuleType(typeStr);

        if (currentSegment != null) {
            currentSegment.addFieldRule(type, elements);
        }
        if (currentComposite != null) {
            currentComposite.addFieldRule(type, elements);
        }
    }

    public void createField(String id, String type, byte min, int max) {
        X12Field field = new X12Field();

        field.setId(id);
        field.setMinimumSize(min);
        field.setMaximumSize(max);
        field.setType(convertX12FieldType(type));
        if (field.getType() == X12Field.TYPE_PACKED_DECIMAL) {
            field.setDecimals(Byte.parseByte(type.substring(1)));
        }

        fieldMap.put(id, field);
    }

    public void startCodeset(String id) {
        currentCodeset = new X12Codeset();
        currentCodeset.setId(id);
    }

    public void addCodesetRange(String min, String max) {
        currentCodeset.addValue(min, max);
    }

    public void endCodeset() {
        if (currentCodeset != null && currentCodeset.size() > 0) {
            currentCodeset.compact();
            X12Field field = (X12Field) fieldMap.get(currentCodeset.getId());

            field.setCodeset(currentCodeset);
        }
    }

    public void startCodesetOverride(String id) {
        currentCodesetOverride = new X12Codeset();
        currentCodesetOverride.setId(id);
    }

    public void addCodesetRangeOverride(String min, String max) {
        currentCodesetOverride.addValue(min, max);
    }

    public void endCodesetOverride(short segOrd, short fieldOrd, short compOrd) {
        currentCodeset.addOverride(currentCodesetOverride, segOrd, fieldOrd, compOrd);
        currentCodesetOverride.compact();
        currentCodesetOverride = null;
    }

    private byte convertX12FieldType(String typeStr) {
        byte type = -1;

        if ("AN".equals(typeStr)) {
            type = X12Field.TYPE_STRING;
        }
        else if ("ID".equals(typeStr)) {
            type = X12Field.TYPE_ID;
        }
        else if ("N0".equals(typeStr) || "N".equals(typeStr)) {
            type = X12Field.TYPE_INTEGER;
        }
        else if ("R".equals(typeStr)) {
            type = X12Field.TYPE_DECIMAL;
        }
        else if (typeStr.startsWith("N")) {
            type = X12Field.TYPE_PACKED_DECIMAL;
        }
        else if ("DT".equals(typeStr)) {
            type = X12Field.TYPE_DATE;
        }
        else if ("TM".equals(typeStr)) {
            type = X12Field.TYPE_TIME;
        }
        else if ("B".equals(typeStr)) {
            type = X12Field.TYPE_BINARY;
        }
        else {
            throw new IllegalArgumentException("Unknown rule type: " + typeStr);
        }
        return type;
    }

    private int convertX12RuleType(String typeStr) {
        int type = -1;

        if ("R".equals(typeStr)) {
            type = X12ValidationRule.REQUIRE_ONE_OF;
        }
        else if ("C".equals(typeStr)) {
            type = X12ValidationRule.CONDITIONAL;
        }
        else if ("E".equals(typeStr)) {
            type = X12ValidationRule.EXCLUSIVE;
        }
        else if ("L".equals(typeStr)) {
            type = X12ValidationRule.LIST_CONDITIONAL;
        }
        else if ("P".equals(typeStr)) {
            type = X12ValidationRule.PAIRED;
        }
        else {
            throw new IllegalArgumentException("Unknown rule type: " + typeStr);
        }
        return type;
    }

    public void complete() {
        // System.out.println("Parsing complete.  Results follow: ");
        // System.out.println(xa.toString());
        try {
            xa.emit(xa.getDocumentId());

            /*
             Iterator it = segmentMap.values().iterator();
             while (it.hasNext()) {
             X12Segment seg = (X12Segment) it.next();
             //System.out.println(seg.toString());
             seg.emit(xa.getDocumentId());
             }

             Iterator cit = compositeMap.values().iterator();
             while (cit.hasNext()) {
             X12CompositeField field = (X12CompositeField) cit.next();
             //System.out.println(field.toString());
             field.emit(xa.getDocumentId());
             }
             */
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private byte convertX12Usage(String usage) {
        byte use = X12Element.USAGE_DEFAULT;

        if (".".equals(usage)) {
            use = X12Element.USAGE_NOT_USED;
        }
        else if ("!".equals(usage)) {
            use = X12Element.USAGE_MUST_USE;
        }
        else if ("$".equals(usage)) {
            use = X12Element.USAGE_RECOMMENDED;
        }
        else if ("-".equals(usage)) {
            use = X12Element.USAGE_NOT_RECOMMENDED;
        }
        else if ("&".equals(usage)) {
            use = X12Element.USAGE_DEPENDENT;
        }
        return use;
    }

    public X12Segment getSegment(String name) {
        X12Segment s = (X12Segment) segmentMap.get(name);

        if (s == null) {
            System.out.println("####### Cannot find segment with name: " + name);
        }
        return s;
    }

    public X12Field getField(String id) {
        X12Field f = (X12Field) fieldMap.get(id);
        X12CompositeField c = (X12CompositeField) compositeMap.get(id);

        if (f == null && c == null) {
            System.out.println("####### Cannot find field with id: " + id);
        }
        return (f != null ? f : c);
    }

    /**
     * Formats the number according to EDI conventions:
     * 0 - 9 => "00" - "09"
     * >= 10 => "XX"
     */
    public static String getPaddedNumber(int num) {
        String str = Integer.toString(num);

        if (num < 10) {
            str = "0" + str;
        }
        return str;
    }

    public X12SegmentTrigger getSegmentTrigger(String string) {
        return (X12SegmentTrigger) segmentTriggers.get(string);
    }

}
