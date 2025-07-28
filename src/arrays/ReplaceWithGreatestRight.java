/*

Problem Statement: 
Replace Each Element With the Greatest Element on Right Side

Problem:
You are given an array of integers. Replace every element with the greatest element among the elements to its right, and replace the last element with -1.

*/
package arrays;
import java.util.Arrays;
public class ReplaceWithGreatestRight {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		int maxright=-1;
		
		for(int i=arr.length-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=maxright;
			
			if(temp > maxright) {
				maxright=temp;
			}
		}
		System.out.println("Modified Array: " + Arrays.toString(arr));
	}

}
