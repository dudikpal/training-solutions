package week03.d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
  
  @Test
  void getResult() {
    String appending = "16+10";
    
    assertEquals(26, new Operation(appending).getResult());
  }
}