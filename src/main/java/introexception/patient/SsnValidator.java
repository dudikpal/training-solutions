package introexception.patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            System.out.println("Nem 9 számból áll!");
            return false;
        }

        int sum = 0;
        for (int i = 0; i < ssn.length() - 1; i++) {
            if (i % 2 == 0) {
                sum += Integer.parseInt(Character.toString(ssn.charAt(i))) * 3;
            } else {
                sum += Integer.parseInt(Character.toString(ssn.charAt(i))) * 7;
            }
        }

        if (sum % 10 != Integer.parseInt(Character.toString(ssn.charAt(ssn.length() -1)))) {
            System.out.println("Nem érvényes a szám!");
            return false;
        }
        System.out.println("Szám elfogadva!");
        return true;
    }

    public String validSsnGenerator() {

        Random rnd = new Random();
        List<String> validSsns = new ArrayList<>();
        long ssnNumber = 100_000_000;
        for (int i = 0; i < 899_999; i++) {
            String ssn = Long.toString(ssnNumber);
            int sum = 0;

            for (int j = 0; j < ssn.length() - 1; j++) {
                if (j % 2 == 0) {
                    sum += Integer.parseInt(Character.toString(ssn.charAt(j))) * 3;
                } else {
                    sum += Integer.parseInt(Character.toString(ssn.charAt(j))) * 7;
                }
            }

            if (sum % 10 == Integer.parseInt(Character.toString(ssn.charAt(ssn.length() -1)))) {
                validSsns.add(ssn);
            }

            ssnNumber++;
        }
        return validSsns.get(rnd.nextInt(validSsns.size()));
    }
}
