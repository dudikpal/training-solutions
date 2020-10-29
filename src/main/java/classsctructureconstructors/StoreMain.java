package classsctructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 = new Store("termék1");
        Store store2 = new Store("termék2");

        System.out.println("Az 1-es raktárban a " + store1.getProduct() + "-ből " + store1.getStock() + " db van");
        System.out.println("A 2-es raktárban a " + store2.getProduct() + "-ből " + store2.getStock() + " db van");

        store1.store(10);
        store2.store(20);

        System.out.println("Az 1-es raktárban a " + store1.getProduct() + "-ből " + store1.getStock() + " db van");
        System.out.println("A 2-es raktárban a " + store2.getProduct() + "-ből " + store2.getStock() + " db van");

        store1.dispatch(5);
        store2.dispatch(10);

        System.out.println("Az 1-es raktárban a " + store1.getProduct() + "-ből " + store1.getStock() + " db van");
        System.out.println("A 2-es raktárban a " + store2.getProduct() + "-ből " + store2.getStock() + " db van");
    }
}
