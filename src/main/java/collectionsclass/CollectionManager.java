package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class
CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return new ArrayList<>(library);
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(getLibrary());
    }

    public List<Book> reverseLibrary() {
        List<Book> workingList = getLibrary();
        //workingList.sort(Book::compareTo);
        Collections.reverse(workingList);
        return workingList;
    }

    public Book getFirstBook() {
        return Collections.min(getLibrary());
    }

    public Book getLastBook() {
        return Collections.max(getLibrary());
    }
}
