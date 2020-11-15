package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumAmount = 0;
        for (Transaction item: transactions) {
            if (item.isCredit()) {
                sumAmount += item.getAmount();
            }
        }
        return sumAmount;
    }
}
