package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortInOrder {

	public static void main(String[] args) {
		int[] arr= {5,5,5,5,4,3,3,4,3,2,2,6};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		List<Integer> list= new ArrayList<>(Arrays.stream(arr).boxed().toList());
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				int freqDif= map.get(b).compareTo(map.get(a));
				if(freqDif == 0) {
					return a.compareTo(b);
				}
				return freqDif;
			}
		});
		System.out.println(list);
	}

}
