package com.qae.practice;

public class StringMatching {

	public static void main(String[] args) {
		char[] ch = {'c','h','l'};
		stringMatching(ch);
		for(char i :ch) {
			System.out.print(i+ " ");
		}
	}
	

	public static void stringMatching(char[] str) {
		int i = 0;
		int j = str.length-1;
		while(i<j)
		 {
			 char temp = str[i];
			 str[i++] = str[j];
			 str[j--] = temp;
			 
		}		
			
		}
	}
	
	
	


