package stringbasic;

import java.time.LocalDate;
import java.util.Date;

public class Pet {

    private String name;
    private LocalDate birthDate;
    private String gender;
    private String regNumber;

    public Pet(String name, LocalDate birthDate, String gender, String regNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = genderSet(gender.toLowerCase());
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String genderSet(String gender) {
        if (gender.equals("male")) {
            return "male";
        } else if (gender.equals("female")) {
            return "female";
        } else {
            return "unknown";
        }
    }
}
