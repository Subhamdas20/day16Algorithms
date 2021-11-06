package com.bridgelabz.algorithms;

import java.util.Scanner;

public class GuessNumber {
    static Scanner sc = new Scanner(System.in);
/**
 * @param high to get the upper limit or range
 * @param low to get lower limit of range
 * */
    public int find(int high, int low) {
        int mid;
        while (low != high) {
            mid = (low + high) / 2;
            System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
                    + (mid + 1) + " - " + high);
            int c = sc.nextInt();
            mid = (low + high) / 2;
            if (c == 1)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        GuessNumber num = new GuessNumber();
        System.out.println("guess a no between 0 to 100 ");
        sc.next();
        System.out.println("guessed no is " + num.find(100, 0));
    }
}
