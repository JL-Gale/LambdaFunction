package practice;/*
    Problema:
    Dada el arreglo de números, calcular la suma de todos los elementos.
    Posteriormente, también buscar la suma de solo los elementos pares.
 */

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.stream(arreglo).sum());
        System.out.println(Arrays.stream(arreglo).filter(i -> i % 2 == 0).sum());
    }
}