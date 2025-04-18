package practice;/*
    Problema:
    Dada el arreglo de cadenas, devolver el primer elemento que inicia con j.
 */

import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "joaquin", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};
        System.out.println(Arrays.stream(nombres)
                .filter(str -> str.startsWith("j"))
                .findFirst().orElseThrow());
    }
}