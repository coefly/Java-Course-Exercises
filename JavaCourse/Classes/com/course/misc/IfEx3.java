package com.course.misc;

public class IfEx3 {
	public static void main(String[] args) 
	{
		int num = (int)(Math.random() * 100);
		System.out.println("Num: " + num);
		// 0 - 50
		if (num > 0 && num < 50)
		{
			System.out.println("Small");
		}
		else
		{
			System.out.println("Big");
		}
		
		// Odd or even
		if (num % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
