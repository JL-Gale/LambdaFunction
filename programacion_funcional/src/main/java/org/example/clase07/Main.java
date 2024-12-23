package org.example.clase07;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeNombre = List.of("nombre 1", "nombre 2", "nombre 3", "nombre 4", "nombre 5");

        //Programacion imperativa
        for (int i = 0; i < listaDeNombre.size(); i++) {
            System.out.println(listaDeNombre.get(i));
        }

        System.out.println("*************");

        //bucle for mejorado, bucle for-each
        //Programacion declariva
        for (String s : listaDeNombre) {
            System.out.println(s);
        }

        System.out.println("***************");
        //Programacion funcional con
        listaDeNombre.forEach(System.out::println);

        System.out.println("***************");

        ColleccionInventada<String> list = new ColleccionInventada<>();
        list.add("1 Jorge");
        list.add("2 luis");
        list.add("3 Gale");
        list.add("4 Jorge");
        list.add("5 luis");
        list.add("6 Gale");
        list.add("7 Jorge");
        list.add("8 luis");
        list.add("9 Gale");
        list.add("10 Jorge");
        list.add("11 luis");
        list.add("12 Gale");
        list.add("13 Jorge");
        list.add("14 luis");
        list.add("15 Gale");
        list.add("16 Jorge");
        list.add("17 luis");
        list.add("18 Gale");
        list.add("19 Jorge");
        list.add("20 luis");
        list.add("21 Gale");
        list.add("22 Jorge");
        System.out.println(list.get(1));
        System.out.println(list.get(22));

        for (String s : list) {
            System.out.println(s);
        }



    }
}
