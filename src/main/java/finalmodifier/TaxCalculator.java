package finalmodifier;

public class TaxCalculator {

    public static final double AFA = 0.27;

    static double tax(double price) {
        return price * AFA;
    }

    static double priceWithTax(double price) {
        return price * (1 + AFA);
    }

    public static void main(String[] args) {
        double price = 1000;
        System.out.println(price + "Ft Áfa-ja: " + tax(price) + " Ft.");
        System.out.println(price + " Ft Áfa-val növelve: " + priceWithTax(price) + " Ft lesz.");
    }
}
