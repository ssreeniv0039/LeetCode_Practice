package com.qae.String.practice;

import java.util.HashSet;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		String s = reverseVowel("hello");
		System.out.println(s);
	}
	
	public static String reverseVowel(String s) {
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		char ch [] = s.toCharArray();
		//Two pointer technique
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			while(i < j && !set.contains(ch[i])) {
				i++;
			}
			while(i < j && !set.contains(ch[j])) {
				j--;
			}
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
		} 
		return new String(ch);
		
	}

}
