package algorithmscount;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int lessThan) {
        int counter = 0;
        for (Transaction item: transactions) {
            if (item.getAmount() < lessThan) {
                counter++;
            }
        }
        return counter;
    }
}
