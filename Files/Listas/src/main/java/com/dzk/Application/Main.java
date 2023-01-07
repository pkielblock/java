package com.dzk.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Lists always have the same type
        //Elements are accessed by their positions
        //Starts empty and it's content is allocated as needed
        //Each element occupies only one node of the list
        //It's not possible to create List instances as it is an interface
        //Use wrapper class instead of primitive types
        //List x = new List(); -> not possible

        List<String> list = new ArrayList<>();

        list.add("Pedro");
        list.add("Marcus");
        list.add("Gias");
        list.add("Ana");
        list.add(2, "Giovani");

        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);

        String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name2);

        //Stream accepts lambda operations
        List<String> results = list.stream().filter(x -> x.charAt(0) == 'P').toList();

        for (String result : results) {
            System.out.println(result);
        }

        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'G'); //Lambda function

        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Index of Pedro: " + list.indexOf("Lucas")); // Return -1 if does not exist

        System.out.println("List Size: " + list.size());
        for (String nome : list) {
            System.out.println(nome);
        }
    }
}