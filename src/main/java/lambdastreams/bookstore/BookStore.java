package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public int getNumberOfBooks() {
        /*int sumBooks = 0;
        for (Book book : books) {
          sumBooks += book.getPieces();
        }
        return sumBooks;*/
        return books.stream().reduce(0, (a, b) -> a + b.getNumber(), (x, y) -> x + y);
        //ekvivalens
        //return books.stream().reduce(0, (a, b) -> a + b.getNumber(), Integer::sum);
    }


    public Optional<Book> findNewestBook() {
        return books.stream()
                .max((x, y) -> x.getYearOfPublish() - y.getYearOfPublish());
    }


    public int getTotalValue() {
        return books.stream()
                .reduce(0, (x, y) -> x + y.getPieces() * y.getPrice(), Integer::sum);
    }


    public List<Book> getByYearOfPublish(int year) {
        List<Book> result = books.stream()
                .filter(x -> x.getYearOfPublish() == year)
                .collect(Collectors.toList());
        if (result.isEmpty()) {
            return null;
        }
        return result;
    }
}
