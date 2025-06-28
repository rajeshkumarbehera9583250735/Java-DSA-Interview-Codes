/*
Problem Title:
Find Two Numbers That Add Up to a Target Sum

You are given an array of integers arr[] and a target integer target. 
Your task is to find any two distinct numbers in the array such that their sum equals the target.
Return or print the pair of numbers if such a pair exists.
If no such pair exists, you may return/print an appropriate message like "No valid pair found".

*/
package arrays;
import java.util.*;
public class PairValueSum {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 3, 4, 1};
        int target = 9;
        
        boolean found=false;
        
        HashSet<Integer> set= new HashSet<Integer>();
        
        for(int num: arr) {
        	int complement=target-num;
        	if(set.contains(complement)) {
        		 System.out.println("Pair found: (" + complement + ", " + num + ")");
        		 found= true;
        		 //break;			 //Exit after finding first valid pair
        	}
        	set.add(num);
        }
        if(!found) {
        	System.out.println("No valid pair found");
        }
	}

}


/*
  
Time Complexity: O(n)
Space Complexity: O(n) 

*/
