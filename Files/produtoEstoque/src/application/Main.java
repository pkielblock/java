package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product Data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated Data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated Data: " + product.toString());

        sc.close();
    }
}