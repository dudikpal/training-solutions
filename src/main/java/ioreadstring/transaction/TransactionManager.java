package ioreadstring.transaction;

import library.NullOrEmpty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public void makeTransactions(String transactionsPath) {
        NullOrEmpty.objectIsNull(getAccountList(), "The List<BankAccount> object is null!");
        NullOrEmpty.listIsEmpty(accountList, "The list is empty!");
        try {
            List<String> transactions = Files.readAllLines(Path.of(transactionsPath));
            for (String line: transactions) {
                String[]words = line.split(";");
                for (BankAccount account: accountList) {
                    if (words[0].equals(account.getAccountNumber())) {
                        account.setBalance(Double.parseDouble(words[1]));
                    }
                }
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("Transactions format is not valid!");
        }
    }

    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();

        tm.makeTransactions("src/test/java/ioreadstring/resources/transactions.txt");
    }

    public void uploadListFromFile(String accountsPath) {
        try {
            List<String> accounts = Files.readAllLines(Path.of(accountsPath));
            for (String line: accounts) {
                String[] words = line.split(";");
                accountList.add(new BankAccount(words[0], words[1], Double.parseDouble(words[2])));
            }
        } catch (IOException | NumberFormatException ex) {
            throw new IllegalStateException("File not exist, or Accounts format is wrong!");
        }
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }
}
