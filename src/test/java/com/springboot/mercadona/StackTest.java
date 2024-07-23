package com.springboot.mercadona;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private MyStack stack = new MyStack();

    @Test
    void nothing() {
    }

    @Test
    void canCreateStack() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    void afterOnePush_isNotEmpty() {
        stack.push(0);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    void afterOnePushAndOnePop_isEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void afterTwoPushes_sizeIsTwo() throws Exception {
        stack.push(0);
        stack.push(1);
        assertEquals(2, stack.getSize());
    }

    @Test
    void poppingEmptyStack_throwUnderFlow() {
        assertThrows(UnderFlow.class, () -> stack.pop());
    }

    //La pila debe recordar lo que se ha apilado
    @Test
    void afterPushingX_willPopX() throws Exception {
        stack.push(99);
        assertEquals(99, stack.pop());
        stack.push(88);
        assertEquals(88, stack.pop());
    }

    private int zize = -1;

    @Test
    void test() {
        int[] elements = new int[2];
        elements[++zize] = 88;
        elements[++zize] = 99;
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[zize--]);
        }
    }
}