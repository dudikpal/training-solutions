package schoolrecords;

import java.util.Arrays;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
        isEmpty();
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        for (MarkType mark: MarkType.values()) {
            if (mark.getDescription().equals(markType)) {
                this.markType = mark;
            }
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    private void isEmpty() {
        if (markType == null || subject == null || tutor == null) {
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
