package br.com.pkielblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doWhile();
    }

    public static void While() {
        //While
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }

    public static void For() {
        //For
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
    }

    public static void doWhile() {
        int x = 1;
        do {
            System.out.println("Valor de i: " + x);
            x++;
        } while (x != 10);
    }
}