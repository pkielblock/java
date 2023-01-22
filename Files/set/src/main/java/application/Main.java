package application;

import entities.Product;
import entities.Product2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println();
        for (String p : set) {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection - elements in common
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


        //Comparing Set
        Set<Product> setProduct = new HashSet<>();

        setProduct.add(new Product("TV", 900.0));
        setProduct.add(new Product("Notebook", 1200.0));
        setProduct.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(setProduct.contains(prod));

        //TreeSet - it uses comparable interface and compareTo method.
        Set<Product2> setTreeSet = new TreeSet<>();
        setTreeSet.add(new Product2("TV", 900.0));
        setTreeSet.add(new Product2("Notebook", 1200.0));
        setTreeSet.add(new Product2("Tablet", 400.0));
        for (Product2 p : setTreeSet) {
            System.out.println(p);
        }
    }
}