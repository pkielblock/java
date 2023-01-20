package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500);

        //Upcasting - subclass to upperclass
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.1);

        //Downcasting - Upperclass to subclass
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof  SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account account = new Account(1010, "Alex", 1000.00);
        account.withdraw(200);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(1011, "Pete", 1000.00, 0.01);
        account2.withdraw(200);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1013, "Max", 1000.00, 500);
        account3.withdraw(200);
        System.out.println(account3.getBalance());
    }
}