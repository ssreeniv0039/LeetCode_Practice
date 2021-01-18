package com.qae.String.practice;

import java.util.HashSet;

public class RemoveVowelsInString {
	public static void main(String[] args) {
		String str = removeVowelsHasSet("aeious");
		System.out.println(str);
	
	
	}
	public static String romoveVowels(String str) {
		StringBuffer res = new StringBuffer();
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				continue;
			}
			else {
				res.append(str.charAt(i));
				
			}
		}
		return res.toString();
}
	public static String removeVowelsHasSet(String s) {
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		StringBuilder res = new StringBuilder();
		for(int i = 0;i<s.length();i++) {
			if(!set.contains(s.charAt(i))) {
				res.append( s.charAt(i));
			}
		}return res.toString();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}
