package software;

public class OfficeSoftware extends Software{
    
    private final double PRICE_MULTIPLIER = 1.05;
    
    public OfficeSoftware(String name, double price) {
        super(name, price);
    }
    
    @Override
    protected void increasePrice(double PRICE_MULTIPLIER) {
        super.increasePrice(PRICE_MULTIPLIER);
    }
    
    
    
    public static void main(String[] args) {
        OfficeSoftware os = new OfficeSoftware("name", 100);
        os.increasePrice(1.05);
        System.out.println(os.getPrice());
    }
}
