package org.example.clase09;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeNombre = List.of("Jorge", "Milton", "Cecillia", "Mariana", "Joe", "Rene");
        final List<String> nombresUpperCase = listaDeNombre.stream()
                .map(s->s.toUpperCase())
                .toList();

        final String[] nombre = {"Jorge", "Milton", "Cecillia", "Mariana", "Joe", "Rene"};
        final List<?> list = Arrays.stream(nombre)
                .map(s -> s.toUpperCase())
                .toList();
        list.forEach(System.out::println);

        UnaryOperator<Double> funcion = Math::sqrt;
        var numero = 2;
        if (funcion.apply((double)numero) > 0) {
            System.out.println(funcion.apply((double)numero));
        } else{
            System.err.println("esta malo");
        }

//        for (String s : listaDeNombre) {
//            nombresUpperCase.add(s.toUpperCase());
//        }
//        System.out.println(listaDeNombre);
//        System.out.println(nombresUpperCase);
//
//        listaDeNombre.forEach(a -> nombresUpperCase.add(a.toUpperCase()));
//        System.out.println(listaDeNombre+"\n"+nombresUpperCase);

//        nombresUpperCase.forEach(System.out::println);
    }
}
