package com.course.misc;

import com.course.shapes.MyPoint;

public class TestPassArguments {
	public static void main(String[] args) 
	{
//		int x = 11;
//		changeValue(x);
//		System.out.println(x);
		
		MyPoint p1 = new MyPoint(11, 11);
		changeValue2(p1);
		System.out.println(p1);
	}
	
	
	// this has YES effect
	public static void changeValue(MyPoint p)
	{
		p.setX(55);
	}
	
	// this has NO effect
	public static void changeValue(int x)
	{
		x = 55;
	}
	
	
	public static void changeValue2(MyPoint p)
	{
		p = new MyPoint(55, 55);
	}
	
}
