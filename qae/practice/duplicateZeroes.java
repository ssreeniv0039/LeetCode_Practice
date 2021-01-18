package com.qae.practice;

public class duplicateZeroes {
	public static void main(String[] args) {
		
		int arr[] = {1,0,2,3,1,0,1,2};
		duplicateZero(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}

		}
	
	public static void duplicateZero(int[]  arr) {
		for(int i = 0;i<arr.length;) {
			if(arr[i] ==0) {
				for(int j=arr.length-1;j>i;j--) {
					arr[j] = arr[j-1];
				}
				i= i+2;
			}else {
				i++;
			}
		}
	}
	

}
