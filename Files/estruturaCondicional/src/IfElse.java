import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora > 0 && hora < 12) {
            System.out.println("Bom Dia");
        } 
        else if (hora >= 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } 
        else if (hora >= 18 && hora <= 24) {
            System.out.println("Boa Noite");
        } 
        else {
            System.out.println("O dia só tem 24 horas.");
        }

        sc.close();
    }
}
