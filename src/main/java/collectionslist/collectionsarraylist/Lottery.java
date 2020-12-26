package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    private int lotteryType;
    private int ballCount;

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        lotteryValidator(lotteryType, ballCount);
        Set<Integer> winningNumbers = new HashSet<>();
        Random rnd = new Random(25);
        List<Integer> numbers = new ArrayList<>(Balls.createBalls(ballCount));
        while (winningNumbers.size() < lotteryType) {
            winningNumbers.add(numbers.get(rnd.nextInt(ballCount)));
        }
        List<Integer> result = new ArrayList<>(winningNumbers);
        Collections.sort(result);
        return result;
    }

    public int getLotteryType() {
        return lotteryType;
    }

    public int getBallCount() {
        return ballCount;
    }

    private void lotteryValidator(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
    }


}
