package com.qae.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberUnsortedArray {

	public static void main(String[] args) {
		int arr1[] = {2,3,1};
		int n = arr1.length;
		System.out.println(maxProduct(arr1));;
	}
	
	public static int maxProduct(int arr[]) {
		if(arr.length == 1|| arr.length == 0)
			return -1;
		if(arr.length == 2)
			return(arr[arr.length-1]) *(arr[arr.length-2]);
		
		//Arrays.sort(arr);
		//Brute-force search
		for(int i = 0;i<arr.length;i++) {
			for(int j= 0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return (arr[arr.length-1]) *(arr[arr.length-2]);
		
	}

}
