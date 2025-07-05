/*
 * Problem Statement:
 * Write a Java program to print the first N prime numbers starting from a user-given number.
 */

package logicBased;

import java.util.Scanner;

public class First_N_Primes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting value:");
        int start = sc.nextInt();
        System.out.print("Enter how many prime numbers you want to print: ");
        int count = sc.nextInt();

        System.out.print("First " + count + " prime numbers are: ");

        for (int i = start; count > 0; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } 
            for (int j = 2; j <= Math.sqrt(i); j++) {
                 if (i % j == 0) {
                        isPrime = false;
                        break;
                 }
             }

            if (isPrime) {
                System.out.print(i + " ");
                count--;
            }
        }

        sc.close();
    }
}
