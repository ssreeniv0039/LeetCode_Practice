package com.qae.Integer.practice;

import java.util.HashMap;
import java.util.Map;

public class IdebticalPairs {

	public static void main(String[] args) {
		int num[]  = {1,2,1,1,3,3};	
		int nums = numsIdenticalPairs1(num);
		System.out.println(nums);
		}
		public static int numIdenticalPairs(int[] nums) {
			int res = 0;
			int count[] = new int[101];
			for(int i: nums) {
				count[i]++;
				}
			
			for(int i:count) {
				res = res+  (i*(i-1))/2;                 
				}
			return res;	
		}
		
		public static int numsIdenticalPairs1(int nums[]) {
			Map<Integer,Integer> map = new HashMap<>();
			int count = 0;
			for(int i : nums) {
				if(map.containsKey(i)) {
					int value = map.get(i);
					count = count + value;
				}
				map.put(i,map.getOrDefault(i,0)+1);
			}
			return count;
			
			
			
			
		}
		
}
