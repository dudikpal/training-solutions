package week04.d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || "".equals(fullName)) {
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }
        this.fullName = fullName;
    }

    private void separateName(String fullName) {

    }

    public void changeFirstName(String firstName) {
        String actualFirstName;
        String actualLastName;
        actualFirstName = firstName;
        actualLastName = fullName.substring(fullName.indexOf(" ") + 1);
        setFullName(actualFirstName + " " + actualLastName);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
