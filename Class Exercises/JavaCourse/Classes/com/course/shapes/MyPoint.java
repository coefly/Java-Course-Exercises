package com.course.shapes;

public class MyPoint 
{
	//
	// Attributes
	//
	private int x = 0;
	private int y = 0;
	
	//
	// Constructors
	//
	public MyPoint()
	{
	}
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//
	// Functions
	//
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	// p1.distance(4, 8)
	public double distance(int x, int y)
	{
		int xDiff = (this.x - x);
		int yDiff = (this.y - y);
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	
	// p1.distance(p2)
	public double distance(MyPoint other)
	{
		return distance(other.x, other.y);
	}
}
