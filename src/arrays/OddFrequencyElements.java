/*
Problem:-

You are given an array of integers. 
Some elements may appear once, some twice, and some more than twice. 
Your task is to find and print all the elements that occur an odd number of times in the array.


*/
package arrays;
import java.util.*;
public class OddFrequencyElements {

	public static void main(String[] args) {
		int[] arr = {2, 2, 4, 4, 5, 7, 1, 3, 1};
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num,1);
			}
		}
		System.out.println("Elements with odd frequency:");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				System.out.println(entry.getKey());
			}	
		}
	
	}

}
