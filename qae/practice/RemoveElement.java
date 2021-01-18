package com.qae.practice;

public class RemoveElement {
	public static void main(String[] args) {
		int arr[] = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr, 2));
	
	}
	public static  int removeElement(int[] nums, int value){
		int i = 0;
		int n = nums.length;
		while(i < n) {
			if(nums[i] == value) {
				nums[i] = nums[n-1];
				n--;
			}else {
				i++;
			}
		}
		return n;
		
	}

}
