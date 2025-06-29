/*
  
Problem Title:
Partition Array Around a Pivot Value
  
Given an unsorted array of integers and a pivot value x, rearrange the array so that:
All elements less than x come first
Then all elements equal to x
Then all elements greater than x

You must perform the rearrangement in-place and return or print the modified array.
  
 */

package arrays;

public class PartitionArray {

	public static void main(String[] args) {
		int[] arr = {12, 3, 6, 9, 7, 5, 11, 17};
		int x=9;
		
		int left = 0, right = arr.length-1;
		int curindex = 0;
		
		while(curindex <= right) {
			
			if(arr[curindex] < x) {
				
				int temp = arr[curindex];
				arr[curindex] = arr[left];
				arr[left] = temp;
				
				left++;
				curindex++;
				
			}else if(arr[curindex] == x) {
				
				curindex++;
				
			}else {
				
				int temp=arr[curindex];
				arr[curindex]=arr[right];
				arr[right]=temp;
				
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
