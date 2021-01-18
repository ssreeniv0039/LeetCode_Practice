package com.qae.String.practice;

public class DefangIPaddr {
	/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

	public static void main(String[] args) {
		String str = defangIPaddr("255.100.50.0");
		System.out.println(str);
	
	}
	
	public static String defangIPaddr(String address) {
		StringBuilder res = new StringBuilder();
			for(int i = 0;i<address.length();i++) {
				if(address.charAt(i) == '.') {
						res.append("[.]");
				}else {
					res.append(address.charAt(i));
				}
			}return res.toString();
	}

}
