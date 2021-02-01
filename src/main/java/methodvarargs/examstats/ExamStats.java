package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        isEmptyOrNull(results);
        int counter = 0;
        for (int result: results) {
            if (result > maxPoints * limitInPercent / 100) {
                counter++;
            }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        isEmptyOrNull(results);
        for (int result: results) {
            if (maxPoints * limitInPercent / 100 > result) {
                return true;
            }
        }
        return false;
    }

    private void isEmptyOrNull(int... param) {
        if (param == null || param.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }
}
