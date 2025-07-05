/*
 
Three Sum – Find All Unique Triplets That Sum to Zero
Given an array arr[] of n integers, your task is to find all unique triplets (a, b, c) in the array such that:
a + b + c = 0
Each triplet should be in non-descending order, i.e., a <= b <= c.
The result should not contain duplicate triplets. 
  
*/


package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		
		Arrays.sort(arr);
		
		Set<List<Integer>> set= new HashSet<>();
		
		for(int i=0;i<arr.length-2;i++) {
			
			int left =i+1;
			int right =arr.length-1;
			
			while(left < right) {
				int sum=arr[i] + arr[left] +arr[right];
				if(sum == 0) {
					List<Integer> triplet = Arrays.asList(arr[i], arr[left], arr[right]);
					set.add(triplet);
					left++;
					right--;
				}else if(sum < 0) {
					left++;
				}else {
					right--;
				}
			}
			
		}
		
		System.out.println("Unique Triplets are:");
		
		for(List<Integer> triplet : set) {
			System.out.println(triplet);
		}
	}

}

/*
- Time Complexity: O(n^2)
- Space Complexity: O(k) where k = number of valid triplets
*/
