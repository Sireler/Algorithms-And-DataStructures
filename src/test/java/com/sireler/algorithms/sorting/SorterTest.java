package com.sireler.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    private static final int[] ARRAY = { 5, 4, 1, 3, 2, 7, 9, 6, 8 };
    private static final int[] EXPECTED = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    private Sorter sorter;

    @Before
    public void beforeTest() {
        this.sorter = new Sorter();
    }

    @Test
    public void bubble() {
        assertArrayEquals(EXPECTED, sorter.bubble(ARRAY));
    }
}