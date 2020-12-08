package exceptionmulticatch;


public class AnswerStat {


    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public boolean[] convert(String str) {
        try {
            return bsc.binaryStringToBooleanArray(str);
        } catch (NullPointerException | IllegalArgumentException ex) {
            ex.printStackTrace();
            throw new InvalidBinaryStringException(ex);
        }
    }

    public int answerTruePercent(String answers) {
        double trues = 0;
        double falses = 0;
        for (boolean item: convert(answers)) {
            //item == true ? trues++ : falses++;
            if (item == true) {
                trues++;
            } else {
                falses++;
            }
        }
        return  (int)(trues / (trues + falses) * 100);
    }
}
