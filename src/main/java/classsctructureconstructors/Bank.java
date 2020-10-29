package classsctructureconstructors;

public class Bank {
    public static void main(String[] args) {
        BankAccount szamla1 = new BankAccount("5410-8546-7315-1574", "első ügyfél", 100000);
        BankAccount szamla2 = new BankAccount("6716-9723-6721-2123", "másik ügyfél", 200000);

        System.out.println(szamla1.getInfo());
        System.out.println(szamla2.getInfo());
        System.out.println("első betesz 100000 Ft-ot");
        szamla1.deposit(100000);
        System.out.println(szamla1.getInfo());
        System.out.println(szamla2.getInfo());
        System.out.println("másik kivesz 50000 Ft-ot");
        szamla2.withdraw(50000);
        System.out.println(szamla1.getInfo());
        System.out.println(szamla2.getInfo());
        System.out.println("első utal a másiknak 20000 Ft-ot");
        szamla1.transfer(szamla2, 20000);
        System.out.println(szamla1.getInfo());
        System.out.println(szamla2.getInfo());
    }
}
