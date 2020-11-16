package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public List<BankAccount> executeTransactions(List<Transaction> transactions, List<BankAccount> bankAccounts) {

        for (BankAccount account: bankAccounts) {
            for (Transaction transaction: transactions) {
                if (account.getAccountNumber() == transaction.getAccountNumber()) {
                    if (transaction.isDebit()) {
                        account.withdraw(transaction.getAmount());

                    } else {
                        account.deposit(transaction.getAmount());
                    }
                }
            }
        }
        return bankAccounts;
    }
}
