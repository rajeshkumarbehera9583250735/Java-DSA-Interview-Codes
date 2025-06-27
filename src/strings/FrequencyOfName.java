/*

Question:Frequency of Names
Write a Java program that takes a list of names and counts how many times each name appears in the list.

Your program should:
Print each name along with its frequency.
Identify and print the name that was added the most number of times, along with its count.*/


package strings;

import java.util.*;

public class FrequencyOfName {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(
            Arrays.asList("Rajesh", "Akash", "Niharika", "Swagatika", "Rajesh", "Niharika", "Rajesh")
        );

        HashMap<String, Integer> map = new HashMap<>();

        
        for (String name : al) {
            if(map.containsKey(name)) {
            	map.put(name, map.get(name)+1);
            }else {
            	map.put(name, 1);
            }
            
        }

        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
        String maxName = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxName = entry.getKey();
            }
        }

        System.out.println("Name added most times: " + maxName + " (" + maxCount + " times)");
    }
}