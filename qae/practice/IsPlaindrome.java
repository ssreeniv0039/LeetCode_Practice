package com.qae.practice;

public class IsPlaindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-11));
		
			
		}
	public static boolean isPalindrome(int x) {
		int res = 0;
		int temp = x;
		while(x != 0) {
			res = res*10 + x % 10;
			x = x/10;
		}
		if(res == temp) {
			return true;
		}else {
			return false;
		}
		
	}
}
