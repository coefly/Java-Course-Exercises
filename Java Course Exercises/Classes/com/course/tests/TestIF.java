package com.course.tests;

public class TestIF
{
	public static void main(String[] args)
	{
		int salary = 1000 + (int)(Math.random() * 28001);
		System.out.println("Your salary: " + salary);
		
		if (salary > 25000)
		{
			System.out.println("Really nice!");
			System.out.println("Really nice!");
		}
		else if (salary > 20000)
		{
			System.out.println("Nice!");
		}
		else if (salary >  15000)
		{
			System.out.println("Good!");
		}
		else if (salary > 10000)
		{
			System.out.println("O.K");
		}
		else if (salary > 5000)
		{
			System.out.println("try harder!!");
		}
		else
		{
			System.out.println("Find another job!!");
		}
	}
}
