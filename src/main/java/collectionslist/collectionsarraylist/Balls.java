package collectionslist.collectionsarraylist;

import java.util.HashSet;
import java.util.Set;

public class Balls {

    public static Set<Integer> createBalls(int ballsBound) {
        Set<Integer> balls = new HashSet<>();
        for (int i = 1; i < ballsBound + 1; i++) {
            balls.add(i);
        }
        return balls;
    }


}
