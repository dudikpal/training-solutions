package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String > menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4;
        createMenu();
    }

    public void createMenu() {
        menu = new ArrayList<>();
        menu.add("Medvetarkóleves betűtésztával");
        menu.add("Gnúpatapörkölt");
        menu.add("Sajtos-tejfölös hegyi vipera");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
