package com.qae.practice;

import java.util.Arrays;

import com.google.common.net.PercentEscaper;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println(premutation("dog", "god"));

	}
	
	public static String sort(String s) {
		char content[] = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean premutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
}
