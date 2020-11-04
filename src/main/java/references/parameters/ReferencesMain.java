package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person p1;
        Person p2;
        p1 = new Person("name1", 33);
        p2 = p1;
        p2.setName("name2");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        // a p2 referencia a p1-re, csak 1 példány létezik

        int i, j;
        i = 24;
        j = i;
        j++;
        System.out.println(i);
        System.out.println(j);
        // érték szerinti átadás van primitíveknél

        p1 = new Person("name1", 44);
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        /*mind2 uarra a példányra mutatott,
        az új példánnyal a p1 régebbi példányra mutató referenciája
        így törlődött, felülírta az új értékadás, a p2 referenciája
        pedig maradt a régi példányon*/


    }
}
