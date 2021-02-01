package week12.d03;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            int min = ages[i];
            int indexOfMin = i;
            for (int j = i + 1; j < ages.length; j++) {
                if (min > ages[j]) {
                    min = ages[j];
                    indexOfMin = j;
                }
            }
            ages[indexOfMin] = ages[i];
            ages[i] = min;
        }
        return ages;
    }
}
