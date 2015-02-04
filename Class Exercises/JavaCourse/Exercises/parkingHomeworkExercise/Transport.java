package parkingHomeworkExercise;

public abstract class Transport implements Comparable<Transport>{
	
	//Variables
	private String color;
	private int max_velocity = 0;
	
	//Constructor number 1 - Default constructor for no_arg constructor.
	public Transport()
	{
		
	}

	//Constructor number 2 - Receives color and velocity from user.
	public Transport(String color, int max_velocity)
	{
		this.color = color;
		this.max_velocity = max_velocity;
	}
	
	//get Color method.
	public String getColor()
	{
		return color;
	}
	
	//get Max Velocity method.
	public int getMaxVelocity()
	{
		return max_velocity;
	}
	
	// toString
	public String toString()
	{
		return ", Color: " + color + ", Max.velocity: " + max_velocity;
	}
	
	@Override
	public int compareTo(Transport o) {
		if (this.max_velocity > o.getMaxVelocity()) return 1;
		if (this.max_velocity < o.getMaxVelocity()) return -1;		
		return 0;
	}

}
