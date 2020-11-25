package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    private int cursor;

    public SimpleBag() {
        beforeFirst();
    }

    public boolean contains(Object item) {
        for (Object object: items) {
            if (object.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public Object next() {
        return items.get(++cursor);
    }

    public boolean hasNext() {
        if (cursor < items.size() - 1) {
            return true;
        }
        return false;
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        if (items.size() == 0) {
            return true;
        }
        return false;
    }

    public int getCursor() {
        return cursor;
    }
}
