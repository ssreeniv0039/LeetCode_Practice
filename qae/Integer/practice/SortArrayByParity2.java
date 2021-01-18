package com.qae.Integer.practice;

public class SortArrayByParity2 {

	public static void main(String[] args) throws Throwable {
		
		int A[] = {1,2,3,4};
		int arr[] = new int[A.length];
		int j = 0;
		for(int i = 0;i<A.length;i++) {
			if(isEven(A[i]) ) {
				arr[j] = A[i];
				j=j+2;
			}
		}
		j = 1;
		for(int i = 0;i<A.length;i++) {
			if(!isEven(A[i])) {
				arr[j] = A[i];
				j = j +2;
			}
		}
	}
	
	public static boolean isEven(int num) {
		return (num%2 == 0);
	}
}
