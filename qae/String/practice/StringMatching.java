package com.qae.String.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatching {

	public static void main(String[] args) {
		String[] words = {"mass","as","hero","superhero"};
		List<String> res= stringMatching(words);
		System.out.println(res);
	}
	
	
	
	public static List<String> stringMatching(String[] words){
		Set<String> word = new HashSet<>();
		for(int i = 0;i<words.length;i++) {
			for(int j = 0;j<words.length;j++) {
				if(i != j && words[i].contains(words[j])) {
					word.add(words[j]);
				}
			}
		}
		return new ArrayList<>(word);
	}

}
