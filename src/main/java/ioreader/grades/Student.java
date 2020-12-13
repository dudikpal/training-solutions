package ioreader.grades;

import library.NullOrEmpty;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList = new ArrayList<>();

    public Student(String name, List<Integer> gradeList) {
        NullOrEmpty.stringIsNullOrEmpty(name, "Name is null or empty!");
        NullOrEmpty.objectIsNull(gradeList, "List is null!");
        NullOrEmpty.listIsNullOrEmpty(gradeList, "List is empty!");
        this.name = name;
        this.gradeList = gradeList;
    }
    
    public double average() {
        double average = 0;
        for (Integer mark: gradeList) {
            average += mark;
        }
        return average / gradeList.size();
    }
    
    public boolean isIncreasing() {
        for (int i = 0; i < gradeList.size() -1; i++) {
            if (gradeList.get(i) > gradeList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void addMark(int mark) {
        gradeList.add(mark);
    }
    
    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }
}
