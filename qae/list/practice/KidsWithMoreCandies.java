package com.qae.list.practice;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMoreCandies {
	public static void main(String[] args) {
		int arr[] = { 12, 1, 12 };
		List<Boolean> list = kidsWithCandies(arr, 10);
		for (Boolean i : list) {
			System.out.print(i + " ");
		}

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}

}
