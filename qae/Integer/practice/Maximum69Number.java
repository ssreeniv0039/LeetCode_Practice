package com.qae.Integer.practice;

public class Maximum69Number {
	
public static void main(String[] args) {
		
	}
	
	
	
	public static int maximum69Number(int num) {
		StringBuilder res = new StringBuilder(num);
		for(int i  = 0;i<res.length();i++) {
			if(res.charAt(i) != '9') {
				res.setCharAt(i,'9');
				break;
			}
		}
		return Integer.parseInt(res.toString());
	}

}
