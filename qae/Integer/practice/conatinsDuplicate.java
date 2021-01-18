package com.qae.Integer.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class conatinsDuplicate {
	public static void main(String[] args) {
		int num[] = {2,14,18,22,22};
		boolean flag = containsDuplicate(num);
		System.out.println(flag);
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums == null)
			return false;
		Map<Integer,Integer> count = new HashMap<>();
		for(int i :nums) {
			if(count.containsKey(i)) {
				return true;
			}
			count.put(i,count.getOrDefault(i, 0)+1);
		}
		return false;
	}
	
	public static boolean dupInteger(int arr1[]) {
		Arrays.sort(arr1);
		for(int i = 1;i< arr1.length;i++) {
			if(arr1[i-1] == arr1[i]) {
				return true;
			}
		}
		return false;
	}
	
	

}
