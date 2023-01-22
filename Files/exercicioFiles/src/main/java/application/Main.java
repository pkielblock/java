package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print(".CSV Path: ");
        String path = sc.nextLine();

        File sourceFile = new File(path);
        String sourceFolder = sourceFile.getParent();

        boolean success = new File(sourceFolder + "/out").mkdir();

        String targetFile = sourceFolder + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String itemCsv = br.readLine();
            while  (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
            for(Product product : products) {
                bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                bw.newLine();
            }
            System.out.println(targetFile + " CREATED");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}