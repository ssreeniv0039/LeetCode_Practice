package com.qae.Integer.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThenCurrentNumber {

	public static void main(String[] args) {
		int num[] = {8,1,2,2,3};
		int arr[]  = smallerNumberThanCurrent(num);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	
	public static int[] smallerNumberThanCurrent(int[] nums) {
		int arr[] = new int[nums.length];
		for(int i = 0;i<nums.length;i++) {
				int count = 0;
			for(int j = 0;j<nums.length;j++) {
				if(i !=j && nums[j]<nums[i]) {
					count++;
				}
			}
			arr[i] =count;
		}
		return arr;
	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        
        return copy;
    }

 public static int[] smallerNumbersThanCurrent1(int[] nums) {
		int b[] = nums.clone(); 
		Arrays.sort(nums);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0 ;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				continue;
			}
			map.put(nums[i], i);
		}
		for(int i = 0 ;i<b.length;i++){
			nums[i]=map.get(b[i]);
		}
		return nums;
    }
	

}
