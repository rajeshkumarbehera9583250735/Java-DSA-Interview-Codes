/*
Problem Title:
Segregate Even and Odd Numbers in an Array

You are given an array of integers. 
Your task is to rearrange the elements of the array such that all even numbers appear before all odd numbers.
The order of appearance among even or odd numbers does not matter.

You must perform this in-place (i.e., without using an additional array).

*/

package arrays;

public class EvenOddSegregation {

	public static void main(String[] args) {
		int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
		
		int left=0, right=arr.length-1;
		
		while(left < right) {
			
			while( (arr[left] % 2 == 0) && (left < right) ) left++;
			while( (arr[right] % 2 != 0) && (left < right) ) right--;
			
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
		}
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}

//Time Complexity: O(n) 
//Space Complexity: O(1)
