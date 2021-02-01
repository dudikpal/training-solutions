package week13.d05;

import java.util.List;

public class BillTypeWithHeader implements BillTemplate{
  
  private String header = String.format("%-19s %12s %5s %6s", "Megnevezés (20 karakter)", "Egységár (Ft)", "Darab", "Összeg\n");
  
  @Override
  public String createBill(List<BillItem> items) {
    StringBuilder sb = new StringBuilder();
    sb.append(header);
    for (BillItem item : items) {
      String line = String.format("%-19s %18d %5d %6d\n", item.getName(), item.getUnitPrice(), item.getNumber(), item.getNumber() * item.getUnitPrice());
      sb.append(line);
    }
    return sb.substring(0, sb.length() - 1);
    
  }
}
