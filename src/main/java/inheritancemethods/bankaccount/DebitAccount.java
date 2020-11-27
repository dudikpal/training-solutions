package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private final double COST = 3.0;
    private final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void balanceToZero() {
        balance = 0;
    }

    public boolean transaction(long amount) {
        if (amount + costOfTransaction(amount) <= balance) {
            balance -= amount + costOfTransaction(amount);
            return true;
        }
        return false;
    }


    public final long costOfTransaction(long amount) {
        if (amount * COST / 100 < 200) {
            return 200;
        } else {
            return (long)(amount * COST) / 100;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
}
