package org.example.clase08;

import java.util.List;

public class Main {
    static int numero = 0;
    public static void main(String[] args) {

        List<String> listaDeNombre = List.of("Jorge","Maria","Cecilia","Milton","Onalba","Rene");

        //Funcion lamaba con metodo de referncia y foreach
        listaDeNombre.forEach(System.out::println);

        System.out.println("***********");

        //Funcion lamaba larga y foreach
        listaDeNombre.forEach((a) -> {
            System.out.println(a);
        });

        System.out.println("***********");

        //Funcion lamaba corta y foreach
        listaDeNombre.forEach(a-> System.out.println(a));

        System.out.println("***********");

        listaDeNombre.forEach(a->{
            numero += a.length();
            String cadena = a;
            cadena = cadena.toUpperCase();
            System.out.println(numero+") "+cadena);
        });

        System.out.println("***********");

        listaDeNombre.forEach(new ConsumidorDeCadenas());
    }
}
