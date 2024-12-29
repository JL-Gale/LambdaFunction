package org.example.clase10;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Jorge", "Milton", "Cecillia", "Mariana", "Joe", "Rene");
         list.stream()
                //.filter(a-> a.equalsIgnoreCase("jorge") | a.equalsIgnoreCase("milton"))
                 .filter(a-> a.contains("il"))
                .map(a-> a.toUpperCase())
                .forEach(System.out::println);




    }
}
