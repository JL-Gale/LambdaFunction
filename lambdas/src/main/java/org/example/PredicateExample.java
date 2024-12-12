package org.example;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
        * Precicate
        * Resive un valor y devulve un booleano (true o false)
        * */

        Predicate<String> predicate = (param) -> param.equalsIgnoreCase("Hola");
        System.out.println((predicate.test("HOLo")) ? "Son iguales" : "No son Iguales");

        Predicate<String> predicate2 = (param) -> {
            System.out.println(param.length());
            return param.length() < 10;
        };
        System.out.println((predicate2.test("0123456789")) ? "Tiene menos de 10 caracteres" : "Tiene mas de 10 caracteres");

    }
}
