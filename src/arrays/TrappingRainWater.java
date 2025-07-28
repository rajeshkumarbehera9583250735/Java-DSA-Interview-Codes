/*

Problem Statement: Trapping Rain Water
Problem:
You are given an array height[] representing the elevation map where the width of each bar is 1. 
Compute how much water it can trap after raining.


*/
package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int left = 0, right = height.length-1;
		
		int leftHeighestBar = 0, rightHeighestBar = 0;
		
		int water=0;
		// Process until the two pointers meet
		while(left < right) {
			//Finding Water level by understanding the lowest point of both the side
			if(height[left] < height[right]) {
				
				if(height[left] >= leftHeighestBar) {				// If current left bar is taller than or equal to left heighest bar, update it because it cannot store the water.
					leftHeighestBar=height[left];
				}else {
					water=water+(leftHeighestBar - height[left]);	// Else, water can be trapped; calculate and add it
				}
				left++;											
			}else {
				if(height[right] >= rightHeighestBar) {				// If current right bar is taller than or equal to right heighest bar, update it because it cannot store the water.
					rightHeighestBar=height[right];
				}else {
					water=water+(rightHeighestBar - height[right]);	// Else, water can be trapped; calculate and add it
				}
				right--;
			}
			
		}
		System.out.println("Water stored totally: " + water);
	}

}
