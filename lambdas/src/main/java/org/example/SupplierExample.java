package org.example;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
         *Supplier
         *No recibe ningun valor, pero retorna un resultado
         */

        Supplier<Integer> supplier = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Numero 1");
            var numero1=sc.nextInt();
            System.out.println("Numero 2");
            var numero2=sc.nextInt();
            return numero1 + numero2;
        };
        System.out.println(supplier.get());

        Supplier<String> supplier2 = () -> {
          return "Hola desde un supplier";
        };
        System.out.println(supplier2.get());

        Supplier<String> supplier3 = () -> "Hola";
        System.out.println(supplier3.get());

    }
}
