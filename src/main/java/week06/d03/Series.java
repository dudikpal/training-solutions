package week06.d03;

public class Series {

    public SeriesType calculateSeriesType(int[] numbers) {
        isSeries(numbers);
        boolean isAscending = false;
        boolean isDescending = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] - numbers[i + 1] < 0) {
                isAscending = true;
            } else {
                isDescending = true;
            }
            if (isAscending && isDescending) {
                return SeriesType.UNORDERED;
            }
        }
        return isAscending ? SeriesType.ASCENDING : SeriesType.DESCENDING;
    }

    private void isSeries(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("The series must be two element at least!");
        }
    }
}
