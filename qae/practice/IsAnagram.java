package com.qae.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsAnagram {
	public static void main(String[] args) {
		 
		String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> list1 = groupAnagrams(list);
		for(List<String> i :list1) {
			System.out.print(i + " ");
		}
		
	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
	       Map<String,List<String>> map = new HashMap<>();
	        for(String i: strs){
	            char ch[] = i.toCharArray();
	            Arrays.sort(ch);
	            String word = String.valueOf(ch);
	            if(!map.containsKey(word)){
	                map.put(word, new ArrayList<String>());
	            }
	            map.get(word).add(i);

	        }
	        return new ArrayList(map.values());
	        
	    }

}
