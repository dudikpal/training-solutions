package algorithmscount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int greaterThan) {
        int counter = 0;
        for (BankAccount item: bankAccounts) {
            if (item.getBalance() > greaterThan) {
                counter++;
            }
        }
        return counter;
    }
    
}
