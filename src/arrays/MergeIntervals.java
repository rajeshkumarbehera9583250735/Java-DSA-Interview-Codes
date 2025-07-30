/*
Problem Name: Merge Intervals

Problem Statement:
You are given an array of intervals where intervals[i] = [start_i, end_i], representing the start and end of the i-th interval.
Your task is to merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

*/
package arrays;
import java.util.*;
public class MergeIntervals {

	public static void main(String[] args) {
		int[][] intervals= {{1, 3}, {2, 6}, {15, 18}, {8, 10}};
		
		//Sort intervals by starting time
		Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> result=new ArrayList<>();
		int[] current= intervals[0];
		
		for(int i=1;i<intervals.length;i++) {
			if(current[1] >= intervals[i][0]) {
				// Merge overlapping
				current[1]=Math.max(current[1],intervals[i][1]);
			}else {
				// No overlap: add current and move to next
				result.add(current);
				current=intervals[i];
			}
		}
		
		// Add the last interval
		result.add(current);
		
		// Convert List to array
		int[][] merged = result.toArray(new int[result.size()][]);
		
		//New Merged Intervals for Output
		for(int[] interval : merged) {
			System.out.println(Arrays.toString(interval));
		}
	}

}
