package week15.d01;

public class BitcoinProfit {
  
  private int[] values = {100, 120, 40, 70, 200, 30, 50};
  
  public ProfitDays maxProfit(int[] values) {
    int buyDay = 0;
    int sellDay = 0;
    int minValue = 0;
    int maxProfit = values[0];
    for (int i = 0; i < values.length - 1; i++) {
      minValue = values[i];
      for (int j = i + 1; j < values.length; j++) {
        if (values[j] - minValue > maxProfit) {
          maxProfit = values[j] - minValue;
          buyDay = i + 1;
          sellDay = j + 1;
        }
      }
    }
    return new ProfitDays(buyDay, sellDay);
  }
}
