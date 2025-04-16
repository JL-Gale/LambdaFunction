package lambdas.bifunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        /*
        * Recibe dos valores y devuelve uno
        * */

        BiFunction<Integer, Integer, String> test1 = (a, b) -> "La multiplicacion de "+a+" por "+b+" es "+ (a*b);
        String resultado = test1.apply(10, 10);
        System.out.println(resultado);
    }
}
