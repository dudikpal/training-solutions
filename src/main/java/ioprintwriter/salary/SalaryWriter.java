package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names = new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path fileName) {

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(fileName))){
            for (String name: names) {
                pw.write(name + ": ");
                pw.println(salary(name));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Cant write file.");
        }
    }

    private int salary(String name) {
        if (name.toLowerCase().contains("dr.")) {
            return 500000;
        }
        if (name.toLowerCase().contains("mr.") || name.toLowerCase().contains("mrs.")) {
            return 200000;
        }
        return 100000;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }
}
