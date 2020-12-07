package exceptionclass.bank2;

import exceptionclass.bank.ErrorCode;
import exceptionclass.bank.InvalidBankOperationException;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        isNull(accounts);
        this.accounts = accounts;
    }

    public void deposit(String accountNumber, double amount) {
        for (Account account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        throw new InvalidAccountNumberBankOperationException();
    }

    public void payment(String accountNumber, double amount) {
        for (Account account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.subtract(amount);
                return;
            }
        }
        throw new InvalidAccountNumberBankOperationException();
    }

    private void isNull(Object accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException();
        }
    }
}
