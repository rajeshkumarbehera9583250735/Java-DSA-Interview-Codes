/*
  Print all Prime Numbers within a Given Range
  Problem Statement:
  Write a Java program that accepts two integers from the user (start and end of a range) 
  and prints all prime numbers within that range, inclusive.
*/

package logicBased;

import java.util.Scanner;

public class PrimeNumberRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting value: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending value: ");
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
