package com.course.tests;

public class TestFactorial {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		
//		long result = 1;
//		int temp = num;
//		for (;temp > 1; temp--)
//		{
//			result = result * temp;
//		}
		
		System.out.println("The factorial of " + 
				num + " is " + factorial(num));
	}
	
	public static int factorial(int n)
	{
		if (n == 1) return 1;
		return n * factorial(n-1);
	}
}
