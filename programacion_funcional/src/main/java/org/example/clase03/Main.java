package org.example.clase03;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            System.out.println(calculadora.dividir(0, 1));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        Operator suma = (a, b) -> a+b;
        Operator resta = (a, b) -> a-b;
        Operator multi = (a, b) -> a*b;

        System.out.println(ejecutar(suma, 5, 8));
        System.out.println(ejecutar(resta, 5, 8));
        System.out.println(ejecutar(multi, 5, 8));

        System.out.println(ejecutar((a,b)->a+b,5, 8));

        //Nos estamos volviendo el hombre del martillo
        System.out.println(ejecutarG((a, b)->a+b, 10, 25));

    }
    static <T extends Number> T ejecutarG(OperatorG<T> op, T a, T b) {
        return op.apply(a, b);
    };
    static double ejecutar(Operator op, double a, double b) {
        return op.apply(a, b);
    }
}
