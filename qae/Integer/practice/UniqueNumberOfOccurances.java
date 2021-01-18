package com.qae.Integer.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class UniqueNumberOfOccurances {

	public static void main(String[] args) {
		int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
		
	}
	
	
	
	public static boolean uniqueOccurrences(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i: arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		List<Integer> list = new ArrayList<>();
		for(Entry<Integer, Integer> res: map.entrySet()) {
			list.add(res.getValue());
		}
		
		int nums[] = new int[list.size()];
		int j = 0;
		for(int k: list) {
			nums[j++] = k;
		}
		
		Arrays.sort(nums);
		for(int i = 1;i<nums.length;i++) {
			if(nums[i-1] == nums[i]) {
				return false;
			}
		}
		return true;
	}	
		
	public static boolean uniqueOccurrences1(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i: arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		Set<Integer> set = new HashSet<>();
		for(int j: map.values()) {
			if(set.contains(j)) {
				return false;
			}
			set.add(j);
		}
		return true;
		
		
	}
	
}
