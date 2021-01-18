package com.qae.Integer.practice;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfSet {
	public static void main(String[] args) {
		 int nums1[] = {2, 4, 4, 2};
		 int nums2[] = {2,2};
		 int num[] = intersectionOfSet(nums1, nums2);
		 for(int i:num) {
			 System.out.print(i+" ");
		 }
		
		}
	
		public static int[] intersectionOfSet(int nums1[],int nums2[]) {
			Set<Integer> set = new HashSet<>();
			for(int i = 0;i< nums1.length;i++) {
				set.add(nums1[i]);
			}
			Set<Integer> set1 = new HashSet<>();
			for(int i = 0;i<nums2.length;i++) {
				if(set.contains(nums2[i])) {
					set1.add(nums2[i]);
				}
			}
			int arr[] = new int[set1.size()];
			int j = 0;
			for(int i : set1) {
				arr[j++] = i;
			}
			return arr;

		}

}
