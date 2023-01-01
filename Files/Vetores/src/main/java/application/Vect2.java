package application;

import entities.Product;

import java.util.Scanner;

public class Vect2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        double sum = 0;
        double average = 0;

        Product[] vect = new Product[n];

        for (i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        for (i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
            average = sum / n;
        }

        System.out.printf("Average Price: %.2f%n", average);

        sc.close();
    }
}
