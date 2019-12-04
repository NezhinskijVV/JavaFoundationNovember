package collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array = new Object[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(T t) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, 3 * array.length / 2 + 1);
        }
        array[size] = t;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public int indexOf(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList: {" + Arrays.toString(array) + "}";
    }
}
