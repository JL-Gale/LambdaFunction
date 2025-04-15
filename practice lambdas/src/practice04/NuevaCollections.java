package practice04;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NuevaCollections<E> implements Iterable<E> {

    private E[] array;
    private int capacity = 10;
    private int size;

    public NuevaCollections() {
        // Para poder hacer esto la capacity debe static
//        this(capacity);
        size = 0;
        array = (E[]) new Object[capacity];
    }

    public NuevaCollections(int capacity) {
        size = 0;
        if (capacity >= 0) {
            this.capacity = capacity;
        }
        array = (E[]) new Object[capacity];
    }

    public void add(E e) {
        ensuceCapacity();
        array[size] = e;
        size ++;
    }

    private void ensuceCapacity() {
        if(size == array.length) {
            int newSize = array.length + 10;
            E[] newArray = (E[]) new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int currenIndex = -1;


            @Override
            public boolean hasNext() {
                return currenIndex < size - 1;
            }

            @Override
            public E next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                currenIndex++;
                return array[currenIndex];
            }
        };
    }


}
