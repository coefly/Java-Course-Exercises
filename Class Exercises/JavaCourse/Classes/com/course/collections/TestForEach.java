package com.course.collections;

import java.util.Arrays;
import java.util.List;

public class TestForEach {

	public static void main(String[] args) 
	{
		List nums = 
				Arrays.asList(35, 234, 34, 34, 3, 2, 3, 4, 3);
		
		for (int i = 0; i < nums.size(); i++) {
			int num = (int)nums.get(i);
			System.out.println(num);
		}
		/////////////////////////////////////////
		int sum = 0;
		for (Object num : nums)
		{
			sum += (int)num;
		}
		
		System.out.println(sum);
		/////////////////////////////////////////
		int[] nums2 = {45, 3, 4, 3, 4, 2, 4, 6, 4};
		for (int n : nums2)
		{
			System.out.println(n);
		}
		
		/////////////////////////////////////////////
		char[] chars = {'t', 's', 'g', 'w', 'y', 'z', 'z'};
		for (char c : chars)
		{
			System.out.println(c);
		}
		
	}

}
