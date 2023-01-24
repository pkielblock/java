package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Comparator<String> stringComparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        System.out.print("File Path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");

                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

            double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));

            List<String> names = list.stream().filter(x -> x.getPrice() < avg).map(Product::getName).sorted(stringComparator.reversed()).toList();

            names.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}