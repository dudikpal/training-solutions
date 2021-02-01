package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {

    private static final long TRX_MIN = 1;
    private static final long TRX_MAX = 10_000_000;
    private static int trxCounter = 0;
    private long trxValue;
    private static long currentMinValue;
    private static long currentMaxValue;
    private static BigDecimal sumOfTrxs = new BigDecimal("0");

    /*public static void main(String[] args) {
        BankTransaction bt = new BankTransaction(20000);
        //BankTransaction bt1 = new BankTransaction(50000);
        System.out.println(bt.trxValue);
        System.out.println(bt.getTrxValue());
        System.out.println(BankTransaction.getCurrentMinValue());
        System.out.println(BankTransaction.getCurrentMaxValue());
        System.out.println(BankTransaction.getSumOfTrxs());
    }*/


    public BankTransaction(long trxValue) {
        if (TRX_MIN > trxValue || trxValue > TRX_MAX) {
            throw new IllegalArgumentException("Transaction value is out of range!");
        }
        this.trxValue = trxValue;

        if (trxCounter == 0) {
            currentMinValue = TRX_MAX;
            currentMaxValue = TRX_MIN;
        }

        trxCounter++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(trxValue));

        if (currentMinValue > trxValue) {
            currentMinValue = trxValue;
        }
        if (currentMaxValue < trxValue) {
            currentMaxValue = trxValue;
        }
    }

    public static void initTheDay() {
        trxCounter = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
        sumOfTrxs = new BigDecimal("0");
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static BigDecimal averageOfTransaction() {
        if (trxCounter == 0) {
            return BigDecimal.valueOf(0);
        }
        return sumOfTrxs.divide(BigDecimal.valueOf(trxCounter));
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }
}
