package application;

import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        BusinessAccount bacc = new BusinessAccount(1, "Test", 5000.00, 5000.00);

        System.out.println(bacc.getLoanLimit());
    }
}