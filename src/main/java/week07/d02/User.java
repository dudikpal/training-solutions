package week07.d02;

public interface User {



    String getUsername();
    String getFirstName();
    String getLastName();

    default String getFullName() {
        return getFirstName() + " " + getLastName();
    };

    static void of(String username, String firstName, String lastName) {
        new UserImpl(username, firstName, lastName);
    }

}
