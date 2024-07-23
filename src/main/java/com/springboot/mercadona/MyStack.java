package com.springboot.mercadona;

public class MyStack {

    private int size = 0;
    //private int element;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        if (size == 0) throw new UnderFlow();
        return elements[--size]; // Decrement size before accessing the array
    }


    public int getSize() {
        return size;
    }
}
