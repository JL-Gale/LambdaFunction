package practice;/*
    Problema:
    Dado la matriz de números, aplana la misma, posteriormente deberás obtener:
    1. El menor
    2. El mayor
    3. La suma de todos sus elementos
    4. El promedio
    5. El producto.
 */

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("El menor: "+Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .min().orElseThrow());

        System.out.println("El mayor: "+Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .max().orElseThrow());

        System.out.println("La suma de tos los elementos: "+Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum());

        System.out.println("EL promedio :"+Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .average().orElseThrow());

        System.out.println("El producto: "+Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .reduce((i1, i2)-> i1 * i2).orElseThrow());

    }
}