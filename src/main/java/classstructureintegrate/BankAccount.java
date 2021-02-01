package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(int amount) {
        setBalance(getBalance() - amount);
    }

    public void transfer(BankAccount to, int amount) {
        to.setBalance(to.getBalance() + amount);
        withdraw(amount);
    }

    public String getInfo() {
        return getOwner() + " (" + getAccountNumber() + ") : " + getBalance() + " Ft";
    }
}
