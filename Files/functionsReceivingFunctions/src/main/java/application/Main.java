package application;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();

        double sum = productService.filteredSum(list, x -> x.getPrice() < 100);

        System.out.println("Sum: " + String.format("%.2f", sum));
    }
}