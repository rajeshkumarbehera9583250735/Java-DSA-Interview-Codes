/*
Problem Title:
Sort a Binary Array (0s and 1s)

You are given an array of integers that contains only 0s and 1s. 
Your task is to sort the array in non-decreasing order (i.e., move all 0s to the left side and all 1s to the right side) in-place.

You must not use any sorting library function. 
 */


package arrays;

public class BinaryArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 1, 0};
		int left=0;
		int right=arr.length-1;
		
		while(left < right) {
			while(arr[left] == 0 && left < right ) left++;
			while(arr[right] == 1 && left < right) right--;
			
			if(left < right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]= temp;
				left++;
				right--;
			}
		}
		
		System.out.println("After sort:");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}

//Time Complexity: O(n)
//Space Complexity: O(1)
