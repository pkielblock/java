package application;

import java.util.Scanner;

public class Vect1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        double sum = 0;
        double average = 0;

        double[] vect = new double[n];

        for (i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        for (i = 0; i < n; i++) {
            sum += vect[i];
            average = sum / n;
        }

        System.out.printf("Average Height: %.2f%n", average);

        sc.close();
    }
}
