package dataStructure;

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
        ensureCapacity();
        int[] data;
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
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
    public int si


}
