package com.qae.practice;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(revString("hello"));;
	}
	
	public static String revString(String s) {
//		//Method 1
//		String rev = " ";
//		for(int i= s.length()-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}return rev;
		
		//Method 2
		char[] character = s.toCharArray();
		 int i = 0;
		 int j = s.length() -1;
		 while(i<j) {
			 char temp = character[i];
			 character[i++] = character[j];
			 character[j--]= temp;
		 }
		 return new String(character);
		
	}
	
	public static void reverseStrings(char[] s) {
		int i = 0;
		int j = s.length-1;
		while(i<j) {
			char temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
		}
		
	}

}
