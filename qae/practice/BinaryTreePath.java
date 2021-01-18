package com.qae.practice;

import java.util.ArrayList;
import java.util.List;



public class BinaryTreePath {
public static void main(String[] args) {
		
	
		
	}
	
	
	public static   List<String> binaryTreePaths(TreeNode root){
		
		List<String> paths = new ArrayList<String>();
		if(root == null) {
			return paths;
			}
		
		dfs(root,"",paths);
		return paths;	

	}
	public static void dfs(TreeNode root,String path,List<String> paths) {
		path = path + root.val;
		if(root.left == null && root.right == null) {
			paths.add(path);
			return;
		}
		if(root.left != null) {
			dfs(root.left,path + "=>",paths); 
		}
		if(root.right != null) {
			dfs(root.right,path + "=>", paths);
		}
		
	}

}
