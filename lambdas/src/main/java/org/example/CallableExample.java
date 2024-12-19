package org.example;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
        * Callable
        * No recibe valores, pero retorna un resultado y  puede lanzar una excepcion.
        * */

        Callable<String> callable = () -> {
            return "Callable preba";
        };

        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
