package week13d05;

public class BillItem {
  private String name;
  private int number;
  private int unitPrice;
  
  public BillItem(String name, int number, int unitPrice) {
    this.name = name;
    this.number = number;
    this.unitPrice = unitPrice;
  }
  
  public String getName() {
    return name;
  }
  
  public int getNumber() {
    return number;
  }
  
  public int getUnitPrice() {
    return unitPrice;
  }
}
