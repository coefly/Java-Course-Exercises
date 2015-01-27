package com.course.shapes;

public class TestMyCircle {
	public static void main(String[] args) 
	{
		MyCircle c1 = new MyCircle(1, 1, 5);
		
		MyPoint p1 = new MyPoint(1, 1);
		MyCircle c2 = new MyCircle(p1, 5);
//		
		//MyCircle c3 = new MyCircle(new MyPoint(3, 3), 5);
		
		
		System.out.println(c2.getArea());
	}
}
