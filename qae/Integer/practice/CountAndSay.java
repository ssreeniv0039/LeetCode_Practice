package com.qae.Integer.practice;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(1));
	}
	
	public static String countAndSay(int n) {
		
		String res = "1";
		int  i = 1;
		while(i++< n) {
			StringBuilder reader = new StringBuilder();
				int count = 1;
				for(int  j = 1; j < res.length() ; j++) {
					if(res.charAt(j) == res.charAt(j-1)) {
					count++;
					}else {
						reader.append(count).append(res.charAt(j-1));
						count = 1;
					}
				}
				reader.append(count).append(res.charAt(res.length()-1));
				res = reader.toString();
			}return res;
		
		} 

}
