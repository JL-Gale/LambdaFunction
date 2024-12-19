package org.example.clase01.comparators;

import org.example.clase01.Persona;

import java.util.Comparator;

public class ComparatorByLengthName implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
//        if (o1.getFirstName().length() < o2.getFirstName().length()) {
//            return -1;
//        } else if (o1.getFirstName().length() > o2.getFirstName().length()) {
//            return 1;
//        } else {
//            return 0;
//        }
        return Integer.compare(o1.getFirstName().length(), o2.getFirstName().length());
    }
}
