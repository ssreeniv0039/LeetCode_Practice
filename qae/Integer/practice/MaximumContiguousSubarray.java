package com.qae.Integer.practice;



public class MaximumContiguousSubarray {

	public static void main(String[] args) {
		int arr[] = {3};
		int num = maxSumConSubArray(arr);
		System.out.println(num);

	}
	
	
	public static int maxSumConSubArray(int[] nums) {
		if(nums == null | nums.length == 0)
	            return Integer.MIN_VALUE;
		int sum = nums[0]; 
		int maxSum = nums[0];
		for(int i =1;i<nums.length;i++) {
			sum = sum + nums[i];
			if(nums[i] > sum){
				sum = nums[i];
				}
			if(sum > maxSum){
				maxSum = sum;
				}		
		}
		return maxSum;
	}
	// Kadane's algorithm
	public static int maxSumArray(int[] nums) {
		int maxSum = nums[0];
		int sum = nums[0];
		for(int i = 1;i<nums.length;i++) {
			sum = Math.max(sum+nums[i],nums[i]);
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
	
	
	
	

}
