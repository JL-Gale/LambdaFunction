package practice;/*
    Problema:
    Dada el arreglo de cadenas, separar a través de una serie de filtros (reutilizando lambdas),
    de tal forma que podamos separar todas las que empiezan con "a", "f", "j", "d", "r", "b".
    Recordar como generar una función que devuelve predicados.
 */

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        test(nombres, "a");
        test(nombres, "f");
        test(nombres, "j");
        test(nombres, "d");
        test(nombres, "r");
        test(nombres, "b");

    }

    static Predicate<String> filtrar(String letter) {
        return s -> s.startsWith(letter);
    }

    static void test(String[] array, String letter) {
        System.out.println("****************");
        Arrays.stream(array)
                .filter(filtrar(letter))
                .forEach(System.out::println);
    }

    static Function<String, Predicate<String>> function = letter -> {
        return s -> s.startsWith(letter);
    };

}