package com.qae.practice;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	
	public static void main(String[] args) {
		int arr[] = {-1,2,3,-4};
		squares(arr);
		for(int  i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void squares(int[] A) {
		for(int i = 0;i<A.length;i++) {
			A[i] = A[i]*A[i];
		}
		Arrays.sort(A);
	}

}
