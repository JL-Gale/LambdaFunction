package org.example;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        /*
         * Consumer
         * Recibe un volor y no retorna nada
         * */
        Consumer<String> consumerCorto = System.out::println;
        consumerCorto.accept("Hola Desde una lambda");

        Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };
        consumer.accept("Hola desde lambda 2");
    }
}
