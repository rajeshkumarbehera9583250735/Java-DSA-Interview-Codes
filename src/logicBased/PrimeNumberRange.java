/*
 
  
Print all Prime Numbers within a Given Range
Problem Statement:

Write a Java program that accepts two integers from the user (start and end of a range) and prints all prime numbers within that range, inclusive.

Example:
Input:
Start = 10
End = 30

Output:
Prime numbers between 10 and 30 are: 11, 13, 17, 19, 23, 29
 
 
*/
package logicBased;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Starting value:");
		int start= sc.nextInt();
		System.out.println("Enter Ending value:");
		int end= sc.nextInt();
		
		boolean isPrime=true;
		for(int i =start;i<=end; i++) {
			
			isPrime=true;
			
			if(i <= 1) {
				continue;
			}else {
				for(int j=2;j<= Math.sqrt(i);j++) {
					 if(i % j == 0) {
						 isPrime=false;
					 }
				}
			}	
			if(isPrime) {
				System.out.println(i + " is a prime number.");
			}else {
				System.out.println(i + " is not a prime number.");
			}
			
		}
		sc.close();
	}

}
