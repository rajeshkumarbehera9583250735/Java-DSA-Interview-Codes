/*
  
Problem Statement:
Write a Java program to print the last N prime numbers that are less than or equal to a user-defined ending value.

*/
package logicBased;
import java.util.Scanner;
public class Last_N_Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        System.out.print("Enter how many prime numbers you want to print: ");
        int count = sc.nextInt();

        System.out.print("Last " + count + " prime numbers are: ");
        
        for(int i=end;count>0;i--) {
        	boolean isPrime=true;
        	if(i<=1) {
        		continue;
        	}
        	for(int j=2;j<=Math.sqrt(i);j++) {
        		if(i % j==0) {
        			isPrime=false;
        			break;
        		}
        	}
        	if(isPrime) {
        		System.out.println(i+" ");
        		count--;
        	}
        }
        sc.close();
	}

}
