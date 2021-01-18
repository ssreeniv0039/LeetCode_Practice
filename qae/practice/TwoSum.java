package com.qae.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[] = {0,1,2,3,5};
		 twoSumA(arr,5);
		
		

	}
	
	public static int[] twoSum1(int[] nums,int target) {
		int arr[] = new int[2];
		Map<Integer,Integer> mapReader = new HashMap<>();
		
		for(int i = 0;i<nums.length;i++) {
			int difference = target - nums[i];
			if(mapReader.containsKey(difference)) {
				arr[0] = mapReader.get(difference);
				arr[1] = i;
			}else {
				mapReader.put(nums[i],i);
			}
		}
		return arr;
	}
	
	public static int[] twoSum(int[] nums,int target) {
		for(int i = 0;i< nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i] +nums[j]== target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum Solotion");
	}
	
	public static int[] twoSumOnePass(int nums[],int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			int difference = target - nums[i];
			if(map.containsKey(difference)) {
				return new int[] {i,map.get(difference)};
			}else {
				map.put(nums[i],i );
			}
		}throw new IllegalArgumentException("No two sum solotion");

	}
	//Amazon Interview Question
	public static void twoSumA(int nums[],int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				System.out.println(nums[i]+","+ temp+" ");
			}
			else {
				map.put(nums[i], i);
			}
				
		}
	}
	// Google Interview Question
	public static boolean twoSumG(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			int difference = target - nums[i];
			if(map.containsKey(difference)) {
				return true;
			}
			map.put(nums[i],i);
		}
		return false;
	}
	

}
