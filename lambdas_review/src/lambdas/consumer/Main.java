package lambdas.consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        /*
        *  Consumer -> resive un valor y no retorna nada
        * */

        Consumer<String> test1 = System.out::println;
        Consumer<String> test2 = Main::hacerAlgo;
        Consumer<String> test3 = value -> System.out.println(value.toUpperCase());

        test1.accept("Hola que tal");
        test2.accept("Hola que tal");
        test3.accept("Hola que tal");


    }

    static void hacerAlgo(String i) {
        System.out.println(i.toUpperCase());
    }
}