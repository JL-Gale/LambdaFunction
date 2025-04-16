package lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        /*
        *  Recibe un valor y retorna el mispo de dato que recive
        * */

        UnaryOperator<Integer> test = i -> i*i;

        System.out.println(test.apply(10));


    }
}
