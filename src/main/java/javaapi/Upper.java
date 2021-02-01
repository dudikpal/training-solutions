package javaapi;

public class Upper {
  
  public String toUpper(String str) {
    return str.toUpperCase();
  }
  
  public static void main(String[] args) {
    String str = "Hello Wolrd!";
    
    System.out.println(str);
    System.out.println(new Upper().toUpper(str));
  }
}
