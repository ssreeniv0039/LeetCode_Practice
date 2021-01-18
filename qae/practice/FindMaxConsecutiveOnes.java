package com.qae.practice;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
			
		}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, max = 0;
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == 1)
				count++;
			else
				count = 0;
			if(count > max)
				max = count;
			
		}return max;
	}
}
