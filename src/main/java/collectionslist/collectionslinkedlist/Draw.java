package collectionslist.collectionslinkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Draw {

    public static Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException("drawCount must be less then 8!");
        }
        LinkedList<Integer> numbers = Balls.createBalls(maxNumber);
        TreeSet<Integer> winningNumbers = new TreeSet<>();
        while (winningNumbers.size() < drawCount) {
            winningNumbers.add(numbers.poll());
        }
        return winningNumbers;
    }
}
