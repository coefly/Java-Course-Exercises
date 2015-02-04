package parkingHomeworkExercise;

public class Bike extends Transport{
	
	protected int gear;
	
	//no-arg Constructor.
	public Bike()
	{
		
	}
	
	//Constructor passing values color and max velocity.
		public Bike(String color, int max_velocity)
		{
			super(color, max_velocity);
		}
	
	//Constructor passing values color, max velocity and gear.
	public Bike(String color, int max_velocity, int gear)
	{
		super(color, max_velocity);
		this.gear = gear;
	}
	
	//Get gear method.
	public int getGear()
	{
		return gear;
	}
	

	//Override the toString class of super class.
	@Override
	public String toString()
	{
		return "Type: " + getClass().getSimpleName() + ", Amount of gears: " + gear + " "
					+ super.toString();
	}
	
}
