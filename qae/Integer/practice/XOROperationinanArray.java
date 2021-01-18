package com.qae.Integer.practice;

public class XOROperationinanArray {
	public static void main(String[] args) {
		int num = xorOperation(1, 7);
		System.out.println(num);
	}

	public static int xorOperation(int n, int start) {
		int Xor = 0;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = start + 2 * i;
		}
		for (int i = 0; i < arr.length; i++) {
			Xor = Xor ^ arr[i];
		}
		return Xor;
	}
	
	public static int xorOperationEasy(int n, int start) {
		int Xor = 0;
		for(int i = 0;i<n;i++) {
			Xor = Xor ^start + 2*i;
		}
		
		return Xor;
	}
}
