package com.qae.String.practice;

public class TitleToNumber {
	
	public static void main(String[] args) {
		int num = titleToNumber("A");
		System.out.println(num);
		
	}
	
	
	public static int titleToNumber(String s) {
		int colNum = 0;
	      for(int i = 0;i < s.length();i++){
	          	int res  = colNum + ((s.charAt(i) - 'A') + 1);
	          	colNum = (colNum*26) + res;
	          }
	      return colNum;
	      }
		 
	

}
