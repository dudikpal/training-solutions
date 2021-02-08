package week15.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitcoinProfitTest {
  
  @Test
  void maxProfit() {
    BitcoinProfit bcp = new BitcoinProfit();
    
    ProfitDays result = new ProfitDays(3, 5);
    int[] values = {100, 120, 40, 70, 230, 30, 50};
    
    assertEquals(3, bcp.maxProfit(values).getDayOfBuy());
    assertEquals(5, bcp.maxProfit(values).getDayOfSell());
  }
}