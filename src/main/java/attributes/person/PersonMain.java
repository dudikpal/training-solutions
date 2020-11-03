package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println(person1.personToString());
        person1.correctData("Név", "PA1111");
        System.out.println(person1.personToString());
        Address address1 = new Address("Hungary", "Dunapataj", "Csákány u. 10.", "4444");
        System.out.println(address1.addressToString());
        person1.moveTo(address1);
        System.out.println(person1.personToString());
        System.out.println(person1.getAddress().addressToString());

        person1.correctData("Másikjános", "XX2222");
        address1.correctData("Talyvan", "Sziti", "Firts str 32", "34123");
        System.out.println(person1.personToString());
        System.out.println(person1.getAddress().addressToString());

    }
}
