package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.hasPrintedFeature()) {
                printedItems.add(item);
            }
        }
        return printedItems;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                audioItems.add(item);
            }
        }
        return audioItems;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem item: catalogItems) {
            fullLength += item.fullLengthAtOneItem();
        }
        return fullLength;
    }

    public int getAllPageNumber() {
        int sumOfAllPages = 0;
        for (CatalogItem item: catalogItems) {
            sumOfAllPages += item.numberOfPagesAtOneItem();
        }
        return sumOfAllPages;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> findResults = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            for (Feature feature: item.getFeatures()) {
                if (!searchCriteria.hasContributor()) {
                    if (searchCriteria.getTitle().equals(feature.getTitle())) {
                        findResults.add(item);
                    }
                } else
                if (!searchCriteria.hasTitle()) {
                    if (feature.getContributors().contains(searchCriteria.getContributor())) {
                        findResults.add(item);
                    }
                } else {
                    if (feature.getContributors().contains(searchCriteria.getContributor()) && searchCriteria.getTitle().equals(feature.getTitle())) {
                        findResults.add(item);
                    }
                }
            }
        }
        return findResults;
    }

    public void deleteItemByRegistrationNumber(String id) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(id)) {
                catalogItems.remove(i);
                return;
            }
        }
    }

    public double averagePageNumberOver(int pageNumber) {
        if (pageNumber < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int countValidItems = 0;
        int sumPages = 0;
        int countAllPrintedfeaturesItem = 0;
        for (CatalogItem item: catalogItems) {
            for (Feature feature: item.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    countAllPrintedfeaturesItem++;
                    if (((PrintedFeatures) feature).getNumberOfPages() > pageNumber) {
                        countValidItems++;
                        sumPages += ((PrintedFeatures) feature).getNumberOfPages();
                    }
                }
            }
        }
        if (countAllPrintedfeaturesItem != 0 && countValidItems == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sumPages / countValidItems;
    }

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }
}
