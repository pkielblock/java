import java.util.Locale; //import to use locale

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // set locale to US

        System.out.print("Sem Quebra");
        System.out.print(" de Linha");
        System.out.println("Com Quebra");
        System.out.println("de Linha");

        int y = 32;
        System.out.println(y);

        double x = 32.5371;
        System.out.println(x);
        System.out.printf("%.2f\n", x);

        System.out.println("Resultado: " + x + " metros");
        System.out.printf("Resultado: %.2f metros\n", x);
    }
}