package org.example.clase01.comparators;

import org.example.clase01.Persona;

import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
//        if (o1.getFirstName().charAt(0) < o2.getFirstName().charAt(0)){
//            return -1;
//        } else if (o1.getFirstName().charAt(0) > o2.getFirstName().charAt(0)) {
//            return 1;
//        } else {
//            return 0;
//        }

        return Character.compare(o1.getFirstName().charAt(0), o2.getFirstName().charAt(0));
//        return 0;
    }
}
