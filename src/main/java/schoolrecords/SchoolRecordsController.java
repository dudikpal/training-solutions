package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private ClassRecords classRecords;

    public static void main(String[] args) {

        SchoolRecordsController src = new SchoolRecordsController();
        src.classRecords = new ClassRecords("Class 1", src.students);

        src.initSchool();

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int choosedMenu = 0;
        while (choosedMenu != 11) {
            src.showMenu();
            choosedMenu = Integer.parseInt(scanner.nextLine());
            src.choosedMenuMethods(choosedMenu);
        }
    }

    public void choosedMenuMethods(int menuPoint) {
        Scanner scanner = new Scanner(System.in);

        switch (menuPoint) {
            case 1:
                System.out.println("\nAz alábbi diákok járnak az osztályba:");
                System.out.println(classRecords.listStudentNames());
                break;

            case 2:
                System.out.println("\nKérem pontosan adja meg a diák nevét:");
                System.out.println("\n" + classRecords.findStudentByName(inputName()));
                break;

            case 3:
                case3();
                break;

            case 4:
                System.out.println("\nKérem a törlendő diák nevét:");
                classRecords.removeStudent(classRecords.findStudentByName(inputName()));
                break;

            case 5:
                case5();
                break;

            case 6:
                System.out.println(classRecords.calculateClassAverage());
                break;
            case 7:
                case7();
                break;
            case 8:
                System.out.println("A diákok átlaga:");
                for (StudyResultByName student: classRecords.listStudyResults()) {
                    System.out.println(student.getStudentName() +
                            "\nOsztályzatainak átlaga: " + student.getStudyAverage() + "\n");
                }
                break;
            case 9:
                System.out.println("Kérem adja meg pontosan a diák nevét:");
                Student studentMarksAverage = classRecords.findStudentByName(inputName());
                System.out.println(studentMarksAverage.getName() +
                        "\nOsztályzatainak átlaga: " + studentMarksAverage.calculateAverage());
                break;
            case 10:
                case10();
                break;
            case 11:
                System.out.println("Köszönjük, hogy használta világszínvonalú rendszerünket!");
                break;
            case 12:
                case12();
                break;

            default:
                System.out.println("Kérjük 1 és 12 közötti számot írjon be!");
        }
    }

    private void case3() {
        System.out.println("\nKérem az új diák nevét:");
        String name = inputName();
        if (classRecords.addStudent(new Student(name))) {
            classRecords.addStudent(new Student(name));
            System.out.println(name + " sikeresen hozzáadva a naplóhoz.");
        } else {
            System.out.println("Ilyen nevű diák már van a naplóban!");
        }
    }

    private void case5() {
        Random rnd = new Random();
        System.out.println("\"Ahol kinyílik a napló\" feleltetés eredménye:");
        Tutor tutor = tutors.get(rnd.nextInt(tutors.size()));
        Subject subject = tutor.getTaughtSubject().get(rnd.nextInt(tutor.getTaughtSubject().size()));
        String givenMark = String.valueOf(rnd.nextInt(MarkType.values().length) + 1);
        Student studentToRepetition = classRecords.repetition();
        Mark mark = new Mark(givenMark, subject, tutor);
        studentToRepetition.grading(mark);
        System.out.println("Felelő neve: " + studentToRepetition.getName() +
                "\nFeleltető tanár: " + tutor.getName() +
                "\nTantárgy: " + subject.getSubjectName() +
                "\nOsztályzat: " + mark.toString());
    }

    private void case7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik tantárgy osztályátlagára kíváncsi?");
        String subjectName = scanner.nextLine();
        for (Subject item: subjects) {
            if (item.getSubjectName().equals(subjectName)) {
                System.out.println("Az osztály átlaga " +
                        item.getSubjectName() + " tárgyból: " +
                        classRecords.calculateClassAverageBySubject(item));
            }
        }
    }

    private void case10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg pontosan a diák nevét:");
        Student studentSubjectAverage = classRecords.findStudentByName(inputName());
        System.out.println("Kis helper a jó lekérdezéshez:\n" + classRecords.findStudentByName(studentSubjectAverage.getName()));
        System.out.println("Melyik tantárgy átlagára kíváncsi?");
        String subjectToAverage = scanner.nextLine();
        for (Subject item: subjects) {
            if (item.getSubjectName().equals(subjectToAverage)) {
                System.out.println(item.getSubjectName() +
                        ": " + studentSubjectAverage.calculateSubjectAverage(item));
            }
        }
    }

    private void case12() {
        for (Tutor item: tutors) {
            System.out.println(item);
        }
        for (Student student: students) {
            System.out.println(student);
        }
    }

    private String inputName () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showMenu() {
        System.out.println( "\n1. Diákok nevének listázása\n" +
                            "2. Diák név alapján keresése\n" +
                            "3. Diák létrehozása\n" +
                            "4. Diák név alapján törlése\n" +
                            "5. Diák feleltetése\n" +
                            "6. Osztályátlag kiszámolása\n" +
                            "7. Tantárgyi átlag kiszámolása\n" +
                            "8. Diákok átlagának megjelenítése\n" +
                            "9. Diák átlagának kiírása\n" +
                            "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                            "11. Kilépés\n" +
                            "12. Állapot kiírása ellenőrzéshez\n");
    }

    public void initSchool() {
        // tantárgyak létrehozása
        subjects.add(new Subject("Irodalom"));
        subjects.add(new Subject("Matematika"));
        subjects.add(new Subject("Történelem"));
        subjects.add(new Subject("Földrajz"));
        subjects.add(new Subject("Biológia"));
        subjects.add(new Subject("Proktológia"));

        // tanulók létrehozása
        classRecords.addStudent(new Student("Első Márton"));
        classRecords.addStudent(new Student("Mássodhik Kicsién"));
        classRecords.addStudent(new Student("Harmadik Gyula"));
        classRecords.addStudent(new Student("Negyedik Eufrozina"));
        classRecords.addStudent(new Student("Ötödik Taksony"));

        // tanárok létrehozása a tanított tantárgyaikkal
        tutors.add(new Tutor("Tanár Néni", new ArrayList<>(){
            {
                add(subjects.get(0));
                add(subjects.get(1));
            }
        }));
        tutors.add(new Tutor("Tanár Bácsi", new ArrayList<>(){
            {
                add(subjects.get(2));
                add(subjects.get(3));
            }
        }));
        tutors.add(new Tutor("Tanár Semleges", new ArrayList<>(){
            {
                add(subjects.get(4));
                add(subjects.get(5));
            }
        }));

        Random rnd = new Random();
        // tanulók feltöltése osztályzatokkal
        for (Student student: students) {
            // mennyi osztályzatot akarunk adni diákonként
            int marksPerStudent = 5;
            for (int i = 0; i < marksPerStudent; i++) {
                String markType = String.valueOf(rnd.nextInt(5) + 1);
                Subject subject = subjects.get(rnd.nextInt(subjects.size()));
                Tutor tutor = null;
                // subjecthez való tanár kikeresése
                for (Tutor item: tutors) {
                    if (item.tutorTeachingSubject(subject)) {
                        tutor = item;
                    }
                }
                student.grading(new Mark(markType, subject, tutor));
            }
        }
    }
}
