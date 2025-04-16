package lambdas.callable;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Callable<Integer> test = () -> 10;

        try {
            System.out.println(test.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
