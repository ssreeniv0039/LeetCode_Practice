package com.qae.Integer.practice;

public class CheckPerfectNumber {
	public static void main(String[] args) {
		boolean flag = checkPerfectNumber(6);
		System.out.println(flag);

		}
	
	public static boolean checkPerfectNumber(int num) {
		if(num < 6) {
			return false;
		}
		int sum = 0 ;
		for(int i = 2;i<=num/2;i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == num) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
