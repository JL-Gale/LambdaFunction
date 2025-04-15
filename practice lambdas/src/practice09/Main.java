package practice09;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // refactor, refactorizacion de las funciones para no repir codigo

        Function<String, Predicate<String>> function = letter -> {
            return s -> s.toLowerCase().startsWith(letter.toLowerCase());
        };

        Function<String, Predicate<String>> functionShort = letter ->
                s -> s.toLowerCase().startsWith(letter.toLowerCase());

        final List<String> amigos = List.of("Sofia", "Mateo", "Isabella", "Leonardo", "Velentina");
        final List<String> enemigos = List.of("Alejandro", "Martin", "Daniel", "Lucia", "Gabriel");
        final List<String> conocidos = List.of("Emma", "Nicolas", "Sara", "Samuel", "Camaila");

        amigos.stream()
                .filter(function.apply("S"))
                .forEach(System.out::println);
        System.out.println("***********");
        enemigos.stream()
                .filter(test("M"))
                .forEach(System.out::println);
        System.out.println("***********");
        conocidos.stream()
                .filter(functionShort.apply("S"))
                .forEach(System.out::println);

    }

    static Predicate<String> test(final String letter) {
        return s -> s.toLowerCase().startsWith(letter.toLowerCase());
    }

}
