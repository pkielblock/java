public class Main {
    public static void main(String[] args) {
        //Casting in Java
        int a, b;
        double result, resultWithCasting;

        a = 5;
        b = 2;

        result = a / b;
        resultWithCasting = (double) a / b;

        System.out.println("Result: " + result);
        System.out.println("Result with casting: " + resultWithCasting);
    }
}
