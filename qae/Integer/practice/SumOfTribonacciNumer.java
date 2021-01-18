package com.qae.Integer.practice;

public class SumOfTribonacciNumer {
	public static void main(String[] args) {
		System.out.println(tribinacci(3));
		}
		
		public static int tribinacci(int n) {
//			int t0 = 1, t1 =0, t2 =1;
//			for(int i = 0;i<=n;i++) {
//				sum = t1+ t2;
//				t1 = t2;
//				t2 = sum;
//			}
			if(n == 1|| n == 2)
				return 1;
			int sum = 0;
			int t0= 0,t1 = 1,t2= 1;
			for(int i = 3;i<=n;i++) {
				sum = t1+ t2+t0;
				t0 = t1;
				t1 = t2;
				t2 = sum;
				
			}return sum;

}
}
