package com.qae.String.practice;

public class GenerateTheString {
	public static void main(String args[]) {
		String s = generateTheString(9);
		System.out.println(s);
		
	}

	public static String generateTheString(int num) {
		StringBuilder res = new StringBuilder();
		for(int i = 0;i <num-1; i++) {
			res.append("a");
			}
		if(num % 2 == 0) {
			res.append("b");
		}
		else {
			res.append("a");
		}
		return res.toString();
		}
		

}
