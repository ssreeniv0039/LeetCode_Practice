package com.qae.practice;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("V"));
			
		}
		
	
		public static Integer romanToInt(String s) {
			Map<Character,Integer> map= new HashMap<Character,Integer>();
			map.put('I',1);
			map.put('V',5);
			map.put('X',10);
			map.put('L',50);
			map.put('C',100);
			map.put('D',500);
			map.put('M',1000);
			
			int n = s.length()-1;
	        int result = map.get(s.charAt(n));
	        
	        for(int i = 0; i<n; i++){
	            int value = map.get(s.charAt(i));
	            int nextVal = map.get(s.charAt(i+1));
	            
	            if(value >= nextVal) {
	                result += value;
	            }
	            else {
	                result -= value;
	            }
	        }
	        return result;
		
		
		}

}
