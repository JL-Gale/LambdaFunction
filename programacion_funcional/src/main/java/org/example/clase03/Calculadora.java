package org.example.clase03;

public class Calculadora implements Operaciones {
    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a+b;
    }

    @Override
    public double dividir(double a, double b) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("No puedes divire en cero");
        }
        return a/b;
    }
}
