package com.qae.String.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MOstCommonWord {

	public static void main(String[] args) {
		String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] s = {"hit"}; 
		String res = mostCommonWord(str,s);
		System.out.println(res);
	}
	
	public static String mostCommonWord(String str,String[] banned) {
		
		String normalizedString = str.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
		
		String[] words = normalizedString.split("\\s+");
		
		Set<String> bannedWords = new HashSet<>();
		for(String i:banned) {
			bannedWords.add(i);
		}
		Map<String,Integer> map = new HashMap<>();
		for(String i : words) {
			if(!bannedWords.contains(i))
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		
		
	}

}
