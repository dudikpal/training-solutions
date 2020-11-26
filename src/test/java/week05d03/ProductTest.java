package week05d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void rateToUSD() {

        Product product = new Product(300, Currency.USD);

        Currency currency = Currency.HUF;
        assertEquals(90000, product.convertPrice(currency));
    }

    @Test
    void rateToHUF() {
        Product product = new Product(300, Currency.HUF);

        Currency currency = Currency.USD;
        assertEquals(1, product.convertPrice(currency));

    }
}
