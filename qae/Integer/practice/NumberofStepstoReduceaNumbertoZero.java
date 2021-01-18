package com.qae.Integer.practice;

public class NumberofStepstoReduceaNumbertoZero {
	public static void main(String[] args) {
		int num = numberofSteps(1);
		System.out.println(num);
	}
	public static int numberofSteps(int num) {
		int count = 0;
		if(num == 1) {
			return count;
		}

		int  i = num;
		while(i>=0) {
			if(num % 2 == 0) {
				num = num/2;
				i = num;
			}else {
				num=num-1;
				i = num;
			}
			count++;
			i--;
		}return count;
	}
}
