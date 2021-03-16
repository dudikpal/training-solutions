package software;

public class DeveloperSoftware extends Software{
    
    private final double PRICE_MULTIPLIER = 1.1;
    
    public DeveloperSoftware(String name, double price) {
        super(name, price);
    }
    
    @Override
    protected void increasePrice(double PRICE_MULTIPLIER) {
        super.increasePrice(PRICE_MULTIPLIER);
    }
}
