package com.qae.practice;

public class AddString {
	public static void main(String[] args) {
		
		System.out.println(addString("100","200"));
			
		}
		
		
		public static String addString(String num1,String num2) {
			StringBuilder res = new StringBuilder();
			int  i = num1.length()-1;
			int  j = num2.length()-1;
			int carry = 0;
			while(i>=0||j>=0) {
				int sum = carry;
				if(i>=0) {
					sum = sum + num1.charAt(i--) - '0';//Ascii addition 
				}if(j>=0) {
					sum = sum + num2.charAt(j--) - '0';
				}
				res.append(sum%10);// Allowed to enter values between 0-9
				carry = sum/10;//if sum is greater than or equal to 10
			}
			if(carry!=0) {
				res.append(carry);
			}
			
			return res.reverse().toString();
			
		}
		
		public static int addString(String str) {
			int a = 10;
			int j= 0;
			int  len = str.length();
			int sum = 0;
			while(len > j) {
					sum = sum*10;				
					sum = sum + str.charAt(j) - '0';
					j++;
			}
			return sum+a;
	}
		public static void addStr(String str) {
			int a = 10;
			int result = 10 + Integer.parseInt(str);
			System.out.println(result);
		}

}
