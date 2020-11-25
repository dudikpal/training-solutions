package inheritanceattributes;

public class Book {

    private String title;
    protected int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int purchase(int pieces) {
        return price * pieces;
    }

    public String getTitle() {
        return title;
    }
}
