package com.qae.String.practice;

public class BalancedStringSplit {
	public static void main(String[] args) {
		int num = balancedStringSplit("RLRRLLRLRL");
		System.out.println(num);
	}

	public static int balancedStringSplit(String s) {

		int countR = 0, countL = 0, counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				countL = countL + 1;
			} else {
				countR = countR + 1;
			}
			if (countR == countL)
				counter++;
		}
		return counter;

	}
}