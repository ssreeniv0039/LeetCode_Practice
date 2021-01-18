package com.qae.list.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		List<List<Integer>> list = generate(5);
		System.out.println(list);
		
	}
	
	
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> triangle = new ArrayList<List<Integer>>(); 
		List<Integer> row = new ArrayList<Integer>();
		for(int i = 0; i < numRows; i++) {
			for(int j = row.size()-1; j >=1 ;j--) {
				row.set(j, row.get(j) + row.get(j-1));
			}
			row.add(1);
			triangle.add(new ArrayList<>(row));
		}
		return triangle;	
	}
		 

}
