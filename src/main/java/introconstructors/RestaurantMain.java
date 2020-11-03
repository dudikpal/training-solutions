package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant resti = new Restaurant("A tönkölyszamárhoz fogadó", 10);
        System.out.println("Étterem neve: " + resti.getName());
        System.out.println("Éttermi kapacitás: " + resti.getCapacity());
        System.out.println("Aktuális kínálatunk: " + resti.getMenu());

        // kipróbáltam a legenerált toString()-et
        System.out.println(resti.toString());
    }
}
