/*

Problem Title: Conditional Sum Between Extremes

Problem Statement:

You are given an array arr of n integers. 
You are also given two integers, k and x. 
Your task is to compute the sum of all unique integers in the array that are greater than exactly k values and less than exactly x values from the array.

If no such integers exist, return 0.

Only unique values are considered, i.e., duplicates should be removed.After removing duplicates, sort the elements.

From the sorted unique list:
	Ignore the smallest x elements.
	Ignore the largest k elements.

The remaining middle values are the ones to be summed. 

 */
package arrays;
import java.util.*;
public class ConditionalSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of smallest elements to exclude: ");
		int x= sc.nextInt();
		
		System.out.println("Enter the number of largest elements to exclude: ");
		int k= sc.nextInt();
		
		System.out.println("Enter the number of elements to add in the array: ");
		int n= sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Set<Integer> uniqueNum=new HashSet<>();
		for(int num: arr) {
			uniqueNum.add(num);
		}
		
		List<Integer> sortedNum= new ArrayList<>(uniqueNum); 
		Collections.sort(sortedNum);
		
		if(x + k >= sortedNum.size()) {
			System.out.println("Based on your condition sum is : 0");
		}else {
			int sum=0;
			for(int i =x; i<sortedNum.size()-k;i++) {
				sum=sum + sortedNum.get(i);
			}
			System.out.println("Based on condition sum is: "+sum);
		}
		sc.close();
	}
}
