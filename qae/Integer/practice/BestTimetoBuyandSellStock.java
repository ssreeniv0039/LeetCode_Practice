package com.qae.Integer.practice;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int arr[] = {7,6,4,3,1};
		int num = maxProfit(arr);
		System.out.println(num);
	}
	
	public static int maxProfit(int prices[]) {
		int maxProfit = 0;
		for(int i = 1;i<prices.length-1;i++) {
			int profit = 0;
			for(int j = i+1;j<prices.length;j++) {
				if(prices[i]<prices[j]) {
					profit = prices[j] - prices[i];
					}
				if(profit > maxProfit) {
					maxProfit = profit;
					}
				
				}
		}
		return maxProfit;
	}
	//one pass solution
	public static int maxProfitOnePass(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i = 0;i<prices.length;i++) {
			if(prices[i]<minPrice) {
				minPrice = prices[i];
			}else if(prices[i] - minPrice>maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}return maxProfit;
	}

}
