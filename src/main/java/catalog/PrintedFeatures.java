package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title) || Validators.isEmpty(authors) || Validators.isZeroOrNegative(numberOfPages)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


}
