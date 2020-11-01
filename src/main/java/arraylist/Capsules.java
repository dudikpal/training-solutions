package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    void addLast(String color) {
        colors.add(color);
    }

    void addFist(String color) {
        colors.add(0, color);
    }

    void removeFirst() {
        colors.remove(0);
    }

    void removeLast() {
        colors.remove(colors.size() - 1);
    }

    List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("első");
        System.out.println(capsules.getColors());
        capsules.addFist("újelső");
        System.out.println(capsules.getColors());
        capsules.addLast("utolsó");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());

    }
}
