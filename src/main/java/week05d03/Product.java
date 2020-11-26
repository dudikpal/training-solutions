package week05d03;

public class Product {

    private long price;
    private Currency currency;

    public Product(long price, Currency currency) {
        isCurrency(currency);
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice(Currency currency) {
        if (currency == Currency.HUF) {
            return price / currency.getRate();
        }
        if (currency == Currency.USD) {
            return price * currency.HUF.getRate();
        }
        return 0;
    }

    private Currency isCurrency(Currency currency) {
        if (currency == null) {
            return null;
        }
        if (currency == Currency.HUF || currency == Currency.USD) {
            return currency;
        }
        return null;
    }
}
