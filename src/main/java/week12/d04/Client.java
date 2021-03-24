package week12.d04;

public class Client {
    
    private String regNumber;
    private String name;
    
    public Client(String regNumber, String name) {
        this.regNumber = regNumber;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRegNumber() {
        return regNumber;
    }
}
