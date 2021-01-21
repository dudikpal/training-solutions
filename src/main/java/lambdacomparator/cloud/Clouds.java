package lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages) {
        return Collections.min(cloudStorages, Comparator.comparing(CloudStorage::getProvider, String::compareToIgnoreCase));
    }
}
