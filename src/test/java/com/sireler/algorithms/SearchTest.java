package com.sireler.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void binary() {
        int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        assertEquals(0, Search.binary(array1, 1));
        assertEquals(2, Search.binary(array1, 3));
        assertEquals(7, Search.binary(array1, 8));

        assertEquals(0, Search.binary(array2, 1));
        assertEquals(4, Search.binary(array2, 5));
        assertEquals(8, Search.binary(array2, 9));
    }
}