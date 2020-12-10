package ioreader.grades;

import library.NullOrEmpty;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public double classAverage() {
        double sum = 0;
        for (Student student: students) {
            sum += student.average();
        }
        return sum / students.size();
    }

    public void readGradesFromFile(String pathName) {
        NullOrEmpty.stringIsNullOrEmpty(pathName, "Pathname is null or empty");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(pathName), Charset.forName("UTF-8"))){
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(lineProcess(line));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("File not exist!");
        }
    }

    private Student lineProcess(String line) {
        String[] words = line.split(" ");
        List<Integer> marks = new ArrayList<>();
        String name = words[0];
        for (int i = 1; i < words.length; i++) {
            marks.add(Integer.parseInt(words[i]));
        }
        return new Student(name, marks);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
