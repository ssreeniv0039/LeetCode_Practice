package com.qae.Integer.practice;

public class BusyStudent {
	public static void main(String[] args) {
		int num1[] = {9,8,7,6,5,4,3,2,1};
		int num2[] = {10,10,10,10,10,10,10,10,10};
		int res = busyStudent(num1, num2, 5);
		System.out.println(res);
	}
	
	
	public static int busyStudent(int[] startTime,int[] endTime,int queryTime) {
		
		int count = 0;
		for(int i = 0;i<startTime.length;i++) {
			if(startTime[i] <= queryTime ) {
			if(Math.max(startTime[i],endTime[i]) >= queryTime) {
				count++;
			}
		}
		}
		return count;
	}

}
