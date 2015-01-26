package ntuOopExercises;

public class MyCircle {
	
	//
	//Variables
	//
	private MyPoint center;
	private int radius = 1;
	
	
	//
	//Constructors
	//
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
	//Getters
	//
	public int getRadius()
	{
		return radius;
	}
	
	public MyPoint getCenter()
	{
		return center;
	}
	
	public int getCenterX()
	{
		return center.getX();
	}
	
	public int getCetnerY()
	{
		return center.getY();
	}
	
	public double getArea()
	{
		return  radius*radius * Math.PI; //Area of a circle = PI * squared Radius.
	}
	
	//
	//Setters
	//
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public void setCenter(MyPoint center)
	{
		this.center = center;
	}
	
	public void setCenterXY(int x, int y)
	{
		center.setXY(x, y);
	}
	
	//
	//toString
	//
	public String toString()
	{
		return "Circle @ (" + center + ") radius = " + radius;
	}

	
}
