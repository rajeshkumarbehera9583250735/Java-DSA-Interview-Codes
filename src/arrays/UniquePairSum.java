/*
Problem Title:
Count All Unique Pairs With a Given Target Sum

You are given an array of integers and an integer K (target sum).
Your task is to count all unique pairs of elements in the array whose sum is equal to K.

A pair (a, b) is considered the same as (b, a) — so avoid counting duplicate pairs.

 */
package arrays;

import java.util.HashSet;

public class UniquePairSum {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1, 5, 3, 8};
        int target = 6;
        
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<String> uniquePair = new HashSet<String>();
        
        int count=0;
        
        for(int num: arr) {
        	int complement= target - num;
        	if(set.contains(complement)) {
        		
        		int min= Math.min(complement, num);
        		int max= Math.max(complement, num);
        		
        		String pair=min+" : "+max;
        		
        		if( ! uniquePair.contains(pair)) {
        			uniquePair.add(pair);
        			count++;
        		}
        	}
        	set.add(num);
        }
        
        System.out.println("Total: " + count + " unique pairs are present");
	}
}

//Time Complexity: O(n)
//Space Complexity: O(n) 

/*
In Brute Force Approach:

Use nested loops to check every pair:

Time: O(n^2)
Space: O(1)

*/
