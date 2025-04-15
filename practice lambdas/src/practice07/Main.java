package practice07;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // filter() Y map()

        List<Ganancias> gananciasSemanales = List.of(new Ganancias(450, "2025-01"),
                new Ganancias(390, "2025-02"),
                new Ganancias(399, "2025-03"),
                new Ganancias(122, "2025-04"),
                new Ganancias(874, "2025-05"),
                new Ganancias(329, "2025-06"),
                new Ganancias(129, "2025-07"),
                new Ganancias(1283, "2025-08"));


        List<String> names = List.of("fernando", "ana", "diana", "jesica", "anastacia", "pepe", "enabel", "pepe", "juan");

        names.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.endsWith("a"))
                .filter(s -> s.contains("t"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

//        List<Integer> gananciasSemanales = List.of(450, 390, 399, 122, 874, 329, 129, 1283);

        gananciasSemanales.stream()
                .filter(s -> {return s.getGanacias() > 250;})
                .forEach(System.out::println);

    }
}
