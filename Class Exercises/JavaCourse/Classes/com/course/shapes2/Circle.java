package com.course.shapes2;

public class Circle {
	// private instance variable, not accessible from outside this class
	private double radius = 1.0;
	private String color = "-unknown-";

	// 1st constructor, which sets both radius and color to default
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	// 2nd constructor with given radius, but color default
	public Circle(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		color = "red";
	}

	public Circle(double radius, String color) {
		if (radius > 0) {
			this.radius = radius;
		}
		// TODO: check that color is valid
		this.color = color;
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius;
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// A public method for retrieving the radius
	public String getColor() {
		return color;
	}

	public String toString() {
		return "Circle: radius=" + radius + " color=" + color + 
				" Area: " + this.getArea();  
	}
}