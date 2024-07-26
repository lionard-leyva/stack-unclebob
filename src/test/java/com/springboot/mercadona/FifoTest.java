package com.springboot.mercadona;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FifoTest {

    private Fifo fifo = new Fifo();

    @Test
    void nothing() {
    }

    @Test
    void canCreateFifoStack() {
        assertTrue(fifo.isEmpty());
    }

    @Test
    void canPush() {
        fifo.push(9);
        assertFalse(fifo.isEmpty());
        assertEquals(1, fifo.getSize());
    }

    @Test
    void pushXandPushY() {
        fifo.push(99);
        fifo.push(88);
        assertEquals(2, fifo.getSize());
    }

    @Test
    void pop() {
        fifo.push(99);
        fifo.pop();
        assertTrue(fifo.isEmpty());
    }

    @Test
    void afterPushX_popX() {
        fifo.push(99);
        assertEquals(99, fifo.pop());
        assertTrue(fifo.isEmpty());
    }

    @Test
    void afterPushXandPushY_popXandPopY() {
        fifo.push(99);
        fifo.push(88);
        fifo.push(100);
        assertEquals(3, fifo.getSize());
        assertEquals(99, fifo.pop());
        assertEquals(88, fifo.pop());
        assertEquals(100, fifo.pop());


    }

    @Test
    void afterPushXandPushY_then() {

    }

    @Test
    void afterPushXAndPushY_lastElement() {
        fifo.push(99);
        fifo.push(88);

        assertEquals(99, fifo.getFirstElement());
    }


}
