package zarovizsgapotvizsga1.cleaning;

public class Office implements Cleanable{
    
    private String address;
    private double baseArea;
    private int levelsNumber;
    private final int SQUAREMETER_PRICE = 100;
    
    public Office(String address, double baseArea, int levelsNumber) {
        this.address = address;
        this.baseArea = baseArea;
        this.levelsNumber = levelsNumber;
    }
    
    @Override
    public int clean() {
        return (int)(levelsNumber * baseArea * SQUAREMETER_PRICE);
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    public double getBaseArea() {
        return baseArea;
    }
    
    public int getLevelsNumber() {
        return levelsNumber;
    }
    
    public int getSQUAREMETER_PRICE() {
        return SQUAREMETER_PRICE;
    }
}
