package com.course.shapes3;

public class Circle extends Shape {
	private double radius = 1.0;
	
	//
	// Constructors
	//
	public Circle()
	{
	}
	
	public Circle(double radius) {
		// super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	//
	// Functions
	//
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "A Circle with radius = " + radius + 
				", which is a subclass of " + super.toString();
	}
}
