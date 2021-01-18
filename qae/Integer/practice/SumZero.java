package com.qae.Integer.practice;

public class SumZero {
	public static void main(String[] args) {
		int nums[]= sumZero(1);
		for(int i:nums) {
			System.out.print(i+" ");
		}
	

	}	
	
	public static int[] sumZero(int n) {
		int arr[] = new int[n];
		for(int i = 0;i<n-1;i= i+2) {
			arr[i] = i+1;
			arr[i+1] = -arr[i];
		}
		return arr;
	}

}
