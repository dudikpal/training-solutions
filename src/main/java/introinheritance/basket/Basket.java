package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        isNull(item);
        items.add(item);
    }

    public void removeItem(String barcode) {
        isEmpty(barcode);
        for (Item item: this.getItems()) {
            if (item.getBarcode().equals(barcode)) {
                items.remove(item);
            }
        }
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    private void isNull(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("The item must not be null!");
        }
    }

    private void isEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Barcode must not be empty!");
        }
    }
}
