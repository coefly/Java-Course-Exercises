package parkingHomeworkExercise;

public class Car extends Veichle{
	
	//no-arg constructor.
	public Car()
	{
		
	}
	
	//Constructor passing values.
	public Car(String color, int max_velocity)
	{
		super(color, max_velocity);
		
	}
	
	//Constructor passing values.
		public Car(String color, int max_velocity, int model)
		{
			super(color, max_velocity, model);
		}
	
	
	//Override the toString class of super class.
	@Override
	public String toString()
	{
		return "Type: " + getClass().getSimpleName() + ", " + super.toString();
	}
	
}
