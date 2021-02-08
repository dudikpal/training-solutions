package week15.d01;

public class ProfitDays {
  
  private int dayOfBuy;
  private int dayOfSell;
  
  public ProfitDays(int dayOfBuy, int dayOfSell) {
    this.dayOfBuy = dayOfBuy;
    this.dayOfSell = dayOfSell;
  }
  
  public int getDayOfBuy() {
    return dayOfBuy;
  }
  
  public int getDayOfSell() {
    return dayOfSell;
  }
}
