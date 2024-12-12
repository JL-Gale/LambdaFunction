package org.example;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*
        * UnaryOperator
        * Recibe un valor, lo proceso y devuelve un resultado del mismo tipo
        * */

        UnaryOperator<Integer> unaryOperator = (param) -> param * param;
        System.out.println(unaryOperator.apply(10));

    }
}
