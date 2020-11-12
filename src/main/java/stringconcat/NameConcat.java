package stringconcat;

public class NameConcat {

    private String firstName;
    private String middleName;
    private String lastName;
    private Title title;

    public NameConcat(String firstName, String middleName, String lastName, Title title) {
        if (isEmpty(firstName)) {
            throw new IllegalArgumentException("First name and last name are required!");
        }
        this.firstName = firstName;
        if (isEmpty(lastName)) {
            throw new IllegalArgumentException("First name and last name are required!");
        }
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
    }

    public NameConcat(String firstName, String middleName, String lastName) {
        if (isEmpty(firstName)) {
            throw new IllegalArgumentException("First name and last name are required!");
        }
        this.firstName = firstName;
        if (isEmpty(lastName)) {
            throw new IllegalArgumentException("First name and last name are required!");
        }
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public boolean isEmpty(String name) {
        if (name == null || name.equals("") || name.equals(" ")) {
            return true;
        }
        return false;
    }

    public String concatNameWesternStyle() {
        return title.getTitle() + " " +firstName + " " + middleName + " " + lastName;
    }

    public String concatNameHungarianStyle() {
        return lastName.concat(" ").concat(middleName).concat(" ").concat(firstName);
    }
}
