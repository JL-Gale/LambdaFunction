package practice01;

@FunctionalInterface
public interface Operator<T> {
    T apply(T a, T b);
}
