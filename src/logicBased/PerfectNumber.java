/*
 
Problem: Write a Java program to check whether a given number is a Perfect Number or not.
A number is perfect if the sum of its proper divisors (excluding itself) is equal to the number.

*/
package logicBased;

import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1; i<= num/2; i++) {
        	if(num % i == 0) {
        		sum= sum+i;
        	}
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        }else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
	}

}
