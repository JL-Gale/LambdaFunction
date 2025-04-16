package lambdas.bipredicate;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        /*
        * Recive dos valores y devuelve un voleano
        * */

        BiPredicate<Integer, Integer> test = (a, b) -> a > b;

        System.out.println(test.test(10, 20));
    }
}
