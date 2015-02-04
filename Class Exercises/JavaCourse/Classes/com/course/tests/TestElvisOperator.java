package com.course.tests;

public class TestElvisOperator {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100);
		System.out.println("Num: " + num);
		
//		String message = "";
//		if (num < 50)
//		{
//			message = "Small";
//		}
//		else
//		{
//			message = "Big";
//		}
		
		String message = (num < 50) ? "Small" : "Big";
		System.out.println(message);
	}
}
