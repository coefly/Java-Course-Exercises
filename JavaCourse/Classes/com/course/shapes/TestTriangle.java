package com.course.shapes;

public class TestTriangle {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(2, 4);
		MyPoint p2 = new MyPoint(1, 3);
		MyPoint p3 = new MyPoint(3, 5);
		
		MyTriangle t = new MyTriangle(p1, p2, p3);
		System.out.println(t.getPerimeter());
		System.out.println(t);
		
		
		p1 = null;
		
	}
}
