package com.qae.practice;

public class FindEvenNoOfDigits {
	public static void main(String[] args) {		
		
		int[] arr = {5,555};
		System.out.println(findNumbers(arr));
		
	}
	
	public static int findNumbers(int[] nums) {
		int counter = 0;
		for(int i = 0;i<nums.length;i++) {
			int num = nums[i];
			int count = 0;
			while(num>0) {
				num= num/10;
				count++;
			}
			if(count %2 == 0)
				counter++;
					
		}
		return counter;
	}

}
