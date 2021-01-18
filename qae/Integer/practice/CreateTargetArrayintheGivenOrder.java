package com.qae.Integer.practice;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
	public static void main(String[] args) {
		
		int num1[] = {1,2,3,4,0};
		int num2[] = {0,1,2,3,0};
		int res[] = createTargetArray(num1, num2);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] createTargetArray(int[] nums, int[] index){
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<index.length;i++) {
			list.add(index[i], nums[i]);
		}
		int[] arr = new int[list.size()];
		for(int i = 0;i<list.size();i++) {
			arr[i] = list.get(i);
		}
		return arr;
	
	}


}
