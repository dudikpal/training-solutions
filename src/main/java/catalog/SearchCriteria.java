package catalog;

public final class SearchCriteria {

    public String contributor;
    public String title;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByTitle(String title) {
        SearchCriteria sc = new SearchCriteria(title, null);
        if (sc.hasTitle()) {
            return sc;
        }
        throw new IllegalArgumentException("Title must not be null or empty");
    }

    public static SearchCriteria createByContributor(String contributor) {
        SearchCriteria sc = new SearchCriteria(null, contributor);
        if (sc.hasContributor()) {
            return sc;
        }
        throw new IllegalArgumentException("Contributor must not be null or empty");
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        SearchCriteria sc = new SearchCriteria(title, contributor);
        if (sc.hasContributor() && sc.hasTitle()) {
            return sc;
        }
        throw new IllegalArgumentException("Contributor and title must not be null or empty");
    }

    public boolean hasContributor() {
        return contributor == null || contributor.equals("") ? false : true;
    }

    public boolean hasTitle() {
        return title == null || title.equals("") ? false : true;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
