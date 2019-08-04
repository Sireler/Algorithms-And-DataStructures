package com.sireler.algorithms.sorting;

public class Sorter {

    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        return array;
    }

    public static int[] insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int j = i - 1;

            while (j >= 0 && val < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = val;
        }

        return array;
    }
}
