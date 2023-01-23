package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        Predicate<Product> predicate = x -> x.getPrice() >= min;

        list.removeIf(x -> x.getPrice() >= min);
        list.removeIf(predicate);
        list.removeIf(Product::nonStaticProductPredicate);
        list.removeIf(Product::staticProductPredicate);
        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}