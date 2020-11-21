package methoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> goodPubs) {
        isNullOrEmpty(goodPubs);
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        Pub bestPub = goodPubs.get(0);
        for (Pub pub: goodPubs) {
            if (pub.getOpenFrom().isEarlier(bestPub.getOpenFrom())) {
                bestPub = pub;
            }
        }
        return bestPub;
    }

    private boolean isNullOrEmpty(List<Pub> param) {
        if (param == null || param.size() == 0) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        return false;
    }
}
