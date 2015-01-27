package com.course.tests;

public class TestPalindrom {
	public static void main(String[] args) 
	{
		// Generate 10000 numbers and print only palindroms
		for (int i = 0; i < 10000; i++)
		{
			int num = (int) (Math.random() * 1000000);
			if (isPalindrom(num))
			{
				System.out.println(num);
			}
		}
	}
	
	// Return true if the given number is a palindrom (netul gloten)
	public static boolean isPalindrom(int num)
	{
		return (num == reverseNumber(num));
	}
	
	// Return the reverse of the given number
	public static int reverseNumber(int num)
	{
		int reverse = 0;
		int temp = num;
		while (temp > 0)
		{
			reverse = reverse * 10 + (temp % 10);
			temp = temp / 10;
		}
		
		return reverse;
	}
}
