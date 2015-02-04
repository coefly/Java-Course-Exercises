package com.course.tests;

import com.course.shapes.MyPoint;

public class TestChangingReferenceWithoutKillingTheObject {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1, 1);
		MyPoint p2 = new MyPoint(2, 2);
		
		System.out.println(p1);
		System.out.println(p2);
		// note that after this line - p1 and p2 are the same
		// also - what used to be p2 - is now dead
		//MyPoint p3 = p2;
		p2 = p1;
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
}
