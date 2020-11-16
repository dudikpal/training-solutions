package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int amount) {
        for (Transaction item: transactions) {
            if (item.getDateOfTransaction().isBefore(endTime) && item.getDateOfTransaction().isAfter(startTime) && item.isDebit() && (item.getAmount() > amount)) {
                return true;
            }
        }
        return false;
    }
}
