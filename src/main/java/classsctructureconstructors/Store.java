package classsctructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int pcs) {
        setStock(getStock() + pcs);
    }

    public void dispatch(int pcs) {
        setStock(getStock() - pcs);
    }
}
