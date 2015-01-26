package com.course.shapes;

public class TestMyPoint {
	
	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1, 1);
		MyPoint p2 = new MyPoint(2, 2);
		
		System.out.println(p1.distance(2,  2));
		
		System.out.println(p1.distance(p2));
		
	}
}
