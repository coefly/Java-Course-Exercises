package com.course.tests;
import java.io.DataOutputStream;


public class TestOperators {
	public static void main(String[] args) {
		int x = 10;
		x = x + 10;
		x += 10;
		x++;
		System.out.println(x);
		
		boolean result = true ^ false;
		System.out.println(result);
		
		if (x > 5 || result == false)
		{
			
		}
		
		int a = 10; // 1010
		int b = 8;  // 1000
		
		System.out.println(a ^ b); // 0010
		
		
		
	}
}
