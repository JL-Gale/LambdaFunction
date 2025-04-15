package practice13_matchers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Matchers

        IntPredicate predicate1 = n -> n % 2 == 0; // Funcioona para Primitivos
        Predicate<Integer> predicate2 = n -> n % 2 == 0;

        boolean test;
        int[] array1 = {2, 4, 6, 8, 12};
        List<Integer> listaNumero = List.of(2, 4, 6, 8, 11);

        /*
        allMatch regrase verdadero si todos los elemntos del conjunto
        satisfaces la condicion
        */

        // Forma en la que se realizaba antes
        int[] array2 = Arrays.stream(array1)
                .filter(predicate1)
                .toArray();
        System.out.println("El array2 tiene el mismo tamaño que es array1: " + (array1.length == array2.length));

        System.out.println("*****allMactch*****");
        // nueva forma
        test = Arrays.stream(array1)              // Usando metos de refencia que satisfasa
                .allMatch(Main::funcionBoolean); // un predicate que equivale n -> n % 2 == 0
        System.out.println("Todos los numeros del conjunto son multiplo del 2?: " + test);

        test = listaNumero.stream()    // Usando refactorisacion de codiga
                .allMatch(predicate2); // equivale n -> n % 2 == 0
        System.out.println("Todos los numeros del conjunto son multiplo del 2?: " + test);




        /*
        anyMatch Rregresa verdadero si almenos un elemento del conjunto
        satisface la condicion
        */

        System.out.println("*****anyMactch*****");
        System.out.println("Almenos un numero conjunto son multiplo del 2?: " + listaNumero.stream()
                .anyMatch(n -> n % 2 == 0));






        /*
        noneMatch refresa verdadero si la condicion es falsa para todos
        los elementos (ningun elemeto debe satisfacer la condicion)
        */
        System.out.println("*****noneMactch*****");
        System.out.println(Arrays.stream(array1).noneMatch(n -> n % 2 != 0));






        // Ordenamiento
        int[] arrayDesordenado = {23, 54, 21, 24, 56, 76, 87, 12, 34, 51, 67, 87, 54};
        int[] arrayDeMenorAMayor = Arrays.stream(arrayDesordenado)
                .sorted() // lo ordena de menor a mayor
                .toArray();
        System.out.println(Arrays.toString(arrayDeMenorAMayor));

        int[] arrayDeMayorAMenor = Arrays.stream(arrayDesordenado)
                .boxed()
                .sorted(Comparator.reverseOrder()) //Ordena de mayor a menor
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(arrayDeMayorAMenor));

    }

    static boolean funcionBoolean(int n) {
        return n % 2 == 0;
    }
}
