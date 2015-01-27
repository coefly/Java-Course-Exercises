package com.course.tests;

public class TestFor {
	public static void main(String[] args) 
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i + " ^ 2 = " + i * i);
		}
		
		for (int i = 1000; i > 0; i--)
		{
			if (i == 80) continue;
			System.out.println(i);
		}
		
//		int i = 0;
//		while (i < 100)
//		{
//			System.out.println("kuku");
//			i++;
//		}
	}
}
