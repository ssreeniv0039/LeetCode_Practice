package com.qae.String.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsandStones {
	public static void main(String[] args) {
		int num = newJewelsInStones("aA", "aAAbbbb");
		System.out.println(num);
	}

	public static int newJewelsInStones(String J,String S) {
		
	Set<Character> set = new HashSet<>();
	for(int  i = 0;i<J.length();i++) {
		set.add(J.charAt(i));
	}
	int count = 0;
	for(int j = 0;j<S.length();j++) {
		if(set.contains(S.charAt(j))) {
			count++;
		}
	}
	return count;
	

	}

}
