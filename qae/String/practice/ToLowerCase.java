package com.qae.String.practice;

public class ToLowerCase {
	public static void main(String[] args) {
		String res = toLowerCase("Hello");
		System.out.println(res);
	}
	
	public static String toLowerCase(String str) {
		String s = "";
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) <=90 && str.charAt(i) >= 65) {
				char ch = (char) (str.charAt(i) + 32);
				s = s + ch;
			}else {
				s = s+str.charAt(i); 
			}
		}
		return s;
	}
	

}
