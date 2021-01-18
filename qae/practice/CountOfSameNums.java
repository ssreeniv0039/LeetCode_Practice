package com.qae.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfSameNums {
	public static void main(String[] args) {
		 
		int arr[] = {11,11,12,12,13};	
		practice(arr);	
		
	}
	
	public static void practice(int[] nums) {
		Map<Integer,Integer> count = new HashMap<Integer,Integer>();
//		for(int i: nums) {
//			if(count.containsKey(i)) {
//				count.put(i, count.get(i)+1);
//			}else {
//				count.put(i, 1);
//			}
//		}
		for(int i: nums) {
			count.put(i, count.getOrDefault(i,0)+1);
		}
		
		
		
		
		//Extracting all the keys from the Map
//				Set<Integer> countOfNum = count.keySet();
				
				//Loop through the Map
				for(int j: count.keySet()) {
						System.out.println(j +" : " +count.get(j) );
					
				}
		
		}
		
	

}
