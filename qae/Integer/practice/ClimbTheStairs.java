package com.qae.Integer.practice;

public class ClimbTheStairs {
	public static void main(String[] args) {
		int num = climbStairsDynamicProgramming(4);
		System.out.println(num);
	}
	
	public static int climbStairs(int n) {
		if(n == 1)
			return 1;
		int res = 0,t2 =2,t1=1;
		for(int i = 3;i<=n;i++) {
			res = t1+t2;
			t1= t2;
			t2=res;
		}return t2;
}
	
	
	public static int climbStairsDynamicProgramming(int n) {
		if(n == 1)
			return 1;
		int[] dp = new int[n +1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3;i<= n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}return dp[n];
		
	}
}
