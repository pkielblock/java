package application;

import entities.Client;

public class Main {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "test";
        String s2 = "test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //different memory positions, so its false
        System.out.println(s1 == s2); //literal values have special treatment by compiler so its true
    }
}