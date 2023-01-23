package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i;
            System.out.println(n + " x " + i);
        }

        System.out.println(n + "! = " + result);

        sc.close();
    }
}