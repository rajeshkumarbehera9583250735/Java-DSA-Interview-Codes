package arrays;
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int [] arr= {12,3,6,2,8,5,1};
		
		int target=9;
		Map<Integer,Integer> map= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int complement= target-arr[i];
			if( map.containsKey(complement)){
				System.out.println("The indices are:"+map.get(complement)+","+ i);
			}
			map.put(arr[i], i);
		}
	}

}

//Time Complexity:O(n) and Space Complexity :O(n)
