package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet pet) {
        for (Pet pet2: getPets()) {
            if (areEquals(pet, pet2)) {
                return;
            }
        }
        pets.add(pet);
    }

    private boolean areEquals(Pet pet1, Pet pet2) {
        return pet1.getRegNumber().equals(pet2.getRegNumber());
    }
}
