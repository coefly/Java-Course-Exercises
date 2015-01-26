package com.course.misc;

public class IfEx5 {
	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		int num3 = (int)(Math.random() * 100);
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		System.out.println("Num3: " + num3);
		System.out.println("------------------------");
		
		int max = num3;
		
//		if (num1 > num2 && num1 > num3)
//		{
//			max = num1;
//		}
//		else if (num2 > num1 && num2 > num3)
//		{
//			max = num2;
//		}
		if (num1 > max)
		{
			max = num1;
		}
		if (num2 > max)
		{
			max = num2;
		}
		
		System.out.println("The biggest number is " + max);
	}
}
