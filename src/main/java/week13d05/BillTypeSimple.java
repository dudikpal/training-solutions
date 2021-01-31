package week13d05;

import java.util.List;

public class BillTypeSimple implements BillTemplate{
  
  @Override
  public String createBill(List<BillItem> items) {
    StringBuilder sb = new StringBuilder();
    for (BillItem item : items) {
      sb.append(item.getNumber() + " " + item.getName() + ", darabja " + item.getUnitPrice() + " Ft\n");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
