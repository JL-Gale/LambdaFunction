package practice14_reduceBasico;

import java.util.List;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        // forEach() ->
        // filter() ->
        // map() ->
        // reduce() ->

        List<Integer> numero = List.of(34, 32, 41, 4, 7, 45, 37, 51, 4, 56, 89, 98);

        OptionalInt reduce = numero.stream()
                .mapToInt(i -> i)
                .reduce((t1, t2) -> t1 + t2);
        System.out.println(reduce.orElseThrow());

    }
}
