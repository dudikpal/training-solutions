package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutor {

    private String name;
    //private List<Subject> taughtSubject = new ArrayList<>();
    private List<Subject> taughtSubject;

    public Tutor(String name, List<Subject> taughtSubject) {
        //try {
            isEmpty(name);

        /*} catch (IllegalArgumentException iae) {
            System.out.println("Tutor creating failed!");
        }*/
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public List<Subject> getTaughtSubject() {
        return taughtSubject;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject item: taughtSubject) {
            if (item.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void isEmpty(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tutor name must not be empty!");
        }
    }

    public String toString() {
        System.out.println("Tanár neve: " + name);
        System.out.println("Tanított tárgyai: ");
        for (Subject subject: taughtSubject) {
            System.out.println(subject.getSubjectName());
        }
        return "";
    }

}

