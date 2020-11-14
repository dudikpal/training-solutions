package filescanner;

public class Book {

    private String regNumber;
    private String author;
    private String title;
    private String year;

    public Book(String regNumber, String author, String title, String year) {
        this.regNumber = regNumber;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
