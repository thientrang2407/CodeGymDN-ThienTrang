package dataStructure;

import java.util.ArrayList;

public class MyMethodList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyMethodList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyMethodList(int capacity) {
    }

    public void add(int index, E element) {
        ensureCapacity(10);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if ( size >= elements.length) {
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(elements, 0, newData, 0,size);
            elements = newData;
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index" + index + "out of bounds");
    }

    public void remove(int index) {
        checkIndex(index);
        E[] data = null;
        E e = data[index];
    }

    public int size() {
        return this.size;
    }
    public E clone() {
        return (E) "aaa";
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        ensureCapacity(size + 1);
        elements[size++] = o;
        return true;
    }

    public E get(int i) {
        int index;
        checkIndex(i);
        return (E) elements[i];
    }

    public void clear() {
        E[] data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


}
