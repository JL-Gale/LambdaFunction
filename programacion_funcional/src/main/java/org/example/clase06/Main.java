package org.example.clase06;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Integer> square = a -> a*a;
        Function<Integer, Integer> cube  = a -> a*a*a;

        //Callback es una Funcion que se pasa por parametro a otra funcion
        System.out.println(ejecutarFunction(5, square));
        System.out.println(ejecutarFunction(5, cube));
        var numerito = ejecutarFunction(30, a -> a+30);
        System.out.println(numerito);
        System.out.println(ejecutarFunction(5, ejecutar()));


        Function<String, Integer> function = (a)->{
            try {
                return Integer.parseInt(a);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Pone numeros no lentras ni espacio homosexual");
                return 0;
            }
        };

        System.out.println(function.apply(""));
    }

    //Una high orden functions es una funcion que recive funciones o que devuelve funciones.
    static Integer ejecutarFunction(Integer numerito, Function<Integer, Integer> f) {
        return f.apply(numerito);
    }

    static Function<Integer, Integer> ejecutar(){
        return a -> a*a+20;
    }

}
