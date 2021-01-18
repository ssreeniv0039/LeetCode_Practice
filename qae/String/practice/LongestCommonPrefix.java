package com.qae.String.practice;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str = {"flower","flow","flowe"};
		String s1 = longestCommonPrefix(str);
		System.out.println(s1);
		}
		
		public static  String longestCommonPrefix(String[] strs){
			if(strs.length == 0)
				return "";
			for(int  i = 0;i<strs[0].length();i++) {
				for(int j = 1;j<strs.length;j++) {
					if( i >= strs[j].length() ||strs[j].charAt(i) != strs[0].charAt(i) ) {
						return strs[0].substring(0, i);
					}
				}
			}return strs[0];

}
		}
