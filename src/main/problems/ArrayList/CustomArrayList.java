package main.problems.ArrayList;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[10]; // Initial capacity
        this.size = 0;
    }

    // Add an element to the end of the list
    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Insert an element at a specific index
    public void insert(int index, T element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        System.out.println("the array before: ");
        System.out.println(Arrays.toString(elements));
        System.arraycopy(elements, index, elements, index + 1, size - index);
        System.out.println("the length: "+ (size-index));
        System.out.println("the array after: ");
        System.out.println(Arrays.toString(elements));
        elements[index] = element;
        size++;
    }

    // Remove an element at a specific index
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T oldValue = (T) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.out.println("the array before: ");
            System.out.println(Arrays.toString(elements));
            System.arraycopy(elements, index + 1, elements, index, numMoved);
            System.out.println("the array after: ");
            System.out.println(Arrays.toString(elements));
        }
        elements[--size] = null; // Clear to let GC do its work
        System.out.println("the array after: ");
        System.out.println(Arrays.toString(elements));
        return oldValue;
    }

    // Ensure the array can accommodate at least one more element
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * size];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    // Return the size of the ArrayList
    public int size() {
        return size;
    }
}

