package com.sireler.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    private static final int[] ARRAY = { 5, 4, 1, 3, 2, 7, 9, 6, 8 };
    private static final int[] EXPECTED = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    @Test
    public void bubble() {
        assertArrayEquals(EXPECTED, Sorter.bubble(ARRAY.clone()));
    }

    @Test
    public void selection() {
        assertArrayEquals(EXPECTED, Sorter.selection(ARRAY.clone()));
    }

    @Test
    public void insertion() {
        assertArrayEquals(EXPECTED, Sorter.insertion(ARRAY.clone()));
    }

    @Test
    public void merge() {
        assertArrayEquals(EXPECTED, Sorter.merge(ARRAY.clone()));
    }

    @Test
    public void quick() {
        assertArrayEquals(EXPECTED, Sorter.quick(ARRAY.clone()));
    }
}