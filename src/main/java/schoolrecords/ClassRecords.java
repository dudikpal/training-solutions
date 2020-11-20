package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ClassRecords {
    private String className;
    private Random rnd = new Random();
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, List<Student> students) {
        this.className = className;
        this.students = students;
    }

    public boolean removeStudent(Student student) {
        for (Student item: students) {
            if (item.getName().equals(student.getName())) {
                System.out.println(student.getName() + " sikeresen törölve a naplóból.");
                students.remove(student);
                return true;
            }
        }
        System.out.println("Nincs " + " nevű diák az osztályban!");
        return false;
    }
    // ez csak a teszthez kell
    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
        for (Student item: students) {
            if (item.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sumMarks = 0;
        int counter = 0;
        for (Student student: students) {
            if (student.calculateAverage() < 1) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sumMarks += student.calculateAverage();
            counter++;
        }
        return (double)Math.round((sumMarks / counter) * 100) / 100;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sumMarks = 0;
        int counter = 0;
        for (Student student: students) {
            if (student.calculateSubjectAverage(subject) < 1) {
                continue;
            }
            sumMarks += student.calculateSubjectAverage(subject);
            counter++;
        }
        return (double)Math.round((sumMarks / counter) * 100) / 100;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student student: students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student student: students) {
            StudyResultByName studyResultByName = new StudyResultByName(student.getName(), student.calculateAverage());
            studyResultByNames.add(studyResultByName);
        }
        return studyResultByNames;
    }

    public String listStudentNames() {
        String names = "";
        for (Student student: students) {
            names += student.getName() + ", ";
        }
        return names.substring(0, names.length() - 2);
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        return false;
    }

    public String getClassName() {
        return className;
    }
}
