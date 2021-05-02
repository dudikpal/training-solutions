package lambdaprimitives;

public class Product {

    private String name;
    private double price;
    private int pcs;

    public Product(String name, double price, int pcs) {
        this.name = name;
        this.price = price;
        this.pcs = pcs;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPcs() {
        return pcs;
    }
}
