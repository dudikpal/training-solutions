package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }


    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sumNettoPrice = 0;
        for (Item item: basket.items) {
            sumNettoPrice += item.getNettoPrice();
        }
        return sumNettoPrice;
    }

    public double sumTaxValue() {
        double sumTaxValue = 0;
        for (Item item: basket.items) {
            sumTaxValue += item.getTaxAmount();
        }
        return sumTaxValue;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        Item mostExpensiveItem = null;
        double expensivePrice = 0;
        for (Item item: basket.items) {
            if (item.getNettoPrice() > expensivePrice) {
                expensivePrice = item.getNettoPrice();
                mostExpensiveItem = item;
            }
        }
        basket.items.remove(mostExpensiveItem);
    }
}
