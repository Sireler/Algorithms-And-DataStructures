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

    public static int[] merge(int[] array) {
        mergeSort(array, 0, array.length - 1);

        return array;
    }

    /**
     * Merge sort
     *
     * @param array source array
     * @param left left merge boundary
     * @param right right merge boundary
     */
    private static void mergeSort(int[] array, int left, int right) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        doMerge(array, left, mid, right);
    }

    /**
     * Merge two arrays in ascending order of their elements
     *
     * @param array big array
     * @param left left merge boundary
     * @param mid middle merge boundary
     * @param right right merge boundary
     */
    private static void doMerge(int[] array, int left, int mid, int right) {
        // Current position to read from the first array
        int pos1 = left;

        // Current position to read from the second array
        int pos2 = mid + 1;

        // Current position to write to the temp array
        int pos3 = 0;

        int[] temp = new int[right - left + 1];

        // Merge while both arrays have elements
        while (pos1 <= mid && pos2 <= right) {
            if (array[pos1] < array[pos2]) {
                temp[pos3++] = array[pos1++];
            } else {
                temp[pos3++] = array[pos2++];
            }
        }

        // Merge the remaining elements
        while (pos2 <= right) {
            temp[pos3++] = array[pos2++];
        }
        while (pos1 <= mid) {
            temp[pos3++] = array[pos1++];
        }

        // Copy from the temp array to the source array
        for (pos3 = 0; pos3 < right - left + 1; pos3++) {
            array[left + pos3] = temp[pos3];
        }
    }

    public static int[] quick(int[] array) {
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (array.length == 0 || left >= right)
            return;

        // Select the wall
        int middle = left + (right - left) / 2;
        int wall = array[middle];

        // Split into subarrays
        // 1 - ( > wall)
        // 2 - ( < wall )
        int i = left, j = right;
        while (i <= j) {
            while (array[i] < wall) {
                i++;
            }

            while (array[j] > wall) {
                j--;
            }

            // Swap elements
            if (i <= j) {
                int temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            }
        }

        // Sort the left or right side of array
        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }
}
