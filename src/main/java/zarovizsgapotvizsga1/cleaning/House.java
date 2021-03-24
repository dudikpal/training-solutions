package zarovizsgapotvizsga1.cleaning;

public class House implements Cleanable{
    
    private String address;
    private double baseArea;
    private final int SQUAREMETER_PRICE = 80;
    
    public House(String address, double baseArea) {
        this.address = address;
        this.baseArea = baseArea;
    }
    
    @Override
    public int clean() {
        return (int) (baseArea * SQUAREMETER_PRICE);
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    public double getBaseArea() {
        return baseArea;
    }
    
    public int getSQUAREMETER_PRICE() {
        return SQUAREMETER_PRICE;
    }
}
