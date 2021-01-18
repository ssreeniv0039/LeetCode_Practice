package com.qae.String.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DecriptString {

	public static void main(String[] args) {
		String s = freqAlphabets("10#11#12");
		System.out.println(s);
		
		
		
	}
	
	public static String freqAlphabets(String s) {
		Map<String,Character> map = new HashMap<>();
		int count = 1;
		for(char i = 'a';i<= 'z';i++) {
			if(count <10) {
			map.put(String.valueOf(count),i);
			}
			else if(count > 9) {
				map.put(String.valueOf(count)+"#",i);
			}
			count++;
		}
		
		StringBuilder res = new StringBuilder();
		int i = s.length()-1;
		while(i>=0) {
			if(s.charAt(i) == '#') {
				res.append(map.get(s.substring(i-2, i+1)));
				i = i-3;
			}
			else {
				res.append(map.get(s.substring(i, i+1)));
				i--;
			}
		}
		return (res.reverse().toString());
		
		
	}
	
	

}
