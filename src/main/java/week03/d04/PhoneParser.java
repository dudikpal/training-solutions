package week03.d04;


public class PhoneParser {

    public Phone parse(String phoneNumber) {
        String prefix = "";
        String phone = "";
        boolean prefixEnd = false;

        for (int i = 0; i < phoneNumber.length(); i++) {
            if ( phoneNumber.charAt(i) == '-') {
                prefixEnd = true;
                continue;
            }
            if (prefixEnd) {
                phone += phoneNumber.charAt(i);
            } else {
                prefix += phoneNumber.charAt(i);
            }
        }
        return new Phone(prefix, phone);
    }
}
