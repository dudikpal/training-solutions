package week13.d05;

import java.util.List;

public interface BillTemplate {
  
  String createBill(List<BillItem> items);
}
