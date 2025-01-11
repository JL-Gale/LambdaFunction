package org.example.clase14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        // sum int[]
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] array2 = Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(array2));

//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                System.out.print(anInt);
//            }
//            System.out.println("");
//        }
//
//        int[] array2 = new int[caculateSize(array)];
//        var aux = 0;
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//               array2[aux] = anInt;
//               aux++;
//            }
//        }
//
//        for (int i : array2) {
//            System.out.print(i+" ");
//        }
    }

//    private static int caculateSize(int[][] array) {
//        var size = 0;
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                size++;
//            }
//        }
//        return size;
//    }
}
