package week13d01;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NameComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        return collator.compare(o1.getName(), o2.getName());
    }
}
