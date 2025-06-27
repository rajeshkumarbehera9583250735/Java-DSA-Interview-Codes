/*
Problem Statement:
You are given an array of N - 1 distinct integers from the range 1 to N. 
That is, the array contains all numbers from 1 to N, except for one missing number.

*/
package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {7,5,1,3,2,4};
		int n=arr.length+1; 
		int actualSum= n *(n+1)/2;
		int cursum=0;
		for(int num:arr) {
			cursum=cursum+num;
		}
		int missingNum= actualSum - cursum;
		System.out.println("Missing number is:"+missingNum);
	}

}
