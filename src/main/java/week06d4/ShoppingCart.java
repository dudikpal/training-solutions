package week06d4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity) {
        isNullOrEmpty(name);
        int index = itemExist(name);
        if (index > -1) {
            items.get(index).setQuantity(items.get(index).getQuantity() + quantity);
        } else {
            items.add(new Item(name, quantity));
        }
    }

    private int itemExist(String name) {
        for (Item item: items) {
            if (item.getName().equals(name)) {
                return items.indexOf(item);
            }
        }
        return -1;
    }

    public int getItem(String name) {
        for (Item item: items) {
            if (item.getName().equals(name)) {
                return item.getQuantity();
            }
        }
        return 0;
    }

    public List<Item> getItems() {
        return items;
    }

    private void isNullOrEmpty(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name must not be empty!");
        }


    }
}
