package schoolrecords;

public class Subject {

    private String subjectName;

    public Subject(String subjectName) {
        isEmpty(subjectName);
        this.subjectName = subjectName;
    }

    public void isEmpty(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Subject name must not be empty!");
        }
    }

    public String getSubjectName() {
        return subjectName;
    }
}
