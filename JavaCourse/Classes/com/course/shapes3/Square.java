package com.course.shapes3;

public class Square extends Rectangle {

	//
	// Constructors
	// 
	public Square() {
		super(1.0, 1.0);
	}

	public Square(double side) {
		super(side, side);
		
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	// functions
	public double getSide()
	{
		return getWidth(); // or getLength()
	}
	
	public void setSide(double side)
	{
		setWidth(side);
		setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + getSide() + 
				" , which is a subclass of " + super.toString();
	}
	
	// override width and length setters to make sure that they
	// always stay the same!
	@Override
	public void setWidth(double width) {
		super.setWidth(width); // this.width = width;
		super.setLength(width); // this.length = width;
	}
	
	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
	}
	
	

}
