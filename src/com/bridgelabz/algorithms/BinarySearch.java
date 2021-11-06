package com.bridgelabz.algorithms;

import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {
    /**
     * PERFORMS BINARY SEARCH
     *
     * @param arr to get the array or strings
     * @param searched_element to search in array
     */
    public int binarySearch(T[] arr, T searched_element) {
        int left_Index = 0, right_Index = arr.length - 1;
        while (left_Index < right_Index) {
            int middle_Index = left_Index + (right_Index - left_Index) / 2;
            int res = searched_element.compareTo(arr[middle_Index]);
            if (res == 0)
                return middle_Index;
            if (res > 0) {
                left_Index = middle_Index + 1;
            }
            if (res < 0) {
                right_Index = middle_Index - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        String x = "India";
        Arrays.sort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
        BinarySearch<String> search = new BinarySearch<>();
        int result = search.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);

    }
}



