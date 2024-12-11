package org.example;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
        * Biconsumer
        * Recibe dos valores y no retorna nada
        * */

        BiConsumer<String, Integer> biConsumer = (param1, param2) -> {
            System.out.println(param1.concat(" ").concat(String.valueOf(param2)));
        };
        biConsumer.accept("Hola", 15);

        BiConsumer<String, Byte> biConsumer2 = (param1, param2) -> System.out.println(param1.concat(" ").concat(String.valueOf(param2)));
        biConsumer2.accept("Biconsumer 2", (byte)10);


        BiConsumer<String,String> biConsumer3 = (param1, param2) -> {
            System.out.println("-----------------");
            System.out.println(param1+"\n"+param2);
        };

        biConsumer3.accept("Biconsumer 3", "BICONSUMER LAMBDAS");
    }
}
