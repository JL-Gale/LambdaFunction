package org.example;

import org.example.clase01.FakerUtils;
import org.example.clase01.Persona;
import org.example.clase01.comparators.ComparadorAlfabetico;
import org.example.clase01.comparators.ComparatorByLengthName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Persona> listaPersona = generarPersona(100);
        listaPersona.add(new Persona("Ana","Garrero"));
        System.out.println("****Antes*****");
        System.out.println(listaPersona);
        System.out.println("****Despues*****");
        //Instacia de una clase anonima
        listaPersona.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return Integer.compare(o1.getFirstName().length(), o2.getFirstName().length());
            }
        });

        listaPersona.sort((o1, o2) -> Character.compare(o1.getFirstName().charAt(0), o2.getFirstName().charAt(0)));

        listaPersona.sort(new ComparadorAlfabetico());
        System.out.println(listaPersona);

    }

    private static List<Persona> generarPersona(int n) {
        List<Persona> lista = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            lista.add(new Persona(FakerUtils.generarNombre(), FakerUtils.generarApellido()));
        }
        return lista;
    }
}