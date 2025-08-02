/*

Problem Name: Maximum Sum Subsequence of Length K

Problem Statement:
Given an array of integers nums and an integer k, return a subsequence of nums of length k that has the largest sum.
The returned subsequence must maintain the original order of elements (i.e., must be a subsequence, not a subset).

You may return any valid subsequence of length k with the largest sum if multiple answers exist.

*/

package priorityQueue;
import java.util.*;
public class MaxSumSubsequence {

	public static void main(String[] args) {
		int[] result= maximumSubSequence(new int[] {7,3,2,5},2);
		System.out.println("Maximum Sum SubSequence is :"+Arrays.toString(result));
	}
	
	public static int[] maximumSubSequence(int[] nums, int k) {
		
		/*
		 
		// Define comparator to compare based on value (at index 0 of int[])		
		Comparator<int[]> byValues = (a,b) -> Integer.compare(a[0], b[0]);
		
		// Create a min-heap using the comparator
		PriorityQueue<int[]> minHeap = new PriorityQueue<>(byValues);
		
		*/
		
		PriorityQueue<int[]> minHeap = new PriorityQueue<>( (a,b) -> Integer.compare(a[0], b[0]));
		
		for(int i=0; i<nums.length; i++) {
			minHeap.offer( new int[] { nums[i], i } );					// store both value and index
			if(minHeap.size() > k) {
				minHeap.poll();											// remove the smallest value to keep top k largest
			}
		}
		
		List<int[]> topElements = new ArrayList<>(minHeap);
		topElements.sort(Comparator.comparingInt(a -> a[1]));			// sort by original index
		
		// Extract the values only (ignore index now)
		
		int[] result = new int[k];
		for(int i=0;i<k;i++) {
			result[i] = topElements.get(i)[0];
		}
		return result;
	}
}
