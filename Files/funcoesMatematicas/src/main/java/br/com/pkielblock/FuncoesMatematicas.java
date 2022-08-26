package br.com.pkielblock;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        //Raiz quadrada
        double x = Math.sqrt(100);
        System.out.println(x);

        //Elevado
        double y = Math.pow(10, 2);
        System.out.println(y);

        //Valor Absoluto (sem o negativo)
        double z = Math.abs(-10);
        System.out.println(z);

        //bhaskara
        double a = 5;
        double b = -3;
        double c = -4;
        double delta, x1, x2;

        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("x1 = %.2f\n", x1);
        System.out.printf("x2 = %.2f\n", x2);
    }
}
