package week12d01;

public class GoodsPacker {

    public int packGoods(int[][] types, int capacity) {
        double maxValueRate = 0;
        int sumValue = 0;
        int minWeight = getMinWeight(types, Integer.MAX_VALUE);
        int actualWeight = 0, actualValue = 0;
        while (capacity >= minWeight) {
            for (int[] item: types) {
                int weight = item[0];
                int value = item[1];
                if (maxValueRate <= value / weight && weight <= capacity) {
                    maxValueRate = value / weight;
                    actualWeight = weight;
                    actualValue = value;
                }
            }
            sumValue += (capacity / actualWeight) * actualValue;
            capacity -= (capacity / actualWeight) * actualWeight;
        }
        return sumValue;
    }

    private int getMinWeight(int[][] types, int minWeight) {
        for (int[] item: types) {
            if (minWeight > item[0]) {
                minWeight = item[0];
            }
        }
        return minWeight;
    }
}
