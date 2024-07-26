package com.springboot.mercadona;

public class Fifo {

    private int size = 0;
    private int r = 0;
    private int[] elements = new int[3];
    private int[] element3 = new int[3];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
        this.element3[size - 1] = this.elements[size - 1];
    }

    public int getSize() {
        return size;
    }

    public int getFirstElement() {
        return 1;
    }

    public int pop() {
        if (size == 0) throw new IllegalArgumentException();
        return this.elements[--size];
       // return this.element3[r++];
    }
}

