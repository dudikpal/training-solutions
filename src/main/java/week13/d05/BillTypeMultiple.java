package week13.d05;

import java.util.List;

public class BillTypeMultiple implements BillTemplate{
  
  @Override
  public String createBill(List<BillItem> items) {
    StringBuilder sb = new StringBuilder();
    for (BillItem item : items) {
      sb.append(item.getName() + " " + item.getNumber() + " * " + item.getUnitPrice() + " = " + item.getUnitPrice() * item.getNumber() + "\n");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
