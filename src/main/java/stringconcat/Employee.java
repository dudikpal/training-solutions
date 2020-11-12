package stringconcat;

public class Employee {

    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        parametersValidator();
    }

    public void parametersValidator() {
        if (getName() == null || getName().equals("") || getName().equals(" ")) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (getSalary() < 0 || getSalary() % 1000 != 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        if (getJob() == null || getJob().equals("") || getJob().equals(" ")) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
    }

    public String toString() {
        return name + " - " + job + " - " + salary + " Ft";
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }
}
