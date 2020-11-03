package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Item> items;

    // ez konkrétan nem volt leírva a feladatban, hogy csináljunk konstruktort a lista létrehozása miatt
    // enélkül kellett volna megoldani?
    public Bill() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void calculateTotalPrice() {
        double sum = 0;
        for (Item item: items) {
            sum += item.getPrice() * item.getQuantity();
        }
        System.out.println(sum);
    }
}
