package com.qae.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {

		int ch = firstUniqueChar("loveleetcode");
		System.out.println(ch);

	}

	public static int firstUniqueChar(String s) {
		Map<Character, Integer> characterCount = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			characterCount.put(s.charAt(i), characterCount.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int j = 0; j < s.length(); j++) {
			if (characterCount.get(s.charAt(j)) == 1)
				return j;
		}
		return -1;

	}

}
