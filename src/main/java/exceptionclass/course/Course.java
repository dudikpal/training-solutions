package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        isNull(name);
        isNull(begin);
        this.name = name;
        this.begin = begin;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d: %s", begin.getHour(), begin.getMinute(), name);
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    private void isNull(Object object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
    }
}
