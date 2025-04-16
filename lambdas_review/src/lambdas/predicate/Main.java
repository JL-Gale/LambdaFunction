package lambdas.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /*
        * Recibe un valor y devuelve un boolean
        * */

        Predicate<Integer> test = (i) -> i >= 18;
        Predicate<String> test2 = str -> str.length() >= 6;

        System.out.println(test2.test("Hola que") ? "Tiene 6 o mas letras"  : "Tiene menos de 6 letras");
        System.out.println(test.test(18) ? "Es mayor de edad"  : "Es menor de edad");
    }
}
