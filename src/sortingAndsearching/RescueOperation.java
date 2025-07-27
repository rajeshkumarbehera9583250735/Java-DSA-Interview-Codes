/*

Problem Title: Rescue Operation – Minimum Boats Required

Problem Statement:
A devastating hurricane is approaching the coastal town of Codeville, and immediate evacuation is required. 
Each rescue boat can carry at most two people and has a maximum weight limit of k.

You are given a list of people’s weights. Your task is to determine the minimum number of boats required to rescue everyone.
 
 */
package sortingAndsearching;

import java.util.Arrays;

public class RescueOperation {

	public static void main(String[] args) {
		String input="100,200,150,80;200";
		
		String[] parts=input.split(";");
		
		int maxWeight=Integer.parseInt(parts[1]);
		
		String[] weightsStr= parts[0].split(",");
		
		int[] weights= new int[weightsStr.length];
		for(int i=0;i<weights.length;i++) {
			weights[i]=Integer.parseInt(weightsStr[i]);
		}
		
		Arrays.sort(weights);
		int lowW = 0, 
			highW = weights.length-1;
		int boats=0;
		
		while(lowW <= highW) {
			if(weights[lowW] + weights[highW] <= maxWeight) {
				lowW++;
			}
			highW--;
			boats++;
		}
		System.out.println("Minimum number of rescue boats required: " + boats);

	}
}
