package com.course.tests;
import com.course.shapes2.Circle;

public class TestCircle { // save as "TestCircle.java"
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius()
				+ " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius()
				+ " and area of " + c2.getArea());
		
		Circle c3 = new Circle(4.0, "yellow");
		System.out.println("The circle has radius of " + c3.getRadius()
				+ " and area of " + c3.getArea());
		
		System.out.println(c3.toString());
		
		
		Circle c4 = new Circle(1.2);
		System.out.println(c4.toString());  // explicit call
		System.out.println(c4);             // println() calls toString() implicitly, same as above
		System.out.println("Operator '+' invokes toString() too: " + c4);  // '+' invokes toString() too
	}
}