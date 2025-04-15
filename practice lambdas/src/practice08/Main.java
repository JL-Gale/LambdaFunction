package practice08;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // skip()

        List<Venta> ventas = Arrays.stream(Month.values())
                .map(m -> new Venta(generarGanacias(), m))
                .toList();

        ventas.stream()
                .skip(6)
                .forEach(System.out::println);

//        ventas.forEach(System.out::println);

    }

    public static Double generarGanacias() {
        return new Random().nextDouble(1000, 2000);
    }
}
