package org.example.clase12;

import org.apache.commons.lang3.StringUtils;
import org.example.clase06.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        var letra = "a";
        var cadenaOLetra = "a";

        Function<Integer, List<String>> generarNombres = a -> {
            String[] nombres = new String[a];
            return Arrays.stream(nombres)
                    .map(s -> FakerUtils.generarNombre())
                    .toList();
        };

       Function<String, Predicate<String>> test = (s) -> (n) ->
               n.startsWith(StringUtils.stripAccents(s).toLowerCase())
                       | n.startsWith(StringUtils.stripAccents(s).toUpperCase());


        Function<String, Predicate<String>> test2 = (s) -> {
            Predicate<String> filtrar = (n) -> {
                if (s.contains("Ñ") | s.contains("ñ")){
                    return n.contains(s.toLowerCase())
                            | n.contains(s.toUpperCase());
                }
                return n.contains(StringUtils.stripAccents(s).toLowerCase())
                        | n.contains(StringUtils.stripAccents(s).toUpperCase());};
            return filtrar;
        };

        Consumer<List<String>> inicianConLetra = s ->
                s.stream()
                        .filter(test.apply(letra))
                        .forEach(System.out::println);

        Consumer<List<String>> tienenA = s ->
                s.stream()
                        .filter(test2.apply(cadenaOLetra))
                        .forEach(System.out::println);

        final List<String> amigos = generarNombres.apply(5);
        final List<String> enemigos = generarNombres.apply(5);
        final List<String> conocidos = generarNombres.apply(5);

        amigos.forEach(System.out::println);
        System.out.println("***********");
        enemigos.forEach(System.out::println);
        System.out.println("************");
        conocidos.forEach(System.out::println);

        System.out.println("Nombre que solo empiezan por:" + letra);
        System.out.println("**Amigos**");
        inicianConLetra.accept(amigos);

        System.out.println("**Enemigos**");
        inicianConLetra.accept(enemigos);

        System.out.println("**Conocidos**");
        inicianConLetra.accept(conocidos);

        System.out.println("Nombre que tienen la letar: "+cadenaOLetra);
        System.out.println("**Amigos**");
        tienenA.accept(amigos);

        System.out.println("**Enemigos**");
        tienenA.accept(enemigos);

        System.out.println("**Conocidos**");
        tienenA.accept(conocidos);
    }
}
