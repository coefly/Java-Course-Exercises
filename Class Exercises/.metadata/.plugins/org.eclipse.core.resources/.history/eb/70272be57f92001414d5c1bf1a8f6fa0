package com.course.exceptions;

import com.course.animals.Animal;

public class TestVarArgs {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 35;
		arr[1] = 25;
		arr[2] = 15;
		arr[3] = 25;
		arr[4] = 55;
		sum(arr);
		
		int[] arr2 = {8, 4, 6, 2, 34, 65, 3, 65};
		sum(arr2);
		
		sum(6, 32, 65, 4, 67);
		sum(78, 3);
		sum(3);
		sum();
		sum(9, 7, 4, 6, 2, 6, 4, 6, 3, 6, 3, 6);
	}
	
	// var args
	public static void sum(int... nums)
	{
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		
		System.out.println("Sum = " + sum);
	}

}
