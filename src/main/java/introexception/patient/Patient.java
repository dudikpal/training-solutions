package introexception.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;

        if (name.equals(null)) {
            throw new IllegalArgumentException();
        }

        if (year < 1900) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


}
