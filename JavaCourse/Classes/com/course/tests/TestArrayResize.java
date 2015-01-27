package com.course.tests;

public class TestArrayResize {
	public static void main(String[] args) {
		int[] nums = {5, 6, 7, 8, 98};
		
		// We would like to 'resize' the array
		// a. create a new array
		int[] temp = new int[nums.length * 2];
		
		// b. copy all values to the new array
//		for (int i = 0; i < nums.length; i++) {
//			temp[i] = nums[i];
//		}
		System.arraycopy(nums, 0, temp, 0, nums.length);
		
		// c.
		nums = temp;
		
		System.out.println(nums.length);
		
		System.out.println(nums[2]);
		temp[2] = 17;
		System.out.println(nums[2]);
	}
}
