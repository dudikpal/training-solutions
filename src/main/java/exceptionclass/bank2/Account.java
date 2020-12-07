package exceptionclass.bank2;

import exceptionclass.bank.ErrorCode;
import exceptionclass.bank.InvalidBankOperationException;

public class Account {

    private String accountNumber;
    private double balance;
    private double  maxSubtract;

    public Account(String accountNumber, double balance) {
        isNull(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        setMaxSubtract(100000);
    }

    public double subtract(double amount) {
        isNegativeAmount(amount);
        isNegativeBalance(amount);
        return balance -= amount;
    }

    public double deposit(double amount) {
        isNegativeAmount(amount);
        return balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        isNegativeAmount(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    private void isNull(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private void isNegativeAmount(Double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException();
        }
    }

    private void isNegativeBalance(double amount) {
        if (balance - amount < 0) {
            throw new LowBalanceBankOperationException();
        }
    }

}
