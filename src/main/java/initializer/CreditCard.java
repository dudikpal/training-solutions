package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> rates = new ArrayList<>();
    private long balance;
    //private Currency currency;

    static {
        rates.add(new Rate(Currency.HUF, 1.0));
        rates.add(new Rate(Currency.EUR, 308.23));
        rates.add(new Rate(Currency.SFR, 289.24));
        rates.add(new Rate(Currency.GBP, 362.23));
        rates.add(new Rate(Currency.USD, 289.77));

        /*List<Rate> ratesInitializer = new ArrayList<>();
        ratesInitializer.add(new Rate(Currency.HUF, 1.0));
        ratesInitializer.add(new Rate(Currency.EUR, 308.23));
        ratesInitializer.add(new Rate(Currency.SFR, 289.24));
        ratesInitializer.add(new Rate(Currency.GBP, 362.23));
        ratesInitializer.add(new Rate(Currency.USD, 289.77));
        rates = ratesInitializer;*/
    }

    public static void main(String[] args) {
        Rate rate = rates.get(Currency.EUR.ordinal());
        //System.out.println(rates.get(index).getConversionFactor());
        System.out.println(1);
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = amountConverter(balance, currency);
    }

    public boolean payment(long amount, Currency currency) {
        if (balance - amountConverter(amount, currency) >= 0) {
            balance -= amountConverter(amount, currency);
            return true;
        } else {
            return false;
        }
    }

    private long amountConverter(long amount, Currency currency) {
        return (long)(amount * rates.get(currency.ordinal()).getConversionFactor());
    }

    public boolean payment(long amount) {
        if (balance - amountConverter(amount, Currency.HUF) >= 0) {
            balance -= amountConverter(amount, Currency.HUF);
            return true;
        } else {
            return false;
        }
    }

    public long getBalance() {
        return balance;
    }
}
