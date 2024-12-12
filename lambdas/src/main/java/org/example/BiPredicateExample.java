package org.example;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /*
        * BiPredicate
        * Recibe dos valores y retorna un booleano
        * */

        BiPredicate<String, Integer> biPredicate = (param1, param2) -> {
            return (param1.equalsIgnoreCase("jorge") && param2 == 20);
        };
        System.out.println((biPredicate.test("Luis", 20) ? "Eres Jorge" : "No se quien eres"));

    }
}
