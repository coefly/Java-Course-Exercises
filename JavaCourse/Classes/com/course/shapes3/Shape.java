package com.course.shapes3;

public abstract class Shape {
	//
	// Attributes
	//
	private String color = "red";
	private boolean filled = true;
	
	
	//
	// Constructors
	//
	public Shape()
	{}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//
	// Functions
	//
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		String msg = filled ? "filled" : "not filled";
		return "A Shape with color of " + color + " and " + msg;
	}
}
