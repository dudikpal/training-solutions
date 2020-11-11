package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Szerző neve", "Könyvcím");
        book1.register("ISDN156687-12");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getRegNumber());
    }
}
