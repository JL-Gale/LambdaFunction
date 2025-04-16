package lambdas.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        /*
        *  recibe un valor y retorna un valor
        * */

        String numeroString = "100";
        int numeroInt = 100;

        int pruebaInt = Integer.parseInt(numeroString);
        String prueba = String.valueOf(numeroInt);

        System.out.println(prueba);
        System.out.println(pruebaInt);

        Function<Integer, String> test1 = (num) -> {
            int numero = 1;
            for (int i = 0; i < num; i++) {
                numero *= i+1;
            }
            return "el resultado es: "+numero;
        };

        Function<Integer, String> test2 = Main::hacerAlgo;

        System.out.println(test1.apply(5));
        System.out.println(test2.apply(5));

    }

    static String hacerAlgo(Integer num) {
        int numero = 1;
        for (int i = 0; i < num; i++) {
            numero *= i+1;
        }
        return "el resultado es: "+numero;
    }
}
