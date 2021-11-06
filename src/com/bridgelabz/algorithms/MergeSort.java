package com.bridgelabz.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        String[] values = {"apple", "mango", "banana", "berry", "strawberry", "guava"};
        mergeSort(values, 0, values.length - 1);
        System.out.println("Result " + Arrays.toString(values));
    }
    public static void mergeSort(String[] a, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }
    public static void merge(String[] a, int low, int mid, int high) {
        int n = high - low + 1;       // size of the range to be merged
        String[] b = new String[n];   // merge both halves into a temporary array b
        int i1 = low;
        int i2 = mid + 1;
        int j = 0;

        // as long as neither i1 nor i2 past the end, move the smaller into b
        while (i1 <= mid && i2 <= high) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        // note that only one of the two while loops below is executed
        // copy any remaining entries of the first half
        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        // copy any remaining entries of the second half
        while (i2 <= high) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[low + j] = b[j];
        }
    }

}
