package finalmodifier;

public class Gentleman {

    static final String MESSAGE_PREFIX = "Legyen üdvözölve, kedves ";
    static String sayHello(String name) {
        return MESSAGE_PREFIX + name;
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Tibor"));
    }

}
