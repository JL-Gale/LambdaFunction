package practice03;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
