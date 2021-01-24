package timesheet;

public class Employee {
    private final String firstname;
    private final String lastname;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

}
