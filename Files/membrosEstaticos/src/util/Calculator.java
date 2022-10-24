package util;

public class Calculator {
        //Metodos e Atributos estáticos permitem realizar a chamada dos mesmos sem instanciar um objeto
        public static final double PI = 3.14159;

        public static double circumference(double radius) {
            return 2.0 * PI * radius;
        }

        public static double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
        }
}
