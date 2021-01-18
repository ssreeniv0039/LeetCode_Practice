 package com.qae.practice;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {

	public static void main(String[] args) {
		

	}
	public static  int rangeSumBST(TreeNode root,int L, int R){
		int sum = 0;
		if(root == null) {
			return sum = 0;
		}
		//BFS implementation
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode current = queue.remove();
			if(current.val >= L && current.val <= R) {
				sum = sum+ current.val;
			}
			if(current.left != null && current.val > L) {
				queue.add(current.left);
			}
			if(current.right != null && current.val < R) {
				queue.add(current.right);
			}
			 
		}
		return sum;
		

	}

}
