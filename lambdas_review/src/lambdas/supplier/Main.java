package lambdas.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /*
        * No recibe ningun valor y retorna algo
        * */

        Supplier<Integer> test = () -> 10 * 10;
        Supplier<String> test2 = () -> "Hola como estas\nHello world";

        System.out.println(test.get());
        System.out.println(test2.get());

    }
}
