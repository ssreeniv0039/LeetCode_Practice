package com.qae.String.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {

	public static void main(String[] args) {
		String s = "23";
		List<String> list = letterCombination(s);
		for(String i:list) {
			System.out.print(i+" ");
		}
	}
	
	public static List<String> letterCombination(String digits){
		Map<String,String> map = new HashMap<>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9","wxyz");
		List<String> list = new ArrayList<>();
		
		for(int i = 0;i<digits.length();i++) {
			String str = "";
			str+= digits.charAt(i);
			if(map.containsKey(str)) {
				list.add(map.get(str));
				}
		}
		return list;
		}
	}
	