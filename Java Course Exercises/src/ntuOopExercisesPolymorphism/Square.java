package ntuOopExercisesPolymorphism;

public class Square extends Rectangle{
	
	// Constructor 1
	public Square()
	{
		
	}
	
	// Constructor 2
	public Square(double side)
	{
		super(side, side); // Pass the length of the side to both Width and Length.
	}
	
	// Constructor 3
	public Square(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}
	
	public double getSide()
	{
		return super.getWidth();
	}
	
	public void setSide(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	
	//Overriding the setWidth and setLength so to avoid situations which setWidth or setLength are 
	//used and create the wrong behavior of a square with un-equal sides.
	
	@Override //Overriding setWidth method from Rectangle setting the width to the square's geometry.
	public void setWidth(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override //Overriding setWidth method from Rectangle setting the length to the square's geometry.
	public void setLength(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}

	@Override // Overrides the toString method introduced in the Rectangle class.
	public String toString()
	{
		return "A Square with side= " + super.getWidth() + " which is a subclass of " + super.toString();
	}
	
	//Overriding the setWidth and setLength so to avoid situations which setWidth or setLength are 
	//used and create the wrong behavior of a square with un-equal sides.
	
}
