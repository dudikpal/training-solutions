package sorting;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = new TreeSet<>(library);
    }

    public Set<Book> getLibrary() {
        return new TreeSet<>(library);
    }

    public Book lendFirstBook() {
        if (getLibrary().size() == 0) {
            throw new NullPointerException("Libray is empty!");
        }
        return new ArrayList<Book>(getLibrary()).get(0);
    }
}
