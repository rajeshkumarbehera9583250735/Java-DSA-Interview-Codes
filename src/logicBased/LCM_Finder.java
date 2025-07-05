/*
Write a Java program to find the LCM (Least Common Multiple) of two numbers using GCD. 

 */
package logicBased;

public class LCM_Finder {

	public static void main(String[] args) {
		 int a = 12, b = 18;
		 int lcm=(a*b)/hcf(a,b);
		 System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
	}
	public static int hcf(int a, int b) {
		while(b != 0) {
			int temp=b;
			b=a % b;
			a=temp;
		}
		return a;
	}

}
