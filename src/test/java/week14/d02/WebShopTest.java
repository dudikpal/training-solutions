package week14.d02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {
    
    private static WebShop webShop;
    
    @BeforeAll
    static void setUp() {
        webShop = new WebShop();
    }
    
    
    @Test
    void testsumPriceByOrderId() {
        assertEquals(550, webShop.sumPriceOfOrder("01112"));
    }
    
    
    @Test
    void testCustomerSumSpending() {
        
        assertEquals(4890, webShop.customerSumSpending("BK123"));
    }
    
    
    @Test
    void testGetSortedOrder() {
        String expected = "[chicken: 1300\n" +
                              ", dogfood: 900\n" +
                              ", fish: 3000\n" +
                              ", pasta: 200\n" +
                              ", potato: 300\n" +
                              ", tomato: 200\n" +
                              ", tuna: 1200\n]";
        
        assertEquals(expected, webShop.sortedItemsInOrder("120"));
    }
    
    
    @Test
    void testProductSumPcs() {
        assertEquals(3, webShop.getProductSumPcs("bread"));
    }
    
    
    @Test
    void testProductsSum() {
        assertEquals(27, webShop.createStatisticByProduct().size());
        assertEquals(3, webShop.createStatisticByProduct().get("bread"));
    }
    
}