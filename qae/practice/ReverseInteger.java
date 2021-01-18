package com.qae.practice;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-153));

	}

	public static int reverse(int x) {
		int rev = 0;
		
		while (x > 0 || x < 0) {
			int temp = rev;
			rev = rev * 10 + x % 10;
			x = x / 10;
			if (temp != rev / 10) {
				return 0;
			}
		}
		return rev;
	}

}
