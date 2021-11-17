package com.bridgelabz.algorithms.collection;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year, Month;
        System.out.println("Enter the year");
        Year = sc.nextInt();
        System.out.println("Enter the month");
        Month = sc.nextInt();
        printCalendar(Year, Month);
    }
/**
 * prints calender
 * */
    public static void printCalendar(int year, int month) {
        int leap_year;
        int dayOfWeek=1;
        String space = "   ";
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] calDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Calendar cal = new GregorianCalendar(year, month, 1);

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                calDays[1] = 29;
            }
        } else if (year % 4 == 0) {
            calDays[1] = 29;
        }
        System.out.println("Year: " + year + space + "Month: " + monthName[month] + "\n");
        System.out.println("S   M   T   W   T   F   S\n");
        for (int dayCounter=1; dayCounter <= calDays[month]; dayCounter++) {
            if (dayCounter > 9) {
                space = "  ";
            }
            if (dayCounter == 1) {
                while (dayOfWeek != cal.get(Calendar.DAY_OF_WEEK)) {
                    System.out.print(space + " ");
                    dayOfWeek++;
                }
                System.out.print(dayCounter + space);
                dayOfWeek++;
            } else {
                if (dayOfWeek == 8) {
                    System.out.print("\n" + dayCounter + space);

                    dayOfWeek=2;
                } else {

                    System.out.print(dayCounter + space);

                    dayOfWeek++;

                }

            }

        }
        System.out.println("\n");
    }
}

