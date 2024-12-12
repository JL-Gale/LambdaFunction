package org.example;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*
         *BinaryOperator
         *Recibe dos valores del mismo tipo y retorna un valor del mismo tipo
         **/
        BinaryOperator<String> binaryOperator = (param1, param2) -> {
            return param1.concat(" "+param2);
        };
        System.out.println(binaryOperator.apply("Hola", "Como estas"));

        BinaryOperator<Integer> binaryOperator2 = (a, b) -> {
            return a * b;
        };
        System.out.println(binaryOperator2.apply(5, 5));
    }
}
