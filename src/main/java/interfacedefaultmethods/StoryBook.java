package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{

    private List<ColoredPage> coloredPages = new ArrayList<>();

    public void addPage(String page, String color) {
        coloredPages.add(new ColoredPage(page, color));
    }

    @Override
    public int getLength() {
        return coloredPages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return coloredPages.get(pageNumber).getContent();
    }

    @Override
    public String getColor(int pageNumber) {
        return coloredPages.get(pageNumber).getColor();
    }
}
