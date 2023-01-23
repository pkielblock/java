package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        Consumer<Product> consumer = x -> x.setPrice(x.getPrice() * factor);

        list.forEach(x -> x.setPrice(x.getPrice() * factor));
//        list.forEach(consumer);
//        list.forEach(Product::nonStaticPriceUpdate);
//        list.forEach(Product::staticPriceUpdate);
//        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}