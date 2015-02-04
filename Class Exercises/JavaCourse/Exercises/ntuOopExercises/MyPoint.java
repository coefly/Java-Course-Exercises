package ntuOopExercises;

public class MyPoint {
	
	//
	// Variables
	//
	
	private int x = 0;
	private int y = 0;
	
	
	//
	// Constructors
	//

	//Construct a (0,0) point - 'no-arg' contructor
	public MyPoint()
	{
		this.x = 0;
		this.y = 0;
	}
	
	//Construct a point from 2 given integers
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
			
	//
	// Getters
	//
	
	//Getter for X
	public int getX()
	{
		return x;
	}
	
	//Getter for Y
	public int getY()
	{
		return y;
	}
	
	//
	// Setters
	//
	
	//Setter for X
	public void setX(int x)
	{
		this.x = x;
	}
	
	//Setter for Y
	public void setY(int y)
	{
		this.y = y;
	}
	
	//Setter for (X,Y)
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//
	// toString
	//
	
	public String toString()
	{
		return "My Point is: (" + x + "," + y + ")" ;
	}
	
	//
	//Methods
	//
	
	public double distance(int x, int y)
	{
		int xDiff = this.x - x; //Calculates the difference between the 2 X coordinates given.
		int yDiff = this.y - y; //Calculates the difference between the 2 Y coordinates given.
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another)
	{
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
