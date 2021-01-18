package com.qae.String.practice;

import java.util.ArrayList;
import java.util.List;

public class ShuffleString {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,2,1,3};
		String str = shuffleString("codeleet",arr );
		System.out.println(str);
	}
	
	
	public static String restoreString(String s,int[] indices) {
		StringBuilder res = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			res.setCharAt(indices[i], s.charAt(i));
		}
		return res.toString();
	}
	
	public static String shuffleString(String s,int[] indices) {
		char[] arr = new char[s.length()];
		for(int i = 0;i<s.length();i++) {
			arr[indices[i]] = s.charAt(i);
		}
		return new String(arr);
		
	}

}
