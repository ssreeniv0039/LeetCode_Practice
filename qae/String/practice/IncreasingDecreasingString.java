package com.qae.String.practice;

import java.util.Arrays;

public class IncreasingDecreasingString {

	public static void main(String[] args) {
		String s = sortString("aaaabbbbcccc");
		System.out.println(s);
		
		
	}
	
	public static String sortString(String s) {
		StringBuilder res = new StringBuilder();
		int lcount = s.length();
		
		//counting the frequency of letters using array
		int arr[] = new int[26];
		for(char ch:s.toCharArray()) {
			arr[ch - 'a']++;
		}
		//iterating the loop for number of letters present in the string
		while(lcount > 0) {
			
			//iterating for the step 1,2,3 i.e ascending order
			for(int i =0 ;i<arr.length;i++) {
				if(arr[i] != 0) {
					res.append((char)(i+97));
					arr[i]--;
					lcount--;
				}
			}
			//iterating for step 4,5,6 i.e descending order
			for(int i = arr.length-1;i>=0;i--) {
				if(arr[i] != 0) {
					res.append((char)(i+97));
					arr[i]--;
					lcount--;
				}
			}
		}
		return res.toString();
	}

}
