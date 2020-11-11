package classsctructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Gipsz Jakab");
        client1.setYear(1976);
        client1.setAddress("Parti sétány 2.");

        System.out.println("Név: " + client1.getName());
        System.out.println("Születési év: " + client1.getYear());
        System.out.println("Lakcím: " + client1.getAddress());

        client1.migrate("Garbage str 115");
        System.out.println("Lakcím: " + client1.getAddress());
    }
}
