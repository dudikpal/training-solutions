package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable{

    private List<String> pages = new ArrayList<>();

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int page) {
        return pages.get(page);
    }

    public void addPage(String str) {
        pages.add(str);
    }
}
