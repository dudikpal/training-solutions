package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount{

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        if (getBalance() > amount + costOfTransaction(amount)) {
            super.transaction(amount);
            return true;
        }
        if (getBalance() + overdraftLimit >= amount) {
            overdraftLimit = getBalance() + overdraftLimit - amount - costOfTransaction(amount);
            balanceToZero();
            return true;
        }
        return false;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
