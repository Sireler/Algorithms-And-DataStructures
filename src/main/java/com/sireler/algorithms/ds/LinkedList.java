package com.sireler.algorithms.ds;

import java.util.NoSuchElementException;

public class LinkedList {

    LinkedList.Node first;
    LinkedList.Node last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Insert an element at the top of the list
     *
     * @param data
     */
    public void insert(int data) {
        Node fresh = new LinkedList.Node(null, data, first);

        if (last == null) {
            last = fresh;
        }
        if (first != null) {
            first.prev = fresh;
        }

        first = fresh;
        size++;
    }

    /**
     * Remove the first element
     *
     * @return the first removed element
     */
    public int remove() {
        LinkedList.Node element = first;

        if (first.equals(last)) {
            last = first = null;
        } else {
            first = first.next;
            first.prev = null;
        }

        size--;
        return element.data;
    }

    /**
     * Remove the last element
     *
     * @return data from the last removed element
     */
    public int pop() {
        LinkedList.Node element = last;

        if (last.equals(first)) {
            first = last = null;
        } else {
            last = last.prev;
            last.next = null;
        }

        size--;
        return element.data;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getFirst() {
        LinkedList.Node firstElement = first;

        if (firstElement == null) {
            throw new NoSuchElementException();
        } else {
            return firstElement.data;
        }
    }

    public int getLast() {
        LinkedList.Node lastElement = last;

        if (lastElement == null) {
            throw new NoSuchElementException();
        } else {
            return lastElement.data;
        }
    }

    public int get(int index) {
        checkIndexPosition(index);

        return getNode(index).data;
    }

    /**
     * Get element by index
     *
     * @param index
     * @return Node
     */
    private LinkedList.Node getNode(int index) {
        LinkedList.Node element;
        int i;
        if (index < size / 2) {
            element = first;

            for (i = 0; i < index; i++) {
                element = element.next;
            }

            return element;
        } else {
            element = last;

            for (i = size - 1; i > index; i--) {
                element = element.prev;
            }

            return element;
        }
    }

    /**
     * Check if index is within the bounds of the list
     *
     * @param index
     * @return boolean
     */
    private boolean isIndexInList(int index) {
        return index >= 0 && index < size;
    }

    private void checkIndexPosition(int index) {
        if (!isIndexInList(index)) {
            throw new IndexOutOfBoundsException("Index was outside the bounds of the list");
        }
    }

    public int getSize() {
        return size;
    }

    /**
     * An element of the LinkedList
     */
    private static class Node {
        int data;
        LinkedList.Node prev;
        LinkedList.Node next;

        Node(LinkedList.Node prev, int data, LinkedList.Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
