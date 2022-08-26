package br.com.pkielblock;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana (1-7): ");
        int x = sc.nextInt();

        String dia = switch(x) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido";
        };
        System.out.println(dia);
        sc.close();
    }
}
