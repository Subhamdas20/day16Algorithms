package algorithms;

import java.util.Scanner;

public class PrimeNumbers {
    /*
    * PRINT PRIME NUMBERS WITHIN A RANGE
    * */
    public static void  primeRange(){
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
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[])
    {
        primeRange();
    }
}
