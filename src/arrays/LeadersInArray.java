/*

Problem Statement: Leaders in an Array
Problem:
Given an array of integers, print all the leaders in the array.

An element is a leader if it is greater than or equal to all elements to its right.
The rightmost element is always considered a leader.


*/
package arrays;
import java.util.*;
public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		List<Integer> leaders = new ArrayList<>(); 
		
		int maxright=arr[arr.length-1];
		leaders.add(maxright); 			//Last element is always a leader
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i] >= maxright) {
				maxright=arr[i];
				leaders.add(maxright);
			}
		}
		
		Collections.reverse(leaders);
		System.out.print("Leaders in array: ");
		for(int num: leaders) {
			System.out.print(num+" ");
		}
	}

}
