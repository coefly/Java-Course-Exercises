package com.course.tests;

public class TestCasting
{
	public static void main(String[] args)
	{
//		int a = 55555;
//		long b = 66666;
//		long c = a * b;
//		System.out.println(c);
//		
		System.out.println(55555 * 66666L);
		
		// upcast - can be implicit
		int a = 100;
		long b = a;
		System.out.println(b);
		
		// downcast - must be explicit
		int c = (int)b;
		System.out.println(c);
		
		float f = 1.9F;
		
		int number = (int)f;
		System.out.println(number);
	}
}
