package com.bridgelabz.algorithms;

import com.bridgelabz.algorithms.collection.Queue;
import com.bridgelabz.algorithms.collection.Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Prime2D {
    static Stack stackAnagramPrime = new Stack();
    static Stack stackNonAnagramPrime = new Stack();
    static Queue queueAnagramPrime = new Queue();

    /*
     * PRINT PRIME NUMBERS WITHIN A RANGE
     * */
    public static int[] primeRange(int a, int b) {

        boolean flag = false;
        int[] arr = new int[30];
        int k = 0;


        for (int x = a + 1; x < b; x++) {
            if (x == 2) {
                arr[k] = x;
                ++k;
            } else {
                for (int i = 2; i < x; i++) {
                    flag = false;
                    if ((x % i) == 0)
                        break;
                    else
                        flag = true;
                }
            }
            if (flag == true) {
                arr[k] = x;
                ++k;
            }
        }

        int[] arr_new = new int[k];
        for (int i = 0; i < k; i++)
            arr_new[i] = arr[i];
        return arr_new;
    }

    public static int[][] range2D() {
        int[][] arr2 = new int[11][1001];
        for (int i = 1; i <= 10; i++) {
            int x = i * 100;
            int y = x - 100;
            System.out.print("Range " + (y) + " to " + x + " : ");
            int[] arr1 = primeRange(y + 1, x);
            for (int k = 0; k < arr1.length; k++) {
                arr2[i][k] = arr1[k];
                System.out.print(arr2[i][k] + " ");

            }
            System.out.println();
        }

        return arr2;
    }

    /**
     * check anagram prime or not
     */
    public static void checkAnagramPrime() {
        int temp = 0, remainder;
        int arr2[][] = range2D();
        int revPrime[][] = new int[11][500];
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 1000; j++) {
                if (arr2[i][j] != 0) {
                    temp = arr2[i][j];
                    int rev = 0;
                    while (temp != 0) {
                        remainder = temp % 10;
                        rev = rev * 10 + remainder;
                        temp = temp / 10;

                    }
                    revPrime[i][j] = rev;
                    int fl = 0;
                    for (int l = 4; l <= revPrime[i][j] / 2; l++) {
                        if (revPrime[i][j] % l == 0) {
                            fl = 1;
                            break;
                        }
                    }
                    if (fl == 0) {
                        stackAnagramPrime.push(revPrime[i][j]);
                        queueAnagramPrime.append(revPrime[i][j]);
                        System.out.println(revPrime[i][j] + " is anagram prime number");
                    } else {
                        stackNonAnagramPrime.push(revPrime[i][j]);

                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        checkAnagramPrime();
    }
}
