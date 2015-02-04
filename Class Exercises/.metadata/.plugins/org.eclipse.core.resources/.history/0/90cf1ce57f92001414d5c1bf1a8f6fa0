package com.course.exceptions;

public class TestExceptions1 {

	public static void main(String[] args) {
		sum("5", "2s2", "11", "asdgfs", "2");
		sum();
		sum("353", "1", "1b2", "33ff3", "11");
		sum("5", "22", "11");
	}

	public static void sum(String... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) 
		{
			try {
				sum += Integer.parseInt(nums[i]);
			} catch (NumberFormatException e) {
				System.out.println("EXCEPTION!!!!!! for " + nums[i]);
				// e.printStackTrace();
				return;
			}
		}

		System.out.println("Sum = " + sum);
	}

}
