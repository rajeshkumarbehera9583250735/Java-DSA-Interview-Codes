/*
Problem:
Write a Java program to count the frequency of each character in a given string and print each character with its number of occurrences.

*/
package strings;
import java.util.*;
public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String s="programming";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(char ch: s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
