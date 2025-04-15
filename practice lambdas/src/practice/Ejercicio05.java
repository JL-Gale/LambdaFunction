package practice;/*
    Problema:
    Dada el arreglo de cadenas, imprimir cada nombre de tal forma que estén en mayúsculas,
    y que cada vocal sea reemplazada por una "X", ejemplo:
    "XNX", "FXRNXNDX" ... etc.
 */

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "fernando", "jorge", "diana", "raul"};

//        Arrays.stream(nombres).map(Ejercicio05::esVocal)
//                .forEach(System.out::println);

        Arrays.stream(nombres).map(i-> i.replaceAll("(?i)[aeiou]","x").toUpperCase())
                .forEach(System.out::println);


    }
    static String esVocal(String i) {
        String aux = i.replaceAll("(?i)[aeiou]","x");
        return aux.toUpperCase();
    }
}