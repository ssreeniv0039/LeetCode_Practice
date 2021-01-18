package com.qae.practice;

import java.util.Arrays;

public class UniqueCharacters {

	public static void main(String[] args) {
		System.out.println(isCharUnique("sha"));

	}
	
	public static boolean isCharUnique(String str) {
		if(str.length() >128)
			return false;
		boolean[] char_set = new boolean[128];
		for(int i = 0;i<str.length();i++) {
			int value = str.charAt(i);
			if(char_set[value]) {
				return false;
			}
				char_set[value] = true;
		}
		return true;
	}
	
	public static boolean isCharUnique1(String s) {
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(int i = 1;i<ch.length;i++) {
			if(ch[i-1] == ch[i]) {
				return false;
			}
		}
		return true;
	}

}
