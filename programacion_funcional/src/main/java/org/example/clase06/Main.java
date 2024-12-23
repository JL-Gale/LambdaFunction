package org.example.clase06;

import javax.swing.*;
import java.util.Scanner;

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

        var sB = new StringBuilder().append("Hola putos");
        System.out.println(sB);

//        int numero = 1;
//        var aux = 1;
//        while (aux < 5){
//            aux++;
//            System.out.println(numero += aux);
//        }
//
//        numero = 1;
//        for (int i = 1; i < 5;) {
//            i++;
//            System.out.println(numero += i);
//        }
//
//        System.out.println("Ingrese el numero de filas: ");
//        Scanner sc = new Scanner(System.in);
//        var numeroFilas = sc.nextInt();
//
//        for (int i = 1; i <= numeroFilas; i++) {
//            var espaciosFilas = " ".repeat(numeroFilas-i);
//            var asteriscos = "*".repeat(2*i-1);
//            System.out.println(espaciosFilas.concat(asteriscos));
//        }


    }

    //Una high orden functions es una funcion que recive funciones o que devuelve funciones.
    static Integer ejecutarFunction(Integer numerito, Function<Integer, Integer> f) {
        return f.apply(numerito);
    }

    static Function<Integer, Integer> ejecutar(){
        return a -> a*a+20;
    }

}
