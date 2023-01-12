package com.dzk.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                if (ints[j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative Numbers: " + count);

        sc.close();
    }
}