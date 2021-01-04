package lambdaintro;

public class BankAccount implements Comparable<BankAccount>{

    private String accountNumber;
    private String nameOfOwner;
    private double balance;

    public BankAccount(String accountNumber, String nameOfOwner, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    public BankAccount(BankAccount bankAccount) {
        this.accountNumber = bankAccount.getAccountNumber();
        this.nameOfOwner = bankAccount.getNameOfOwner();
        this.balance = bankAccount.getBalance();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        return accountNumber.compareTo(o.getAccountNumber());
    }
}
