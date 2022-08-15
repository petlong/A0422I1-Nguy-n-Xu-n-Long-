package ss10_dsa_danhsach.exercise.ArrayList;

import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

public void add(E e) {
    if (size == elements.length) {
        ensureCapacity();
    }
    elements[size++] = e;
}

    public void add(int index, E element) {
        size++;
        if (index> size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        if (size == elements.length) {
            ensureCapacity();
        } else {
            for (int i = elements.length-1; i>index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index]=element;
        }
    }

    public E remove(int index){
        E e;
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        else {
            e = (E) elements[index];
            for(int i=index;i<elements.length - 1;i++){
                elements[i]=elements[i+1];
            }
        }
        return e;
    }

    public int size(){
        return size;
    }

    public MyList<E> clone(){
        MyList<E> clones = new MyList<>();
        for (int i=0;i<size; i++){
            clones.add(i,(E) elements[i]);
        }
        return clones;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


}
