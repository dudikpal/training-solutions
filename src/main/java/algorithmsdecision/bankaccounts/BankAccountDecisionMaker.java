package algorithmsdecision.bankaccounts;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> bankAccounts, int greaterThan) {
        for (BankAccount item: bankAccounts) {
            if (item.getBalance() > greaterThan) {
                return true;
            }
        }
        return false;
    }
}
