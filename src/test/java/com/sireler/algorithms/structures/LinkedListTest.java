package com.sireler.algorithms.structures;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void getFirst() {
        LinkedList list = new LinkedList();

        list.insert(5);
        assertEquals(5, list.getFirst());

        list.insert(6);
        assertEquals(6, list.getFirst());
    }

    @Test
    public void getLast() {
        LinkedList list = new LinkedList();

        list.insert(10);
        assertEquals(10, list.getLast());

        list.insert(20);
        assertEquals(10, list.getLast());
    }

    @Test(expected = NoSuchElementException.class)
    public void getLastEmptyList() {
        LinkedList list = new LinkedList();
        list.getLast();
    }

    @Test(expected = NoSuchElementException.class)
    public void getFirstEmptyList() {
        LinkedList list = new LinkedList();
        list.getFirst();
    }

    @Test
    public void insert() {
        LinkedList list = new LinkedList();

        list.insert(5);
        assertEquals(5, list.getFirst());

        list.insert(6);
        assertEquals(5, list.getLast());
    }

    @Test
    public void remove() {
        LinkedList list = new LinkedList();

        list.insert(10);
        assertEquals(10, list.getFirst());

        list.remove();
        assertTrue(list.isEmpty());

        list.insert(10);
        list.insert(20);
        assertEquals(20, list.getFirst());
        list.remove();
        assertEquals(10, list.getFirst());
    }

    @Test
    public void pop() {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);

        assertEquals(1, list.pop());

        list = new LinkedList();
        list.insert(1);
        list.pop();
        assertTrue(list.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void clear() {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }

        list.clear();
        list.getFirst();
        list.getLast();
    }

    @Test
    public void isEmpty() {
        LinkedList list = new LinkedList();

        list.insert(1);
        assertFalse(list.isEmpty());

        list = new LinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void get() {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(4);
        list.insert(3);

        assertEquals(5, list.get(2));
        assertEquals(4, list.get(1));
        assertEquals(3, list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOutsideBounds() {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);

        list.get(2);
    }
}