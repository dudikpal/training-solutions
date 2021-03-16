package software;

public abstract class Software {
    
    private String name;
    private double price;
    
    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    protected void increasePrice(double multiplier){
        price *= multiplier;
    };
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
