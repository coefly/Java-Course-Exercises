package ntuOopExercisesPolymorphism;

public abstract class Shape { //Is an abstract class - Cannot create instances of this class (shape instances)
	
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape()
	{
		this.color = "green";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	//Adding abstract methods
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public String toString()
	{
		return "A Shape with color of " + color + " and " + filled + "\n";
	}
	
	
	
}
