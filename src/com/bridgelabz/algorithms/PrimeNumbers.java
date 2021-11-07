package com.bridgelabz.algorithms;

import java.util.Scanner;

public class PrimeNumbers {
    /*
    * PRINT PRIME NUMBERS WITHIN A RANGE
    * */
    public  int  primeRange(){
        int start, end, i, j, count=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        start = scan.nextInt();
        System.out.print("Enter Ending Number : ");
        end = scan.nextInt();
        System.out.print("Prime Numbers Between " + start + " and " +end+ " is : ");
        for(i=start; i<=end; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println(i + " ");
            }
        }
        return i;
    }

    public int pallindrome (){
        int primeNum = primeRange();
        int temp = 0, rev = 0;
        temp = primeNum;
        while (primeNum>0) {

            rev = (rev * 10) + primeNum % 10;
            primeNum = primeNum/10;
        }
        if(rev == temp){
            System.out.println("Palindrome prime is : "+ temp);
            return temp;
        }
        else System.out.println("No palindrome prime detected");

        return 0;
    }

    public static void main(String args[])
    {
        PrimeNumbers prime = new PrimeNumbers();
//        prime.primeRange();
        prime.pallindrome();
    }
}
