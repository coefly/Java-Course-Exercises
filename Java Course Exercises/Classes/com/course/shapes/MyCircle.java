package com.course.shapes;

public class MyCircle {
	//
	// Attributes
	//
	private MyPoint center= null;
	private int radius = 0;
	
	//
	// Constructors
	//
	// new MyCircle(1, 1, 5)
	public MyCircle(int x, int y, int radius)
	{
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius)
	{
		this.center = center;
		this.radius = radius;
	}
	
	//
	// Methods
	//
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
}
