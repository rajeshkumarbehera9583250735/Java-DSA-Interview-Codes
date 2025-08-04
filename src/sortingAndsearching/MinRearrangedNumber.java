/*

Problem Title:
Rearrange Digits to Form Minimum Value Without Leading Zeros

Problem Description:
You are given an integer num. Rearrange its digits to form the smallest possible number such that:
It does not contain any leading zeros.
The sign of the number remains unchanged.

Return the rearranged number with minimal value under the constraints.

Example 1:

Input: num = 310  
Output: 103  

Explanation:

All digit arrangements: 013, 031, 103, 130, 301, 310.
The smallest valid value without leading zero is 103.

Example 2:

Input: num = -7605  
Output: -7650  

*/
package sortingAndsearching;

import java.util.Arrays;
import java.util.Scanner;

public class MinRearrangedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long num = sc.nextLong();
		
		long smallest = smallestNumber(num);
		System.out.println("The smallest Possible number of "+ num +" is :"+ smallest );
		
		sc.close();
	}
	
	public static long smallestNumber(long num) {
		boolean isNegative = num < 0;
		
		char[] digits = String.valueOf(Math.abs(num)).toCharArray();		
		Arrays.sort(digits);
		
		if(isNegative) {
			reverseNumber(digits);
		}else {
			if(digits[0] == '0') {
				for(int i=1;i < digits.length;i++ ) {
					if(digits[i] != '0') {
						char temp = digits[i];
						digits[i] = digits[0];
						digits[0] = temp;
						break;
					}
				}
			}
		}
		
		long result = Long.parseLong(new String(digits));
		return isNegative ? -result : result;
	}
	
	public static void reverseNumber(char[] arr) {
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
	}
}
