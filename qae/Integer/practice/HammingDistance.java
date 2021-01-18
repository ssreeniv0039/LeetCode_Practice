package com.qae.Integer.practice;

public class HammingDistance {

	public static void main(String args[]) {
		
		int res = hammingDistance(1, 4);
		System.out.println(res);
		}



	public static int hammingDistance(int x, int y) {
	    int distance = 0;
	    int lastXbit = 0;
	    int lastYbit = 0;

	    while (x > 0 || y > 0) {
	        lastXbit = x % 2;
	        lastYbit = y % 2;
	        x /= 2;
	        y /= 2;

	        if (lastXbit != lastYbit) {
	            distance++;
	        }
	    }
		
	    return distance;
	}

}
