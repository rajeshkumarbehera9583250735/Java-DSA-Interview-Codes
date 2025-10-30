package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveAnagram {

	public static void main(String[] args) {
		String[] str= {"cat","nitin","Raj","NItin","tAc","Jaga","man","NaM"};
		HashMap<String,String> map= new HashMap<>(); 
		HashSet<String> duplicates= new HashSet<>();
		for(String word:str) {
			char[] ch=word.toLowerCase().toCharArray();
			Arrays.sort(ch);
			String key= new String(ch);
			if(map.containsKey(key)) {
				duplicates.add(key);
			}else {
				map.put(key, word);
			}
		}
		List<String> uniqueWords= new ArrayList<>();
		for(String key: map.keySet()) {
			if( ! duplicates.contains(key)) {
				uniqueWords.add(map.get(key));
			}
		}
		System.out.println(uniqueWords);
	}

}
