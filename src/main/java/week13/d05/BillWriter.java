package week13.d05;

import java.util.List;

public class BillWriter {
  
    private static final String name = "{name}";
    private static final String number = "{number}";
    private static final String price = "{price}";
    private static final String sum = "{sum}";
    
  public String writeBills(List<BillItem> items, BillTemplate writer) {
    
    /*int nameIndex = stringTemplate.indexOf("{name");
    int numberIndex = stringTemplate.indexOf("{number}");
    int priceIndex = stringTemplate.indexOf("{price}");
    int sumIndex = stringTemplate.indexOf("{sum}");*/
    
   /* if (stringTemplate.contains("\n")) {
      String header = stringTemplate.substring(0, stringTemplate.indexOf("\n") + 2);
      sb.append(header);
    }
    for (BillItem billItem : items) {
      
      if (stringTemplate.contains(sum)) {
      
      }
      
    }*/
    return writer.createBill(items);
  }
}
