package practice01;

public class Main {
    public static void main(String[] args) {

        System.out.println(ejecutarOp(10, 10, (a, b) -> a + b));
        System.out.println(ejecutarOp(10, 10, (a, b) -> a - b));
        System.out.println(ejecutarOp(10, 10, (a, b) -> a / b));
        System.out.println(ejecutarOp(10, 10, (a, b) -> a * b));
    }

    static <T extends Number> T ejecutarOp(T a, T b, Operator<T> operator) {
        return operator.apply(a, b);
    }
}
