package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = util.CurrencyConverter.dollarToReal(amount, dollarPrice);

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", result));
    }
}