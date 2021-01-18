package com.qae.practice;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		 
		int arr[] = {1,0,2,3,0,4,5,6};
		extracted(arr);
		for(int i:arr) {
			System.out.print(i+ " ");
		}

	}

	public static void extracted(int[] arr) {
		int j = 0;
		for(int  i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			}
		}
	}

}
