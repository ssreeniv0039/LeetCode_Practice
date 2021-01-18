package com.qae.Integer.practice;

public class RunningSumOf1dArray {
	public static void main(String[] args) {
		int arr[] = {3,1,2,10,1};
		int num[] = runningSum(arr);
		for(int i:num) {
			System.out.print(i+" ");
		}

	}

	
	public static int[] runningSum(int nums[]) {
		int arr[] = new int[nums.length];
		int sum = 0;
		for(int i = 0;i< nums.length;i++) {
			sum += nums[i];
			arr[i] =sum;	
		}return arr;

	}
	

}
