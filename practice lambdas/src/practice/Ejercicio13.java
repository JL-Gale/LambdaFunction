package practice;/*
    Problema:
    Dado el arreglo de números, obtener el promedio de todos los elementos.
 */

import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.stream(arreglo)
                .average().orElseThrow());
    }
}