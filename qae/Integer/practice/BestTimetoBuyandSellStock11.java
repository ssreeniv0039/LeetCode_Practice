package com.qae.Integer.practice;

public class BestTimetoBuyandSellStock11 {
	public static void main(String[] args) {
		int num[] = {7,2,3,5,5,1,4};
		int res = maxProfit(num);
		System.out.println(res);
	}
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int  i = 0;i<prices.length-1;i++) {
			if(prices[i]<prices[i+1]) {
				maxProfit += prices[i+1] - prices[i];
			}
		
		}return maxProfit;

}
}