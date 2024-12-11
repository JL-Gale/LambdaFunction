package org.example;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
        * Bifunction
        * Resive dos valores y retorna un resultado
        * */
        BiFunction<String, Byte, String> biFunction = (param1,  param2) -> "Hola ".concat(param1).concat(" "+param2);
        System.out.println(biFunction.apply("Jorge", (byte)20).toLowerCase());

        BiFunction<Integer, Integer, Integer> biFunction2 = (a,b) -> a*b;
        System.out.println("la Multiplicacion de 9 * 9 es: "+biFunction2.apply(9,9));
    }
}
