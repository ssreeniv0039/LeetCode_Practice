package com.qae.String.practice;

public class backSpaceCompare {
	public static void main(String[] args) {
		boolean flag = backSpaceCompare("ab#c", "ad#c");
		System.out.println(flag);
		
		}
	public static boolean backSpaceCompare(String S,String T) {
		String s = getString(S);
		String t = getString(T);
		return s.equals(t);
		}
	
	private static String getString(String s) {
		StringBuilder res = new StringBuilder();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '#') {
				if(res.length() != 0) {
					res.deleteCharAt(res.length()-1);
				}
			}else {
				res.append(s.charAt(i));
			}
		}
		return res.toString();
	}

}
