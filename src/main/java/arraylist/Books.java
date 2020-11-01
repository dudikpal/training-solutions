package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    void add(String title) {
        titles.add(title);
    }

    List<String> findAllByPrefix(String prefix) {
        List<String> resultList = new ArrayList<>();
        for (String item: titles) {

            if (item.substring(0, prefix.length()).equals(prefix)) {
                resultList.add(item);
            }
        }
        return resultList;
    }

    List<String> getTitles() {
        List<String> allTitles = new ArrayList<>();
        for (String item: titles) {
            allTitles.add(item);
        }
        return allTitles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Az indián");
        books.add("A cowboy");
        books.add("Az űrlény");
        books.add("Mindenki szakácskönyve");
        books.add("Ég és Föld");
        books.add("Ég és Föld között");
        books.add("Mindenkinek jár egy esély");

        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Az"));
        System.out.println(books.findAllByPrefix("Mindenk"));
        //System.out.println(books.getTitles().get(0).substring(0, 4));
    }
}
