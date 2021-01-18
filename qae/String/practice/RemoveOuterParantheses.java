package com.qae.String.practice;

public class RemoveOuterParantheses {

	public static void main(String[] args) {
		String str = removeOuterParantheses("(()())(())(()(()))");
		System.out.println(str);
	}
	
	public static String removeOuterParantheses(String S) {
		StringBuilder res = new StringBuilder();
		int count = 0;
		char[] ch = S.toCharArray();
		for(char i:ch) {
			if(i == '(' && (count+= 1) > 1) {
				res.append(i);
			}
			else if(i == ')' && (count-= 1) >=1) {
				res.append(i);
			}
		}return res.toString();
	}
	
	public static String removeOuterParenthesesEasy(String S) {
		StringBuilder res = new StringBuilder();
		int count = 0;
		char ch [] = S.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(ch[i] == '(') {
				if(count > 0) {
					res.append(ch[i]);
				}
				count = count+1;
			}
			else {
				count = count-1;
				if(count > 0) {
					res.append(ch[i]);
				}
			}
		}
		return res.toString();

	}

}
