package practice;/*
    Problema:
    Dada el arreglo de números, encontrar el número más grande y el más pequeño.
 */

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.stream(arreglo).max().orElseThrow());
        System.out.println(Arrays.stream(arreglo).min().orElseThrow());
    }
}