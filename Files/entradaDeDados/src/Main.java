import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x, s;
        int y;
        double z;
        char w;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);

        sc.nextLine();
        s = sc.nextLine(); //read until break line

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(s);
        sc.close();
    }
}
