/*
Problem Title:
Move All Zeros to End of Array (Preserve Order)
You are given an array of integers that may contain both zero and non-zero elements. 
Your task is to move all the zero elements to the end of the array while maintaining the relative order of the non-zero elements.

This must be done in-place, i.e., without using extra space (excluding a few variables).
*/
package arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {12, 0, 1, 0, 5, 9, 3};
		 
		int index=0;
		
		for(int num: arr) {
			if(num != 0) {
				arr[index]=num;
				index++;
			}
		}
		
		while(index < arr.length) {
			arr[index]=0;
			index++;
		}
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
}

//Time Complexity: O(n)
//Space Complexity: O(1)
