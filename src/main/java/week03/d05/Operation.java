package week03.d05;

public class Operation {
  
  private int leftOperand;
  private int rightOperand;
  
  public Operation(String appending) {
    leftOperand = Integer.parseInt(appending.substring(0, appending.indexOf("+")));
    rightOperand = Integer.parseInt(appending.substring(appending.indexOf("+") + 1));
  }
  
  public int getResult() {
    return leftOperand + rightOperand;
  }
}
