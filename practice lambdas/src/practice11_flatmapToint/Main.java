package practice11_flatmapToint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // flatmapToint

        String[] frutas = {"Manzana", "ciruela", "Pera"};
        String[] variedades = {"Verde", "Amarrilla", "Premium"};

        String[] nombres1 = {"Pedro", "Carlos", "Juan"};
        String[] nombres2 = {"Pedro2", "Carlos2", "Juan2"};

        List<List<Integer>> listaAnidada = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6)
        );


        int[][] numerosMatris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] numerosArray = Arrays.stream(numerosMatris)
//                .flatMapToInt(ints -> Arrays.stream(ints))
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(Arrays.stream(numerosArray).sum());

        System.out.println("*********************");
        Stream.of(nombres1, nombres2)
                .flatMap(n -> Arrays.stream(n))
                .forEach(s -> System.out.print(s + " "));

        System.out.println(" ");
        Arrays.stream(frutas)
                .flatMap(fruta -> Arrays.stream(variedades).map(variedad -> fruta + " " + variedad + " "))
                .forEach(System.out::println);
        System.out.println("*********************");

        listaAnidada.stream()
                .flatMap(ints -> ints.stream())
                .forEach(System.out::print);

        System.out.println("\n*********************");

        int size = calcularsize(numerosMatris);
        int[] nuevoArray2 = new int[size];
        int aux = 0;
        for (int[] row : numerosMatris) {
            for (int i : row) {
                nuevoArray2[aux] = i;
                aux++;
            }
        }

        for (int i : nuevoArray2) {
            System.out.print(i+" ");
        }
        aux = 0;
        for (int i : nuevoArray2) {
            aux += i;
        }

        System.out.println(aux);
    }

    private static int calcularsize(int[][] matris) {
        int size = 0;
        for(int[] row : matris) {
            size += row.length;
        }
        return size;
    }
}
