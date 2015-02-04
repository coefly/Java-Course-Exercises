package com.course.tests;

public class TestNestedLoop 
{
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" # ");
			}
			// new line
			System.out.println();
		}
	}
}
