package com.qae.Integer.practice;

public class DecompressRunLengthEncodedList {
	//for strings 3a4b2c -> aaa bbbb cc
	//similarly for integers [1,2,3,4] -> 2 one time and 4 3times ->[2,4,4,4] logic
	
	

	public static void main(String[] args) {
		int arr[] = {1,1,2,3};
		int[] nums = decompressRLEList(arr);
		for(int i:nums) {
			System.out.print(i+" ");
		}

	}
	
	public static int[] decompressRLEList(int[] nums) {
		int resSize = 0, j = 0;
		for(int i =0;i<nums.length;i=i+2) {
			resSize = resSize+ nums[i];
		}  
        int arr[] = new int[resSize];
        
        for(int  i = 0;i<nums.length;i=i+2) {
        	int frequency = nums[i];
        	int value = nums[i+1];
        	while(frequency!=0) {
        		arr[j++] = value;
        		frequency--;
        	}
        }return arr;

	}

}
