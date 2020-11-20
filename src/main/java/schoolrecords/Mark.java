package schoolrecords;

import java.util.Arrays;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        isEmpty(subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        isEmpty(subject, tutor);
        this.markType = markTypeStringOrNumber(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    private MarkType markTypeStringOrNumber(String markType) {
        for (MarkType mark: MarkType.values()) {
            if (markType.length() > 1) {
                if (mark.getDescription().equals(markType)) {
                    return mark;
                }
            } else {
                if (!markType.isBlank() && mark.getValue() == Integer.parseInt(markType)) {
                    return mark;
                }
            }
        }
        return null;
    }

    private void isEmpty(Subject subject, Tutor tutor) {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }

    public String toString() {
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

}
