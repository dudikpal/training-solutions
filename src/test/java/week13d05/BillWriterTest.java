package week13d05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillWriterTest {
  
  private static List<BillItem> items;
  private static BillWriter billWriter;
  
  @BeforeAll
  static void setUp(){
    items = List.of(
      new BillItem("kenyér", 3, 10),
      new BillItem("tej", 5, 20)
    );
    billWriter = new BillWriter();
  }
  
  @Test
  void writeBillsSimple() {
    
    String result = "3 kenyér, darabja 10 Ft\n" +
                        "5 tej, darabja 20 Ft";
    
    assertEquals(result, billWriter.writeBills(items, new BillTypeSimple()));
  }
  
  @Test
  void writeBillWithHeader() {
    String result =   "Megnevezés (20 karakter) Egységár (Ft) Darab Összeg\n" +
                      "kenyér                              10     3     30\n" +
                      "tej                                 20     5    100";
    
    assertEquals(result, billWriter.writeBills(items, new BillTypeWithHeader()));
  }
  
  @Test
  void writeBillWithMultiple() {
    String result =   "kenyér 3 * 10 = 30\n" +
                      "tej 5 * 20 = 100";
   
    assertEquals(result, billWriter.writeBills(items, new BillTypeMultiple()));
  }
}