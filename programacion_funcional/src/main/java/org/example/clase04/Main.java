package org.example.clase04;

public class Main {
    public static void main(String[] args) {
        ejecitoLambdaTipo1(() -> System.out.println("Hello world"));
        ejecitoLambdaTipo2(a -> System.out.println(a), 15);
        ejecitoLambdaTipo2(a -> System.out.println(a), Integer.MIN_VALUE);
        ejecitoLambdaTipo3((a, b)-> System.out.println(a+b), 30, 15);
        ejecitoLambdaTipo4(()->{
            var a = 2;
            var b = 3;
            return a*b;
        });
        ejecitoLambdaTipo5((a,b)->a+b, 17, 9);
    }

    static void ejecitoLambdaTipo5(IFuncional5 f, int a, int b) {
        var numerito = f.matedo5(a, b);
        System.out.println(numerito);
    }

    static void ejecitoLambdaTipo4(IFuncional4 f) {
        var numerito = f.metodo4();
        System.out.println(numerito);
    }


    static void ejecitoLambdaTipo3(IFuncional3 f, int a, int b){
        f.metodo3(a, b);
    }

    static void ejecitoLambdaTipo2(IFuncional2 f, int a){
        f.metodo2(a);
    }

    static void ejecitoLambdaTipo1(IFuncional1 f){
        f.metodo1();
    }
}
