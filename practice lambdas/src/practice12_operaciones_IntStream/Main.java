package practice12_operaciones_IntStream;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Operaciones con IntStream

        Predicate<Integer> funtion = i -> i % 2 == 0;

        int[] arrayNumber = {41, 43, 52, 53, 55, 42, 47, 49, 51, 42, 40, 53, 41, 50, 58, 43, 59, 42, 43, 43};

        int[] sinRepedidos = Arrays.stream(arrayNumber)
                .distinct() // -> Nos devuelve todos los diferentes
                .sorted() // -> Los ordena de mayor a menor
//                .filter(s -> s % 2 == 0)
//                .filter(Main::isEvent)
                .filter(s -> funtion.test(s))
                .toArray(); // -> lo concierte de a un array primitivo

        System.out.println(Arrays.toString(sinRepedidos));

        OptionalInt min = Arrays.stream(arrayNumber)
                .min(); // -> Devuelve el valor mas pequeño pero devuelve un optionalInt

        if(min.isPresent()) {
            System.out.println(min.getAsInt());
        } else {
            throw new NoSuchElementException();
        }

        OptionalInt max = Arrays.stream(arrayNumber)
                .max();

        System.out.println(max.orElseThrow());

        int sum = Arrays.stream(arrayNumber)
                .sum();
        System.out.println(sum);

        OptionalDouble promedio = Arrays.stream(arrayNumber)
                .average();
        System.out.println(promedio.orElseThrow());


        List<Integer> listaSinrepetidos = Arrays.stream(arrayNumber)
                .distinct() // -> Nos devuelve todos los diferentes
                .sorted() // -> Los ordena de mayor a menor
//                .filter(s -> s % 2 == 0)
//                .filter(Main::isEvent)
                .filter(s -> funtion.test(s))
                .boxed() // -> Compierte los primitivos a emboltorios
                .toList();

        long restante = Arrays.stream(arrayNumber)
                .distinct() // -> Nos devuelve todos los diferentes
                .sorted() // -> Los ordena de mayor a menor
//                .filter(s -> s % 2 == 0)
//                .filter(Main::isEvent)
                .filter(s -> funtion.test(s))
                .count(); // -> devuelve el numero de elementos que hallan

//        int size = 20;
//        int[] numbers = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            numbers[i] = generarNumero();
//        }
//
//        for (int number : numbers) {
//            System.out.print(number+ ", ");
//        }

    }


//    static int generarNumero() {
//        return new Random().nextInt(40, 60);
//    }

    static boolean isEvent(int n) {
        return n % 2 == 0;
    }


}
