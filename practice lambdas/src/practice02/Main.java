package practice02;

public class Main {
    public static void main(String[] args) {

        ejecutarLambda1(() -> System.out.println("Hola"));
        ejecutarLambda2(10, (a) -> System.out.println(a));
        ejecutarLambda3((a, b) -> System.out.println(a+b), 10, 20);
        ejecutarLambda4(() -> {
            var a = 3;
            var b = 2;
            return a+b;
        });
        ejectarLambda5((a, b) -> a + b, 30, 30);
    }

    static void ejecutarLambda1(IFuntional1 funt) {
        funt.metodo1();
    }

    static void ejecutarLambda2(int a, IFuntional2 funt) {
        funt.metodo2(a);
    }

    static void ejecutarLambda3(IFuntional3 funt, int a,  int b) {
        funt.metodo3(a, b);
    }

    static void ejecutarLambda4(IFuntional4 funt) {
        System.out.println(funt.metodo4());
    }

    static void ejectarLambda5(IFuntional5 funt, int a,  int b) {
        System.out.println(funt.metodo5(a, b));
    }

}
