package com.course.misc;
public class ForEx1 {
	public static void main(String[] args) {
		ex2();
	}

	public static void ex5()
	{
		int num = (int) (Math.random() * 10000);
		System.out.println(num);
		System.out.println("************************");
		
		// 1. find the number of digits
		int numOfDigits = 0;
		int temp = num;
		while (temp != 0)
		{
			temp = temp/10;
			numOfDigits++;
		}	
		
		System.out.println("Number of digits: " + numOfDigits);
		
		// 2. find the left most digit
		int leftDigit = num / (int)(Math.pow(10, numOfDigits - 1));
		System.out.println("Left digit: " + leftDigit);
		
		// 3. sum of digits
		temp = num;
		int sum = 0;
		while (temp > 0)
		{
			sum += temp % 10;
			temp = temp / 10;
		}
		System.out.println("Sum = " + sum);
		
		// 4. opposite
		temp = num;
		int reverse = 0;
		while (temp > 0)
		{
			reverse = reverse * 10 + (temp % 10);
			temp = temp / 10;
		}
		System.out.println("Reverse = " + reverse);
		
//		temp = num;
//		String reverse2 = "";
//		while (temp > 0)
//		{
//			reverse2 = reverse2  + (temp % 10);
//			temp = temp / 10;
//		}
//		System.out.println("Reverse = " + reverse2);
//		
	}
	
	public static void ex4()
	{
		int max = (int) (Math.random() * 100);
		int den = (int) (Math.random() * 15);
		
		System.out.println("max: " + max);
		System.out.println("den: " + den);
		System.out.println("************************");
		
		for (int i = 0; i < max; i+= den) {
			System.out.println(i);
		}
//		for (int i = 0; i < max; i++) {
//			// if i is divided by den
//			if (i % den == 0)
//			{
//				System.out.println(i);
//			}
//		}
	}
	
	public static void ex3()
	{
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		System.out.println("************************");
		
		// print only even numbers
		for (int i = 0; i < num; i += 2) 
		{
			System.out.println(i);
		}
//		for (int i = 0; i < num; i++) {
//			// if i is even
//			if (i % 2 == 0)
//			{
//				System.out.println(i);
//			}
//		}
		
	}
	public static void ex2()
	{
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("*******************************");

		// make sure that num1 is the smaller number
		if (num2 < num1)
		{
			// swap the values
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		for (int i = num1; i < num2; i++)
		{
			System.out.println(i);
		}
//		if (num1 < num2)
//		{
//			for (int i = num1; i < num2; i++)
//			{
//				System.out.println(i);
//			}
//		}
//		else
//		{
//			for (int i = num2; i < num1; i++)
//			{
//				System.out.println(i);
//			}
//		
//		}
	}

	public static void ex1() {
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		System.out.println("************************");
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
