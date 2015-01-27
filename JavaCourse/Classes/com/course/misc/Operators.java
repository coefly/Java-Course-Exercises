package com.course.misc;

public class Operators
{
	public static void main(String[] args)
	{
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		
		// print the numbers:
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		
		// the sum
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);

		// the average
		double avg = sum / 2.0;
		System.out.println("Avg: " + avg);
		
		// the area
		int area = num1 * num2;
		System.out.println("Area: " + area);
		
		// the remainder
		int rem1 = num1 % 10;
		int rem2 = num2 % 10;
		System.out.println("Remainder of num1: " + rem1);
		System.out.println("Remainder of num2: " + rem2);
	}
}
