package com.course.shapes2;

public class Cylinder extends Circle 
{ 
	// save as "Cylinder.java"
	private double height; // private variable

	// Constructor with default color, radius and height
	public Cylinder() {
		//super(); // call superclass no-arg constructor Circle()
		height = 1.0;
	}

	// Constructor with default radius, color but given height
	public Cylinder(double height) {
		super(); // call superclass no-arg constructor Circle()
		this.height = height;
	}

	// Constructor with default color, but given radius, height
	public Cylinder(double radius, double height) {
		super(radius); // call superclass constructor Circle(r)
		this.height = height;
	}

	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}

	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume() {
		return getBaseArea() * height;
	}
	
	// 2*PIªradiusªheight + 2ªbase-area
	public double getArea() {
		double perimeter = 2 * Math.PI * getRadius() * height;
		
		return perimeter + 2 * super.getArea();
	}
	
	public double getBaseArea()
	{
		return super.getArea();
	}
	
	@Override
	public String toString() {      // in Cylinder class
	   return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
	          + " height=" + height;
	}
	
	
}