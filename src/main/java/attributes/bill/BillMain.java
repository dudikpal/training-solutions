package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Item item1 = new Item("product1", 10, 100);
        Item item2 = new Item("product2", 20, 200);
        Item item3 = new Item("product3", 30, 300);

        Bill bill1 = new Bill();
        bill1.addItem(item1);
        bill1.addItem(item2);
        bill1.addItem(item3);

        bill1.calculateTotalPrice();
    }
}
