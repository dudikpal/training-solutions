package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubject = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubject) {
        //try {
            isEmpty(name);

        /*} catch (IllegalArgumentException iae) {
            System.out.println("Tutor creating failed!");
        }*/
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public static void main(String[] args) {
        Subject subject = new Subject("matek");
        Tutor tutor = new Tutor("", Arrays.asList(subject));
        System.out.println(tutor);
        System.out.println("Vége");
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

}

