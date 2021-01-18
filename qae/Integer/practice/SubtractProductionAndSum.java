package com.qae.Integer.practice;

public class SubtractProductionAndSum {
	
	public static void main(String[] args) {
		int prod = productofDigits(234);
		int sum = sumOfDigits(234);
		int res = prod - sum;
		System.out.println(res);
		System.out.println(subtractProductionAndSum(234));
	}
	
	public static int productofDigits(int num) {
		int prod = 1;
		while(num!= 0) {
			int rem = num%10;
			prod = prod * rem;
			num = num/10;
		}return prod;
	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num!= 0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}return sum;
		
	}
	public static int subtractProductionAndSum(int n) {
		int prod = 1,sum = 0;
		while(n != 0) {
			prod *= n %10;
			sum += n%10;
			n = n/10;
		}return (prod - sum);
	}

 

}
