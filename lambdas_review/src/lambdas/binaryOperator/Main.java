package lambdas.binaryOperator;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        /*
        *  recibe dos valores del mismo tipo y retorna un valor del mismo tipo
        * */

        BinaryOperator<Integer> test = (a, b) -> Integer.max(a, b);
        BinaryOperator<Integer> test2 = Integer::max;

        System.out.println(test.apply(10, 20));
        System.out.println(test2.apply(20, 10));
    }
}
