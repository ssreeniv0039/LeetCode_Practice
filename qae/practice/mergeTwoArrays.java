package com.qae.practice;

public class mergeTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6}; 
		int n = nums2.length;
		int  m = nums1.length - n;
		merge(nums1, m, nums2, n);
		for(int i:nums1) {
			System.out.print(i + " ");
		}
	}

public static void merge(int[] nums1,int m, int[] nums2,int n) {
	if(n == 0) return;
	int i = m-1, j = n-1,k = (n+m-1);
	while(i>=0 && j>=0) {
		if(nums1[i]>nums2[j]) {
			nums1[k--] = nums1[i--];
		}else {
			nums1[k--] = nums2[j--];
		}
	}
	while(j>=0) {
		nums1[k--] = nums2[j--];
	}
	
}

}
