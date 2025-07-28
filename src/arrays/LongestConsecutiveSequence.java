/*

Problem Title:
Longest Consecutive Sequence in an Unsorted Array

You are given an unsorted array of integers. 
Your task is to write a Java program that finds the length of the longest consecutive elements sequence.
You must solve the problem in O(n) time complexity.

*/
package arrays;
import java.util.*;
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1, 3, 2, 2, 49, 1, 48, 49, 50};
		Set<Integer> set= new HashSet<>();
		
		for(int n:arr) {
			set.add(n);
		}
		
		int longest=0;
		
		for(int num:set) {
			if(! set.contains(num-1)) {
				int streak=1;
				int curNum=num;
				while(set.contains(curNum+1)) {
					streak++;
					curNum++;
				}
				longest=Math.max(streak,longest);
			}
		}
		System.out.println("Longest consecutive sequence length: " +longest);
	}

}
