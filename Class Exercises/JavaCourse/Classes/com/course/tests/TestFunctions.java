package com.course.tests;

public class TestFunctions {
	public static void main(String[] args) {
		System.out.println(square(6));
//		
		int y = square(53);
		System.out.println(y);
//		
		System.out.println(sum3Numbers(55, 22, 55));
//		
		int sum = sum3Numbers(3, 23, 235);
	}
	
	
	public static int sum3Numbers(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public static int square(int x)
	{
		return x * x;
	}
	
	public static void doSomething()
	{
		System.out.println("doing something");
		System.out.println("doing something");
		System.out.println("doing something");
	}
	
	
}
