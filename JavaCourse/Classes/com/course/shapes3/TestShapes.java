package com.course.shapes3;

public class TestShapes {

	public static void main(String[] args) {
//		Shape s = new Shape();
//		printShapeColor(s);
		
		Rectangle r = new Rectangle(3, 2, "orange", true);
		printShape(r);
		
		Circle c = new Circle();
		printShape(c);
	}
	
	public static void printShape(Shape s)
	{
		System.out.println(s.toString());
	}
 
}
