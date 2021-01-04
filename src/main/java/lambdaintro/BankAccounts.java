package lambdaintro;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        List<BankAccount> returnNewList = new ArrayList<>();
        for (BankAccount bankAccount: bankAccounts) {
            returnNewList.add(new BankAccount(bankAccount));
        }
        return returnNewList;
    }

    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> resultList = getBankAccounts();
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        resultList.sort(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(collator)).thenComparing(BankAccount::getAccountNumber));
        return resultList;
    }

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> resultList = getBankAccounts();
        resultList.sort(Comparator.comparing(a -> Math.abs(a.getBalance())));
        return resultList;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> resultList = getBankAccounts();
        resultList.sort(Comparator.comparing(BankAccount::getBalance).reversed());
        return resultList;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> resultList = getBankAccounts();
        resultList.sort(Comparator.naturalOrder());
        return resultList;
    }
}
