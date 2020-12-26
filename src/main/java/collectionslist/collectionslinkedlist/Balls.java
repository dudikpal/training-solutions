package collectionslist.collectionslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Balls {

    public static LinkedList<Integer> createBalls(int ballsCount) {
        Random rnd = new Random();
        LinkedList<Integer> balls = new LinkedList<>();
        List<Integer> rawBalls = new ArrayList<>();
        for (int i = 1; i < ballsCount + 1; i++) {
            int number = rnd.nextInt(ballsCount) + 1;
            if (!rawBalls.contains(number)) {
                rawBalls.add(number);
            }
        }
        balls.addAll(rawBalls);
        return balls;
    }
}
