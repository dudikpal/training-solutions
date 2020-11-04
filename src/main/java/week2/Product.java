package week2;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return p.name == name && Math.max(p.code.length(), code.length()) - Math.min(p.code.length(), code.length()) < 2 ? true : false;
    }

    public static void main(String[] args) {

        Product product1 = new Product("termek1", "12345");
        Product product2 = new Product("termek1", "1234");
        Product product3 = new Product("termek1", "12345678");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product2.areTheyEqual(product3));


    }
}
