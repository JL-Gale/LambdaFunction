package org.example.clase07;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ColleccionInventada<E> implements Iterable<E> {

    private E[] array;
    private static final int CAPACIDAD_POR_DEFECTO = 10;
    private int size;

    public ColleccionInventada(int capicidad) {
        size = -1;
        this.array = (E[]) new Object[capicidad];
    }

    public ColleccionInventada() {
        this(CAPACIDAD_POR_DEFECTO);
    }

    public void add(E e) {
        validadCapacidad();
        size++;
        array[size] = e;
    }

    public E get(int i){
        if (i < 0){
            System.err.println("el Numero debe ser mayor a cero");
            return null;
        } else if (i-1 > size | array[i-1] == null) {
            System.err.println("Te pasaste o esta vacio");
            return null;
        }
        return array[i-1];
    }

    private void validadCapacidad() {
        if(size == array.length-1) {
            E[] nuevoArray = (E[]) new Object[array.length*2];
            System.arraycopy(array, 0, nuevoArray, 0, array.length);
            array = nuevoArray;
        }
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            int currentIndex = -1;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                currentIndex++;
                return array[currentIndex];
            }
        };
    }
}
