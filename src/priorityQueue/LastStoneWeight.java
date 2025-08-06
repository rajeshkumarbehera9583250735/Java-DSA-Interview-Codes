/*

Problem Title: Last Stone Weight

Problem Statement:

You are given an array of integers stones where stones[i] is the weight of the i-th stone.
We are playing a game with the stones. On each turn, we choose the two heaviest stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. 
The result of this smash is:
	If x == y, both stones are completely destroyed.
	If x != y, the stone of weight x is destroyed, and the stone of weight y is replaced with y - x.
Repeat this process until there is at most one stone left.

Return the weight of the last remaining stone. If all the stones are destroyed, return 0.

*/
package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		int result = findLastStoneWeight(stones);
		System.out.println("The last stone weight is: "+result);
	}

	public static int findLastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int stone : stones) {
			maxHeap.add(stone);
		}
		
		while(maxHeap.size() > 1) {
			int y = maxHeap.poll();
			int x = maxHeap.poll();
			
			if(x != y) {
				maxHeap.add(y-x);
			}
		}
		
		return maxHeap.isEmpty() ? 0 :maxHeap.poll();
	}
}
