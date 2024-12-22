package org.example.clase06;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
