/*
Problem Statement:
Write a Java program to find the HCF (Highest Common Factor) of two numbers using the Euclidean Algorithm.
*/
package logicBased;

public class HCF_Finder {

	public static void main(String[] args) {
		int a=12, b=18;
		int hcf= findHCF(a,b);
		System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
	}
	public static int findHCF(int a, int b) {
		while(b != 0) {
			int temp=b;
			b= a % b;
			a=temp;
		}
		return a;
	}

}
