package com.qae.practice;

public class LinearSearch {
	public static void main(String[] args) {
		boolean flag = false;
		int arr[] = {20,30,5,10,4,3};
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		int search = 10;
		for(int  k = 0;k<arr.length;k++) {
			if(search == arr[k]) {
				System.out.println("Element "+search +" in the array at: "+ k);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element not present in the array");
		}
		
	}

}
