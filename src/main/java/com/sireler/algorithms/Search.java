package com.sireler.algorithms;

public class Search {

    private Search() {
    }

    public static int binary(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    /**
     * Binary search using recursion
     *
     * @param array
     * @param value
     * @param left
     * @param right
     * @return index of element or -1
     */
    private static int binarySearch(int[] array, int value, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;


            if (value == array[mid]) {
                return mid;
            }

            if (array[mid] < value) {
                return binarySearch(array, value, mid + 1, right);
            } else {
                return binarySearch(array, value, 0, mid - 1);
            }
        }

        return -1;
    }
}
