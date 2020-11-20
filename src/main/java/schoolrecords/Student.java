package schoolrecords;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String student) {
        isEmpty(student);
        this.name = student;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sumMarks = 0;
        int counter = 0;
        for (Mark item: marks) {
            if (item.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sumMarks += item.getMarkType().getValue();
                counter++;
            }
        }
        return (double)Math.round((sumMarks / counter) * 100) / 100;
    }

    public double calculateAverage() {
        double sumMarks = 0.0;
        for (Mark mark: marks) {
            sumMarks += mark.getMarkType().getValue();
        }
        return (double)Math.round((sumMarks / marks.size()) * 100) / 100;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public String toString() {
        String studentMarks= name + " Marks: \n";
        for (Mark mark: marks) {
            studentMarks += mark.getSubject().getSubjectName() +
                    ": " + mark.getMarkType().getDescription() +
                    "(" + mark.getMarkType().getValue() + ") from " + mark.getTutor().getName() + "\n";
        }
        return studentMarks;
    }

    private void isEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    public String getName() {
        return name;
    }
}
