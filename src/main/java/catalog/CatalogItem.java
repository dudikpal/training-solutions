package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private List<Feature> features = new ArrayList<>();



    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        if (Validators.isBlank(registrationNumber) || Validators.isZeroOrNegative(price) || feature.length == 0) {
            throw new IllegalArgumentException();
        }
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = List.of(feature);
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature: features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public int numberOfPagesAtOneItem() {
        int sumPages = 0;
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                sumPages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return sumPages;
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) feature).getLength();
            }
        }
        return fullLength;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAudioFeature() {
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature: features) {
            for (String contributor: feature.getContributors()) {
                contributors.add(contributor);
            }
        }
        return contributors;
    }



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }


}
