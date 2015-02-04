package ntuOopExercises;

public class OldShape {
	
	protected String color = "red";
	private boolean filled = true;
	
	public OldShape()
	{
		this.color = "green";
		this.filled = true;
	}
	
	public OldShape(String color, boolean filled)
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

	public String toString()
	{
		return "A Shape with color of " + color + " and " + filled + "\n";
	}
	
}
