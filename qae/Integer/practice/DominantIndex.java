package com.qae.Integer.practice;

public class DominantIndex {
	public static void main(String[] args) {
    	int nums[] = {3, 6, 1, 0};
    	int res = largestNumber(nums);
    	System.out.println(res);
    
    	}
    	
    public static int largestNumber(int nums[]) {
    	int max = 0;
    	int index = 0;
    	for(int i = 0;i<nums.length;i++) {
    		if(nums[i] > max) {
    			max = nums[i];
    			index = i;
    		}
    	}
    	for(int i = 0;i<nums.length;i++) {
    		if((2 * nums[i] > max) && (nums[i] != max)) {
    			return -1;
    		}
    	}
    	return index;
    }	
    
}
