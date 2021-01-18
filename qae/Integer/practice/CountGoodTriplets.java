package com.qae.Integer.practice;

public class CountGoodTriplets {

	public static void main(String[] args) {
		int arr[] = {3,0,1,1,9,7};
		int num = countGoodTriplets(arr, 7, 2, 3);
		System.out.println(num);

	}
	
	
	public static int countGoodTriplets(int[] arr,int a,int b,int c) {
		int count = 0;
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = i+1; j<arr.length-1; j++) {
				for(int k =j+1; k<arr.length;k++) {
						int a1 = Math.abs(arr[i] - arr[j]);
						int b1 = Math.abs(arr[j] - arr[k]);
						int c1 = Math.abs(arr[i] - arr[k]);
						if(a1 <= a && b1 <= b && c1 <= c ) {
							count++;
						}
				}
			}
		}
		return count;
	}

}
