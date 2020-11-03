package attributes.person;

public class Person {

    private String name;
    private String identificationCard;
    private Address address;

    public String personToString() {
        return name + ", " + identificationCard;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
