package week13d03;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
  
  private String message = "Hello";
  
  public Optional<String> findAuthorWithMaxPageWithStream(List<Book> books) {
    /*Map m = books.stream()
        .collect(Collectors.groupingBy(b -> b.getAuthor()));*/
    Map<String, Integer> m = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                    Collectors.summingInt(Book::getNumberOfPages)));
    System.out.println(m);
    return m.entrySet().stream()
        .max(Comparator.comparing(Map.Entry::getValue))
        .map(Map.Entry::getKey);
  }
  
  public Optional<String> findAuthorWithMaxPage(List<Book> books) {
    
    
    if (books.isEmpty()) {
      return Optional.empty();
    }
    Map<String, Integer> authorWithPageNumbers = new HashMap<>();
    for (Book book : books) {
      String author = book.getAuthor();
      /*if (!authorWithPageNumbers.containsKey(author)) {
        authorWithPageNumbers.put(author, book.getNumberOfPages());
      } else {
        int sum = authorWithPageNumbers.get(author);
        sum = sum + book.getNumberOfPages();
        authorWithPageNumbers.put(author, sum);
      }*/
      
      /*int value = authorWithPageNumbers.getOrDefault(author, 0);
      value += book.getNumberOfPages();
      authorWithPageNumbers.put(author, value);*/
    
      authorWithPageNumbers.merge(author,
          book.getNumberOfPages(),
        
          // legnagyobb oldalszámú könyv
          //(x, y) -> x > y ? x : y
          //(x, y) -> Math.max(x, y)
          //Math::max
        
          // összoldalszám
          //(x, y) -> x + y
          // metódus referencia
          //Integer::sum
          //BookStore::add
          this::add2
      );
      System.out.println(message);
    }
    int maxNumberOfPages = 0;
    String author = null;
    for (Map.Entry<String, Integer> entry : authorWithPageNumbers.entrySet()) {
      if (entry.getValue() > maxNumberOfPages) {
        maxNumberOfPages = entry.getValue();
        author = entry.getKey();
      }
    }
    return Optional.of(author);
  }
  
  public static int add(int x, int y) {
    return x + y;
  }
  
  public int add2(int x, int y) {
    return x + y;
  }
  
  
  public static void main(String[] args) {
    Optional<String> result = new BookStore().findAuthorWithMaxPageWithStream(
        List.of(
            new Book("xx", "t1", 30),
            new Book("xx", "t2", 20),
            new Book("yy", "t2", 20),
            new Book("yy", "t2", 20),
            new Book("zz", "t2", 10),
            new Book("zz", "t2", 10)
        )
    );
    /*System.out.println(result.isPresent());
    if (result.isPresent()) {
      System.out.println(result.get());
    }*/
  }
}
