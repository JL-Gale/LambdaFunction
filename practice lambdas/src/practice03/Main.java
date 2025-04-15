package practice03;

public class Main {
    public static void main(String[] args) {

//        Function<Integer, Integer> square = a -> a * a;
//        Function<Integer, Integer> cube = a -> a * a * a;

        Integer num = applyFunction(a -> a * a, 4);
        System.out.println(num);
        System.out.println(applyFunction(a -> a * a * a, 4));

        System.out.println(applyFunction(functionSupplier(), 10));

        Function<Integer, Integer> box = functionSupplier();
        System.out.println(box.apply(10));


    }

    static Integer applyFunction(Function<Integer, Integer> funt, int a) {
        return funt.apply(a);
    }

    static Function<Integer, Integer> functionSupplier() {
        return (a) -> {return  a * a;};
    }
}
