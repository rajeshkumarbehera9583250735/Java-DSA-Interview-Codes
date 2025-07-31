/*
Problem Name: Container With Most Water

Problem Statement:

You are given an array height of length n. 
Each element of the array represents the height of a vertical line drawn at that index. 
The i-th and j-th lines, together with the x-axis, can form a container.

Find two lines such that the container formed holds the maximum amount of water.
Return the maximum amount of water a container can store.

At least two lines must be present in the input.
You cannot tilt the container.

*/
package arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int left = 0,right = height.length-1;
		int maxWater= 0;
		
		while(left < right) {
			int width = right - left;
			int minHeight = Math.min(height[left], height[right]);
			
			int currentWater = width * minHeight;
			
			maxWater = Math.max(maxWater, currentWater);
			
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		System.out.println("Maximum water the container can store: " + maxWater);
	}

}
