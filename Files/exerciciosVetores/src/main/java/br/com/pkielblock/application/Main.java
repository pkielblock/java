package br.com.pkielblock.application;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Type a number (Max 10):");
            n = sc.nextInt();
        } while (n > 10 || n <= 0);

        int[] vect = new int[n];

        int i = 0;
        while (i < n) {
            System.out.println("Type a number:");
            int num = sc.nextInt();
            vect[i] = num;
            i++;
        }

        System.out.println("Negative Numbers");

        for (int nNum : vect) {
            if (nNum < 0) {
                System.out.println(nNum);
            }
        }

        sc.close();
    }
}