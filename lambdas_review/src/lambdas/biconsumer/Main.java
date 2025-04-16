package lambdas.biconsumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        /*
        * Recibe dos parametros y no retorna nada
        * */

        BiConsumer<String, Integer> test = (s, i) -> {
            for (int j = 0; j < i; j++) {
                System.out.println((j+1) + " " +s);
            }
        };

        BiConsumer<String, String> test2 = (a, b) -> System.out.println(a.concat(" ").concat(b));
        BiConsumer<String, String> test3 = Main::hacerAlgo;

        test.accept("Hello world", 10);
    }

    static void hacerAlgo(String a, String b) {

    }
}
