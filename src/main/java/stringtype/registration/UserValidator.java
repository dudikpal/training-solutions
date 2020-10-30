package stringtype.registration;

public class UserValidator {
    public boolean isValidUserName(String username) {
        return username.equals("") ? false : true;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.equals(password2) && password1.length() >= 8 ? true : false;
    }

    public boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && email.indexOf('@') != 0 && email.indexOf('.') < email.length() - 1 && email.indexOf('@') + 1 < email.indexOf('.') ? true : false;
    }
}
