package practice;/*
    Problema:
    Dado el arreglo de números, devuelve otro arreglo con cada una de las raíces cuadradas
    del arreglo original.
 */

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double[] arregloRaizes = Arrays.stream(arreglo).mapToDouble(Math::sqrt).toArray();
        Arrays.stream(arregloRaizes).forEach(System.out::println);

    }
}