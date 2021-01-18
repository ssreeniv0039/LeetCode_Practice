package com.qae.practice;

import java.util.Scanner;

public class NumberDivisiableBy8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer value : ");
		int value = reader.nextInt();
		extracted(value);
	}
public static void extracted(int value) {
		
		try {
			if(value == 0) {
				System.out.println("Enter another value apart from zero");
			}
			else if(value %32 == 0) {
				System.out.println("ANIMAL");
			}else if(value % 16 == 0) {
				System.out.println("ANIM");
			}else if(value % 8 == 0) {
				System.out.println("AN");
			}else {
				System.out.println("The number is not divisiable by 8 or 16 or 32");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
