package practice;/*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
 */

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(arreglo).filter(i -> i%2 == 0).forEach(System.out::println);
    }
}