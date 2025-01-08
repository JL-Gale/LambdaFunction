package org.example.clase13;

import org.example.clase06.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Function<Integer, List<String>> generar = (n) -> {
            String[] lista = new String[n];
            return Arrays.stream(lista).map(s -> FakerUtils.generarNombre()).toList();
        };

        // Metodos de referencia

        // 1. Refesencia a metodo estatico
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numeros)
                .map(s -> s * s)
                .forEach(s -> System.out.println(s));

        System.out.println("*************");

        Arrays.stream(numeros)
                .map(Main::test)
                .forEach(System.out::println);

        System.out.println("**************");

        Arrays.stream(numeros)
                .map(MathUtils::saquare)
                .forEach(System.out::println);

        // 2. Referencia a metodos constructor
        String[] nombres = generar.apply(10).toArray(new String[0]);

        List<Persona> list = Arrays.stream(nombres)
                .map(s -> new Persona(s))
                .toList();
        System.out.println(list);

        List<Persona> list2 = Arrays.stream(nombres)
                .map(Persona::new)
                .toList();

        // 3. Referencia a metodos de instancia


//        List<String> list3 = new ArrayList<>();
//        for (Persona persona : list) {
//            list3.add(persona.getName());
//        }
//        System.out.println(list3);

        List<String> listaDeString = list2.stream()
                .map(Persona::getName)
                .toList();
        System.out.println(listaDeString);

    }

    static int test(int number) {
        return number*number;
    }
}
