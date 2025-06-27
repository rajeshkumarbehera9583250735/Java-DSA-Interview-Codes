/*
Problem:-
You are given an array consisting only of integers 0, 1, and 2. 
Sort the array in-place (without using any sorting algorithm) so that all 0s come first, followed by all 1s, and then all 2s.

Constraints:
You must solve it without using any sorting algorithm (e.g., Arrays.sort() is not allowed).
Your algorithm must work in a single traversal (O(n)), and in-place (no extra space).

*/
package arrays;

public class DutchNationalFlag {
	public static void main(String [] args) {
		int[] arr = {0, 1, 1, 1, 0, 1, 2};
		
		int left=0, right=arr.length - 1;
		int curindex=0;
		
		while(curindex <= right) {
			if(arr[curindex] == 0) {
				int temp = arr[curindex];
				arr[curindex] = arr[left];
				arr[left] = temp;
				
				left++;
				curindex++;
			}else if (arr[curindex] == 1) {
				curindex++;
			}else {
				int temp = arr[curindex];
				arr[curindex] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
}
